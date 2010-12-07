                                 arquillian-javamagazin
 Arquillian project for JavaMagazin article. Arquillian enables you to test your business logic in a remote or embedded container. Alternatively, it can deploy an archive to the container so the test can interact  as a remote client.

 http://jboss.org/arquillian


 Example contains test for EJB3.

 Getting started - example using the OpenEJB embedded container:
 1) git checkout or download sources
 2) run: mvn test

 Tests will be executed within container. Container can either be started manually or automatically by Arquillian.

 Switch container
 ================
 
 Tests will be executed against OpenEJB embedded container, by default. Glassfish Embedded 3 and JBoss AS Embedded 6 container profiles are configured out of the box:
 *GF embedded 3: mvn test -Pglassfish-embedded-3
 *JBoss AS Embedded 6: mvn test -Pjbossas-embedded-6

 See http://docs.jboss.org/arquillian/reference/latest/en-US/html_single/#d0e708 for description of all supported containers.

 System requirements
 ===================

 All you need to run this project is Java 5.0 (Java SDK 1.5) or greater and
 Maven 2.0.10 or greater. This application is setup to be run on a Java EE 6
 certified application server. It has been tested with GlassFish V3 and JBoss
 AS 6.0.

