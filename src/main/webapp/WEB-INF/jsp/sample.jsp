<%@ taglib prefix="sample" uri="http://kercheval.org/sample" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>Sample JSP file for Web Application</title>
        <script src='static/js/jquery-1.8.3.min.js' type='text/javascript'></script>
        <link href='static/css/common.css' media='screen' rel='stylesheet' type='text/css' />
    </head>
    <body>
       <h1>Spring Web Application Sample JSP</h1>
       <p>This file is a sample JSP file referenced indirectly from SampleController.java</p>
       <p>This is a call to the TLD function sampleFunction(String) and it returns: ${sample:sampleFunction("TestString")}</p>
    </body>
</html>
