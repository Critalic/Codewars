public class EvenOrOdd {
  public static void main (String[] args) {
    int number = 5;
    even_or_odd(number);
  }

    public static String even_or_odd(int number) {
        String str;
                
        if(number%2 ==0) str ="Even";
        else str = "Odd" ;
        return str;
    }
}