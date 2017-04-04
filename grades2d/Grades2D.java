
package grades2d;



public class Grades2D {
    
   
   public double grades(int [][] gradeTable, int student){
   int gradeValues = gradeTable.length;
   int total = 0;     
   for (int p = 0; p < gradeValues; p++) {
       total += gradeTable[p][student];

   }
    double average = total/(double) gradeValues;
    
    return average;
   }
   
   /*public void loops4Days() {
   
   for (int i = 0; i < 3; i++) {
   
       for (int j = 0; j < 3; j++)
           System.out.println("Anus");
   }
   
   }*/
    
   public void testGrades(int [][] theTable, int rowSize, int colunmSize) {
   
   int gradeLength = theTable.length;
   int total = 0;
   
   for (int r = 0; r < rowSize; r++) {
       
       for (int c = 0; c < colunmSize; c++) {
       
       total += theTable[r][c];
       }
   
   }
   
   }
    
   
    public static void main(String[] args) {
        
        
        
    }
    
}
