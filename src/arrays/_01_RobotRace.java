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
    	   robots[i].setSpeed(10);
    	   robots[i].setPenColor(250,0,0);
    }
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
    Random r = new Random();
    boolean b = true;
    int ii = 0;
    System.out.println(b);
      while(b == true) {
    
        for(int i = 0; i < robots.length; i++) {
        	
       	    robots[i].move( r.nextInt(50) );
       	    
  		  if(robots[i].getY() > 100) {
  			  
			 b = true;
			 
		  }else {
			  
			 ii = i;
			 b = false;
			 i = 5;
			 
	      }
  		  
        }
        
      }
        
      int ii2 = ii+1;
      System.out.println("robot " + ii2 + " is the winner");
      
        while(b == false){
        	
          //robots[ii].turn(360);
        	  b = true;
          
        }
    
      
    
    
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	//7. declare that robot the winner and throw it a party!
      
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
        Random t = new Random();
        boolean n = true;
        int oo = 0;
        
        for(int i = 0; i < robots.length; i++) {
        	
     	   robots[i].setAngle(90);
     	   robots[i].setX(200);
     	   robots[i].setY(500);
     	   robots[i].setSpeed(1000);
     	   robots[i].setPenColor(250,0,0);
     	   
     }
        
        while(n == true) {
            
            for(int o = 0; o < robots.length; o++) {
            	    
            	    int now =  r.nextInt(10)+1 ;
           	    robots[o].move(now);
           	    double noww =  ( now * .4 )*-1 ;
           	    robots[o].turn((int) noww);
           	    
             if(robots[o].getX() > 185 && robots[o].getX() < 190 && robots[o].getY() > 400){
    			  
    			    oo = o;
    			    n = false;
    			    o = 5;
    			 
    	         }
      		  
           }
            
       }
        
        
        while(n == false){
        	
            robots[oo].turn(360);
          	  n = true;
            
          }
        
	}
}
