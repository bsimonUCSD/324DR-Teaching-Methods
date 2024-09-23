import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
 
    int distance = 238900; //distance to the moon in miles
    int time = 5; //in hours
    int speed = 25000; //speed of Apollo 11 in miles / hour

    //Can we make a road trip to the moon?
    if (speed/distance <= time) 
    {
      System.out.println("You made it in " + speed/distance + " hours!"); 
    }
    else if (speed/distance >= time)
    {
      System.out.println("Sorry you didn't make it. You needed " + (time-speed/distance) + " more hours"); 
    }
    System.out.println("Welcome to the moon!");
    
  }
}