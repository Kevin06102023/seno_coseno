package servlet;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calcular")
public class Ecuacion extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        procesarCalculos(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        procesarCalculos(request, response);
    }

    private void procesarCalculos(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Calcular los valores de seno y coseno para los ángulos en el rango 0-360 grados, con intervalos de 15 grados
        List<Map<String, Object>> tabla = new ArrayList<>();
        for (int grado = 0; grado <= 360; grado += 15) {
            double seno = Math.sin(Math.toRadians(grado));  // Convertir grados a radianes
            double coseno = Math.cos(Math.toRadians(grado));
            Map<String, Object> fila = new HashMap<>();
            fila.put("grado", grado);
            fila.put("seno", seno);
            fila.put("coseno", coseno);
            tabla.add(fila);
        }

        // Generar la respuesta HTML con la tabla
        out.println("<html><body>");
        out.println("<h1>Tabla de Seno y Coseno</h1>");
        out.println("<table border='1'>");
        out.println("<tr><th>Ángulo (grados)</th><th>Seno</th><th>Coseno</th></tr>");

        // Rellenar la tabla con los valores
        for (Map<String, Object> fila : tabla) {
            out.println("<tr>");
            out.println("<td>" + fila.get("grado") + "</td>");
            out.println("<td>" + String.format("%.4f", fila.get("seno")) + "</td>");
            out.println("<td>" + String.format("%.4f", fila.get("coseno")) + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }
}
