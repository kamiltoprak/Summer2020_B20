package WarmUpAndPractices;

import java.util.Scanner;

public class Day16_PizzaStore {

//150 gr  hamur  15  gr  souce  ve 30  gr  kasar  peyniri olsun.

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("un miktarini girininiz");
            int un=scan.nextInt();
            System.out.println("souce miktarini girininiz");
            int souce=scan.nextInt();
            System.out.println("peynir miktarini girininiz");
            int peynir=scan.nextInt();
            System.out.println("pizza size girininiz");
            String pizzaSize=scan.next();
            System.out.println("kac pizza istiyorsunuz");
            int count=scan.nextInt();

            //kucuk  pizza  icin
            switch (pizzaSize){
                case "kucuk":
                    int ihtiyacUn=count*150;
                    int ihtiyacSouce=count*15;
                    int ihtiyacPeynir=count*30;
                    if (ihtiyacUn<=un && ihtiyacSouce<=souce && ihtiyacPeynir<=peynir) {
                        System.out.println("Bu orderi alabilirsiniz");
                        if((un-ihtiyacUn)/150<=(souce-ihtiyacSouce)/15 && (un-ihtiyacUn)/150<=(peynir-ihtiyacPeynir)/30){
                            System.out.println("elinizde kalan malzeme ile "+(un-ihtiyacUn)/150+ " adet "+ pizzaSize+ " pizza dah yapababilirsiniz");
                        } else if ((un-ihtiyacUn)/150 >= (souce-ihtiyacSouce)/15 && (souce-ihtiyacSouce)/15<=(peynir-ihtiyacPeynir)/30){
                            System.out.println("elinizdeki kalan malzeme ile "+(souce-ihtiyacSouce)/15+ " adet "+ pizzaSize+ " pizza daha yapababilirsiniz");
                        }else{
                            System.out.println("elinizdeki kalan malzeme ile "+(peynir-ihtiyacPeynir)/30+ " adet "+ pizzaSize+ " pizza daha yapababilirsiniz");
                        }
                    }else{
                        System.out.println("bu  orderi alamazsiniz");
                        System.out.println("bu  order alamaniz icin " +(ihtiyacUn-un) + " gr una" + (ihtiyacSouce-souce)+ " gr souce a" + (ihtiyacPeynir-peynir)+" gr peynire ihtiyaciniz var");
                    }

                case "orta":

                case "buyuk":

                default:
            }
        }
    }


