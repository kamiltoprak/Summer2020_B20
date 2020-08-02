package RunstoneAcademy;

import java.util.*;

public class RS812<i1> {
    int[] x1 = {1, 2, 4, 7};
    int[] x2 = {1, 2, 5, 7};
    int i1 = x1.length - 1;
    int i2 = x2.length - 1;

    int count = 0;
    //while ((i1 > 0 ) && (i2 > 0 ))
    {
        if (x1[i1] == x2[i2])
        {
            count++;
            i1--;
            i2--;
        }
        else if (x1[i1] < x2[i2])
        {
            i2--;
        }
        else
        { // x1[i1] > x2[i2]
            i1--;
        }
    }
}
