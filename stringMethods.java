//  String Methods in java

public class stringMethods {
  public static void main (String[] args) {
    
//  Types to declase String
  String s1 = "Rohit";
  String s2 = new String("Tippe");
  
//  measure length of string  .length();
  System.out.println("String Length  :-  " + s1.length() );
  
//  convert string to lower case  .toLowerCase();
  System.out.println(  "LowerCase  :-  " + s1.toLowerCase());
  
//  convert string to upper case  .toUpperCase();
  System.out.println("UpperCase  :-  "  + s1.toUpperCase());
  
//  remove extra spaces  .trim();
  String s3 = "            Rohit     ";
  System.out.println("Non Trimed String  :-  " + s3 );
  System.out.println("Trimed String  :-  " + s3.trim());
  
//  print string from specific index to end .substrint(index);
  System.out.println("Substring  :-  " + s1.substring(2) );
  
//  pring string from specific index to specific index .substring(start index , end index);
  System.out.println("substring  :-  " + s1.substring(2 , 5) );

//  replace special character from string  .replace(orignal char , new char);
  System.out.println("character replaced  ;-  " + s2.replace('t' , 'p') );
  
//  replace special string from tring .replace(orignal string , new string);
  System.out.println("String Replaced  :-  " + s1.replace("it" , "an") );
   
// check string starts with which character  .startsWith(string);
//  it returns boolean value
  System.out.println("s1 starts with Ro  :-  " + s1.startsWith("Ro") );
  
//  check string ends with .endsWith(string);
//  it also returns boolean value
  System.out.println("s1 ends with m  :-  " + s1.endsWith("m") );
  
//  find character on specific index  .charAt(index);
  System.out.println("Character at 2 index  :-  " + s1.charAt(2) );
  
//  find index of specific character  .indexOf(char);
  System.out.println("index of o  :-  " + s1.indexOf("o") );
  
//   calculate index from last .lastindexOf(char);
  System.out.println("index of t from last  :-  " + s2.lastIndexOf("t") );

//  Check equality of string  .equals(string to compare);
  System.out.println("s1 == Rohit  :-  " + s1.equals("Rohit") );
  
//  ignore lower or upper case when check equality
  System.out.println("s1 == RoHiT  :-  " + s1.equalsIgnoreCase("RoHiT") );
  
    
  }
}
