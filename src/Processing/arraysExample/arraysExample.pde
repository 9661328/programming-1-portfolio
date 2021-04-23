int[] nums = {5, 4, 2, 7, 6, 8, 5, 2, 8, 14};

//Uncomment each problem to see the result.

////Problem 1 - Square each number.
//for (int i = 0; i < nums.length; i++) {
//  nums[i] = nums[i]*nums[i];
//  println(nums[i]);
//}

////Problem 2 - Add a random number between 0 and 10 to each number.
//for (int i = 0; i < nums.length; i++) {
//  nums[i] = nums[i] + int(random(11));
//  println(nums[i]);
//}

////Problem 3 - Add to each number the number that follows in the array. Skip the last value in the array. 
//for(int i = 0; i < (nums.length)-1; i++) {
//  nums[i] = nums[i] + nums[i+1];
//  println(nums[i]);
//}

////Problem 4 - Calculate the sum of all numbers in the array.
//int total = 0;
//for (int i = 0; i < nums.length; i++) {
//  total += nums[i];
//}
//println(total);

////Problem 5 - If the mouse is over a rectangle, the rectangle changes color.
//int x = 50;
//int y = 50;
//int w = 100;
//int h = 75;

//void setup() {
//  size(200, 200);
//}

//void draw() {
//  background(255);
//  stroke(0);
//  if (mouseX < x+w && mouseX > x && mouseY < y+h && mouseY > y) {
//    fill(0, 93, 191);
//  } else {
//    fill(255);
//  }
//  rect(x, y, w, h);
//}

//Problem 6 - Create a Button class (on new sketch).

////Write numbers from 0-100 onto console
//int[] numbers = new int[101];
//for (int i = 0; i < numbers.length; i++) {
//  numbers[i] = i;
//  println(numbers[i]);
//}

////Write random numbers from 0-100 onto console
//int[] numbers = new int[101];
//for (int i = 0; i < numbers.length; i++) {
//  numbers[i] = int(random(101));
//  println(numbers[i]);
//}
