class Count {
  public static void main(String[] args) {
  int num =12345;
  int count = 0;
   for(count=0;num!=0;num=num/10) 
     count=count+1;
    System.out.println("Number of digits: " + count);
    }
}
