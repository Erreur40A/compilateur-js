JAVAC = javac
JAVACC = javacc
SRC_DIR = src
OUT_DIR = src/
FILE_JJ = src/Compilateur.jj
AST_DIR = src/AST

all: $(BIN_DIR)
	$(JAVACC) -OUTPUT_DIRECTORY=$(OUT_DIR) $(FILE_JJ)
	$(JAVAC) src/AST/*.java src/*.java

clean:
	rm -rf $(SRC_DIR)
	rm -rf $(AST_SRC)