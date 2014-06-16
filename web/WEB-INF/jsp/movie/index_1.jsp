<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<%@ include file="/WEB-INF/jsp/layout/header.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
      <div class="container">
          <table class="table table-striped">
              <tr><th>No</th><th>Judul</th><th>Durasi</th></tr>
              <c:forEach items="${model.movies}" var="movie">
                  <tr>
                  <td><c:out value="${movie.getId()}"/></td>
                  <td><c:out value="${movie.getTitle()}"/></td>
                  <td><c:out value="${movie.getLength()}"/></td>
                  </tr>
              </c:forEach>
          </table>
      
      </div>
  </body>
</html>
<%@ include file="/WEB-INF/jsp/layout/footer.jsp" %> 
