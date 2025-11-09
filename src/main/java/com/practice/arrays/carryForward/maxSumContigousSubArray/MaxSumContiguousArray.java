package com.practice.arrays.carryForward.maxSumContigousSubArray;

public class MaxSumContiguousArray {

    public static void main(String[] args){
        MaxSumContiguousArray maxSumContiguousArray = new MaxSumContiguousArray();
        int[] A = new int[]{-163, -20};
        System.out.print("Max Sub Array Sum is :: "+maxSumContiguousArray.maxSubArray(A));
    }

    public int maxSubArray(final int[] A) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<A.length;i++){
            sum = sum+A[i];
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }

}
