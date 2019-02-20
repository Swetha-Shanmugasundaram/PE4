/*Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.*/
package com.stackroute.four;

import java.util.Arrays;

public class Sort {
    public String sortasc(String str){
        String string=str.replaceAll("\\s","");
        char temp[]=string.toCharArray();
        Arrays.sort(temp);
        String sort=new String(temp);
        return sort;
    }
}
