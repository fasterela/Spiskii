package ru.mirea.klimenkoSpiski;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList d = new DoubleLinkedList();
        String beforeSort = "";
        d.sortedInsert(5);
        beforeSort+=" 5";
        d.sortedInsert(2);
        beforeSort+=" 2";
        d.sortedInsert(9);
        beforeSort+=" 9";
        d.sortedInsert(10);
        beforeSort+=" 10";

        System.out.println("Before sorting: " + beforeSort);
        System.out.println("After sorting: " + d);
    }
}

