package ReplitTry;
/*This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

        It returns true only if both a and b are true or c is true.

        https://en.wikipedia.org/wiki/Truth_table*/
public class R169_Methods_7_WithReturn3Locks {
        public boolean threeLocks(boolean a, boolean b, boolean c) {

            if(a && b && c){
                return true;

            }else if((a && b || c)){
                return true;

            }else{
                return false;
            }

        }//end threeLocks
    }

