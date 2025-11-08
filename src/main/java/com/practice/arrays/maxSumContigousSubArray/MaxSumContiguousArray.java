package com.practice.arrays.maxSumContigousSubArray;

public class MaxSumContiguousArray {

    public static void main(String[] args){
        MaxSumContiguousArray maxSumContiguousArray = new MaxSumContiguousArray();
        int[] A = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.print("Max Sub Array Sum is :: "+maxSumContiguousArray.maxSubArray(A));
    }

    public int maxSubArray(final int[] A) {
        int sum = A[0];
        int max = A[0];
        for(int i =1;i<A.length;i++){
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
