package com.company.algorithm.AlgorithmImpl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StrangePrinter664 {
    public static int strangePrinter(String s) {
        /**
         * 太难了太难了，看不懂
         * Character[] m= s.chars().mapToObj(c->(char)c).toArray(Character[]::new);
         * List<Character> r= Stream.of(m).distinct().collect(Collectors.toList());
         */

        int n = s.length();
        int[][] f = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            f[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    f[i][j] = f[i][j - 1];
                } else {
                    int minn = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        minn = Math.min(minn, f[i][k] + f[k + 1][j]);
                    }
                    f[i][j] = minn;
                }
            }
        }
        return f[0][n - 1];
    }

    public static void main(String[] args) {
        String str="abcabc";
        System.out.println(strangePrinter(str));
    }
}