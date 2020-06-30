package com.java.programs;

import java.util.*;
public class IndexOfTheElement {
   

    public void indexOfTheElement(int[] myarray){
        
        for(int i=0;i<myarray.length;i++){
               for(int j=i;j<myarray.length;j++){
            	   
            if((myarray[j]!=myarray[i]) && (j==i+1)){
            	
              System.out.println("position of the value changed"+j);
            
             break;
          }
        }
      }
     }
    
    public static void main(String [] args){
        
        int[] s={1,0,0,1};
        IndexOfTheElement i=new IndexOfTheElement();
        i.indexOfTheElement(s);
     }
}





