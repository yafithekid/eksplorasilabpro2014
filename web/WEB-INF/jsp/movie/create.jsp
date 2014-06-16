<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<%@ include file="/WEB-INF/jsp/layout/header.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reservasi Tiket Bioskop</title>
    </head>
    <div class="container">
        <div class="col-xs-4"></div>
        <div class="col-xs-4">
            <form action="../movie/create.htm" method="post">
            <input type='hidden' name='form-submit' value='1'>
            <h5>Judul</h5>
            <input type='text' name='title' class='form-control'/>
            <h5>Durasi</h5>
            <input type="number" name="length" class="form-control"/>
            <button type='submit' class='btn btn-primary'>Simpan</button>
        </form>
        </div>
        <div class="col-xs-4"></div>
        
        
    </div>
</html>
<%@ include file="/WEB-INF/jsp/layout/footer.jsp" %> 
