/*Write a program to transpose the given string.*/
package com.stackroute.four;

public class Transpose {
    public String transposeword(String str){
        String[] string=str.split(" ");
        String temp="";
        for(int i=0;i<string.length;i++){
            StringBuffer sbf= new StringBuffer(string[i]);
            temp+=sbf.reverse()+" ";
        }
        temp=temp.trim();
        return temp;
    }
}
