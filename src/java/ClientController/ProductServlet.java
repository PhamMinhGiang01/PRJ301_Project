/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientController;

import Dal.DAOBrand;
import Context.DBContext;
import Dal.DAOCategory;
import Dal.DAOProduct;
import Dal.DAOTechnology;
import Model.Brand;
import Model.Category;
import Model.Product;
import Model.Technology;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pham Minh Giang
 */
public class ProductServlet extends HttpServlet {

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

        /* TODO output your page here. You may use following sample code. */
        try (PrintWriter out = response.getWriter()) {

            DAOCategory DAOCategory = new DAOCategory();
            List<Category> listCategory = DAOCategory.getAll();
            request.setAttribute("listCategory", listCategory);

            DAOProduct DAOProduct = new DAOProduct();
            List<Product> listProduct = DAOProduct.getAll();
            request.setAttribute("listProduct", listProduct);

            int num = 9;
            int page = 1;
            if (request.getParameter("page") != null) {
                page = Integer.parseInt(request.getParameter("page"));
            }
            int size = listProduct.size();
            int numpage = (size % 9 == 0 ? (size / 9) : ((size / 9) + 1));
            int start = (page - 1) * num;
            int end = Math.min(page * num, size);
            request.setAttribute("product", listProduct.subList(start, end));
            request.setAttribute("page", page);
            request.setAttribute("numpage", numpage);

            List<Integer> listSize = DAOProduct.getSize();
            request.setAttribute("listSize", listSize);

            DAOBrand DAOBrand = new DAOBrand();
            List<Brand> listBrand = DAOBrand.getAll();
            request.setAttribute("listBrand", listBrand);

            DAOTechnology DAOTechnology = new DAOTechnology();
            List<Technology> listTechnology = DAOTechnology.getAll();
            request.setAttribute("listTechnology", listTechnology);

            request.getRequestDispatcher("Client/Product.jsp").forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
