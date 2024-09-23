class Main {
  public static void main(String[] args) {
    int speed = 75;
    int fine = 0;

    if (speed > 65 && speed < 75)
    {
      fine = 50;
    }
    else if (speed >= 75 && speed < 85)
    {
      fine = 100;
    }
    else if (speed >= 85)
    {
      fine = 200;
    }
    System.out.println("Your fine is " + fine);
  }
}
