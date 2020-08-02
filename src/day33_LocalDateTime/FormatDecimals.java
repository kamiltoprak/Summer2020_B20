package day33_LocalDateTime;

import java.text.DecimalFormat;

public class FormatDecimals {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.000");
        double a=22/7.0;
        System.out.println(a);
        System.out.println(df.format(a));

        System.out.println(df.format(6.665655745645645));
        System.out.println(df.format(6));

    }
}
