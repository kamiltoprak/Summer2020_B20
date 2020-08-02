package OCA_Questions;

public class Q024 {

        public Q024() {
            System.out.print("A ");
        }
    }
    class B extends Q024{
        public B() {
            System.out.print("B ");
        }
    }
    class C extends B{
        public C() {
            System.out.print("C");
        }
        public static void main(String[] args) {
            C c = new C();
        }
    }

//What is the result?
//A.	C B A
//B.	C
//C.	A B C
//D.	Compilation fails at line n1 and line n2
