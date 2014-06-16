<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<%@ include file="/WEB-INF/jsp/layout/header.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
      <div class="container">
          <div class="panel-body">
              <c:forEach items="${model.shows}" var="show">
              <div class="panel panel-default centered" style="position: relative;margin-left: auto; margin-right: auto; width: 80%;">
                    <div class="panel-heading">
                        <div class="row">
			<div class="col-md-4">
                            <center><B><c:out value="${show.getMovieTitle()}"/></B></center> 					
			</div>
                        <div class="col-md-4">
                            <center><B><c:out value="Gate ${show.room.getId()}"/></B></center> 					
			</div>
                        <div class="col-md-4">
                            <center><B>${show.getTimeStartFormatted()} WIB</B></center>
                        </div>
			</div>
                    </div>
                        <div class="panel-body"><center>
                        <img src="../../../springapp/img/${show.getMovieId()}.jpg" alt="hello" width="120" height="150">
                        </center>
                        </div>
                    <div class="panel-footer">
                        <div class="row">
                            <div class="col-md-4"></div>
                            <div class="col-md-4">
                                <center>
                                <a href='../ticket/book.htm?show_id=<c:out value="${show.getId()}"/>'>Pesan</a>					
                                </center>
                            </div>
                            <div class="col-md-4">
                                <B></B> 					
                            </div>
			</div>
                    </div>
		</div>
            </div>
            </c:forEach>

      
      </div>
  </body>
</html>
<%@ include file="/WEB-INF/jsp/layout/footer.jsp" %> 
