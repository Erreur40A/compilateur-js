JAVAC = javac
JAVACC = javacc
SRC_DIR = src
OUT_DIR_JCC = src/
FILE_JJ = src/Compilateur.jj
AST_DIR = src/AST

all:
	$(JAVACC) -OUTPUT_DIRECTORY=$(OUT_DIR_JCC) $(FILE_JJ)
	$(JAVAC) $(AST_DIR)/*.java $(SRC_DIR)/*.java

clean:
	rm -rf $(SRC_DIR)
	rm -rf $(AST_SRC)