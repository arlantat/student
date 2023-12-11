package com.example.student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

@WebServlet(name = "sort", value = "/sort")
public class Sort extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int input = Integer.parseInt(request.getParameter("input"));
        ArrayList<Student> students = new ArrayList<>(AllStudents.students.values());
        switch (input) {
            case 1:
                students.sort(Comparator.comparing(Student::getAvg));
                break;
            case 2:
                students.sort(Comparator.comparing(Student::getAvg).reversed());
                break;
        }
        ArrayList<String> studentInfoList = new ArrayList<>();
        RequestDispatcher dispatcher = request.getRequestDispatcher("sort2.jsp");
        String cur;
        for (Student student : students) {
            cur = student.getId() + " " + student.getAge() + " " +student.getName() + " " +student.getGender() + " " +student.getAvg() + " " +student.getAddress();
            studentInfoList.add(cur);
        }
        request.setAttribute("studentInfoList", studentInfoList);
        dispatcher.forward(request, response);
    }
}