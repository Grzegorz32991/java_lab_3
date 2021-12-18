import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        Student[] students = new Student [3];
        Student students1 = new Student();
        Student students2 = new Student();
        Student students3 = new Student();
        students1.Imię = "Anna";
        students1.Nazwisko = "Mario";
        students1.wiek = 31;
        students1.czyjestszczepiony = true;
        students1.displayInfo();
        students2.Imię = "Agnieszka";
        students2.Nazwisko = "Kowal";
        students2.wiek = 23;
        students2.czyjestszczepiony = true;
        students2.displayInfo();
        students3.Imię = "Dariusz";
        students3.Nazwisko = "Groźny";
        students3.wiek = 28;
        students3.czyjestszczepiony = false;
        students3.displayInfo();



        for (int i = 0;i >= students.length;++i){

            System.out.println(students.length);
        }



    }
}
