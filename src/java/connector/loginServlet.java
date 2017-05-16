package connector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.Security;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Patrick Ian Co
 */
public class loginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static final String SQL_Select = "SELECT * FROM LE7";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String adminUname = getServletContext().getInitParameter("adminUname");
            String adminPass = getServletContext().getInitParameter("adminPass");
            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");
            String dbDriver = getServletContext().getInitParameter("dbDriver");
            String dbURL = getServletContext().getInitParameter("dbURL");
            String dbUser = getServletContext().getInitParameter("dbUser");
            String dbPass = getServletContext().getInitParameter("dbPass");
            String pw = Security.encrypt(pass);
            String role = "";
            String uname1 = "";
            
            if(dbDriver != null){
                try {
                    Class.forName(dbDriver);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            Connection con = DriverManager.getConnection(dbURL, dbUser, dbPass);
            PreparedStatement stmt = con.prepareStatement(SQL_Select);
            
            ResultSet rs = stmt.executeQuery();
            
             if(adminUname.equals(uname) && adminPass.equals(pass)){
                RequestDispatcher rd = request.getRequestDispatcher("superHome.jsp");
                rd.forward(request, response);
            }
            else
            while(rs.next()){
                uname1 = rs.getString("username");
                role = rs.getString("role");
                
                if(uname1.equals(uname) && pw.equals(rs.getString("password"))){
                    if(role.equals("Admin")){
                        RequestDispatcher rd = request.getRequestDispatcher("adminhome.jsp");
                        rd.forward(request, response);
                    }
                    else if(role.equals("Guest")){
                        RequestDispatcher rd = request.getRequestDispatcher("guesthome.jsp");
                        rd.forward(request, response);
                    }
                }       
                }
             RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
                    rd.include(request, response);
             
        
            
            
            
           
            rs.close();
            con.close(); 
            stmt.close();
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
