package com.java2novice.junit.tests;
 
import org.junit.Test;
import static org.junit.Assert.*;
 
public class MyAssertFalseTest {
 
    public boolean isEvenNumber(int number){
         
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
     
    @Test
    public void evenNumberTest(){

    	String str1 = null;

    	String str2 = "hello";              

    	

    	// Sucess.
    	assertNull(str1);

    	// Fail.
    	assertNull(str2);

    }
    
}