import java.util.*;
class Linecomparision {
      double length1;
      double length2;
      Scanner sc = new Scanner(System.in);
      int x1=sc.nextInt();
      int x2=sc.nextInt();
      int y1=sc.nextInt();
      int y2=sc.nextInt();
      int m1=sc.nextInt();
      int m2=sc.nextInt();
      int n1=sc.nextInt();
      int n2=sc.nextInt();
   static{
      System.out.println("Enter your 8 coordinates for computation");
   }

   Linecomparision(){
      System.out.println("Welcome to Line Comparison Computation Program");
   }
   void length1computation(){
      length1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
      System.out.println("Length of the first line:" + length1);
   }
   void length2computation(){
      length2=Math.sqrt((m2-m1)*(m2-m1) + (n2-n1)*(n2-n1));
      System.out.println("Length of the line:" + length2);
   }
   void comparision(){
      String str1=length1+"";
      String str2=length2+"";
      if(str1.equals(str2)==true)
         System.out.println(" Two lines are equal");
      else
         System.out.println("The two lines are not equal");
      double check = str1.compareTo(str2);
      if(check == 0)
         System.out.println("The two lines are equal");
      else if(check < 0.0)
         System.out.println("Line1 is smaller than Line2");
      else
         System.out.println("Line1 is greater than Line2");
   }
   public static void main(String[]args){
      Linecomparision a=new Linecomparision();
      a.length1computation();
      a.length2computation();
      a.comparision();
   }
}
