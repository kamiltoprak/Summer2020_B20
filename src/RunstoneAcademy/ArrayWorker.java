package RunstoneAcademy;

public class ArrayWorker {


        private int[ ] values;

        public ArrayWorker(int[] theValues)
        {
            values = theValues;
        }

        public void doubleFirstFive()
        {
            for (int i = 0; i < values.length && i < 5; i++)
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
            int[] numArray = {3, 8, -3, 2, 20, 5, 33, 1};
            ArrayWorker worker = new ArrayWorker(numArray);
            worker.doubleFirstFive();
            worker.printArray();
        }
    }


