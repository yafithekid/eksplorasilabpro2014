<%@page import="java.util.Map"%>
<%@page import="springapp.domain.Room"%>
<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<%@ include file="/WEB-INF/jsp/layout/header.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Map<String,Object> model = (Map<String,Object>) request.getAttribute("model");
    Integer showId = (Integer) model.get("showId");
    Room room = (Room) model.get("room");
%>
<html>
    <div class="container">
        <div style="position: relative;margin: auto;width: 85%;">
	<div class="panel panel-default">
        <div class="panel-heading">
        <center><h3>Layar</h3></center>
        </div>
        <div class="panel-body">

        <form action="../ticket/book.htm" method="post">
            <input type="hidden" name="form-submit" value=""/>
            <input type="hidden" name="show_id" value="<c:out value="${model.showId}"/>"/>
            <table class="table" style="border: none !important;">
                    <% for(int i = 0; i < room.countSeat(); i++){
                        if (i % 10 == 0)
                            out.print("<tr>");
                    %>
                    <td style="text-align: center;"> 
                    <input name="ticket_no_<% out.print(i); %>" type="checkbox" value="<% out.print(i); %>" <% if (room.getSeat(i)) out.print("disabled"); %> />
                    <% if (!room.getSeat(i))out.println("<h5>"+(i+1)+"</h5>"); else out.println("<h5>-</h5>"); %>
                    </td>
                    <%
                        if (i % 10 == 4){
                            out.print("<td></td><td></td>");
                        }
                        if (i % 10 == 9)
                            out.print("</tr>");
                    }
                    %>
            </table>
            <center><button type="submit" class="btn btn-success">Pesan Tiket</button></center>
        </form>
        </div>
        </div>
        </div>
    </div>
</html>
<%@ include file="/WEB-INF/jsp/layout/footer.jsp" %> 
