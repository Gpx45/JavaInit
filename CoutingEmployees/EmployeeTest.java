



public class EmployeeTest
{
  public static void main(String[] args)
  {
    // Show that count is 0 before creating Employees.
      System.out.printf("Employees before instantiation: %d\n",
      Employee.getCount());

      Employee emp1 = new Employee("Susan", "Parker");
      Employee emp2 = new Employee("Bob", "Blue");

      // Show that count is 2 after creating two Employees.
      System.out.println("\nEmployees after instantiation: ");
      System.out.printf("via emp1 getCount(): %d\n", emp1.getCount());
      System.out.printf("via emp2 getCount(): %d\n", emp2.getCount());
      System.out.printf("via Employee.getCount():  %d\n",
        Employee.getCount());

      System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n",
      emp1.getFirstName(), emp1.getLastName(),
      emp2.getFirstName(), emp2.getLastName());

      // in this example, there is only one reference to each Employee.
      // so the following two statements indicate that these objects
      // are eligible for garbage collection.
      emp1 = null;
      emp2 = null;
  }// end of main.
}// end of class.
