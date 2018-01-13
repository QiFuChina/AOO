<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Web page</title>
</head>
<body>
 <h1>Upload File One</h1>
    <form method=post enctype=multipart/form-data>
      <p><input type=file name=fileone>
         <input type=submit value=Upload>
         
 <h1>Upload File Two</h1>
    <form method=post enctype=multipart/form-data>
      <p><input type=file name=filetwo>
         <input type=submit value=Upload>
</body>
</html>