//package com.company;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Main{
//    public static void main(String[] args){
//        // create array with all 26 letters (a-z)
//        String[] letter = new String[26];
//        for(int i = 0; i <= 25; i++) {
//            letter[i] = Character.toString(i + 97);
//        }
//
//        // create array with all 10 figures (0-9)
//        String[] number = new String[10];
//        for(int i = 0; i <= 9; i++){
//            number[i] = Integer.toString(i);
//        }
//
//        // create array list to save all letterNumber (a0-z9)
//        ArrayList<String> letterNumber = new ArrayList<>();
//        //add letters and numbers
//        for(int i = 0; i <= 25; i++){
//            for(int j = 0; j <= 9; j++){
//                letterNumber.add(letter[i] + number[j]);
//            }
//        }
//
//        //new part
//        ArrayList<String> lNs = new ArrayList<>();
//        String line = "";
//        for(int i = 0; i <= 25; i++){
//            lNs.add(letterNumber.get(i));
//            for(int j = 0; j <= 25; j++){
//                lNs.add(letterNumber.get(j));
//            }
//        }
//
//        System.out.println(lNs);
//    }
//}
//
//class Addition{
//    int a;
//}
package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        char v1 = 'a';
        int i1 = 0;
        char v2 = 'a';
        int i2 = 0;
        String line = "";
        ArrayList<String> letterNumber = new ArrayList<>();
        ArrayList<String> letterNumber1 = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int y = 0; y < 26; y++) {
                    for (int x = 0; x <= 9; x++) {
                        line = line + (v1 + Integer.toString(i1) + v2 + Integer.toString(i2)) + ", ";
                        letterNumber.add((v1 + Integer.toString(i1) + v2 + Integer.toString(i2)));
                        letterNumber1.add(letterNumber.get(counter) + (v2 + Integer.toString(i2)));
                        i2++;
                    }
                    v2+=1;
                    i2 = 0;
                }

                counter++;
                v2 = 'a';
                i1++;
            }
            v1 +=1;
            i1 = 0;
        }

        letterNumber.addAll(letterNumber1);
        System.out.println(letterNumber);
    }
}
