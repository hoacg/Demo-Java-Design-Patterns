package com.codegym.behavioral.strategy.students_management;

import com.codegym.behavioral.strategy.students_management.sorts.SortStrategy;

import java.util.ArrayList;
import java.util.List;

public class StudentsListContext {
    List<String> students = new ArrayList<>();

    SortStrategy sortStrategy;

    public void addStudent(String studentName) {
        this.students.add(studentName);
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort() {
        this.sortStrategy.sort(students);
    }

    public List<String> getStudents() {
        return students;
    }
}
