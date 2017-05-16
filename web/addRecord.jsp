<%-- 
    Document   : addRecord
    Created on : Mar 23, 2017, 10:21:36 PM
    Author     : Patrick Ian Co
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

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
                color: black;
                background-image: url("asd.jpg");
                background-position: center center;
                background-size: cover;
                position: relative;
                background-repeat: no-repeat;
                background-attachment: fixed;
            }

            #logo
            {
                display: block;
                margin: 0  auto;
            }

            #title
            {
                width: 100%;
                padding: 12px 20px;
                box-sizing: border-box;
                border: 3px solid #ccc;
                -webkit-transition: 0.5s;
                transition: 0.5s;
                outline: none;
                font-family: Segoe UI;
                font-size: 150%;
            }

            #title:focus
            {
                border: 3px solid #FFFF00;
            }

            #details
            {
                width: 100%;
                padding: 12px 20px;
                box-sizing: border-box;
                border: 3px solid #ccc;
                -webkit-transition: 0.3s;
                transition: 0.3s;
                outline: none;
                font-family: Segoe UI;
                font-size: 150%;                            
            }

            #details:focus
            {
                border: 3px solid #FFFF00;
            }


            #buttons
            {
                    display: block;
                    margin: 0 auto;
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

            .button
            {
                padding: 15px 25px 15px 25px;
                font-size: 24px;
                text-align: center;
                cursor: pointer;
                outline: none;
                color: white;
                background-color: #80ced6;
                border: none;
                border-radius: 15px;
                width: 100%;
                font-family: Segoe UI;
            }

            .button:hover
            {
                background-color: #d5f4e6;
            }

            .button:active
            {
                background-color: #FFFF00;
                box-shadow: 0 5px #808000;
                transform: translateY(4px);
            }
            .w3-card   {
                width:50%;
                margin:0 auto
            }
    </style>
  <body>
       <div class="w3-container">
           <br><br><br><br><br><br><br>
            <div class=" w3-card w3-card-24">
                <header class="w3-container w3-teal">
                      <center><h1>Add Record</h1></center>
                </header>
            <form action="AddRecord" method="POST">
                <div class="row" align="center">
                <div class="col-sm-3">&nbsp;</div>
                <div class="col-sm-12">
                    <input type="text" name="title" id="title" value="" placeholder="TITLE" />
                </div>
            </div><br>
            <div class="row" align="center">
		<div class="col-sm-3">&nbsp;</div>
		<div class="col-sm-12">
                    <div class="row">
                            <div class="col-sm-6"><input class="container-fluid" id="details" type="number" min="0" max="9999" name="year" value="" placeholder="YEAR" required/></div>
                            <div class="col-sm-6"><input class="container-fluid" id="details" type="number" min="0" max="9999" name="season" value="" placeholder="SEASON" required/></div>
                    </div>
                </div>
            </div>
            
            <div class="row">
		<div class="col-sm-3">&nbsp;</div> 
                <div class="col-sm-6">
                    <div class="row">
                        <div class="col-sm-6">
                             <br><input class="button hvr-grow" name="but" type="submit" value="Submit" />
                        </div>
                        <div class="col-sm-6"><br>
                            <button onclick="location.href = 'adminhome.jsp'" class="button hvr-grow" name="button" type="submit" value="Go Back" > Go Back </button> 
                        </div>
                    </div>
                </div>
            </div>
               
            </form>
            </div>
       </div>
    </body>

