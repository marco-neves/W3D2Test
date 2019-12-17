public class isDivisible{
  public static void main(String[] args){
    int num = 5;
    checkIfDivisible(num);
  }
  public static void checkIfDivisible(int number){
    if(number%3==0)
      System.out.println("fizz");
    else if(number%5==0)
      System.out.println("buzz");
    else if(number%3==0 && number%5==0)
      System.out.println("fizzbuzz");
    else
      System.out.println("neither");
  }
}
