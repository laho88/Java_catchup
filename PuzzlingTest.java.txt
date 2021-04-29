package com.laho.puzzling;

import java.util.Arrays;

public class PuzzleTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Puzzling fml = new Puzzling();

        int[] arr = {1, 3, 5, 7, 9};
        int[] newArr = fml.sumAndReturn(arr);
        System.out.println(Arrays.toString(newArr));
        
        
        String[] strArr = fml.shuffleStrings();
        System.out.println(Arrays.toString(strArr));
        
        
        fml.allLetters();
        
        
        arr = fml.randomInts();
        System.out.println(Arrays.toString(arr));
        
        
        arr = fml.randomSortedInts();
        System.out.println(Arrays.toString(arr));


        fml.tenRandomStrings();


    }
}