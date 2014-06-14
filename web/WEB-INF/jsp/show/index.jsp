<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<%@ include file="/WEB-INF/jsp/layout/header.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
      <div class="container">
          <table class="table table-striped">
              <tr><th>No</th><th>Judul</th><th>Durasi</th></tr>
              <c:forEach items="${model.shows}" var="show">
                  <tr>
                  <td><c:out value="${show.getId()}"/></td>
                  <td><c:out value="${show.getMovieTitle()}"/></td>
                  <td><c:out value="${show.getTimeStart()}"/></td>
                  </tr>
              </c:forEach>
          </table>
      
      </div>
  </body>
</html>
<%@ include file="/WEB-INF/jsp/layout/footer.jsp" %> 
