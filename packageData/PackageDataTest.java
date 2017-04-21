



public class PackageDataTest
{
  public static void main(String[] args)
  {
    // intantiate PackageData obj package.
    PackageData pckg = new PackageData();

    // output String representation of package obj.
    System.out.printf("After instantiation:\n%s\n", pckg);

    pckg.number = 77;
    pckg.string = "Goodbye";

    System.out.printf("\nAfter changing values:\n%s\n",pckg);
  }
}

  class PackageData
  {
    int number;
    String string;

    public PackageData()
    {
      number = 0;
      string = "Hello";
    }// end of PackageData constructor.

    public String toString()
    {
      return String.format("number: %d; string: %s", number, string);
    }
  }
