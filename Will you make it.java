public class Kata {
  public static void main (String[] args) {
    zeroFuel(50, 2.5, 50);
  }
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    boolean result = false;
    double fuelNeeded = distanceToPump/mpg;
    double willYou = fuelLeft - fuelNeeded;
    if(willYou<0) result =false;
    if(willYou>=0) result =true;
    return result;
  }
  
}