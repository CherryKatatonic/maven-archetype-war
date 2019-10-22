## Usage with IntelliJ

1. Clone the repo
2. `cd` into the repo folder in your terminal
3. Run `mvn install`
4. Open the `New Project` window in IntelliJ 
5. Select `Maven`
6. Check the `Create from archetype` checkbox
7. Click `Add Archetype...`
8. Enter the archetype package details:

    - GroupId: `com.boulder`
    - ArtifactId: `maven-archetype-war`
    - Version: `1.0-SNAPSHOT`
    - Repository: (leave blank)
    
9. Click `OK` and you should see the archetype appear in the list of options
10. After creating a project from the archetype, create a folder called `lib` inside of `<project-root>/src/main/webapp/WEB-INF/` 
11. Download the JSTL (JSP Standard Tag Library) jar from http://central.maven.org/maven2/javax/servlet/jstl/1.2/jstl-1.2.jar and place it in the `lib` folder