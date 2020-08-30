package ReplitTry;
/*The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.

        the hamletQuote method only returns true if one of  or both of the boolean parameters is true.

        example:

        hamletQuote(true, false)
        returns true

        hamletQuote(false,true)
        returns true

        hamletQuote(true,true)
        returns true

        hamletQuote(false,false)
        returns false



        hint: use the truth table for this one, this can be done with one if and a logical operator.*/
public class R167_Methods_Return5HamletLogic {
    class Main {
        public boolean hamletQuote(boolean toBe,boolean notToBe)
        {
            if( toBe || notToBe){
                return true;
            }else {
                return false;
            }

        }
    }
}
