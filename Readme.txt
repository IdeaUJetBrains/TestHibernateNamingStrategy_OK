(1) Set up a Database
-run the docker-compose.yaml file (to have a docker hsqldb)
-go to the Database view-> + ->datasource from URL and enter jdbc:hsqldb:hsql://localhost/test
( user=sa, password is empty )


(2)
Acceptance
-resolve from a database name in code to the Database
-Gutter actions (near the )
-JPA/Hibernate Consoles
-Generate ER diagram
-Entity generation



(3) For Dynamic plugins
1. do (1)

2.Run a query in JPA console
-open Entitybus class
-click on the gutter
-choose "Run query in Jpa console"

3. Generate ER diagram
-go to the Persistence view
-select "default" persistence unit
-call context menu
-select "Entity Relationship diagram"


