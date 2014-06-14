<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<%-- Redirected because we can't set the welcome page to a virtual URL. --%>
<%@page import="springapp.db.*" %>
<% DBConnector.initConnection(); %>
<c:redirect url="show/index.htm"></c:redirect>