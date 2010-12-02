                                 arquillian-javamagazin
 Arquillian project for JavaMagazin article. Arquillian enables you to test your business logic in a remote or embedded container. Alternatively, it can deploy an archive to the container so the test can interact  as a remote client.

 http://jboss.org/arquillian


 Example contains test for EJB3.

 Getting started - example using the OpenEJB embedded container:
 1) git checkout or download sources
 2) run: mvn test

 Tests will be executed within container. Container can either be started manually or automatically by Arquillian.

 Note: If you run the example you might see an ClassCastException in the console. This is caused by a bug in the OpenEJB embedded container (https://issues.apache.org/jira/browse/OPENEJB-1131). Luckily it does not affect
   the execution of the test.

 System requirements
 ===================

 All you need to run this project is Java 5.0 (Java SDK 1.5) or greatr and
 Maven 2.0.10 or greater. This application is setup to be run on a Java EE 6
 certified application server. It has been tested with GlassFish V3 and JBoss
 AS 6.0.

