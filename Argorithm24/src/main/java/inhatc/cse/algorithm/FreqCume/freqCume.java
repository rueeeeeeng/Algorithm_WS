package inhatc.cse.algorithm.FreqCume;


public class freqCume {

    public static void main(String[] args) {
        int FREQ[] = {1,0,7,5,4,3};

        int[] CUME = new int[6];

        CUME[0] = FREQ[0];
        for (int i = 1; i < FREQ.length; i++) {
            CUME[i] = CUME[i-1]+FREQ[i];
            System.out.println(CUME[i]);
        }




    }


}
