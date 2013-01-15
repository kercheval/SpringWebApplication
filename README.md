#SpringWebApplication

---

This project is intended to be a canonical example of a simple web
application in spring MVC.  There is no service or dao layer here,
only a JSP and controller front end with CSS/JS presentation layer
support.

This project demonstrates the use of gradle and CM plugins for
release as well as local maven repository support.

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
