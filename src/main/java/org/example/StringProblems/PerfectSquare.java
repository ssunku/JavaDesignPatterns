package org.example.StringProblems;

/**
 * This class provides methods to check if a given number is a perfect square.
 * It includes two approaches:
 * 1. usingBinarySearch: Uses binary search to efficiently determine if a number is a perfect square.
 * 2. isPerfectSquare: Uses the Math.sqrt() method to check if a number is a perfect square.
 *
 * @author Satya
 */
public class PerfectSquare {

    public static boolean usingBinarySearch(int num){
        if(num==0||num==1){
            return true;
        }
        int left=0;int right=num;
        while (left<=right){
            int mid=left+(right-left)/2;
            long square=mid*mid;
            if(square==num)
                return true;
            else if(square<num){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }

        return false;
    }

public static boolean isPerfectSquare(int num){

    int num1=(int)Math.sqrt(num);
    return (num1*num1==num);
}

    public static void main(String[] args) {

        System.out.println(PerfectSquare.usingBinarySearch(16));

    }
}
