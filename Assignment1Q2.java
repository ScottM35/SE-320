import java.util.InputMismatchException; 
import java.util.Scanner; 

public class Assignment1Q2 { 
		//random1.java 
	public static void main(String []args) { 
		int[] array = new int[100]; 
		for (int k = 0; k < array.length; k++) { 
			array[k] = (int) (Math.random() * 100); 
				} 
	Scanner inputval = new Scanner(System.in); 
	System.out.print("Enter an index here: "); 
		try {
			int index = inputval.nextInt(); 
			System.out.println("array[" + index + "] = " + array[index]); 
			} catch (ArrayIndexOutOfBoundsException ex) { 
				System.out.println("INDEX " + ex.getLocalizedMessage() + " is out of bounds"); 
			} catch(InputMismatchException ime) {
					System.out.println("Wrong input"); 
			} catch (Exception exc) { System.out.println("YOU ENTERED AN INVALID INPUT"); 
			}
		}
	}

