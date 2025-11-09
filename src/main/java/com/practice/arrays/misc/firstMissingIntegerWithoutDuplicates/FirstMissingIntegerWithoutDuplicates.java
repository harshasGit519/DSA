package com.practice.arrays.misc.firstMissingIntegerWithoutDuplicates;

public class FirstMissingIntegerWithoutDuplicates {

    public static void main(String[] args) {

        FirstMissingIntegerWithoutDuplicates missingIntegerWithoutDuplicates =
                new FirstMissingIntegerWithoutDuplicates();
        int[] A = new int[]{10, 3, 1, 2, 5, -8, -3, 4};
       System.out.print("First Missing Integer is :: "+
               missingIntegerWithoutDuplicates.firstMissingPositive(A));

    }


    // If the values are less than or equal to 0 -> make then N+2 because the max possible answer
        //could be N+1 because the thing is all elements in an array could have been present
    // Get the abs value
    // Check if the abs value falls in the zone of the length of the array
    // If it falls, calculate the index as current val - 1 --> This is the main intuition
    // If the value at that index is already -ve, ignore, else, make it -ve
    // Loop over
    // Now, when ur out of the current loop, then iterate over again and return the current index +1 when the current index value is > 0(+ve)
    // If nothing is found, i.e. all are negative, which means all the values pertaining that length are present. Hence, N+1
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
