# Transport_mini_project
This is the CSI142 (BinaryVI) group project.

# Repository URL
https://github.com/kobedimotheo2/Transport_mini_project

# Group Members
-Motheo Kobedi 202501189
-Leon Elisha 202503874
-Katlego Botauma  202502546
-Thabiso Basuti 202501201
-Saviour Gasemotho 202501133
-Brian Mahilo 202504078

# Domain 
 Transport and Mobility

# Concept Overview
This system is designed to address key challenges faced by the public in the transport sector. Many commuters experience uncertainty, delays, and inconvenience due to limited access to reliable transport information and services.

# Problem Statement
Public transport in Southern African cities and towns, like Gaborone, operate with very little structure.

The specific problem key points include:

  * No fare transparecy: Limited or no access to accurate fare information as prices change based on factors like distance and time of day.
  * Lack of awareness on route information: New passengers in new areas, have no reliable way to be sure of which combi goes where.
  * Absence of a departure schedule: Majority of public transport vehicles like busses, minibusses and combis do not have scheduled times at which they are supposed to be a certain location, hence people who need them might wait long waiting for them to arrive or even depart.
  * There is no booking systems for public transport: This results in conflicts among passengers regarding seats as they cannot reserve a seat they prefer, thus they just come and hope that there is no one on the seat, which is not guaranteed. 

# Proposed solution
A Java console application that implements public transport booking and route management system acting as a transport operator, managing routes, buses and passenger booking efficiently.

# How the Solution works
To address these challenges, the system introduces the following features:
  1. Fare calculation system
    users receive accurate and well calculated fare information immediately after selecting their destination based on their location of departure.
  2. Seat booking system
    Passenger enters their details and selects a route they're using then book a seat in the bus then they are given a reciept of their bookings.
  3. A route displaying system
    Routes are uniformly displayed, also showing the distance, the details of the bus (such as plate number) on that route, and the standard fare based on the distance. It also shows the estimated time in which the minibus is to arrive and depart, ensuring that people are aware of public transport schedules and they choose those of which they are comfortable with.

# Project Structure
 src/
   └── transport/
           ├── app/
           |  └── MainApp.java
           ├── model/
           |    ├── Booking.java
           |    ├── Bus.java
           |    ├── Passenger.java
           |    ├── Routes.java
           |    └── Vehicle/
           |         └── Vehicle.java
           └── service/
                 ├── BookingService.java
                 └── FareCalculator.java
 .gitignore
 README.md
 sources.txt
                
# How to Compile
  ( PowerShell )
  javac -d out (Get-ChildItem -Recurse -Filter *.java src).FullName
  (Bash)
  javac -d out src/transport/app/MainApp.java src/transport/model/*.java src/transport/service/*.java
# How to run
  java -cp out transport.app.MainApp 

# Menu options
 1. View Routes
 2. Book Seat
 3. View Booking
 4. Routes Fare
 5. Exit
  
# Conclusion
This system aims to improve the efficiency, reliability, and overall user experience of public transport by providing  accessibility and timely information, as well as convenient booking features.

