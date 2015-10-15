import java.util.Scanner;

class av {
  public static void main (String [] args){
  
    Scanner sc = new Scanner (System.in);  
    double x0, x1, answer;
    
    System.out.print ("x0? ");
    x0 = sc.nextDouble();
    
    System.out.print ("x1? ");
    x1 = sc.nextDouble();
    
    answer = (((38*x1)-(4.9*x1*x1))-((38*x0)-(4.9*x0*x0)))/(x1-x0);
    
    System.out.println ("Average velocity : "+answer);
    
    }
}