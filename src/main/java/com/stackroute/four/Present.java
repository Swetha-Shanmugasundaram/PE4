/*Write a program with the implementation of Regular Expression to find the presence of the name
Harry in a string.*/
package com.stackroute.four;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Present {
    public String presentword(String str,String word){
        Pattern pattern=Pattern.compile(word);
        Matcher matcher=pattern.matcher(str);
        if(matcher.find())
                return ("Is "+word+" here? true");
            else
                return ("Is "+word+" here? false");
    }
}
