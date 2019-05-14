# try-jenkins

Try Jenkins

# tl;dr

```
docker run \
  --rm \
  -u root \
  -p 8080:8080 \
  -v "jenkins-data:/var/jenkins_home" \
  -v "/var/run/docker.sock:/var/run/docker.sock" \
  -v "$HOME:/home"  jenkinsci/blueocean
```

Visit http://localhost:8080/ 

* log in with default admin password which you should see in the terminal window
* click install suggested plugins
* create admin user
* set Jenkins URL - default of http://localhost:8080/ is OK
* click Save and Finish
* click Start using Jenkins
* click Open Blue Ocean
* click Create a new Pipeline
* click GitHub
* fork this try-jenkins repository (so that steps below can find repo)
* create a new GitHub access token at https://github.com/settings/tokens/new?scopes=repo,read:user,user:email,write:repo_hook
* enter the GitHub access token in the Create Pipeline form and click Connect
* select your GitHub user and the try-jenkins repository
* click Create Pipeline

Pipeline should have been created and will automatically kick off a build.

# clean up

To clean up install to restart afresh, list containers, remove container, list volumes 
and remove volume:

    docker container ls -a 
    docker container rm try-jenkins_jenkins_1 
    docker volume ls
    docker volume rm try-jenkins_jenkins-data

# With docker compose

    docker-compose up -d

Get default admin password

    docker exec try-jenkins_jenkins_1 cat /var/jenkins_home/secrets/initialAdminPassword | pbcopy

Visit http://localhost:8080/ and log in with admin and default admin password

# extra  
  
Log into to node
    
    docker exec -it try-jenkins_jenkins_1 /bin/bash 
        
Jenkins default admin password at /var/jenkins_home/secrets/initialAdminPassword


# thanks

https://jenkins.io/doc/tutorials/build-a-java-app-with-maven/