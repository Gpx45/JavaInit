
package pyramid;



public class Pyramid {

public int countBlocks(int levels) {

    int total = 0;
    
    for (int i = 1; i <= levels; i++) {
 
        total += i * i;  
    }

return total;
}
    
    
    public static void main(String[] args) {
        Pyramid countLevels = new Pyramid();
        System.out.println(countLevels.countBlocks(3));
        
        
    }
    
}
