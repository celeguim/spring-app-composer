FROM nginx
LABEL "Project"="Spring-Stack"
LABEL "Author"="Luiz Celeghin"

RUN rm -rf /etc/nginx/conf.d/default.conf
COPY nginx-config.conf /etc/nginx/conf.d/nginx-config.conf
