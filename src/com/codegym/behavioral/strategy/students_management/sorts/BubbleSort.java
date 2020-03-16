package com.codegym.behavioral.strategy.students_management.sorts;

import java.util.List;

public class BubbleSort implements SortStrategy {
    @Override
    public void sort(List<String> items) {
        System.out.println("Sắp xếp danh sách theo thuật toán nổi bọt");
    }
}
