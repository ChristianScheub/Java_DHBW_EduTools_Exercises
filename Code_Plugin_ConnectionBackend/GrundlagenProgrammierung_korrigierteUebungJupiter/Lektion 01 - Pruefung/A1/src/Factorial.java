public class Factorial {
  public static int computeFactorial(int n){
      if(n == 0){
          return 1;
      }
      if(n < 0){
          return -1;
      }
      return n* computeFactorial(n-1);
  }

    public static void main(String[] args) {

    }

}
