## JSTL Jar

Create a folder called `lib` in the `WEB-INF` folder and then put this .jar file in the `lib` folder: http://central.maven.org/maven2/javax/servlet/jstl/1.2/jstl-1.2.jar

This is the JSTL (JSP Standard Tag Library). It is what enables us to use the special tags in JSPs. This jar must be included the classpath (putting it in `WEB-INF/lib` will automatically add it to the classpath) _**as well as**_ be defined in pom.xml as a provided dependency.