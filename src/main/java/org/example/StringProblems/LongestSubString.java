package org.example.StringProblems;

public class LongestSubString {

    boolean isDistinct(String str,int i,int j){

        boolean[] b=new boolean[256];
        for(int k=i;k<j;k++){
            if(b[str.charAt(k)]==true)
                return false;
            b[str.charAt(k)]=true;
        }
        return true;
    }

    public int longestSubStringLength(String str){
        int result=0;

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(isDistinct(str,i,j)){
                    result=Math.max(result,j-i+1);

                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        LongestSubString longestSubString=new LongestSubString();
        System.out.println(longestSubString.longestSubStringLength("Hello"));

    }
}
