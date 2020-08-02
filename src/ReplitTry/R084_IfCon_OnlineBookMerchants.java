package ReplitTry;
/*Online Book Merchants offers premium customers 1 free book with every
        purchase of 5 or more books and offers 2 free books with every
        purchase of 8 or more books.
        It offers regular customers 1 free book with every purchase of 7 or more books,
        and offers 2 free books with every purchase of 12 or more books.
        Write a program that assigns freeBooks the appropriate value based on the values of
        the boolean variable isPremiumCustomer and the int variable nbooksPurchased.
        Print amount of freeBooks into the console.*/
import java.util.Scanner;
public class R084_IfCon_OnlineBookMerchants {
        public static void main(String[] args) {
            int freeBooks = 0;
            Scanner scan = new Scanner(System.in);
            boolean isPremiumCustomer = scan.nextBoolean();
            int nbooksPurchased = scan.nextInt();
            int n = nbooksPurchased / 8;
            int m = nbooksPurchased / 12;
            if(isPremiumCustomer) {
                if (nbooksPurchased >= 5 && nbooksPurchased < 8) {
                    freeBooks += 1;
                } else if (nbooksPurchased >= 8) {
                    freeBooks += (2 * n) + (1 * ((nbooksPurchased - (n * 8)) / 5));
                } else {

                }
            }
            else{
                if (nbooksPurchased >= 7 && nbooksPurchased < 12) {
                    freeBooks += 1;
                } else if (nbooksPurchased >= 12) {
                    freeBooks += (2 * m) + (1 * ((nbooksPurchased - (m * 12)) / 7));
                } else {

                }


            }

            System.out.println(freeBooks);
        }
    }

