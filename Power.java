class Power {

  static int cnt = 0;
  public static void main(String[] args) {
    
    System.out.println(fastPow(2,10));
    System.out.println(cnt);
  }

  public static int fastPow(int a,int b)
  {
    cnt++; // For Counting how mamny time function is called
    if(b==0)
      return 1;

    if(b%2==0)
      return fastPow(a*a , b/2);

      return a * fastPow(a,b-1);
  }
}
