# Design Patterns – 6 Simple Demos (Java)

This project demonstrates exactly six classic design patterns as requested:

- Behavioral (2): Observer, Strategy
- Creational (2): Singleton, Factory
- Structural (2): Adapter, Decorator

Each demo is intentionally small and easy to run. Packages match the folder layout: `DesignPatterns.<category>.<pattern>`.

## Project layout

- `DesignPatterns/behavioral/observer/ObserverDemo.java`
- `DesignPatterns/behavioral/strategy/StrategyDemo.java`
- `DesignPatterns/creational/singleton/SingletonDemo.java`
- `DesignPatterns/creational/factory/FactoryDemo.java`
- `DesignPatterns/structural/adapter/` (AdapterDemo and supporting classes)
- `DesignPatterns/structural/decorator/` (DecoratorDemo and supporting classes)

## How to compile and run (Windows cmd.exe)

From the project root `c:\Exercise1`:

```
dir /s /b *.java > sources.txt
javac -d . @sources.txt
```

Run any demo:

```
java DesignPatterns.structural.adapter.AdapterDemo
java DesignPatterns.structural.decorator.DecoratorDemo
java DesignPatterns.behavioral.observer.ObserverDemo
java DesignPatterns.behavioral.strategy.StrategyDemo
java DesignPatterns.creational.singleton.SingletonDemo
java DesignPatterns.creational.factory.FactoryDemo
```

If your IDE shows a “package does not match expected package” warning, set the source root to `c:\Exercise1` so package names match folders.

## What each demo prints

- Adapter
  ```
  Playing audio file: song.mp3
  ```
- Decorator
  ```
  Simple Coffee -> 50.0
  Simple Coffee, Milk -> 70.0
  Simple Coffee, Milk, Sugar -> 80.0
  ```
- Observer
  ```
  A received: Hello Observers
  B received: Hello Observers
  ```
- Strategy
  ```
  Add: 7
  Multiply: 12
  ```
- Singleton
## Quick test ideas

- Adapter: try different filenames or blank string to see validation.
- Decorator: change decorator order or stack the same decorator twice.
- Observer: attach different numbers of observers and send multiple messages.
- Strategy: switch strategies and vary inputs (negatives, zeros).
- Factory: pass different types; invalid type throws `IllegalArgumentException`.

## Exercise 2 – SmartOffice (CLI)

Folder: `Exercise2/SmartOffice/`

SmartOffice is a small, interview-ready console application that showcases clean application of multiple design patterns working together in a realistic scenario.

- Singleton: `SmartOffice.core.OfficeConfig` provides a single configuration/state for rooms and bookings.
- Command: `SmartOffice.command.*` encapsulates user actions (book, cancel, add occupants) and decouples invoker from receivers.
- Observer: `SmartOffice.observer.*` (e.g., `LightSystem`, `ACSystem`) reacts to occupancy changes and bookings.

## How to compile and run (same as Exercise 1)

From the project root `c:\Exercise1`:

```
dir /s /b *.java > sources.txt
javac -d . @sources.txt
```
Run the SmartOffice app:

```
java SmartOffice.Main
```
### Example session

```
config room count 3
config room max capacity 1 6     # set room 1 capacity to 6
block room 2 10:00 60            # book room 2 at 10:00 for 60 minutes
add room 2 3                     # add 3 occupants to room 2
cancel room 2                    # cancel booking for room 2
exit                             # quit the app
```
Notes:

- Start typing commands after you see: `SmartOffice app booting...`.
- If you modify code, re-run the compile step before running again.

## Project Highlights 

- Clear mapping between patterns and code: each pattern has a minimal, runnable demo under `DesignPatterns/...`.
- End-to-end scenario: SmartOffice shows patterns collaborating (Singleton + Command + Observer) to model real operations.
- Simple tooling: vanilla `javac/java`, no framework lock-in, runs on any Windows machine.
- Readable code: small classes, self-descriptive names, and intentional separation of concerns.

## Directory Structure (key paths)

```
c:\Exercise1
├─ DesignPatterns
│  ├─ behavioral
│  │  ├─ observer\ObserverDemo.java
│  │  └─ strategy\StrategyDemo.java
│  ├─ creational
│  │  ├─ singleton\SingletonDemo.java
│  │  └─ factory\FactoryDemo.java
│  └─ structural
│     ├─ adapter\AdapterDemo.java
│     └─ decorator\DecoratorDemo.java
└─ Exercise2
   └─ SmartOffice
      ├─ Main.java
      ├─ core\(OfficeConfig, Room, Booking)
      ├─ command\(Command, AddOccupantCommand, BookRoomCommand, CancelRoomCommand, CommandInvoker)
      └─ observer\(Observer, OccupancySensor, LightSystem, ACSystem)
```
## Design Choices & Tradeoffs

- Commands are immutable and validate input early; this keeps the invoker simple.
- `OfficeConfig` centralizes state to simplify the demo; in larger systems, consider repositories/services per aggregate.
- Observer chain uses simple interfaces to keep coupling low; swapping concrete observers is straightforward.

## Requirements

- Java 8+ (tested on Windows).
- Terminal access (cmd.exe or Git Bash/PowerShell).

## Running Any Demo Quickly

After compiling, run one of:

```
java DesignPatterns.structural.adapter.AdapterDemo
java DesignPatterns.structural.decorator.DecoratorDemo
java DesignPatterns.behavioral.observer.ObserverDemo
java DesignPatterns.behavioral.strategy.StrategyDemo
java DesignPatterns.creational.singleton.SingletonDemo
java DesignPatterns.creational.factory.FactoryDemo
java SmartOffice.Main
```

## Author

- Pari Shah — Building clean, demonstrable Java solutions with a focus on patterns and readability.
