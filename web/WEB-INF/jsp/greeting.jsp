<!DOCTYPE HTML>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<head>
    <title>Getting Started: Handing Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
    <h1>Form</h1>
    <form method="post" action="greeting.htm">
        <p>Id: <input type="text" name="id" value="<c:out value="${model.id}"/>"/></p>
        <p>Message: <input type="text" name="content" value="<c:out value="${model.content}"/>"/></p>
        <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
    </form>
</body>
</html>