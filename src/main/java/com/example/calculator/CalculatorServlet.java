package com.example.calculator;

import javax.servlet.HttpConstraintElement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float firstNumber = Float.parseFloat(req.getParameter("first"));
        float secondNumber = Float.parseFloat(req.getParameter("second"));
        char calculator = req.getParameter("calculator").charAt(0);
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1> Result </h1>");
        try{
            float result = Calculator.calculate(firstNumber,secondNumber,calculator);
            writer.println(firstNumber + " " + calculator + " " + secondNumber + " = " + result);
        }catch (Exception e) {
            writer.println("Error" + e.getMessage());
        }
        writer.println("</html>");
    }
}
