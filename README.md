 # Kalah Game

A web application that runs the game of 6-stone Kalah. For the general rules of the game please refer to Wikipedia: https://en.wikipedia.org/wiki/Kalah. This is a Java based project using Maven for building and managing.
##Project's structure
This project consists of two parts:
1.The back end which is responsible for the whole game process and implements all the rules of the game.
It is implemented on Java and uses web sockets. (dynamodb implementation started but not also finished)
2.The front end which is responsible only for taking the user's input, sending it to the server, receiving back the updated board of the game 
and appear it on the browser. It was implemented with stompjs 
##Usage
In order to run the application you need Java 8 and Tomcat 7+.
Clone the repository from Github:
$ git clone git://github.com/defnetuba/kalah.git

Navigate into the cloned repository directory
$ cd kalah
The project uses Maven to build
$ mvn clean install
Launch Tomcat and deploy the war file to it. The target folder with the build and war files is included in the repository. So for your convenience you can go to this step immediately after cloning the repository
Access the deployed webapp at
http://localhost:8080/kalah

##Application is not running due to unfinished HTML and websocket implementation but you can see basic architecture from the code. 
