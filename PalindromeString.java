class Palindrome {
  public static void main(String[] args) {
    System.out.println(isPal("ABBA"));
    System.out.println(isPal("aba"));
    System.out.println(isPal("aaaabbbbaaa"));
    System.out.println(isPal("caCaCc"));
  }

  public static boolean isPal(String str)
  {

      if(str.length()==0 || str.length()==1)
        return true;

      if(str.charAt(0)==str.charAt(str.length()-1))
        return isPal(str.substring(1,str.length()-1));

        return false;
  }
}
