package ru.itis.javalab.servlets;

import ru.itis.javalab.models.User;
import ru.itis.javalab.repositories.UsersRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/users")
public class UsersServlet extends HttpServlet {
    private UsersRepository usersRepository;
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = usersRepository.findAll();
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Hello!</h1>");
    }
}
