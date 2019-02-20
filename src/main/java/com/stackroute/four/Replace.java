/*Write a program to replace all d with f and ll l with t in a given string*/
package com.stackroute.four;

public class Replace {
    public String replacechar(String str, char c1,char c2, char c3, char c4) {
        String str1 = str.replace(c1, c2);
        String str2 = str1.replace(c3, c4);
        return str2;
    }
}
