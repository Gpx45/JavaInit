
package smallestdouble;


public class SmallestDouble {

   public void smallestDouble() {
   
       
   
   }
    
   public double findSmall(double[] smallest) {
       int size = 0;
       size = smallest.length;
       double smallNum = Double.MAX_VALUE;
       
       for (int i = 0; i < size; i++) {
           if (smallest[i] < smallNum)
               smallNum = smallest[i];
       
       }
       
   return smallNum;
   }
    public static void main(String[] args) {
       /*
        Example of instantiating an array object to manipulate it.
        
        double [] doubArr = new double[7];
        
       doubArr[0]= 11;
       doubArr[1] = 12;
       doubArr[1] = 13;
       doubArr[1] = 14;
       doubArr[1] = 15;
       doubArr[1] = 16;
        .....
        .....
       */
       
        double [] fastestTimes = {4.67, 7.86, 3.56, 8.98, 2.56, 1.98, 10.45};
        SmallestDouble smallObj = new SmallestDouble();
        
        System.out.println(smallObj.findSmall(fastestTimes));
    }
    
}
