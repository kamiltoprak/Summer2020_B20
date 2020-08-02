package OCA_Questions;

public class q027 {
    public int amount;
        // line n1
        public q027(){
            this.amount = 100;
        }

        public static void main(String[] args) {
            q027 acc = new q027();
            // line n2
            System.out.println(acc.amount);
        }
    }
/*
 * 		Which three pieces of code, when inserted independently, set the value of amount to 100?

 	A. At line n1 insert:
 		public CheckingAccount(){
 		amount = 100;
 		}

 	 B. At line n2 insert:
 		this.amount = 100;   			// ==>Cannot use this in a static  context

 	 C. At line n2 insert:
 		amount = 100;					// ==> Cannot make a static reference to the non-static field amount

 	 D. At line n1 insert:
 		public CheckingAccount(){
 		this.amount = 100;
 		}

 	 E. At line n2 insert:
 		acc.amount = 100;

 	 F. At line n1 insert:
 		public CheckingAccount(){
 		acc.amount = 100;				// ==> acc cannot be resolved to a variable
 		}

 */

