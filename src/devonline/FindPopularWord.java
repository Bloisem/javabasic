package devonline;

import java.util.Arrays;

public class FindPopularWord {
    public static void main(String[] args) {
        String text = "hello,java-world\tjava hello: I? Hello! Java World. ja 1 1 1 1 1 1 111111va,i";
        String result = mostPopularWord(text);
        System.out.println(result);
    }

    private static String mostPopularWord(String text) {
        String[] allWordsMassive = dividedToArray(text);
        String[] unicalWord = new String[allWordsMassive.length];
        int[] repeatCounter = new int[allWordsMassive.length];
        int lenghtFinalArray = 0;
        int count = 1;

        for(int i = 0; i < allWordsMassive.length; ++i) {
            for(int j = i + 1; j < allWordsMassive.length; ++j) {
                String found = allWordsMassive[i].toLowerCase();
                if (found.equals(allWordsMassive[j].toLowerCase()) && !allWordsMassive[j].equals("")) {
                    ++count;
                    allWordsMassive[j] = "";
                }
            }

            if (!allWordsMassive[i].equals("")) {
                unicalWord[lenghtFinalArray] = allWordsMassive[i];
                repeatCounter[lenghtFinalArray] = count;
                ++lenghtFinalArray;
            }

            count = 1;
        }

        String finalResult = findPopularWord(unicalWord, repeatCounter, lenghtFinalArray);
        return finalResult;
    }

    private static String[] dividedToArray(String text) {
        String[] myArray = new String[text.length()];
        StringBuilder temp = new StringBuilder();
        int counterTemp = 0;

        for(int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) != '\\') {
                if (!Character.isLetter(text.charAt(i)) && !Character.isDigit(text.charAt(i))) {
                    if (temp.toString().length() > 0) {
                        myArray[counterTemp] = temp.toString();
                        temp.setLength(0);
                        ++counterTemp;
                    }
                } else {
                    temp.append(text.charAt(i));
                }
            }
        }

        myArray[counterTemp] = temp.toString();
        temp.setLength(0);
        ++counterTemp;
        return (String[]) Arrays.copyOf(myArray, counterTemp);
    }

    private static String findPopularWord(String[] unicalWord, int[] repeatCounter, int lenghtFinalArray) {
        int indexMax = -1;
        int max = 0;

        for(int i = 0; i < lenghtFinalArray; ++i) {
            if (repeatCounter[i] > max) {
                max = repeatCounter[i];
                indexMax = i;
            }
        }

        return unicalWord[indexMax];
    }
}
