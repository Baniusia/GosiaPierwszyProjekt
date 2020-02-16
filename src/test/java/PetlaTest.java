import org.testng.annotations.Test;

public class PetlaTest {

    @Test
    public void PrintMultiplesFor() {
        Petla test = new Petla();

//        test.PrintMultiplesFor(8, 2, 24);
//        test.PrintMultiplesWhile(7,2,21);
//        test.PrintMultiplesDoWhile (5,2,25);
        test.FinalCountDown(12,3);
    }
}


