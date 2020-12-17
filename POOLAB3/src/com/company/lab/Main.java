package com.company.lab;
import java.io.*;
public class Main {
    
    public static void main(String[] args) {
        int sentenceCount = 0;
        int letterCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        String longWord = "";

        TextManip myText = new TextManip();

        String[] wordArray = myText.Text.split("[\\s.]");

        int wordCount = wordArray.length;
        for(int i=0;i<wordArray.length;i++){
            longWord = myText.compare(longWord,wordArray[i]);
        }
            System.out.println("Longest word: " + longWord);
        System.out.println("Word count is = " + wordCount);
        String[] sentenceList = myText.Text.split("[!?.:]+");

        sentenceCount += sentenceList.length;
        System.out.println("Sentence count is = " + sentenceCount);

        for (int i = 0; i < myText.Text.length(); i++) {
            if (Character.isLetter(myText.Text.charAt(i)))
                letterCount++;
        }
        System.out.println("Letter count is = " + letterCount);
        myText.Text = myText.Text.toLowerCase();
        for (int i = 0; i < myText.Text.length(); i++) {
            if (myText.Text.charAt(i) == 'a' || myText.Text.charAt(i) == 'e' || myText.Text.charAt(i) == 'i' || myText.Text.charAt(i) == 'o' || myText.Text.charAt(i) == 'u') {
                vowelCount++;
            } else if (myText.Text.charAt(i) >= 'a' && myText.Text.charAt(i) <= 'z') {
                consonantCount++;
            }
        }
        System.out.println("Vowel count is = " + vowelCount);
        System.out.println("Consonant count is = " + consonantCount);




    }


}

