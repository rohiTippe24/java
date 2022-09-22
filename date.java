import java.util.Date;

public class date {
  
  public static void main (String[] args) {
    
//  Ststem.currentTimeMillis()  :-  gives that how many seconds was complated aftes 1 jan 1970

    System.out.println(System.currentTimeMillis());
    
//  let`s find out Year

   System.out.println(System.currentTimeMillis()/1000/3600/24/365);
    
    // 
    
    Date date = new Date();
  
  //  Print current full date
    System.out.println(date);
    
    //  milli second 
    System.out.println(date.getTime());
   
   //  find out current date
    System.out.println(date.getDate());
    
    //  find out current second
    System.out.println(date.getSeconds());
    
    //  Find out Current Year
    System.out.println(date.getYear()+1900);
    
    //  Find Current Month 
    System.out.println(date.getMonth());
    
  }
  
  
}
