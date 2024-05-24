package com;

public class RomonToInt {

    public static void main(String[] args) {

        String s = "IV";
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if ((i + 1 < n) && val(ch) < val(s.charAt(i + 1))) {
                sum = sum - val(ch);
            } else {
                sum = sum + val(ch);
            }

        }

        System.out.println(sum);

    }

    public static int val(char c) {

        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;

        }

    }

}
