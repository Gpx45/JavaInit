



public class Employee
{
  private String firstName, lastName;
  private static int count = 0; // number of Employees created

public Employee(String first, String last)
{
  firstName = first;
  lastName = last;

  // initialize Employee, add 1 to static count and
  // output String indicating that constructor was called.
  ++count;
  System.out.printf("Employee constructor: %s %s; count = %d\n",
    firstName, lastName, count);
}

public String getFirstName()
{
  return firstName;
}

public String getLastName()
{
  return lastName;
}

public static int getCount()
{
  return count;
}



}
