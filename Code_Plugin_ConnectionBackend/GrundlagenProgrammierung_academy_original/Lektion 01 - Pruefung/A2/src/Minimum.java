public class Minimum {
  public static double computeMinumum(double[] input){
      if(input == null){
          return Double.NaN;
      }
      if(input.length == 0){
          return Double.NaN;
      }
     double min = Double.MAX_VALUE;
     for(double element: input){
         if(element < min){
             min = element;
         }
     }
     return min;
  }

    public static void main(String[] args) {

    }

}
