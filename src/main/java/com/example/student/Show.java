package com.example.student;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "show", value = "/show")
public class Show extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ArrayList<String> studentInfoArray = AllStudents.studentInfoArray();
        RequestDispatcher dispatcher = request.getRequestDispatcher("show.jsp");
        if (studentInfoArray.isEmpty()) {
            request.setAttribute("msg", "No students");
            dispatcher.forward(request, response);
            return;
        }
        request.setAttribute("studentInfoArray", studentInfoArray);
        dispatcher.forward(request, response);
    }
}