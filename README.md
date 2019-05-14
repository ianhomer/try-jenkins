# try-jenkins

Try Jenkins

# tl;dr

    docker-compose up -d

Get default admin password

    docker exec try-jenkins_jenkins_1 cat /var/jenkins_home/secrets/initialAdminPassword | pbcopy

Visit http://localhost:8080/ and log in with admin and default admin password

# extra  
  
Log into to node
    
    docker exec -it try-jenkins_jenkins_1 /bin/bash 
        
Jenkins default admin password at /var/jenkins_home/secrets/initialAdminPassword

# one-liner start up

```
docker run \
  --rm \
  -u root \
  -p 8080:8080 \
  -v "jenkins-data:/var/jenkins_home" \
  -v "/var/run/docker.sock:/var/run/docker.sock" \
  -v "$HOME:/home"  jenkinsci/blueocean
```

# thanks

https://jenkins.io/doc/tutorials/build-a-java-app-with-maven/