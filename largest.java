class Main {
  public static void main(String[] args) {
    int a,b,c;
    a=10;
    b=5;
    c=6;
    if (a > b && a > c)
         System.out.println("First number is largest.");
      else if (b > a && b > c)
         System.out.println("Second number is largest.");
      else if (c > a && c > b)
         System.out.println("Third number is largest.");
  }
}
