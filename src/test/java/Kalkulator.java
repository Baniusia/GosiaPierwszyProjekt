/*
Stwórz klasę Kalkulator z 4 metodami Suma,Różnica, Iloczyn, Iloraz.
Każda z metod powinna przyjmować 2 parametry o nazwie Liczba1, Liczba2 typu int.
Następnie napisz klasę KalkulatorTest gdzie stworzysz  metodę testującą metody klasy kalkulator.
Metoda testująca powinna wypisać na konsolę wyniki wywołania poszczególnych metod w formacie Liczba1 + Liczba 2 = wynik.
Analogicznie dla pozostałych metod.
 */


public class Kalkulator {
    //public int Liczba1 = 5;
    //public int Liczba2 = 0;
/*    public String  suma = "Liczba1 + Liczba2";
    public String roznica = "Liczba1 - Liczba2";
    public String iloczyn = "Liczba1 * Liczba2";
    public String iloraz = "Liczba1 / Liczba2"; */

    public int suma  (int Liczba1, int Liczba2 ) {return Liczba1  + Liczba2 ;}
    public int roznica (int Liczba1, int Liczba2) {return Liczba1 - Liczba2;}
    public int iloczyn (int Liczba1, int Liczba2) {return Liczba1 * Liczba2;}
    public double iloraz (int Liczba1, int Liczba2) {if (Liczba2 == 0) {
        System.out.println("Nigdy cholero nie dziel przez 0"); return 0;}
        return (double) Liczba1 / Liczba2;}

        //return 0 wyjdź z metody


}
