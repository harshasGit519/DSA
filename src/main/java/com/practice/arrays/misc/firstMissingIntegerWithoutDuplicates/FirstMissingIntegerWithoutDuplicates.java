package com.practice.arrays.misc.firstMissingIntegerWithoutDuplicates;

public class FirstMissingIntegerWithoutDuplicates {

    public static void main(String[] args) {

        FirstMissingIntegerWithoutDuplicates missingIntegerWithoutDuplicates =
                new FirstMissingIntegerWithoutDuplicates();
        int[] A = new int[]{10, 3, 1, 2, 5, -8, -3, 4};
       System.out.print("First Missing Integer is :: "+
               missingIntegerWithoutDuplicates.firstMissingPositive(A));

    }

    public int firstMissingPositive(int[] A) {
        int n = A.length;

        for(int i =0;i<n;i++){
            if(A[i] <=0){
                A[i] = n+2;
            }
        }

        for(int i=0;i<n;i++){
            int val = Math.abs(A[i]);
            if(val>0 && val<=n){
                int index = val-1;
                if(A[index]>0){
                    A[index] = A[index] * -1;
                }
            }
        }

        for(int i =0;i<n;i++){
            if(A[i]>0){
                return i+1;
            }
        }

        return n+1;
    }
}
