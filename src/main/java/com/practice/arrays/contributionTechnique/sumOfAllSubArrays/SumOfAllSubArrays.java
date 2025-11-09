package com.practice.arrays.contributionTechnique.sumOfAllSubArrays;

public class SumOfAllSubArrays {

    public static void main(String[] args) {
        SumOfAllSubArrays allSubArrays = new SumOfAllSubArrays();
        int[] A = new int[]{1, 2, 3};
        System.out.print("Sum of All Sub Arrays :: " + allSubArrays.subarraySum(A));
    }

    public long subarraySum(int[] A) {
        long ans = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            // casting to long at first place rather than casting later when all calculations are done so that we dont land into integer overflow issues
            ans += (long) A[i] * (i + 1) * (n - i);
        }
        return ans;
    }
}
