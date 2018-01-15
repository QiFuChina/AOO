<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Web page</title>
</head>
<body>
<form action="${pageContext.request.contextPath}servlet/ie.gmit.sw.UploadHandleServlet" method=post enctype=multipart/form-data>
 <h1>Upload File One</h1>
 
      <p><input type=file name=fileone>
         <input type=submit value=Upload>
         
 <h1>Upload File Two</h1>
      <p><input type=file name=filetwo>
         <input type=submit value=Upload>
</form>
</body>
</html>