package com.parshuram;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome To Rock - Paper - Seser Game");
        System.out.println(" Enter Your Name ");
        String name = sc.nextLine();
        System.out.println("Enter 0 ----> Rock\n" + "Enter 1 ----> Paper\n" + "Enter 2 ----> Seser");
        int usernum = sc.nextInt();
        Random rd = new Random();
        int rdm = rd.nextInt(3);

        // NOTE : 0 ----> Rock
        // NOTE : 1 ----> Paper
        // NOTE : 2 ----> Seser
        if (usernum >= 3) {
            System.out.println(" Invalid Option Chosen");
        }
        else if (rdm == 0 && usernum == 0) {
            System.out.println("You Chose : " + usernum);
            System.out.println("Computer Chose : " + rdm);
            System.out.println("OPPS ! Both TYED");
        } else if (rdm == 0 && usernum == 1) {
            System.out.println("You Chose : " + usernum);
            System.out.println("Computer Chose : " + rdm);
            System.out.println(name + " Win The Game ");
            System.out.println("Paper Covered The Rock");
        } else if (rdm == 0 && usernum == 2) {
            System.out.println("You Chose : " + usernum);
            System.out.println("Computer Chose : " + rdm);
            System.out.println("Computer Win The Game");
            System.out.println("Rock Destroyed The Seser");
        } else if (rdm == 1 && usernum == 0) {
            System.out.println("You Chose : " + usernum);
            System.out.println("Computer Chose : " + rdm);
            System.out.println("Computer Win The Game ");
            System.out.println("Paper Covered The Rock");
        } else if (rdm == 1 && usernum == 1) {
            System.out.println("You Chose : " + usernum);
            System.out.println("Computer Chose : " + rdm);
            System.out.println("OPPS ! Both TYED");
        } else if (rdm == 1 && usernum == 2) {
            System.out.println("You Chose : " + usernum);
            System.out.println("Computer Chose : " + rdm);
            System.out.println(name + " Win The Game");
            System.out.println("Seser Cut The Paper");
        } else if (rdm == 2 && usernum == 0) {
            System.out.println("You Chose : " + usernum);
            System.out.println("Computer Chose : " + rdm);
            System.out.println(name + " Win The Game");
            System.out.println("Rock Destroyed The Seser");

        } else if (rdm == 2 && usernum == 1) {
            System.out.println("You Chose : " + usernum);
            System.out.println("Computer Chose : " + rdm);
            System.out.println("Computer Win The Game");
            System.out.println("Seser Cut The Paper");
        } else if (rdm == 2 && usernum == 2) {
            System.out.println("You Chose : " + usernum);
            System.out.println("Computer Chose : " + rdm);
            System.out.println("OPPS ! Both TYED");
        }

    }
}
