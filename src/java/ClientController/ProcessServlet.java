/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientController;

import Dal.DAOProduct;
import Model.Cart;
import Model.Item;
import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
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
public class ProcessServlet extends HttpServlet {

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
            out.println("<title>Servlet ProcessServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProcessServlet at " + request.getContextPath() + "</h1>");
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
        HttpSession session = request.getSession();
        Cart cart = null;
        double total = 0;
        Object o = session.getAttribute("cart");
        // có rồi
        if (o != null) {
            cart = (Cart) o;
            total = (double) session.getAttribute("total");
        } else {
            cart = new Cart();
        }
        String tnum = request.getParameter("num");
        String tid = request.getParameter("id");
        int num;
        try {
            num = Integer.parseInt(tnum);
            DAOProduct d = new DAOProduct();
            if ((num == -1) && (cart.getQuantityById(tid) <= 1)) {
                cart.removeItem(tid);
                total -= d.getProById(tid).getPrice();
            }
            
            Product p = d.getProById(tid);
            double price = p.getPrice();
            Item t = new Item(p, num, price);
            cart.addItem(t);
            if (num == 1) {
                total += p.getPrice();
            }
            if (num == -1) {
                total -= p.getPrice();
            }
        } catch (Exception e) {
        }
        List<Item> list = cart.getItems();
        session.setAttribute("cart", cart);
        session.setAttribute("size", list.size());
        session.setAttribute("total", total);
        request.getRequestDispatcher("products").forward(request, response);
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
        Cart cart = null;
        double total = 0;
        Object o = session.getAttribute("cart");
        // có rồi
        if (o != null) {
            cart = (Cart) o;
            total = (double) session.getAttribute("total");
        } else {
            cart = new Cart();
        }
        DAOProduct d = new DAOProduct();
        String tid = request.getParameter("id");
        total -= d.getProById(tid).getPrice() * cart.getQuantityById(tid);
        cart.removeItem(tid);
        
        List<Item> list = cart.getItems();
        session.setAttribute("cart", cart);
        session.setAttribute("size", list.size());
        session.setAttribute("total", total);
        request.getRequestDispatcher("products").forward(request, response);
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
