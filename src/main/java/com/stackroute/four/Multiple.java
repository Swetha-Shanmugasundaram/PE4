/*Write a program to find out the multiple occurrences of the given word in a string using Matcher
methods.*/
package com.stackroute.four;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Multiple {
    public String[] multipleFunction(String string, String word)
    {
        String str="";
        Pattern pattern=Pattern.compile(word);
        Matcher m = pattern.matcher(string);
        while(m.find())
        {
            str+="Found at: "+m.start()+" - "+m.end()+",";
        }
        String[] output = str.split(",");
        return output;
    }
}
