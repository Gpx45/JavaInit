


public class allStaticTest
{
  public static void main(String[] args)
  {
    System.out.printf("\nEmployees before instantiation: %d\n",
    Employee.getCount());

    Employee emp1 = new Employee("Susan", "Baker");
    Employee emp2 = new Employee("Susan", "Baker");

    System.out.println("\nEmployees after instantiation:\n");
    System.out.printf("via emp1.getCount: %d\n", emp1.getCount());
    System.out.printf("via emp2.getCount: %d\n",emp2.getCount());
    System.out.printf("via Employee.getCount %d \n", Employee.getCount());

    System.out.printf("\nEmployees 1: %s %s\nEmployees 2: %s %s\n",
    emp1.getFirstName(),emp1.getFirstName(),
    emp2.getLastName(),emp2.getLastName());

    emp1 = null;
    emp2 = null;
  }
}
