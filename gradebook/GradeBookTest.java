/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;


public class GradeBookTest {
int grade;

public GradeBookTest(int classGrade) {

   grade = classGrade;
}

public void display() {

System.out.println("\n Welcome to the GradeBook App...");
}

public void grade() {

int mygrade = 80;
System.out.println("\n Your grade is " + mygrade); 
}
public static void main(String agrs[]) {

    GradeBookTest myGradeBook = new GradeBookTest(5);
    myGradeBook.display();
    myGradeBook.grade();
    
    
    /*
    This is in another java class in which
    the constructor has to be the same name
    as the class name.
    
    */
    alert newAlert = new alert();
    newAlert.alert();


}
    
}
