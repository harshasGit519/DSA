package com.practice.arrays.equilibriumIndex;

//Example Input
//Input 1:
//
// A = [3, 4, 7, 1, 2, 9, 8]
//Input 2:
//
// A = [2, 5, 1, 6]

import java.util.HashMap;
import java.util.Map;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] A = new int[]{3, 4, 7, 1, 2, 9, 8};
        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();
        int[] result = equilibriumIndex.equal(A);
        System.out.print("Equilibrium Index Values are :: ");
        for (int ans : result) {
            System.out.print(ans + "\t");
        }

    }


    public int[] equal(int[] A) {
        int[] result = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        Map<Integer, Pair<Integer, Integer>> map = new HashMap<>();
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = A[i] + A[j];
                Pair<Integer, Integer> p = new Pair<Integer, Integer>(i, j);
                if (map.containsKey(sum)) {
                    Pair<Integer, Integer> existingPair = map.get(sum);
                    int pairKey = existingPair.getI();
                    int pairValue = existingPair.getJ();
                    if (pairKey != i && pairKey != j && pairValue != i && pairValue != j) {
                        if (result[0] > pairKey ||
                                (result[0] == pairKey && result[1] > pairValue) ||
                                (result[0] == pairKey && result[1] == pairValue && result[2] > i) ||
                                (result[0] == pairKey && result[1] == pairValue && result[2] == i && result[3] > j)) {
                            result[0] = pairKey;
                            result[1] = pairValue;
                            result[2] = i;
                            result[3] = j;
                        }
                    }
                } else {
                    map.put(sum, p);
                }
            }
        }

        return result;
    }


    class Pair<K, V> {
        private Integer i;
        private Integer j;

        public Pair(Integer i, Integer j) {
            this.i = i;
            this.j = j;
        }

        public Integer getI() {
            return i;
        }

        public void setI(Integer i) {
            this.i = i;
        }

        public Integer getJ() {
            return j;
        }

        public void setJ(Integer j) {
            this.j = j;
        }
    }
}
