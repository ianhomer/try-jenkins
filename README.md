# try-jenkins

Try Jenkins

# tl;dr

    docker-compose up -d

Get default admin password

    docker exec try-jenkins_jenkins_1 cat /opt/bitnami/jenkins/jenkins_home/secrets/initialAdminPassword | pbcopy

Visit http://localhost/ and log in with admin and default admin password
    
# extra
    
    docker exec -it try-jenkins_jenkins_1 /bin/bash 
        
Jenkins default admin password at /opt/bitnami/jenkins/jenkins_home/secrets/initialAdminPassword