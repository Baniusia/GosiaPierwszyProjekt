//CTRL+ALT+L format

public class Student1 {
    String nazwisko = "Baniczek";
    String imie = "Małgosia";
    int wiek = 20;
    String miejscowosc = "Opole";
    int nrDomu = 17;
    int nrMieszkania = 7;
    int wzrost = 170;
    int ocenaMatma = 5;
    int ocenaPolski = 4;


    public int dajLiczbe() {
        return 5;
    }

    public double sredniaOcen() {
        return (double) (ocenaMatma + ocenaPolski) / 2;
    }

    public double wzrostmetry() {
        return (double) wzrost / 100;
    }

    public String lesniczek() {
        return "Dziękuję Ci Leśniczku!";
    }

    /*
    New assignment: Create a new method in class Student1 called PrintColor with input param Sting Color.
    In in this version of method try to use if/else statements to print various messages based on value of Color parameter
    e.g. Red is the best, I prefer blue, Green is my favorite, Yellow suits me best and so on.
    Then write another method PrintColor2 in which you will use switch statement to implement same logic.
     */

    public void PrintColor(String color) {
        if (color == "czerwony") {
            System.out.println("Czerwony jest najlepszy");
        }
        if (color == "niebieski") {
            System.out.println("Wolę niebieski");
        }
        if (color == "zielony") {
            System.out.println("Zielony jest moim ulubionym kolorem");
        }
        if (color == "żółty") {
            System.out.println("żółty najbardziej mi odpowaida");
        }
    }

    public void PrintColor2(String color) {
        switch (color) {
            case "czerwony":
                System.out.println("Czerwony jest najlepszy");
                break;
            case "niebieski":
                System.out.println("Wolę niebieski");
                break;
            case "zielony":
                System.out.println("Zielony jest moim ulubionym kolorem");
                break;
            case "żółty":
                System.out.println("Żółty najbardziej mi odpowaida");
                break;
        }
    }
}











