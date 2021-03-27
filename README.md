# Spring-Cloud_kubernetes-ServiceDiscovery
this is end to end solution for kubernetes service discovery.

in this we deploy 4 Spring Boot application on Minikube, a local Kubernetes environment.

Pre:
Install Minikube on our local machine
Develop a microservices architecture example with two independent Spring Boot applications communicating through REST
Set up the application on a one-node cluster using Minikube
Deploy the application using YAML config files

View and DCTM are client , Auth and AppConfig are server.

Steps:

1. Launch Minikube --> minikube start. -- minikube -version
2. set Docker in minikube **$ eval $(minikube docker-env)** otherwise your image will not get picked up by Minikube
3. import code from github
4. create build for respective projects. go to resepective project directory and use below commands  
5. Now prepare image for server - auth and appconfig
    docker build -t auth-service .
    docker build -t appconfig-service .
    
    check docker images by docker image command 
6. Now deploy by yml script
  kubectl create -f auth.yaml
  kubectl create -f appconfig.yaml
  
7. kubectl get pods
8. kubectl get svc
9. kubectl get deploy


10 get service endpoing

i.e minikube service auth-service

11 once good now time to deploy client service in same way


URLS: 
1. http://127.0.0.1:52039/view
2. http://127.0.0.1:50931/viewcontent
3. http://127.0.0.1:50683/dctm
4. http://localhost:8080/auth
