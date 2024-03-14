JAVAC = javac
JAVACC = javacc
SRC_DIR = src

all: $(BIN_DIR)
	$(JAVACC) -OUTPUT_DIRECTORY=$(SRC_DIR) $(SRC_DIR)/Compilateur.jj
	$(JAVAC) $(SRC_DIR)/AST/*.java $(SRC_DIR)/*.java

clean:
	rm -rf $(SRC_DIR)