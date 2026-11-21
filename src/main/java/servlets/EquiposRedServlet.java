package servlets;

import beans.EquiposRed;
import daos.EquiposRedDao;
import dtos.ListadoDto;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name="EquiposRedServlet", value="/ListaEquipos")
public class EquiposRedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");


        String action = req.getParameter("action") == null? "lista":req.getParameter("action");
        EquiposRedDao dao = new EquiposRedDao();
        RequestDispatcher view;


        switch (action) {
            case "lista":
                ArrayList<ListadoDto> lista = dao.listaEquiposRed();
                req.setAttribute("listaEquiposRed", lista);

                view = req.getRequestDispatcher("listaEquipos.jsp");
                view.forward(req,resp);
                break;
        }

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

    }



}
