FROM jboss/wildfly:10.0.0.Final
ENV DEPLOYMENT_DIR /opt/jboss/wildfly/standalone/deployments

COPY target/demo.war ${DEPLOYMENT_DIR}

EXPOSE 8080 9990

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]

