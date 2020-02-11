import org.testng.annotations.Test;

public class StudentTest {
    @Test
     public void przedstawSie() {
        Student1 GosiaStudent = new Student1 () ;

        System.out.println("Nazywam sie "+ GosiaStudent.imie + " " + GosiaStudent.nazwisko);
        if (GosiaStudent.wiek>=18){
            System.out.println("Jestem pełnoletnia"); }
        System.out.println("Mój adres to " + GosiaStudent.miejscowosc + " " + GosiaStudent.nrDomu + "/" + GosiaStudent.nrMieszkania);

        double wzrostmetry = (double)GosiaStudent.wzrost/100;
        System.out.println("Mój wzrost w metrach to " + wzrostmetry );

        double sredniaOcen = (double)(GosiaStudent.ocenaMatma + GosiaStudent.ocenaPolski)/2;
        System.out.println("Moja średnia ocen to " + sredniaOcen);

        if (sredniaOcen==4.5 ) {
            System.out.println( sredniaOcen + "- Dobrze Ci idze ");}

        System.out.println("Podana liczba " + GosiaStudent.dajLiczbe());

        System.out.println("Mam super średnią " + GosiaStudent.sredniaOcen());
        System.out.println("Mam idealny wzrost czyli " + GosiaStudent.wzrostmetry());
        System.out.println(GosiaStudent.lesniczek());}

        @Test
                public void testyKolorow() {
            Student1 GosiaStudent = new Student1 () ;

        GosiaStudent.PrintColor("czerwony");
        GosiaStudent.PrintColor("niebieski");
        GosiaStudent.PrintColor("zielony");
        GosiaStudent.PrintColor("żółty");

        GosiaStudent.PrintColor2("czerwony");
        GosiaStudent.PrintColor2("niebieski");
        GosiaStudent.PrintColor2("zielony");
        GosiaStudent.PrintColor2("żółty");

        //Leśniczek tu był.

}

}