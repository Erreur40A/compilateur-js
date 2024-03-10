JAVAC = javac
JAVACC = javacc
SRC_DIR = src
AST_SRC = src/AST

all: $(BIN_DIR)
	$(JAVACC) -OUTPUT_DIRECTORY=$(SRC_DIR) $(SRC_DIR)/Compilateur.jj
	$(JAVAC) $(AST_SRC)/*.java
	$(JAVAC) $(SRC_DIR)/*.java

clean:
	rm -rf $(SRC_DIR)
	rm -rf $(AST_SRC)