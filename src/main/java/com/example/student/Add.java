package com.example.student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "add", value = "/add")
public class Add extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        float avg = Float.parseFloat(request.getParameter("avg"));
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        Student student = new Student(id, name, age, gender, address, avg);
        if (AllStudents.idExists(id)) {
            request.setAttribute("msg", "ID tồn tại");
            dispatcher.forward(request, response);
            return;
        }
        AllStudents.students.put(id, student);
        request.setAttribute("msg", "Ok");
        dispatcher.forward(request, response);
    }
}