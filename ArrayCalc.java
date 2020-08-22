public class ArrayCalc {
  public int max(int[] in) {
    int tempmax = in[0];
    for (int i = 0; i < in.length; i++) {
      if (in[i] > tempmax)
        tempmax = in[i]; 
    } 
    return tempmax;
  }
  
  public int min(int[] in) {
    int tempmin = in[0];
    for (int i = 0; i < in.length; i++) {
      if (in[i] < tempmin)
        tempmin = in[i]; 
    } 
    return tempmin;
  }
  
  public int sum(int[] in) {
    int tempsum = 0;
    for (int i = 0; i < in.length; i++)
      tempsum += in[i]; 
    return tempsum;
  }
  
  double mean(int[] in) {
    return sum(in) / in.length;
  }
}