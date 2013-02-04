#SpringWebApplication

---

This project is intended to be a canonical example of a simple web
application in spring MVC.  There is no service or dao layer here,
only a JSP and controller front end with CSS/JS presentation layer
support.

This project demonstrates the following:

- Use of Gradle to build a Spring web application
- Configuration of spring MVC
- Use of annotated spring controllers
- Demonstration of view return to access JSP pages
- Use of MVC model to insert data in JSP output
- Use of JSP to build component based pages
- Creation of JSP tags and libraries to create reusable JSP objects
- Use of HTML/Static content (.html, .css, .js)
- Use of WRO4J in spring environment to optimize CSS and JS loading
- Use of URL parameters for RESTful interfaces
- Return of JSON content from a controller
- Client call for and return of JSONP content from a controller
- Loading configuration properties file from the classpath
- The use of JUNIT and JMockit for Unit tests

---

To start the server

```
gradlew jettyRun
```

then visit the page http://localhost:8080/.

---

To enable debugging, add the following to the configuration for your IDE

```
-Xdebug -Xrunjdwp:transport=dt_socket,address=9999,server=y,suspend=n
```

Then attach using remote debugging at port 9999.  This will run the process normally until you attach (if necessary).

You can enable debugging for all your gradle run applications by setting GRADLE_OPTS to this same set of parameters

```
GRADLE_OPTS=-Xdebug -Xrunjdwp:transport=dt_socket,address=9999,server=y,suspend=n
```

---

John Kercheval (kercheval@gmail.com)

##Licensing

<a rel="license" href="http://creativecommons.org/licenses/by/3.0/deed.en_US"><img alt="Creative Commons License" style="border-width:0" src="http://i.creativecommons.org/l/by/3.0/88x31.png" /></a><br /><span xmlns:dct="http://purl.org/dc/terms/" property="dct:title">Gradle CM Plugins</span> by <a xmlns:cc="http://creativecommons.org/ns#" href="https://github.com/kercheval" property="cc:attributionName" rel="cc:attributionURL">John Kercheval</a> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by/3.0/deed.en_US">Creative Commons Attribution 3.0 Unported License</a>.<br />Based on a work at <a xmlns:dct="http://purl.org/dc/terms/" href="https://github.com/kercheval/SpringWebApplication" rel="dct:source">https://github.com/kercheval/SpringWebApplication</a>.

