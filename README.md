# Checkers

This repository contains a simple Java implementation of the classic board game Checkers. The project is structured to demonstrate basic Java principles, including object-oriented programming, control structures, and class interactions.

## Project Structure

The project is organized into several packages and classes to separate concerns and functionality:

- `src/main`: Contains the main game logic.
  - `Checkers.java`: The entry point of the game that initializes and controls the game flow.
  - `GameBoard.java`: Manages the game board, including setup, display, and the state of the game.
- `src/pieces`: Contains the classes for the game pieces.
  - `Piece.java`: Represents a generic game piece.
  - `King.java`: Represents a King piece, extending the generic `Piece`.
- `src/utils`: Utility classes that support game functionality.
  - `Position.java`: Represents a position on the game board.

## How to Run

The project uses a Makefile for easy building and running. Ensure you have Java installed on your machine.

### Using the Makefile

The Makefile includes targets for compiling, running, and cleaning the project. Here are the commands to use from the project root directory:

#### Compiling the Project

To compile the project, ensuring all Java source files are compiled into the `bin` directory, run:

```bash
make compile
```
