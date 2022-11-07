import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.*;
import java.security.InvalidParameterException;


public class Assign4 {
  public static void main(String[] args) throws FileNotFoundException {
    // Create a set
    Set<String> s1 = new HashSet<>();
    s1.add("George");
    s1.add("Jim");
    s1.add("John");
    s1.add("Blake");
    s1.add("Kevin");
    s1.add("Michael");

    // Create another set
    Set<String> s2 = new HashSet<>();
    s2.add("George");
    s2.add("Katie");
    s2.add("Kevin");
    s2.add("Michelle");
    s2.add("Ryan");


    // Print the elements of both sets
   

    // Perform set operations
    System.out.println("\nQ1");
    System.out.println("s1: " + s1);
    System.out.println("s2: " + s2);

    performUnion(s1, s2);//w w w . j  a  v a2 s . com
    performIntersection(s1, s2);
    performDifference(s1, s2);
    textFile();
    formatNumber();
  }

  public static void performUnion(Set<String> s1, Set<String> s2) {
    Set<String> s1Unions2 = new HashSet<>(s1);
    s1Unions2.addAll(s2);
    System.out.println("Union: " + s1Unions2);
  }

  public static void performIntersection(Set<String> s1, Set<String> s2) {
    Set<String> s1Intersections2 = new HashSet<>(s1);
    s1Intersections2.retainAll(s2);
    System.out.println("Intersection: " + s1Intersections2);
  }

  public static void performDifference(Set<String> s1, Set<String> s2) {
    Set<String> s1Differences2 = new HashSet<>(s1);
    s1Differences2.removeAll(s2);

    Set<String> s2Differences1 = new HashSet<>(s2);
    s2Differences1.removeAll(s1);

    System.out.println("s1 Difference s2: " + s1Differences2);
    System.out.println("s2 Difference s1: " + s2Differences1);
  }
  
  public static void textFile() throws FileNotFoundException {
	  
	  System.out.println("\nQ2");
	  File file = new File("filename.txt");
	  
      if (!file.isFile())
          throw new FileNotFoundException(file + " is not a file.");

      try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)), 10000)) {

          String inputS;
          StringBuilder sb = new StringBuilder(10000);
          while ((inputS = in.readLine()) != null)
              sb.append(inputS);

          String[] words = sb.toString().split("\\s+");
          // non duplicate words
          TreeSet<String> ndWords = new TreeSet<>(Arrays.asList(words));

          for (String s : ndWords)
              System.out.println(s);

      } catch (IOException e) {
          e.printStackTrace();
          System.exit(0);
      }
  }
  public static void formatNumber() {
	   
	  
	  System.out.println("\nQ3");

	  double n = 12345.678;
	  String n2 = "12345.678";
	  
	  NumberFormat currencyFormat = 
			  NumberFormat.getCurrencyInstance(Locale.UK);
			System.out.println("a."+currencyFormat.format(12345.678));
			
			NumberFormat currencyFormat2 = 
					  NumberFormat.getCurrencyInstance(Locale.US);
					System.out.println("b."+currencyFormat2.format(12345.678));
					
					
					double d = Double.parseDouble(n2);
					int i = (int) d;
					
					System.out.println("c"+i);

	   
	  }
  
}

