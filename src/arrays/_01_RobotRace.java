package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	//2. create an array of 5 robots.
    Robot[] robots = new Robot[5];		
    //3. use a for loop to initialize the robots.
    for(int i = 0; i < robots.length; i++) {
    	   robots[i] = new Robot();
    }
	//4. make each robot start at the bottom of the screen, side by side, facing up
    for(int i = 0; i < robots.length; i++) {
    	   robots[i].setAngle(0);
    	   robots[i].setX((i*100)+200);
    	   robots[i].setY(500);
    	   robots[i].setSpeed(100);
    	   robots[i].setPenColor(250,0,0);
    }
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
    Random r = new Random();
    boolean b = true;
    int ii = 0;
    
      while(b == true) {
    
        for(int i = 0; i < robots.length; i++) {
       	    robots[i].move( r.nextInt(10) );
  		  if(robots[i].getY() > 100) {
			 b = true;
		  }else {
			 ii = i;
			 b = false;
	      }
        }
        
        while(b = false){
        //robots[ii].turn(10);
        }
    
      }
    
    
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
