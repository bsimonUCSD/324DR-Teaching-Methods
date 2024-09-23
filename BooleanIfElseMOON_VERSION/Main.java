import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  
    //Inspiration https://stepik.org/lesson/255523/step/4
    
    int distance = 238900; //distance to the moon in miles
    int time = 5; //in hours
    int speed = 25000; //speed of Apollo 11 in miles / hour

    //Can we make it to the moon on time?
    if (distance/speed <= time)
    {
      System.out.println("You made it in " + distance/speed + " hours!");
    }
    else
    {
      System.out.println("Sorry you didn't make it within " + time + " hours");
      System.out.println("You needed " + (distance/speed-time) + " more hours");
    }
    System.out.println("Welcome to the moon!");
    
  }
}