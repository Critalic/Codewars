class RowSumOddNumbers {
    public static void main(String[] args) {
      rowSumOddNumbers(4);
    }
    public static int rowSumOddNumbers(int n) {
      int result =0;
      int firN = n*(n-1) +1;
      for(int i =0; i<n; i++ ) {
        result += firN;
        firN+=2;
      }
      return result;
    }
}