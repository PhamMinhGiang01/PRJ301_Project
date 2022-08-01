/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddminController;

import Dal.DAO;
import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Pham Minh Giang
 */
public class ASaleManagerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ASaleManagerServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ASaleManagerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("Admin/ASaleManager.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String sell_raw = request.getParameter("sell");
        String shop_raw = request.getParameter("shop");
        String year = request.getParameter("year");
        request.setAttribute("test", shop_raw);
        int sell = 0;
        int shop = 0;
        try {
            sell = Integer.parseInt(sell_raw);
        } catch (Exception e) {
        }
        try {
            shop = Integer.parseInt(shop_raw);
        } catch (Exception e) {
        }
        request.setAttribute("shop", shop);
        DAO d = new DAO();
        List<Product> listproduct = (List<Product>) session.getAttribute("listproduct");
        if (sell != 0) {
            listproduct = d.BestSelling(sell);
        }
        List<String> listuser = (List<String>) session.getAttribute("listuser");
        if (shop != 0) {
            listuser = d.BestShopping(shop);
        }
        List<Double> listsale = (List<Double>) session.getAttribute("listsale");
        if (year != null) {
            listsale = new ArrayList<>();
            for (int i = 1; i <= 12; i++) {
                double j = d.Sales(String.valueOf(i), year);
                listsale.add(j);
            }
        }

        session.setAttribute("listproduct", listproduct);
        session.setAttribute("listuser", listuser);
        session.setAttribute("listsale", listsale);
        request.getRequestDispatcher("Admin/ASaleManager.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
