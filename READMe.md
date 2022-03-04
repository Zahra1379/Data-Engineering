# Data-Engineering Project

This is my data engineering project named "CryptoDataAnalyser" in Fall 1400


## About The Project

In this project, we communicate with an Internet resource such as an online exchange, and after taking data and analyzing that data, we finally show the results to the user.This project consists of three services.

- [x] First service (CoinMarketCap): This service sends a request to an online exchange with a specific frequency, then receives a series of data, and after receiving the data, has a service that works with Kafka and puts this data on Kafka.  So he takes the data with a certain frequency and puts it on Kafka. 

- [x] Second service (Persister): This service listens to Kafka, every time he gets data, puts it in a list, and when the size of this list exceeds 100, removes 100 to 100 of the data from the list and puts it in files called crypt.bin (  Saves in jason format) and the job in this service checks every half hour if something has been written in the last half hour or not.If he had not written, it would have written whatever data was in the list, and would not have waited for it to become 100.  It has an api that when it is called, it reads and returns the files it has and calls this api to the third service. 

- [x] Third service (Batch-Processing): This service, like the first service, has a job that runs at a certain frequency and requests the API of the previous service and takes all the data written in the files. Then on them a series of custom algorithms  Performs analysis or any other application (this section is empty in the code and can be coded to suit the job).  It then saves the result to the database. This service also has an api that allows you to read the data stored in the database and show it to the user.


## Installation

To do this project, you need to install [intelij](https://www.jetbrains.com/idea/download/#section=windows), [java](https://www.oracle.com/java/technologies/downloads/) and [kafka](https://kafka.apache.org/downloads). These tools are enough to perform the first two services. For the third service (batchprocessing) we need the [postgresql](https://www.postgresql.org/download/)database and after installing it we have to create a user with a username and password and set both to "test".  Then we need to create a database called "crypto", which requires the installation of [pgadmin](https://www.pgadmin.org/download/).


## How To Run

After installing and doing the above, we must enter the following commands in the terminal, respectively, to activate zookeeper and kafka.you can read about [zookeeper](https://zookeeper.apache.org/doc/current/index.html)

First Command:
```java
zookeeper-server-start.bat ../../config/zookeeper.properties 
```
Second Command:
```java
kafka-server-start.bat ../../config/server.properties
```
then we can continue working in intelij.Services can be run by running application classes that have main. :smiley:


## License

gnu general public license v3.0. See `LICENSE.md` for more information.



## Contact

Zahra - gmail: z.motamed321@gmail.com
