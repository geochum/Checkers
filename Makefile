JAVAC = javac
JAVA = java
SRC_DIR = src
BIN_DIR = bin

# Defining the main class
MAIN_CLASS = main.Checkers

# Find all java files in the src directory
SOURCES = $(shell find $(SRC_DIR) -name '*.java')

# Default target
all: compile

# Compile the project
compile:
	$(JAVAC) -d $(BIN_DIR) $(SOURCES)

# Run the project
run:
	$(JAVA) -cp $(BIN_DIR) $(MAIN_CLASS)

# Clean the project
clean:
	rm -rf $(BIN_DIR)/*

.PHONY: all compile run clean
