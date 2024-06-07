package com;

public class testing {

    public static void main(String[] args) {

        String st = "   fly me   to   the moon  ";

        int count = st.length() - 1;

        while (count >= 0 && st.charAt(count) == ' ') {
            count--;
        }
        int ans = count;

        while(ans >= 0 && st.charAt(ans) != ' '){
            ans--;
        }

        System.out.println(count - ans);
    }

}
