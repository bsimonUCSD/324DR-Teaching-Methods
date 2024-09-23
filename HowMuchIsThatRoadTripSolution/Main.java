class Main {
  public static void main(String[] args) {
    
    int totalDistance = 664; //Distance from Lincoln High School in San Diego to Las Vegas, NV
    double mpg = 34; //2003 Honda Accord on freeway
    double gasPricePerGallonSanDiego = 3.22; //Hey, it's the pandemic

    double gallonsGasNeeded;
    double roadTripGasCost;

    gallonsGasNeeded = totalDistance/mpg;

    roadTripGasCost = gallonsGasNeeded * gasPricePerGallonSanDiego;

    System.out.println("A road trip from San Diego to Las Vegas and back will cost $" + roadTripGasCost);
  }
}