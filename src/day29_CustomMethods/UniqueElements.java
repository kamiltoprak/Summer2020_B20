package day29_CustomMethods;

import sun.applet.Main;

public class UniqueElements {
    public static void main(String[] args) {
        unique("kamil kamil yes yes hurriyet no yes no hi no hi");
    }

    public static void unique(String word) {
        String[] word1=word.split(" ");
        for (int i = 0; i <=word1.length - 1; i++) {
            int count=0;
            for (int j = 0; j <=word1.length - 1; j++) {
                if (word1[i].equals( word1[j])) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(word1[i]);
            }
        }


    }
}

