package dzoneone;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============dzoneone.CustomArrayList==================");
        CustomArrayList<String> listCustomArrayList = new CustomArrayList<>();
        listCustomArrayList.add("Москва");
        listCustomArrayList.add("Казань");
        System.out.println(listCustomArrayList);

        System.out.println(listCustomArrayList.get(0));

        System.out.println(listCustomArrayList.remove(1));

        Collection<String> citiesToAdd = List.of("Новосибирск", "Самара");
        boolean result = listCustomArrayList.addAll(citiesToAdd);
        System.out.println(result);
        System.out.println(listCustomArrayList);


        System.out.println("=============dzoneone.CustomLinkedList==================");
        CustomLinkedList<String> listCustomLinkedList = new CustomLinkedList<>();
        listCustomLinkedList.add("Первый");
        listCustomLinkedList.add("Второй");
        listCustomLinkedList.add("Третий");
        System.out.println(listCustomLinkedList);

        System.out.println("Полученный элемент по индексу: " + listCustomLinkedList.get(1));

        listCustomLinkedList.remove("Второй");
        System.out.println("Список после удаления: " + listCustomLinkedList);

        CustomLinkedList<String> secondList = new CustomLinkedList<>();
        secondList.add("Четвертый");
        secondList.add("Пятый");
        listCustomLinkedList.addAll(secondList);
        System.out.println("Общий список после объединения: " + listCustomLinkedList);


        System.out.println("=============dzoneone.CustomHashSet==================");
        CustomHashSet<Integer> customSet = new CustomHashSet<>();
        customSet.add(10);
        customSet.add(20);
        customSet.add(30);
        System.out.println(customSet);

        customSet.remove(20);
        System.out.println(customSet);
    }
}
