package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Group> groupList1 = new ArrayList<>(Arrays.asList(
                new Group("Програмисты", 1, 50),
                new Group("Аналитики", 2, 45),
                new Group("Тестеры", 3, 35)));
        Stream stream1 = new Stream("Первый", groupList1);

        List<Group> groupList2 = new ArrayList<>(Arrays.asList(
                new Group("Програмисты", 4, 51),
                new Group("Аналитики", 5, 44),
                new Group("Тестеры", 6, 38),
                new Group("Програмисты", 7, 49),
                new Group("Аналитики", 8, 39)));
        Stream stream2 = new Stream("Второй", groupList2);

        List<Group> groupList3 = new ArrayList<>(Arrays.asList(
                new Group("Тестеры", 9, 40),
                new Group("Програмисты", 10, 52),
                new Group("Аналитики", 11, 43),
                new Group("Тестеры", 12, 48)));
        Stream stream3 = new Stream("Третий",groupList3);

        List<Stream> streamList = new ArrayList<>(Arrays.asList(stream1, stream2, stream3));

        System.out.println("Вывод первого потока:");
        Stream.printGroups(stream1);
        stream1.remove(stream1.searchGroup("аналитики", 2, 45));
        System.out.println("Вывод первого потока после удаления группы:");
        System.out.println(stream1);

        System.out.println("Вывод третьего потока:");
        Stream.printGroups(stream3);
        stream3.remove(stream3.searchGroup("Тестеры", 9, 40));
        System.out.println("Вывод третьего потока после удаления группы:");
        System.out.println(stream3);

        System.out.println("Вывод всех потоков:");
        System.out.println(stream1);
        System.out.println(stream2);
        System.out.println(stream3);
        System.out.println();

        System.out.println("Вывод всех потоков после сортировки");
        StreamServis.StreamSort(streamList);
        System.out.println(streamList);
    }
}