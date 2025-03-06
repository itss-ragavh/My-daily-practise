package com;

import java.util.Arrays;

public class CountChar {
    public static void main(String[] args) {
        char []ch={'A','B','C','D','9','3','+',' ','@'};
        System.out.println(Arrays.toString(ch));
        int count=0;
        for (char c : ch) {
            if (c>='A'&&c<='Z') {
                count++;
            }
        }
        System.out.println("Count :"+count);
        

    }
}
