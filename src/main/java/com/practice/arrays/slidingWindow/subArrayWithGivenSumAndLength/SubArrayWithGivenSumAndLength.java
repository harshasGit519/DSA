package com.practice.arrays.slidingWindow.subArrayWithGivenSumAndLength;

public class SubArrayWithGivenSumAndLength {

//Input 1:
//
//
//A = [4, 3, 2, 6, 1]
//B = 3
//C = 11
//Output 1:
//1
//Explanation 1:
//
//
//The subarray [3, 2, 6] is of length 3 and sum 11.

    public static void main(String[] args){
        SubArrayWithGivenSumAndLength arrayWithGivenSumAndLength = new SubArrayWithGivenSumAndLength();
        int[] A = new int[]{4, 2, 2, 5, 1};
        int B = 4;
        int C = 6;
        System.out.print("Ans is ::"+arrayWithGivenSumAndLength.solve(A, B, C));
    }

    public int solve(int[] A, int B, int C) {
        int sum =0;
        int ans =0;
        for(int i =0;i<B;i++){
            sum += A[i];
        }
        if(sum == C){
            return 1;
        }

        for(int i =1, j=B;i<(A.length-B);i++, j++){
            sum = sum+A[j]-A[i-1];
            if(sum == C){
                return 1;
            }
        }
        return ans;
    }
}
