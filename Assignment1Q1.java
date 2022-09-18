import java.util.Scanner;

public class trial { 
	public static void main(String[] args) { 
		
		System.out.print("Enter Your Two Integers : ");
		
        Scanner sc= new Scanner(System.in);
        String a = sc.nextLine(); 
        String b = sc.nextLine(); 
        
        
        
        
        try{
             Integer.parseInt(a);
             Integer.parseInt(b);
             /*Integer.parseInt(b.next());*/
             int A=Integer.parseInt(a);  
             int B=Integer.parseInt(b);  
             int c = A+B;
             
             System.out.println("Sum is: " + c);
           
             
        }catch (NumberFormatException ex) {
            System.out.println("The one of your numbers is not an integer ");
        }
	
	}
}
