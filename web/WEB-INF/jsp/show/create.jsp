<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<%@ include file="/WEB-INF/jsp/layout/header.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <div class="container">
    <form action="../show/create.htm" method="post">
        <input type='hidden' name='form-submit' value='1'>
        <h5>Film</h5>
        <select class="dropdown" name="movie_id"/>
        <c:forEach items="${model.movies}" var="movie">
            <option value= <c:out value="${movie.getId()}"/> > ${movie.getTitle()}</option>
        </c:forEach>
        </select>
        <h5>Waktu Mulai</h5>
        <input type='number' name='time' class='form-control'/>
        <h5>Room Id</h5>
        <select class="dropdown" name="room_id">
        <% for(int i = 1; i <= 5; i++) { %>
        <option value='<%out.print(i);%>'><%out.print(i);%></option>
        <% } %>
        </select>
        <button type='submit' class='btn btn-primary'>Simpan</button>
    </form>
    </div>
</html>
