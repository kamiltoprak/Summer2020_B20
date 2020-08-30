package RunstoneAcademy;

public class main {

        private int[ ] values;

        public main(int[] theValues)
        {
            values = theValues;
        }

        public void doubleLastHalf()
        {
            for (int i = values.length / 2; i < values.length; i++)
            {
                values[i] = values[i] * 2;
            }
        }

        public void printArray()
        {
            for (int val: values)
            {
                System.out.println(val);
            }
        }

        public static void main(String[] args)
        {
            int[] numArray = {3,8,-3, 2};
            main worker = new main(numArray);
            worker.doubleLastHalf();
            worker.printArray();
        }
    }



