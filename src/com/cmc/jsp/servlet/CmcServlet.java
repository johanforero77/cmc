package com.cmc.jsp.servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CmcServlet
 */
@WebServlet("/CmcServlet")
public class CmcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CmcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Vector listaDatos = new Vector();
		listaDatos.addElement("Seleccione...");
		listaDatos.addElement("Mango");
		listaDatos.addElement("Banana");
		listaDatos.addElement("Manzana");
		listaDatos.addElement("Mora");
		listaDatos.addElement("Piña");
		listaDatos.addElement("Sandia");
		listaDatos.addElement("Limon");
		listaDatos.addElement("Fresa");
		listaDatos.addElement("Ciruela");
		listaDatos.addElement("Mani");
		request.setAttribute("listaDatos", listaDatos);
		request.getRequestDispatcher("indexPage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	


}
