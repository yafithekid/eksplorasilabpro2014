<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<!DOCTYPE html>
<div class="col-xs-3"></div>
<div class="col-xs-6">
<center><h3>LAB PROGRAMMING</h3></center>
<h6><c:out value="${ticket.getMovieTitle()}"/></h6>
Hari/Tanggal<br>
<h6><c:out value="${ticket.getDate()}"/></h6>
<div class="col-xs-6">
Waktu<br>
<h6><c:out value="${ticket.getTime()}"/></h6>
Kursi<br>
<h6><c:out value="${ticket.getTicketNo()}"/></h6>
<br>
<h6>Rp<c:out value="${ticket.getPrice()}"/></h6>
</div>
</div>

