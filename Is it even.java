public class Number {
  public static void main( String [] args) {
    
    isEven(6);
  }
  public static boolean isEven(double n) {
      boolean result = false;
      if(n%2 ==0) result = true;
      return result;
  }
}