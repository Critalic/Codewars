public class School{
  public static void main(String [] args) {
    int [] marks = {10,12,9,11};
    getAverage(marks);
  }
  public static int getAverage(int[] marks){
    int result = 0;
    int sum =0;
    for( int i = 0; i< marks.length; i++) {
      sum+= marks[i];
    }
    result = sum/(marks.length);
    return result;
  }

}