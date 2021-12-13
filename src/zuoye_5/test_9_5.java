package zuoye_5;

import java.util.GregorianCalendar;

public class test_9_5 {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();
        System.out.print(date.get(GregorianCalendar.YEAR) + " ");
        System.out.print(date.get(GregorianCalendar.MONTH) + 1 + " ");
        System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH));
        date.setTimeInMillis(1234567898765L);
        System.out.print(date.get(GregorianCalendar.YEAR) + " ");
        System.out.print(date.get(GregorianCalendar.MONTH) +1 + " ");
        System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH));
    }

}
