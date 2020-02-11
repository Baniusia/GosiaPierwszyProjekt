import org.testng.annotations.Test;

public class KalkulatorTest {
    @Test
    public void testujKalkulator () {
        Kalkulator test = new Kalkulator();

        System.out.println("Liczba1 + Liczba2 = " + test.suma(5,2));
        System.out.println("Liczba1 - Liczba2 = " + test.roznica(5, 2));
        System.out.println("Liczba1 * Liczba2 = " + test.iloczyn(5, 2));
        System.out.println("Liczba1 / Liczba2 = " + test.iloraz(5,2));
        }


      /*  System.out.println(test.suma + " = " + test.wyliczsuma());
        System.out.println(test.roznica + " = " + test.wyliczroznica());
        System.out.println(test.iloczyn + " = " + test.wylicziloczyn());
        System.out.println(test.iloraz + " = " + test.wylicziloraz());

        System.out.println("Liczba1 + Liczba2 = " + test.wyliczsuma());
        System.out.println("Liczba1 - Liczba2 = "+ test.wyliczroznica());
        System.out.println("Liczba1 * Liczba2 = " + test.wylicziloczyn());
        System.out.println("Liczba1 + Liczba2 = " + test.wylicziloraz());  */


    }