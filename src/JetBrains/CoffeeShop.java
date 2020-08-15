package jetBrains;
import java.util.Scanner;

public class CoffeeShop {

        public static void main(String[] args) {

            Scanner scans=new Scanner(System.in);

            int water=scans.nextInt();
            int milk=scans.nextInt();
            int coffeeBean=scans.nextInt();
            int cups=scans.nextInt();
            int money=scans.nextInt();
        /*int a[]=new int[3];
        int b[]=new int[3];
        a[0]=water/(cups*200);
        a[1]=milk/(cups*50);
        a[2]=coffeeBean/(cups*15);
        for (int i=0; i<3; i++){
            b[i]=a[i]-cups;
        }
        */

            System.out.println("Write action (buy, fill, take):");
            String action=scans.next();

            switch (action){
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int waterAdd=scans.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    int milkAdd=scans.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int coffeeBeanAdd=scans.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int disposableAdd=scans.nextInt();

                    System.out.println(" The coffee machine has:");
                    System.out.println((water+waterAdd)+" of water");
                    System.out.println((milk+milkAdd)+" of milk");
                    System.out.println((coffeeBean+coffeeBeanAdd)+" of coffee beans");
                    System.out.println((cups+disposableAdd)+" of disposable cups");
                    System.out.println(money+" of money");
                    break;

                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    int type=scans.nextInt();

                    if(type==3){
                        water-=200;
                        milk-=100;
                        coffeeBean-=12;
                        cups-=1;
                        money+=6;

                    }
                    if(type==2){
                        water-=350;
                        milk-=75;
                        coffeeBean-=20;
                        cups-=1;
                        money+=7;

                    }
                    if(type==1){
                        water-=250;
                        coffeeBean-=16;
                        cups-=1;
                        money+=4;

                    }

                    System.out.println("The coffee machine has:");
                    System.out.println(water+" of water");
                    System.out.println(milk+" of milk");
                    System.out.println(coffeeBean+" of coffee bean");
                    System.out.println(cups+" of disposable cups");
                    System.out.println(money+" of money");



                case "take":
                    money=0;
                    System.out.println("I gave  you "+money);
                    System.out.println("The coffee machine has:");
                    System.out.println(water+" of water");
                    System.out.println(milk+" of milk");
                    System.out.println(coffeeBean+" of coffee bean");
                    System.out.println(cups+" of disposable cups");
                    System.out.println(money+" of money");
            }
        }
    }


