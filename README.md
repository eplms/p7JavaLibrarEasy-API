# p7JavaLibrarEasyAPi
Projet 7 Parcours Développeur Java (API REST)

# DESCRIPTION
Application de gestion de bibliothèque

# ENVIRONNEMENT
* JavaEE 8  
* PostgreSQL  
* Maven
* Spring Boot
* Spring Data Jpa
* Spring MVC
* Feign
* Bootstrap  

Optimisé pour TOMCAT 9.0

# CLONAGE DU PROJET
Pour cloner le projet : 
* https://github.com/eplms/p7JavaLibrarEasy-API.git
* https://github.com/eplms/p7JavaLibrarEasy-AppliWeb.git
* https://github.com/eplms/p7JavaLibrarEasy-Batch.git

# DEPLOIEMENT
##### BDD (postgresql)
1- Télécharger PostgreSQL  
2- Executer les scripts sql (dossier p7JavaLibrarEasyApi/src/main/ressources/doc)  

##### paramètres de connection à la Base de Données
Le user et le mot de passe de connection à la base de données par défaut sont renseignés dans le fichier persistence.xml  
Pour les modifier, le chemin d'accès au fichier dans le projet est :  
		p6JavaMono/src/main/resources/META-INF/persistence.xml

##### Lancement	
1- Récupérer le fichier jar : dans le repository qui accueille le clone, saisir  la commande mvn install  
2- saisir la commande :    java -jar  
3- url de la page d'accueil :http://localhost:8080/

# VERSION
1.0

# AUTEUR
Emmanuel PLUMAS - Septembre 2020
