<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<%@ include file="/WEB-INF/jsp/layout/header.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
      
      <div style="position: relative;margin-left: auto;margin-right: auto;width: 85%;">
	<div class="panel panel-default"> 
		<div class="panel-heading" style="text-align: left">
		<b>Movies today</b>
		</div>
		<div class="panel-body">
			<!-- Display 3 Movie desc -->
			<div class="row ">
				<%
				int movieID;
				String pictureLink;
				%>
                                <c:forEach items="${model.movies}" var="movie">
				<div class="col-md-4">
				<div class="panel panel-default centered" 
				style="position: relative;margin-left: auto;margin-right: auto;width: 330px;">
                                   
    				<%
					//HashMap<String,Object> model = request.getAttribute("model");
                                       // movieID=$movie.getId(); 
                                        //Ini yang baca ID movienya, ane blum tau cara ngebaca bean di jsp
					//pictureLink="resource/"+movieID+".jpg";
				%>
                                        
					<div class="panel-heading">
                                            <center><B>${movie.getTitle()}</B></center>
					</div>
					<div class="panel-body" style="position: relative;margin-left: auto; margin-right: auto; width: 80%;">
						<div class="row"> 
                                                    <div class="col-md-12">
                                                        <center>
							<img src="../img/${movie.getId()}.jpg" alt="hello" width="137" height="203">
							</center>
                                                    </div>
						</div>
						
					</div>
				</div>
				</div>
				</c:forEach>
			</div>
		</div>
	</div>
</div>
      
      
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
