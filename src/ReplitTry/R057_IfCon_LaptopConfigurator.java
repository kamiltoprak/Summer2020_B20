package ReplitTry;
/*Write a program that will calculate laptop price based on the components.
First ask user for a screen size. If screen size is equals to 13.3, add  $200 to the laptop price. If screen size is equals to  15.0 - add  $300 to the laptop price. If screen size is equals to  17.3 - add  $400 to the laptop price.  Then ask user for CPU type. If CPU type equals to i3, add  $150 to the laptop price. If CPU type equals to i5, add  $250 to the laptop price. If CPU type equals to i7, add  $350 to the laptop price. Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price. Then, ask user for storage type. There are 2 options: SSD and HDD. If it's HDD - add $50 to the laptop price for every 500gb.  If it's SSD - add $100 to the laptop price for every 500GB. Then ask user for for screen resolution. There are 2 options: FULLHD and 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.
        Example:
Display message: Select screen size:
        input: 13.3
        Display message: Select CPU type:
        input: i7
        Display message: Select RAM size:
        input: 8
        Display message: Select storage type:
        input: SSD
        Display message: Enter memory size:
        input: 1000
        Display message: Enter screen resolution:
        input: 4K
        Display message: Laptop price is: $1050.0
        Example #2

        Display message: Select screen size:
        input: 13.3
        Display message: Select CPU type:
        input: i3
        Display message: Select RAM size:
        input: 4
        Display message: Select storage type:
        input: HDD
        Display message: Enter memory size:
        input: 500
        Display message: Enter screen resolution:
        input: FULLHD
        Display message: Laptop price is: $550.0*/
import java.util.Scanner;
public class R057_IfCon_LaptopConfigurator {
    public static void main(String[] args) {

                double price = 0;
                String storageType, screenType, cpu;
                Scanner scan = new Scanner(System.in);
                //WRITE YOUR CODE HERE
                double screenSize;
                double screenSizePrice=0;
                String CPU;
                double CPUPrice=0;
                int ram;
                double ramPrice=0;
                int memorySize;
                double memorySizePrice=0;
                String screenResolution;
                double screenResolutionPrice=0;
                double laptopPrice=0;

                System.out.println("Select screen size:");
                screenSize=scan.nextDouble();
                if(screenSize==13.3){
                    screenSizePrice=200;
                }else if(screenSize==15){
                    screenSizePrice=300;
                }else if(screenSize==17.3){
                    screenSizePrice=400;
                }
                System.out.println("Select CPU type:");
                CPU=scan.next();
                if(CPU.equals("i3")){
                    CPUPrice=150;
                }else if(CPU.equals("i5")){
                    CPUPrice=250;
                }else if(CPU.equals("i7")){
                    CPUPrice=350;
                }
                System.out.println("Select RAM size:");
                ram=scan.nextInt();
                for(int i=4; i<=ram; i+=4){
                    ramPrice+=50;
                }
                System.out.println("Select storage type:");
                storageType=scan.next();
                System.out.println("Enter memory size:");
                memorySize=scan.nextInt();
                switch(storageType){
                    case "SSD":
                        for(int i=500; i<=memorySize; i+=500){
                            memorySizePrice+=100;
                        }
                        break;
                    case "HDD":
                        for(int i=500; i<=memorySize; i+=500){
                            memorySizePrice+=50;
                        }
                        break;
                }
                System.out.println("Enter screen resolution:");
                screenResolution=scan.next();
                if(screenResolution.equals("FULLHD")){
                    screenResolutionPrice=100;
                }else{
                    screenResolutionPrice=200;
                }
                laptopPrice=screenSizePrice+CPUPrice+ramPrice+memorySizePrice+screenResolutionPrice;
                System.out.println("Laptop price is: $"+laptopPrice);
            }
        }


