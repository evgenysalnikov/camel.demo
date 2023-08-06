# Apache Camel Kotlin demo
## My configuration
* java --version
openjdk 11.0.16.1 2022-08-12
OpenJDK Runtime Environment Temurin-11.0.16.1+1 (build 11.0.16.1+1)
OpenJDK 64-Bit Server VM Temurin-11.0.16.1+1 (build 11.0.16.1+1, mixed mode)
evgenijsalnikov@Evgenijs-MacBook-Pro /tmp %
* docker -v
  Docker version 20.10.23, build 7155243

## How to run?
* Open project on IntelliJIdea 
* ``./gradlew dockerBuildImage``
* ``docker run --rm -v /tmp/input:/input -v /tmp/target:/target camel.demo``
## How to try?
* ``ls -la /tmp/target`` empty
* ``cd src/data`` ``cp vasya.xml /tmp/input`` send file to apache camel input stream
* ``ls -la /tmp/target`` check result
* ``cp ivan.xml /tmp/input`` send another file to apache camel input stream
* ``ls -la /tmp/target`` check result again
## What happens?
* Java App running
* Java App starting Apache Camel Core with one example route
