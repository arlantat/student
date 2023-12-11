package com.example.student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "read", value = "/read")
public class Read extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String csvFile = "data/students.csv"; // Replace this with the path to your CSV file
        String line;
        String csvSplitBy = ","; // Assuming columns are separated by commas
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        HashMap<Integer, Student> students = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                if (data.length == 6) {
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    int age = Integer.parseInt(data[2].trim());
                    String gender = data[3].trim();
                    String address = data[4].trim();
                    float avg = Float.parseFloat(data[5].trim());

                    // Create a Student object and add it to the list
                    Student student = new Student(id, name, age, gender, address, avg);
                    students.put(id, student);
                } else {
                    request.setAttribute("msg", "lỗi file");
                    dispatcher.forward(request, response);
                    return;
                }
            }
            AllStudents.students = students;
            request.setAttribute("msg", "ok");
        } catch (IOException e) {
            e.printStackTrace();
        }
        dispatcher.forward(request, response);
    }
}