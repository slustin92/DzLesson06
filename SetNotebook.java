package dz;


// -Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в
// java.
// -Создать множество ноутбуков.
// -Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и
// выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию: 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// -Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации
// можно также в Map.
// -Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class SetNotebook {

    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(16, 512, "windows", "черный");
        Notebook notebook2 = new Notebook(8, 160, "windows", "белый");
        Notebook notebook3 = new Notebook(4, 110, "windows", "серый");
        Notebook notebook4 = new Notebook(14, 256, "lunex", "синий");
        Notebook notebook5 = new Notebook(18, 800, "mac", "красный");
        Notebook notebook6 = new Notebook(16, 512, "windows", "черный");
        Set<Notebook> notes = new HashSet<Notebook>(
                Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5, notebook6));


        selectionBycriteria(notes);

    }

    public static void spisok() {
        
        String[] masStr = new String[] { "1 - Озу", "2 - Объем ЖД", "3 - Операционная система", "4 - Цвет" };

        for (String note : masStr) {
            System.out.println(note);
        }
        
    }

    public static void selectionBycriteria(Set<Notebook> not){
        
        spisok();

        Scanner scan = new Scanner(System.in);
        Scanner scanLine = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        int number = scan.nextInt();

        switch (number) {
            case 1:
                System.out.println("Введи размер озу: ");
                int ozy = scan.nextInt();
                for (Notebook string : not) {
                    if (string.getRam() >= ozy) {
                        System.out.println(string);
                    }
                }
                break;
            case 2:
                System.out.println("Введи Объем ЖД: ");
                int hdd = scan.nextInt();
                for (Notebook string : not) {
                    if (string.getHddCapacity() >= hdd) {
                        System.out.println(string);
                    }
                }
                break;
            case 3:
                System.out.println("Введи название операционная система: ");
                String op = scanLine.nextLine();
                for (Notebook string : not) {
                    if (string.getOpSystem().equals(op.toLowerCase())) {
                        System.out.println(string);
                    }
                }
                break;
            case 4:
                System.out.println("Введи цвет: ");
                String color = scanLine.nextLine();
                for (Notebook string : not) {
                    if (string.getColor().equals(color.toLowerCase())) {
                        System.out.println(string);
                    }
                }
                break;
        }
        scan.close();
        scanLine.close();
    }

}
