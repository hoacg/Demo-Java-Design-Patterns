package com.codegym.behavioral.strategy.students_management;

import com.codegym.behavioral.strategy.students_management.sorts.QuickSort;

public class MainAppStudents {
    public static void main(String[] args) {

        StudentsListContext studentsListContext = new StudentsListContext();

        studentsListContext.addStudent("Thành");
        studentsListContext.addStudent("Phong");
        studentsListContext.addStudent("Đoán");

        studentsListContext.setSortStrategy(new QuickSort());
        studentsListContext.sort();
    }
}
