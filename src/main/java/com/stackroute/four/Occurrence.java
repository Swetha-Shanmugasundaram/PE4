/*Write a java program to count the total number of occurrences of a given character in a string
without using any loop?*/

package com.stackroute.four;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Occurrence {
    public int characterCount(String str, char ch){
        int count=0;
        Pattern pattern=Pattern.compile(String.valueOf(ch));
        Matcher matcher=pattern.matcher(str);
        while ((matcher.find())){
            count++;
        }
        return count;
    }

}
