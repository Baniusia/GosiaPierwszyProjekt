/*
New assignment: Create new class Petla and inside of it new method PrintMultiplesFor with 3 params int Number, int Min, int Max.
This function should print multiples of given Number in range from Min to Max inclusive.
For instance if Number was 7, Min = 2 and Max = 21 then the result of the function should be:
7
14
21
Hint - use For loop and Modulo operator

Second part of assignment: write another 2 functions PrintMultiplesWhile and PrintMultiplesDoWhile
and replace in them For loop with While and Do While accordingly
 */

/*
New assignment: Add new method to class Petla named FinalCountdown with params int StartNumber, int Gap.
Function should print numbers starting from StartNumber to 0 with Gap intervals between them.
Example: FinalCountdown(12, 3) should print 12, 9, 6, 3, 0
 */


import org.testng.annotations.Test;

public class Petla {

    public void PrintMultiplesFor(int Number, int Min, int Max) {
        for (int index = Min; index <= Max; index++) {
            if (index % Number == 0)
                System.out.println(index);
        }
    }

    public void PrintMultiplesWhile(int Number, int Min, int Max) {
        int index = Min;
        while (index <= Max) {
            if (index % Number == 0) {
                System.out.println(index);
            }
            index++;
        }
    }

    public void PrintMultiplesDoWhile(int Number, int Min, int Max) {
        int index = Min;
        do {
            if (index % Number == 0) {
                System.out.println(index);
            }
            index++;
        } while (index <= Max);
    }
    public void FinalCountDown (int StartNumber, int Gap) {
        for (int index=StartNumber; index >=0; index = index - Gap) {
             {
                System.out.println(index);
            }
        }
    }
}
//index-=Gap to samo co index = index - Gap


