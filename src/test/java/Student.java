import org.testng.annotations.Test;
/*
dla char uszy takie ' '
dla String uszy takie " "
dla int brak uszu
 */
public class Student
{
    String nazwisko = "Baniczek";
    String imie = "Małgosia";
    int wiek = 20;
    String miejscowosc = "Opole";
    int nrDomu = 17;
    int nrMieszkania = 7;
    int wzrost = 170;
    int ocenaMatma = 5;
    int ocenaPolski = 4;

    @Test
    public void przedstawsie() {
        System.out.println("Nazywam sie "+ imie + " " + nazwisko);
        if (wiek>=18){
            System.out.println("Jestem pełnoletnia"); }
        System.out.println("Mój adres to " + miejscowosc + " " + nrDomu + "/" + nrMieszkania);

        double wzrostmetry = (double)wzrost/100;
        System.out.println("Mój wzrost w metrach to " + wzrostmetry );

        double sredniaOcen = (double)(ocenaMatma + ocenaPolski)/2;
        System.out.println("Moja średnia ocen to " + sredniaOcen);

        if (sredniaOcen==4.5 ) {
            System.out.println( sredniaOcen + "- Dobrze Ci idze "); }


    }
}


