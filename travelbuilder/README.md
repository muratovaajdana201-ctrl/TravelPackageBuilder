# Travel Package Builder

## Project Description

This project demonstrates the Builder Design Pattern in Java.

The system is used to create travel packages step by step. It supports two different representations of the same travel package:
- a TravelPackage object
- a text itinerary

## Design Pattern

The project contains the following components:

- TravelPackage — Product
- TravelPackageBuilder — Builder interface
- TravelPackageObjectBuilder — Concrete Builder that creates a TravelPackage object
- ItineraryBuilder — Concrete Builder that creates a text itinerary
- TravelDirector — Director with predefined travel configurations
- Main — Client class used to demonstrate the pattern

## Features

- Fluent API with method chaining
- Immutable TravelPackage
- Input validation
- Two predefined configurations: Luxury Trip and Budget Trip
- Two different representations of the same product

## How to Run

Run the `Main` class from IntelliJ IDEA.

The program creates both luxury and budget travel packages and demonstrates object and text representations.