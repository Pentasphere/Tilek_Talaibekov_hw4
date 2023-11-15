import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 5 строк для списка А!");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }
        System.out.println("Список А:");
        Iterator<String> iterator1 = listA.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("Введите 5 строк для списка Б!");
        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }
        System.out.println("Список Б:");
        Iterator<String> iterator2 = listB.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println("Объединенный список А со списком Б в списке С:");
        ArrayList<String> listC = new ArrayList<>();
        listC.add(listA.get(1));
        listC.add(listB.get(4));
        listC.add(listA.get(2));
        listC.add(listB.get(4));
        listC.add(listA.get(3));
        listC.add(listB.get(3));
        listC.add(listA.get(4));
        listC.add(listB.get(2));
        listC.add(listA.get(4));
        listC.add(listB.get(1));
        Iterator<String> iterator3 = listC.iterator();
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
        System.out.println("Отсортированный список С по длине, от наименьшего к наибольшему:");
        listC.sort(Comparator.comparing(String::length));
        Iterator<String> iterator4 = listC.iterator();
        while (iterator4.hasNext()){
            System.out.println(iterator4.next());
        }
    }
}