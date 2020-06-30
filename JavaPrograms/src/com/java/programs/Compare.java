package com.java.programs;
import java.io.*;
import java.util.*;

class Comparator {
    public boolean compare(int a, int b) {
        boolean result = false;
        if (a == b) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public boolean compare(String s1, String s2) {
        boolean result = false;
        if (s1.length() == s2.length() && s1.equals(s2)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public boolean compare(int[] array1, int[] array2) {
        boolean result = false;
      
        if (Arrays.equals(array1, array2)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}



public class Compare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Comparator comp = new Comparator();
        
        int testCases = Integer.parseInt(scan.nextLine());
        while(testCases-- > 0){
            int condition = Integer.parseInt(scan.nextLine());
            switch(condition){
                case 1:
                    String s1=scan.nextLine().trim();
                    String s2=scan.nextLine().trim();
                    
                    System.out.println( (comp.compare(s1,s2)) ? "Same" : "Different" );
                    break;
                case 2:
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();
                    
                    System.out.println( (comp.compare(num1,num2)) ? "Same" : "Different");
                    if(scan.hasNext()){ // avoid exception if this last test case
                        scan.nextLine(); // eat space until next line
                    }
                    break;
                case 3:
                    // create and fill arrays
                    int[] array1 = new int[scan.nextInt()];
                    int[] array2 = new int[scan.nextInt()];
                    for(int i = 0; i < array1.length; i++){
                        array1[i] = scan.nextInt();
                    }
                    for(int i = 0; i < array2.length; i++){
                        array2[i] = scan.nextInt();
                    }
                    
                    System.out.println( comp.compare(array1, array2) ? "Same" : "Different");
                    if(scan.hasNext()){ // avoid exception if this last test case
                        scan.nextLine(); // eat space until next line
                    }
                    break;
                default:
                    System.err.println("Invalid input.");
            }// end switch
        }// end while
        scan.close();
    }
}