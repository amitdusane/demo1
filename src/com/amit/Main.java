package com.amit;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<Integer> ls = Arrays.asList(1,2,3,4);
        int longest = ls.stream()
                .mapToInt(o -> o)
                .max()
                .orElse(0);
        System.out.println(longest);
    }
}
