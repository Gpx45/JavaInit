public class ThisTime
{
  public  static void main(String[] args)
  {
      SimpleTime time = new SimpleTime(15, 30, 19);
      System.out.println(time.buildString());


  }
}

class SimpleTime
{
private int hour, minute, second;

public SimpleTime(int clockHour, int clockMinute, int clockSecond)
{
this.hour = clockHour;
this.minute = clockMinute;
this.second = clockSecond;
}

public String buildString()
{
return String.format("%24s: %s\n%24s: %s"
, "this.toUniversalString()", this.toUniversalString(),
"toUniversalString()", toUniversalString());

}

public String toUniversalString()
{

return String.format("%02d:%02d:%02d",
this.hour, this.minute,this.second);

}


}
