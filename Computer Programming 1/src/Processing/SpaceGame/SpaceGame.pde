// SpaceGame | Dec. 2020
// by Jonathan Su

import processing.sound.*;
SoundFile fire, fireNo, end, shatter, denied, kaching, reload, repair;
Spaceship s1;
EnemyShip f2;
Timer asteroidTimer, pUpTimer;
ArrayList<Projectile> projectiles;
ArrayList<Asteroid> asteroids;
ArrayList<Star> stars;
ArrayList<PowerUp> powerups;
Car[] cars = new Car[5];
int pass;
boolean play;
PImage background, gameOver;
PFont startFont, panelFont;

void setup() {
  size(500, 500);
  fire = new SoundFile(this, "RPG.wav");
  fireNo = new SoundFile(this, "Nope Sound Effect.wav");
  end = new SoundFile(this, "end.mp3");
  shatter = new SoundFile(this, "Window Break.wav");
  denied = new SoundFile(this, "Denied.wav");
  kaching = new SoundFile(this, "kaching.wav");
  reload = new SoundFile(this, "reload.mp3");
  repair = new SoundFile(this, "repair.mp3");
  s1 = new Spaceship(#DBFCEE);
  f2 = new EnemyShip(#F4FC12);
  asteroidTimer = new Timer(1000);
  asteroidTimer.start();
  pUpTimer = new Timer(8000);
  pUpTimer.start();
  projectiles = new ArrayList();
  asteroids = new ArrayList();
  stars = new ArrayList();
  powerups = new ArrayList();
  pass = 0;
  play = false;
  for (int i = 0; i < cars.length; i++) {
    cars[i] = new Car(color(random(255), random(255), random(255)), random(20, 50));
  }
  background = loadImage("planets.jpeg");
  gameOver = loadImage("gameOver.jpg");
  panelFont = loadFont("Cochin-15.vlw");
  startFont = loadFont("DINCondensed-Bold-15.vlw");
}

void draw() {
  if (!play) {
    startScreen();
  } else {
    background(0);
    noCursor();
    image(background, 0, 5, 900, 495);
    stars.add(new Star(int(random(width)), (int(random(height)))));
    for (int i = 0; i < stars.size(); i++) {
      Star star = stars.get(i);
      star.display();
      star.move();
      if (star.reachedBottom()) {
        stars.remove(star);
      }
    }
    for (int i = 0; i < projectiles.size(); i++) {
      Projectile projectile = projectiles.get(i);
      projectile.display();
      projectile.fire();
      // If projectile hits a rock
      for (int e = 0; e < asteroids.size(); e++) {
        Asteroid asteroid = asteroids.get(e);
        if (asteroid.projectileIntersection(projectile)) {
          asteroids.remove(asteroid);
          s1.score += random(100);
          denied.play();
          projectile.c = color(0, 255, 0);
        }
      }
      if (projectile.reachedTop()) {
        for (int p = 0; p < asteroids.size(); p++) {
          Asteroid asteroid = asteroids.get(p);
          if (asteroid.projectileIntersection(projectile) == false) {
            fireNo.play();
          }
        }
        projectiles.remove(projectile);
      }
    }
    if (asteroidTimer.isFinished()) {
      asteroids.add(new Asteroid(int(random(width)), -20));
    }
    for (int i = 0; i < asteroids.size(); i++) {
      Asteroid asteroid = asteroids.get(i);
      asteroid.display();
      asteroid.move();
      // Asteroid + ship collision
      if (s1.rockIntersection(asteroid)) {
        s1.health -= asteroid.health;
        fill(255, 0, 0);
        textAlign(CENTER);
        s1.warning = "Warning: You may have hit a big rock or SpaceBird! \nClick F to pay respects.";
        shatter.play();
        asteroids.remove(asteroid);
      }
      if (asteroid.reachedBottom()) {
        pass++;
        s1.score -= random(500);
        asteroids.remove(asteroid);
        fireNo.play();
      }
      asteroidTimer.start();
    }
    if (pUpTimer.isFinished()) {
      powerups.add(new PowerUp(int(random(width)), -20));
      pUpTimer.start();
    }
    for (int i = 0; i < powerups.size(); i++) {
      PowerUp pu = powerups.get(i);
      pu.display();
      pu.move();
      // Ship + powerup collision
      if (s1.puIntersection(pu)) {
        kaching.play();
        if (pu.pu == 0) {
          s1.ammo += 5;
          s1.score += random(100);
          reload.play();
        } else if (pu.pu == 1) {
          s1.health += 50;
          s1.score += random(100);
          repair.play();
        }
        powerups.remove(pu);
      }
      if (pu.reachedBottom()) {
        powerups.remove(pu);
      }
    }
    for (int i = 0; i < cars.length; i++) {
      cars[i].display();
      cars[i].drive();
    }
    s1.display(mouseX, mouseY);
    f2.display(mouseY, mouseX);
    infoPanel();

    // When to end the game
    if (s1.health < 1) {
      s1.lives --; 
      s1.health = int(random(200));
      if (s1.lives < 1 || pass > 50) {
        play = false;
        endScreen();
      }
    }
  }
}

void mousePressed() {
  if (s1.ammo > 0 && play) {
    fire.play();
    projectiles.add(new Projectile(s1.x, s1.y));
    projectiles.add(new Projectile(f2.x, f2.y));
    s1.ammo --;
    s1.health -= 5;
  }
}

void keyPressed() {
  if (key == 'f' || key == 'F') {
    s1.warning = "";
    s1.score += 500;
  }
}

void infoPanel() {
  rectMode(CORNER);
  fill(130, 130);
  stroke(255, 255, 0);
  rect(width * 0.75, height * 0.05, 110, 110);
  textAlign(LEFT);
  textSize(15);
  textFont(panelFont);

  if (s1.isOut()) {
    fill(255, 0, 0);
  } else {
    fill(0, 255, 0);
  }
  text("Ammo: " + s1.ammo, width * 0.77, height * 0.2);

  if (s1.health < 50) {
    fill(255, 0, 0);
  } else {
    fill(255);
  }
  text("Health: " + s1.health, width * 0.77, height * 0.1);

  if (s1.lives == 3) {
    fill(0, 0, 255);
  } else if (s1.lives == 2) {
    fill(255, 255, 0);
  } else if (s1.lives == 1) {
    fill(255, 0, 0);
  }
  text("Lives: " + s1.lives, width * 0.77, height * 0.15);

  fill(255);
  text("Score: " + s1.score, width * 0.77, height * 0.25);
}

void startScreen() {
  background(0);
  textAlign(CENTER, CENTER);
  textFont(startFont);
  text("Welcome to SpaceGame beta!", width/2, height/2);
  text("Click to Continue: ", width/2, height/2 + 40);

  if (mousePressed) {
    play = true;
  }
}

void endScreen() {
  noLoop();
  image(gameOver, 0, 0, 500, 500);
  textAlign(CENTER);
  text("Final score: " + s1.score, width * 0.5, height * 0.85);
  end.play();
}
