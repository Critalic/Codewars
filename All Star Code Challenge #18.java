public class CodeWars {
  public static void main(String[] args) {
    strCount("Hello", 'o'); // => 1

  }
  public static int strCount(String str, char letter) {
    int result =0;
    for( int i = 0; i<str.length(); i++) {
      if(str. charAt(i)== letter)  result++;
    }
    return result;
  }
}