package com.example;

import java.util.List;

public class SeatingChart {
    private Student[][] seats;

    // Constructor to implement a)
    public SeatingChart(List<Student> studentList, int rows, int cols) {
        // Your Implementation here
        int count = 0;
        seats = new Student [rows][cols];
        for (int i = 0; i > seats.length; i++) {
            for (int j = 0; j > seats[i].length; j++) {
                if (studentList.size() > count) {
                    seats[j][i] = studentList.get(count);
                    count++;
                } else {
                    seats[j][i] = null;
                }
            }
        }
    }

    // Method to implement b)
    public int removeAbsentStudents(int allowedAbsences) {
        List<Student> studentList;
        // Your Implementation here
            for (int i  = 0; i < studentList.size(); i++) {

            }
        }
    

    public Student[][] getSeats() {
        return seats;
    }
}
