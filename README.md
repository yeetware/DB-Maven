# Dreambot Maven Env

## Overview
This repo is an example of how I manage large collections of scripts easily for different clients.  This example applies to the Dreambot client but can be applied to almost any client with some slight adjustments.  This Maven setup generates Dreambot scripts with built in dependencies.  Meaning no lib folder fuckery!

## Parent pom.xml
### Dreambot client.jar dependency
In order to develop for Dreambot you need to add the client.jar to the build path.  This is done in the root level [pom.xml](pom.xml).  The client.jar is located under the ${user.home}/Dreambot/BotData/client.jar

### Global dependencies
Dependencies you may want to use in all or a majority of your scripts can be placed in this root level [pom.xml](pom.xml) in the dependencies sub section here.

### Individual script dependencies
Dependencies that may be needed for a select few or individual scripts should be placed in their respective pom.xml files.

## Building Scripts
Build script is as brain dead as running `mvn install` inside the root directory of the script you want to compile.  This will generate the script of your liking in 2 places.  Once under the /target/ directory without dependencies, and once in your /Dreambot/scripts/ folder with dependencies so ou can automatically hit refresh and run it!  yay less moving files and shit!

## Adding scripts
Adding scripts is as simple as adding maven sub modules!  I normally do this in Eclipse with the prefabb'ed Maven Modules templates but you can find the template of your choice and follow this guide here to making the sub modules of your choice.

https://javatutorial.net/how-to-create-submodules-with-maven-in-java