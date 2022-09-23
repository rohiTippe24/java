//  Calendar class in java
import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendar {
  
  public static void main (String[] args) {
    
    Calendar cal = Calendar.getInstance();
   
//  Print Calendar Type
    
    System.out.println(cal.getCalendarType());
    
//  Findout time zone
  // System.out.println(cal.getTimeZone());
   
//  Find out Default timezone ID
   System.out.println(cal.getTimeZone().getID());
   
//  DATE
   System.out.println(cal.get(Calendar.DATE));
    
//  Month
   System.out.println(cal.get(Calendar.MONTH));
   
//  Year
   System.out.println(cal.get(Calendar.YEAR));
   
//  Time
   System.out.println(cal.get(Calendar.HOUR) + "." + cal.get(Calendar.MINUTE) + "." + cal.get(Calendar.SECOND) );
    
 GregorianCalendar gc = new GregorianCalendar(); 
 
//  Check Leap Year
   System.out.println(gc.isLeapYear(2004));

  }
  
  
}
