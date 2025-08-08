package com.mycompany.papeleriaweb.resources;

import java.io.IOException;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConsultaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Entrando al método doPost");

        String nombreBuscado = request.getParameter("nombre");
        System.out.println("Nombre recibido: " + nombreBuscado);

        String resultado = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver JDBC cargado");

            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/papeleria_app", "root", "");
            System.out.println("Conexión a la base de datos 'papeleria_app' establecida");

            PreparedStatement stmt = conn.prepareStatement(
                "SELECT nombre, precio, existencia FROM productos WHERE nombre LIKE ?");
            stmt.setString(1, "%" + nombreBuscado + "%");

            ResultSet rs = stmt.executeQuery();
            System.out.println("Consulta ejecutada");

            StringBuilder html = new StringBuilder();
            boolean hayResultados = false;

            while (rs.next()) {
                hayResultados = true;
                html.append("<tr>")
                    .append("<td>").append(rs.getString("nombre")).append("</td>")
                    .append("<td>").append(rs.getDouble("precio")).append("</td>")
                    .append("<td>").append(rs.getInt("existencia")).append("</td>")
                    .append("</tr>");
            }

            if (!hayResultados) {
                System.out.println("No se encontraron productos");
            } else {
                System.out.println("Productos encontrados");
            }

            resultado = html.toString();
            conn.close();

        } catch (Exception e) {
            resultado = "<tr><td colspan='3'>Error: " + e.getMessage() + "</td></tr>";
            System.out.println("Error en la consulta: " + e.getMessage());
        }

        request.setAttribute("resultado", resultado);
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
}
