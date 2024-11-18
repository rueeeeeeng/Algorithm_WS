package inhatc.cse.algorithm.search;

import static inhatc.cse.algorithm.search.FindMax.findMaximum;

public class Main {

    public static void main(String[] args) {
        int arr[] = {72, 60, 83, 47, 89, 95};


        int max = FindMax.findMaximum(arr);

        System.out.println("최대값은 : " + max);


    }
}
