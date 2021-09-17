package dev.basiru.weeklyChallenge;

public class ROT13 {
    public static String encrypt(String value){
        char[] values = value.toCharArray();
        for(int i = 0; i < values.length; i++){
            char letter = values[i];

            if (letter >= 'a' && letter <= 'z'){
                if (letter > 'm'){
                    letter -= 13;
                } else {
                    letter += 13;
                }
            } else if (letter >= 'A' && letter <= 'Z'){
                if (letter > 'M'){
                    letter -= 13;
                } else {
                    letter += 13;
                }
            }
            values[i] = letter;
        }
        return new String(values);
    }

    public static void main(String[] args) {

        String message = "How do you encrypt a message";

        String encrypt = encrypt(message);

        System.out.println(encrypt);

    }


}
