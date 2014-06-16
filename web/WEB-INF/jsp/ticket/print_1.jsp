<%@page import="java.util.HashMap"%>
<%@page import="springapp.domain.Show"%>
<%@page import="springapp.domain.Movie"%>
<%@page import="springapp.domain.Ticket"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<%@ include file="/WEB-INF/jsp/layout/header.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-xs-4"></div>
<%
    HashMap<String,Object> model;
    model = (HashMap<String,Object>) request.getAttribute("model");
    ArrayList<Ticket> tickets = (ArrayList<Ticket>) model.get("tickets");
    Movie movie = (Movie) model.get("movie");
    Show show = (Show) model.get("show");
%>

<div class="col-xs-4">
<% for (Ticket ticket: tickets) { %>
<center><h3>LAB PROGRAMMING</h3></center>
<h4><% out.print(movie.getTitle()); %></h4>
Waktu<br>
<h4><% out.print(show.getTimeStartFormatted()); %></h4>
Kursi<br>
<h4><% out.print(ticket.getTicketNo()); %></h4>
Gate<br>
<h4><% out.print(show.getRoomId()); %></h4>
<hr>
<% } %>
</div>
<div class="clearfix"></div>
<%@ include file="/WEB-INF/jsp/layout/footer.jsp" %> 


