// Richard Faktor III.CI
//1
package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    double zaciatok;
    double ciel;
    double dsd;
    int pocetDni = 0;

        Scanner sc1=new Scanner(System.in);
        System.out.print("zadajte km pre 1. den: ");
        zaciatok = sc1.nextDouble();

        Scanner sc2=new Scanner(System.in);
        System.out.print("zadajte cielove km: ");
        ciel = sc2.nextDouble();

        while(ciel>zaciatok){
            zaciatok = zaciatok +(zaciatok/10);
            pocetDni++;
        }
        System.out.println("Na " +pocetDni+" den prebehne "+zaciatok +" km");

    }
}

//2
package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a =1;
        int b= 1;
        int c;
        int d = 2;
        System.out.print("Zadaj cislo: ");
        Scanner sc2 = new Scanner(System.in);
        int cislo = sc2.nextInt();

 while(d !=cislo){
     d ++;
     c = a+b;
     System.out.print(c+" ");
     a=b;
     b=c;

    }
}
}

//3 ruleta
package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int peniaze = 100;
        int vyskaStavky;
        int farba;
        boolean ruleta = true;
        while (ruleta){
                System.out.println("Máš:"+ peniaze);
                System.out.println("Zadajte vyšku stavky");
                Scanner mojScanner = new Scanner(System.in);
                vyskaStavky = mojScanner.nextInt();
            if(peniaze>=vyskaStavky) {
                peniaze = peniaze - vyskaStavky;
            }
            else{
                System.out.println("Nemas dostatok penazi!");
                System.exit(0);
            }
                System.out.println("Zadajte farbu (0-cervena, 1-cierna)");
                farba= mojScanner.nextInt();

                Random rand = new Random();
                int g = 2;

                int r = rand.nextInt(g);
                if(r==0){
                    System.out.println("Padla cervena");
                }else System.out.println("Padla cierna");

                if (r == farba){
                    peniaze = peniaze +(2*vyskaStavky);

                }

                System.out.println("Máš:"+ peniaze);

            if(peniaze==0){
                System.out.println("Prehral si všetky peniaze!");
                System.exit(0);
            }
            mojScanner.nextLine();
            System.out.println("Chcete skoncit?");
            String koniec = mojScanner.nextLine();
            if(koniec.equals("ano")){
                ruleta = false;
            }
        }
    }
}
