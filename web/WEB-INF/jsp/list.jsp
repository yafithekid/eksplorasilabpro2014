<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<%@ include file="/WEB-INF/jsp/layout/header.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
      <div class="container">
      <c:forEach items="${model.shows}" var="show">
          <c:out value="${show.getMovie().getTitle()}"/>
          <hr>
      </c:forEach>
      </div>
    <p><fmt:message key="greeting"/> <c:out value="${model.now}"/></p>
    <h3>Products</h3>
    <c:forEach items="${model.products}" var="prod">
      <c:out value="${prod.description}"/> <i>$<c:out value="${prod.price}"/></i><br><br>
    </c:forEach>
  </body>
</html>
<%@ include file="/WEB-INF/jsp/layout/footer.jsp" %> 
