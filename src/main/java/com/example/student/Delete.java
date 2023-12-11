package com.example.student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "delete", value = "/delete")
public class Delete extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        if (!AllStudents.students.containsKey(id)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            request.setAttribute("msg", "không tìm thấy sv với id này");
            dispatcher.forward(request, response);
            return;
        }
        AllStudents.students.remove(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        request.setAttribute("msg", "ok");
        dispatcher.forward(request, response);
    }
}