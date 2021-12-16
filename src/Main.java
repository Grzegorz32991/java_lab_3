import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{

        private String imie;
        private String nazwisko;
        private int wiek;
        private boolean czyjestszczepiony;

public Student (String imie, String nazwisko, int wiek, boolean czyjestszczepiony){

    this.imie = imie;
    this.nazwisko = nazwisko;
    this.wiek = wiek;
    this.czyjestszczepiony = czyjestszczepiony;
}



    String getImie(){return imie;}
    String getNazwisko(){return nazwisko;}
    int getWiek(){return wiek;}
    boolean getCzyjestszczepiony(){return czyjestszczepiony;}

    public String toString() {
        return "Imię: "+imie+", Nazwisko: "+nazwisko+", Wiek: "+wiek+", Czy jest szczepiony? " +czyjestszczepiony;
    }
    public class Main {

        public static void main(String[] args) {

            Student krzysiek = new Student("Krzysiek", "Piotrowicz", 20, true);
            Student piotrek = new Student("Piotrek", "Wolny", 30, true);
            Student kasia = new Student("Kasia", "Krotwicka", 25, false);
            Student wlodek = new Student("Wlodek", "Zieba", 23, true);

            Student[] students = {krzysiek, piotrek, kasia, wlodek};


        }
        public static void wyswietl(Student[] students){
            for(Student p: students)
                System.out.println(p);
        }


        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
    }

}

