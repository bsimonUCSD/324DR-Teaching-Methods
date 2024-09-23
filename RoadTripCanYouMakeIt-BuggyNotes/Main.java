import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
 
    int distance = 238900; //distance to the moon in miles
    //Should be named distanceToDestination (to reflect it's the one-way distance)
    int time = 5; //in hours
    int speed = 25000; //speed of Apollo 11 in miles / hour

    //Optional: Could declare and initialize a variable called timeNeeded = distance*2/speed

    //Can we make a road trip to the moon?
    if (speed/distance <= time) //Should be distance*2/speed
    {
      System.out.println("You made it in " + speed/distance + " hours!"); //Missing a +  AND calculation should be distance*2/speed
    }
    else if (speed/distance >= time) //should just be an else -- either you make it or not AND the negation of <= is >
    {
      System.out.println("Sorry you didn't make it. You needed " + (time-speed/distance) + " more hours"); //Calculation should be distance*2/speed - time 
    }
    System.out.println("Welcome to the moon!");
    
  }
}