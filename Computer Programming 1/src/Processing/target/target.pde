size(200, 200);  
background(255); 

float w = 200;  
while (w > 0) {   
  stroke(0);  
  fill(w);  
  ellipse(width/2, height/2, w, w);
  w -= 20;
}

// or

size(200, 200);  
background(255);  

for (float z = 200; z > 0; z -= 20) {   
  stroke(0);  
  fill(z);  
  ellipse(width/2, height/2, z, z);
}  
