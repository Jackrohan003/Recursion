class FindAllPathInMatrix {
  public static void main(String[] args) {
    System.out.println(findPathMatrix(3,2));
  }

  public static int findPathMatrix(int m,int n)
  {
    if(n==1 || m == 1)
      return 1;

      return findPathMatrix(m-1,n) + findPathMatrix(m,n-1);
  }
}
