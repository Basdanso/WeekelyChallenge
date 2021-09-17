package dev.basiru.weeklyChallenge;

public class ConvertDecimal {

    static void decimalToOctal(int n){

        int[] octalNumber = new int[100];

        int i = 0;
        while(n != 0) {
            octalNumber[i] = n % 8;
            n = n/8;
            i++;
        }

        for(int j = i - 1; j >= 0; j--) {
            System.out.print(octalNumber[j]);
        }

    }
    public static void main(String[] args){
        int n = 45;

        decimalToOctal(n);
    }
}
