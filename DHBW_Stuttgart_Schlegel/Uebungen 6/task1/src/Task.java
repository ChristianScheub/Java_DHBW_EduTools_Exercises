import java.io.PrintStream;

public class Task {
  public static void main (String[] args){
      for(int n = -1; n <=1; n++){
          if(n >= 0){
              if(n == 0){
                  System.out.println(n + " ist 0");              }
          }
          else {
              System.out.println(n + " ist kleiner 0");
          }
      }
  }
}