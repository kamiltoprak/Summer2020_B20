package day29_CustomMethods;
/* 4. check eligibility to vote
   5. check eligibility to buy alcohol
   5.1. calculate  two  numbers , num1 , operator, num2
*/
public class EligibilityToVote {

    public static void main(String[] args) {
        vote("jonh",28,true,"biden");
        vote("Daniel",17,true,"Kanye");
        eligibleBuyAlcohol(22,true);
        calculator(12,'+',56);
    }
    public static void eligibleBuyAlcohol(int age,boolean hasID){
        if(age>=21 && hasID==true){
            System.out.println("you are eligible to buy Alchol" );
        }else{
            System.out.println("you are not eligible to buy Alchol");
        }


    }



    public static void vote(String name,int age,boolean citizen, String candidateName){
        boolean eligibileToVote = age>=18 && citizen==true;
        if(eligibileToVote){
            System.out.println(name+" is eligible to  vote for "+ candidateName );
        }else{
            System.out.println(name+ " is  not eligible to vote ");
        }


    }


    public static void calculator(int num1,char operator, int num2){
        // +, -, /, *, %,

        switch (operator){
            case '+':
                System.out.println("Addition: "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction: "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication: "+(num1*num2));
                break;
            case '/':
                System.out.println("Division: "+(num1/num2));
                break;
            case '%':
                System.out.println("Remainder: "+(num1%num2));
                break;
            default:
                System.out.println("invalid entry");
        }
    }
}
