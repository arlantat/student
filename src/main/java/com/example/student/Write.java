package com.example.student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;

@WebServlet(name = "write", value = "/write")
public class Write extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String csvFile = "data/students.csv";
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        HashMap<Integer, Student> students = AllStudents.students;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            for (Student student : students.values()) {
                bw.write(student.getId() + "," + student.getName() + "," +
                        student.getAge() + "," + student.getGender() + "," +
                        student.getAddress() + "," + student.getAvg() + "\n");
            }
            System.out.println("Data has been written to " + csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        request.setAttribute("msg", "ok");
        dispatcher.forward(request, response);
    }
}