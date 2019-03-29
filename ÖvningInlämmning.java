package com.övningar;

import java.util.Scanner;
public class ÖvningInlämmning {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int antalSidor = 6;
        int score1 = 0;
        int score2 = 0;
        int datorScore = 0;
        int vinnare = 0;
        int[] kastArray;
        kastArray = new int[3];
        int[] highScore;
        highScore = new int[4];

        System.out.println("hur många spelare (1-2)");
        int spelare = sc.nextInt();

        System.out.println("Hur många kast?");
        int kast = sc.nextInt();


        // för 2 spelare +datorn
        while(true) {
            if (spelare == 2) {
                System.out.println("Vill ni att att datorn ska vara med i spelet?" + "\n" + "Ja eller Nej?");
                String datorMed = sc.next();

                if (datorMed.equals("Ja")) {
                    for (int i = 1; i <= kast; i++) {
                        kastArray[0] = (int) (1 + antalSidor * Math.random());
                        kastArray[1] = (int) (1 + antalSidor * Math.random());
                        kastArray[2] = (int) (1 + antalSidor * Math.random());
                        System.out.println("Spelare 1: Kast: " + i + " är " + kastArray[0]);
                        System.out.println("Spelare 2: Kast: " + i + " är " + kastArray[1]);
                        System.out.println("Datorns: Kast: " + i + " är " + kastArray[2]);

                        score1 += kastArray[0];
                        score2 += kastArray[1];
                        datorScore += kastArray[2];
                    }

                    System.out.println("\n" + "Summa för spelare 1 är: " + score1 + "\n");
                    System.out.println("Summa för Spelare 2 är: " + score2 + "\n");
                    System.out.println("Summa för Datorn är: " + datorScore + "\n");




                   if (datorScore > score1 && score2<datorScore) {
                       System.out.println("Datorn har vunnit!");
                       vinnare = datorScore;
                   }
                    if (score1 > score2 && datorScore<score1) {
                        System.out.println("Spelare 1 har vunnit!");
                        vinnare = score1;
                    }
                    if (score2 > score1 && datorScore<score2) {
                        System.out.println("Spelare 2 har vunnit!");
                        vinnare = score2;
                    }

                }
                //2 spelare -datorn
                if (datorMed.equals("Nej")) {
                    for (int i = 1; i <= kast; i++) {
                        kastArray[0] = (int) (1 + antalSidor * Math.random());
                        kastArray[1] = (int) (1 + antalSidor * Math.random());
                        System.out.println("Spelare 1: Kast: " + i + " är " + kastArray[0]);
                        System.out.println("Spelare 2: Kast: " + i + " är " + kastArray[1]);
                        score1 += kastArray[0];
                        score2 += kastArray[1];
                    }

                    System.out.println("\n"+"Summa för spelare 1 är: " + score1 +"\n");
                    System.out.println("Summa för spelare 2 är: " + score2 + "\n");



                    if (score1 > score2) {
                        System.out.println("Spelare 1 har vunnit!");
                        vinnare = score1;
                    }
                    if (score2 > score1) {
                        System.out.println("Spelare 2 har vunnit!");
                        vinnare = score2;
                    }

                }
            }
            if (spelare == 1) {
                for (int i = 1; i <= kast; i++) {
                    kastArray[0] = (int) (1 + antalSidor * Math.random());
                    kastArray[1] = (int) (1 + antalSidor * Math.random());
                    System.out.println("Spelare 1: Kast: " + i + " är " + kastArray[0]);
                    System.out.println("Datorns: Kast: " + i + " är " + kastArray[1]);
                    score1 += kastArray[0];
                    datorScore += kastArray[1];
                }
                System.out.println("\n" + "Summa för spelare 1 är: " + score1 + "\n");
                System.out.println("Summa för Datorn är: " + datorScore + "\n");

                     
                if (datorScore > score1) {
                    System.out.println("Datorn har vunnit!");
                    vinnare = datorScore;
                }
                if (datorScore < score1) {
                    System.out.println("Spelare 1 har vunnit!");
                    vinnare = score1;
                }
            }

             // Highscore
            if(vinnare > highScore[0]){
                highScore[0] = highScore[1];
                highScore[0] = vinnare;
            }
            if(vinnare > highScore[1]){
                highScore[1] = highScore[2];
                highScore[1] = vinnare;
            }
            if(vinnare > highScore[2]){
                highScore[2] = highScore[3];
            }   highScore[2] = vinnare;

            System.out.println("\n"+"High score: "+vinnare+"\n");
            System.out.println("Spela igen? Ja/Nej");
            String playagain = sc.next();

            if(playagain.equals("Ja")){

            }else{
                System.out.println("Spelet är slut!");
                break;
            }
        }
    }
}








