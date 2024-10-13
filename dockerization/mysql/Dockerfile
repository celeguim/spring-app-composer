FROM mysql:8.0.33
LABEL "Project"="Spring-Stack"
LABEL "Author"="Luiz Celeghin"

ENV MYSQL_ROOT_PASSWORD="root"
ENV MYSQL_DATABASE="accounts"

ADD dbinit.sql docker-entrypoint-initdb.d/dbinit.sql
