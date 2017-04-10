


public class Time2
{
	
private int hour, minute, second;


public Time2()
{
this(0, 0, 0);	

}

public Time2(int h)
{
this(h, 0, 0);	

}

public Time2(int h, int m)
{
this(h, m, 0);	

}

public Time2(int h, int m, int s)
{
this(h, m, s);	

}

public Time2(Time2 time)
{
this(time.getHour(), time.getMinute(), time.getSecond());	

}

public void setTime(int h, int m, int s)
{
	setHour(h);
	setMinute(m);
	setSecond(s);
	
}

public void setHour(int h)
{
if (h >= && h < 24)
	hour = h;
else
	throw new IllegalArgumentException("hour must be 0-23");

}

public void setMinute(int m)
{
if (m >= && m < 60)
	minute = m;
else
	throw new IllegalArgumentException("minute must be  0-59");

}

public void setSecond(int s)
{
if (s >= 0 && s < 60)
	second = ((s >= 0 && s < 60)? s : 0)
else
	throw new IllegalArgumentException("hour must be 0-23");

}

// end of page 321 on book.


}