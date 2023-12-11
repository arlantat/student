package com.example.student;

import java.util.ArrayList;
import java.util.HashMap;

public class AllStudents {

    public static HashMap<Integer, Student> students = new HashMap<>();

    public static boolean idExists(int id) {
        return students.containsKey(id);
    }

    public static ArrayList<String> studentInfoArray() {
        ArrayList<String> toReturn = new ArrayList<>();
        String cur;
        for (int id : students.keySet()) {
            Student student = students.get(id);
            cur = student.getId() + " " + student.getAge() + " " +student.getName() + " " +student.getGender() + " " +student.getAvg() + " " +student.getAddress();
            toReturn.add(cur);
        }
        return toReturn;
    }
}
