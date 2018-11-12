package io.github.actar233;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        StringBuilder builder = new StringBuilder();

        int len = strs.length;
        String str = strs[0];

        int strLen = str.length();

        outer:
        for (int i = 0; i < strLen; i++) {
            char c = str.charAt(i);

            for (int j = 1; j < len; j++) {
                String s = strs[j];
                if (s.length() <= i) break outer;
                if (s.charAt(i) != c) break outer;
            }

            builder.append(c);
        }

        return builder.toString();
    }
}
