package oops;

import java.util.*;

public class RemoveStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Integer> skipIndexes = new HashSet<>();

        // Mark positions to skip
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                skipIndexes.add(i); // skip '*'
                if (i > 0) skipIndexes.add(i - 1); // skip previous character
                if (i < s.length() - 1) skipIndexes.add(i + 1); // skip next character
            }
        }

        // Build final string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!skipIndexes.contains(i)) {
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb);
        sc.close();
    }
}
