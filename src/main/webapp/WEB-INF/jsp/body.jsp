<%@ taglib prefix="sample" uri="http://kercheval.org/sample" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags" %>

<body>
   <h1>Spring Web Application Sample JSP</h1>
   <p>This file is a sample JSP file referenced indirectly from SampleController.java</p>
   <p>This is a sample tag reference in the JSP (<sample:sampleTag sampleAttribute="TestAttribute" />)</p>
   <p>This is a call to the TLD function sampleFunction(String) and it returns: ${sample:sampleFunction("TestString")}</p>
   <p>The div below uses the tags file sampleDiv.tag</p>
   <tags:sampleDiv bgcolor="#dddddd" />
</body>
