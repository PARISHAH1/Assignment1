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
  ```
  Hello from Singleton, same instance: true
  ```
- Factory
  ```
  Serving Coffee
  ```

## Quick test ideas

- Adapter: try different filenames or blank string to see validation.
- Decorator: change decorator order or stack the same decorator twice.
- Observer: attach different numbers of observers and send multiple messages.
- Strategy: switch strategies and vary inputs (negatives, zeros).
- Factory: pass different types; invalid type throws `IllegalArgumentException`.

<<<<<<< HEAD

=======
## Exercise 2 – SmartOffice (CLI)

Folder: `Exercise2/SmartOffice/`

This is a simple Smart Office console app demonstrating additional patterns:

- Singleton: `SmartOffice.core.OfficeConfig`
- Command: `SmartOffice.command.*` with `CommandInvoker`
- Observer: `SmartOffice.observer.*` reacting to occupancy and bookings

### How to compile and run

From the project root `c:\Exercise1` (re-uses the same compile step as Exercise 1):

```
dir /s /b *.java > sources.txt
javac -d . @sources.txt
```

Run the SmartOffice app:

```
java SmartOffice.Main
```

### Supported commands (examples)

```
config room count 3
config room max capacity 1 6     # set room 1 capacity to 6
block room 2 10:00 60            # book room 2 at 10:00 for 60 minutes
add room 2 3                     # add 3 occupants to room 2
cancel room 2                    # cancel booking for room 2
exit                             # quit the app
```

Notes:

- Start typing commands after you see: `SmartOffice app booting...`
- If you modify code, re-run the compile step before running again.
>>>>>>> 202e7ca (Add Exercise 2 (SmartOffice) and update README to include Exercises 1 & 2 with run instructions)
