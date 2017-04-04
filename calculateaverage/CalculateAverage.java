

package calculateaverage;


public class CalculateAverage {

    public double CalculateAverage(double [] temperatures) {
    int size = temperatures.length;
    double total = 0;
    
    for (int i = 0; i < size; i++) {
        total += temperatures[i];
    
    }
    double average = total/size;
    
    return average;
    }
    
    public static void main(String[] args) {
       double [] arrTemp = {73.0, 70, 80.0, 55.5}; 
       
       CalculateAverage calc = new CalculateAverage();
       double average;
        average = calc.CalculateAverage(arrTemp);
       
        System.out.println(average);
    }
    
}
