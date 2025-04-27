package org.example.StringProblems;

public class SubSequenceOfString {

    public static boolean checkSubSequenceOfAnotherString(String str1,String str2){

        boolean b=false;
        int j=0;
        for(int i=0;i<=str1.length()-1;i++){
            if(str1.charAt(i)==str2.charAt(j)){
                j++;
            }
        }
        if(j==str2.length())
            return true;
        else return false;


    }

    public static void main(String[] args) {

        System.out.println(SubSequenceOfString.checkSubSequenceOfAnotherString("ABCD","AD"));

    }
}
