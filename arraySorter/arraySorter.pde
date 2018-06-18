
//1. create an array of ints. don't initialize it yet.
int[] i;
int f = 400;
void setup() {
  //2. set the size of your window
  //  if you are using Processing 3, you cannot use variables
  size(400,400);
  //3. initialize your array with the built in width variable
  i = new int[width];
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  for(int j = 0; j < width; j++){
    i[j] = int(random(height)+1);
  }
  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
  background(random(50),random(50),random(50));
  //7. set the color for your graph
  fill(random(50)+200,random(50)+200,random(50)+200);
  //8. draw a rectangle for each int in your array.
  //   the x value will be the element of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array
  for(int j = 0; j < width; j++){
  rect(j,i[j],1,-i[j]);
  }
  //9. call the stepSort method
  stepSort(i);
  //10. extract the code that randomizes the array into a method.
  
  //11. call the method you made in step 10 when the mouse is pressed
  
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}

void setRandom(int[] arr){
  float f;
  for(int j = 0; j < arr.length; j++){
    f = random(5)+1;
    if(f <= 3){
      arr[j] = int(random((height*2)+1)+1);
    }else if(f > 3){
      arr[j] = int(random(height)+1);
    }
  }
}

void mouseClicked(){
  setRandom(i);
  delay(100);
}