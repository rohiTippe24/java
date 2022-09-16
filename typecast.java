//  type casting in java

public class typecast {
  
  public static void main (String[] args) {
    
    //  byte , short , char , int , long , float , double , string
    
    //  if  data type of element is greater than orignal
    
    int i1 = 5;
    double d1 = i1;
    System.out.println("new data type is greater than orignal : ");
    System.out.println(d1);
    System.out.println();
   
    // if data type of element is smaller than orignal
    
    double dd  = 5.5;
    int ii = (int)dd;
    System.out.println("new data type is smaller than orignal");
    System.out.println(ii);
    System.out.println();
  
    //  type casting string to all
    
    String a = "24";
    int b = Integer.parseInt(a);
    boolean d = Boolean.parseBoolean(a);
    float e = Float.parseFloat(a);
    double f = Double.parseDouble(a);
    long g = Long.parseLong(a);
  
    char h = a.charAt(0);
   
    System.out.println("String to all");
    System.out.println(a);
    System.out.println(b);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);
    System.out.println();
   
// true , True TRuE all of them are true;
    String t = "TrUe";
    boolean bl = Boolean.parseBoolean(t);
    System.out.println(bl);
    
  }
  
}
