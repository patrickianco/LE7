<%-- 
    Document   : viewRecord
    Created on : Mar 23, 2017, 10:26:07 PM
    Author     : Patrick Ian Co
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="controller.AddRecord"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.util.Properties"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <style>
            body
            {
                background-image: url("asd.jpg");
                background-position: center center;
                background-size: cover;
                position: relative;
                background-repeat: no-repeat;
                background-attachment: fixed;
                font-family: Segoe UI;
                font-color: white;
                font-size: 150%;
            }

            #logo
            {
                display: block;
                margin: 0 auto;
            }
            
            table
            {
                border: 1px solid black;
                background-color: white;
                font-family: Segoe UI;
                width: 100%;
            }
            
            th
            {
                border: 1px solid black;
                font-family: Segoe UI;
            }
            
            td
            {
                border: 1px solid black ;
                font-family: Segoe UI;
                font-size: 150%;
                
            }
            
            .button
            {
                font-size: 24px;
                text-align: center;
                cursor: pointer;
                outline: none;
                color: black;
                background-color: #fbffb5;
                border: 5px solid ffdd00;
                width: 100%;
                font-family: Segoe UI;
            }
            
            .button:hover
            {
                background-color: #ffe960;
            }

            .button:active
            {
                background-color: #fbffb5;
                box-shadow: 0 5px #808000;
                transform: translateY(4px);
            }
            
            #boxes
            {
                width: 100%;
                box-sizing: border-box;
                border: 1px solid #000000;
                -webkit-transition: 0.3s;
                transition: 0.3s;
                outline: none;
                font-family: Segoe UI;
                font-size: 75%;                            
            }
            
            .hvr-grow
            {
                display: inline-block;
                -webkit-transform: perspective(1px) translateZ(0);
                transform: perspective(1px) translateZ(0);
                box-shadow: 0 0 1px transparent;
                -webkit-transition-duration: 0.3s;
                transition-duration: 0.3s;
                -webkit-transition-property: transform;
                transition-property: transform;
            }
			
            .hvr-grow:hover, .hvr-grow:focus, .hvr-grow:active
            {
                -webkit-transform: scale(1.1);
                transform: scale(1.1);
            }
                        
            .options
            {
                padding: 15px 25px 15px 25px;
                margin-bottom: 2%;
                font-size: 24px;
                text-align: center;
                cursor: pointer;
                outline: none;
                color: #000000;
                background-color: #FFFF00;
                border: none;
                border-radius: 15px;
                width: 100%;
                font-family: Segoe UI;
            }

            .options:hover
            {
                background-color: #e5e500;
            }

            .options:active
            {
                background-color: #FFFF00;
                box-shadow: 0 5px #808000;
                transform: translateY(4px);
            }    
            tr:nth-child(even){background-color: #f2f2f2}
        </style>
   <body>
        <div class="row">
            <div >
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
                <table id="table table-responsive">
                    <tbody>
            <form action="SortTitle" method="POST">
                <th>
                    <input type="submit" name="button" value="Title" />    
                </th>
            </form>
            <form action="SortYear" method="POST">
                <th>
                    <input type="submit" name="button" value="Year"/>
                </th>
            </form>
            <form action="SortSeason" method="POST">
                <th>
                    <input type="submit" name="button" value="Season"/>
                </th>
            </form>    
        <%
            try{
                
                String dbDriver = getServletContext().getInitParameter("dbDriver");
                String dbURL = getServletContext().getInitParameter("dbURL");
                String dbUser = getServletContext().getInitParameter("dbUser");
                String dbPass = getServletContext().getInitParameter("dbPass");
                String ident = (String)request.getAttribute("ident");
                String query = "SELECT * FROM SHOWS ";
                String conc = (String)request.getAttribute("conc");
                String sort = query + conc;
                
                if(dbDriver != null){
                    try {
                        Class.forName(dbDriver);
                        } 
                    catch (ClassNotFoundException ex) {
                    Logger.getLogger(AddRecord.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                Connection con = DriverManager.getConnection(dbURL, dbUser, dbPass);
                
                if(ident == "1"){
                    PreparedStatement pstmt = con.prepareStatement(query);
                    ResultSet rs = pstmt.executeQuery(query);
                    while(rs.next()){%>
                   
        <tr>
            <td>
                <input id="boxes" class="container-fluid" type="text" name="title" id="title" value="<%=rs.getString("TITLE")%>" readonly=""/>
            </td>
            <td>
                <input id="boxes" class="container-fluid" type="text" name="year" id="year" value="<%=rs.getString("CUR_YEAR")%>" readonly="" />
            </td>
            <td>
                <input id="boxes" class="container-fluid" type="text" name="season" id="season" value="<%=rs.getString("NUM_SEASONS")%>" readonly />
            </td>
            
        </tr>
                <%}
                rs.close();
                con.close();   
                }
                else if (ident == "2"){
                    PreparedStatement pstmt = con.prepareStatement(sort);
                    ResultSet rs = pstmt.executeQuery(sort);
                    while(rs.next()){%>
                                        
        <tr>
            <td>
                <input id="boxes" class="container-fluid" type="text" name="title" id="title" value="<%=rs.getString("TITLE")%>" readonly=""/>
            </td>
            <td>
                <input id="boxes" class="container-fluid" type="text" name="year" id="year" value="<%=rs.getString("CUR_YEAR")%>" readonly="" />
            </td>
            <td>
                <input id="boxes" class="container-fluid" type="text" name="season" id="season" value="<%=rs.getString("NUM_SEASONS")%>" readonly />
            </td>
            
        </tr>
                  <%}
                rs.close();
                con.close();
                }
                %>
        </table>
        </div>
        </div>
        </div>
            <input type="submit" name="button" value="Home" />
        </form>
        </div>
        <%
            }
            catch(Exception e){
                e.printStackTrace();
            }
                
        %>
    </body>
</html>
