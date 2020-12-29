using System;

  public static class Paper
  { 
      public static void main(String[] args) {
    int m = 10;
    int n = 5;
    Paperwork(n,m);
  }
    public static int Paperwork(int n, int m)
    {
      if(n<0 | m<0) return 0;
      int result = n*m;
      return result;
    }
  }