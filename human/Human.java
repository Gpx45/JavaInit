/*
 basic creating objects and methods
with parameters

 */
package human;

/**
 *
 * @author Victor
 */
public class Human {

    int age;
    char letter;
    
   public Human() {
       char lastLetter = 'P', firstLetter = 'L';
       System.out.print(lastLetter);
       letter = firstLetter;
   
   }
    public void humansAge(int manAge) {
        age = manAge;
        System.out.println("Whats his age? ");
    }
    public char getLInitial() {
    Human eddy = new Human();
    return letter;
    }
    
    public static void main(String[] args) {
        Human eddy = new Human();
        eddy.humansAge(3);
        char initial = eddy.getLInitial();
        System.out.println("\n" + initial);
    System.out.println(5 + 5 != 110 % 100);
    
     
    }
    
}
