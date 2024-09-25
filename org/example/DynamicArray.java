package org.example;

import java.util.Arrays;

public class DynamicArray {
    static int max_size = 5;
    static int size = 0;
    static int[] data = new int[max_size];

    public static void main(String[] args) {
        add(1);
        add(3);
        add(5);
        add(4);
        add(2);
        print();
        sort();
        print();
    }

    static void print() {
        System.out.println("[");
        for (int datum : data) {
            System.out.print(" " + datum);
        }
        System.out.println("]");
    }

    static void add(int value) {
        if (size >= max_size) {
            int[] temp = Arrays.copyOf(data, size);
            max_size *= 2;
            data = new int[max_size];
            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
        data[size] = value;
        size++;
    }

    static void sort() {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j + 1] < data[j]) {
                    int swap = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = swap;

                }

            }
        }
    }
}