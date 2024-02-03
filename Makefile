#compilateur
JC = javac

#variable
OUTPATH = bin/ #dossier des fichier .class
SRCPATH = src/ #dossier des fichier .java
LIBPATH = src/ #si on a 2 classe java A et B et que B contient une instance de A il faut alors préciser dans le classpath de java qu'on utilise la classe A sinon on aura une erreur qui dit de l'instance de la classe a n'est pas reconnue

#option javac
JFLAGS = -g -cp $(LIBPATH) -d $(OUTPATH)

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

#pour ajouter des classes faire comme le commentaire entre Volume.java et Main.java
#IL FAUT FAIRE ATTENTION A L'ORDRE DES CLASSES par exemple:
#si on a 2 classes Main et Maclass et que Main a une instance de Maclass il faut mettre le chemin de Maclass au dessus de Main
#CLASSES = \
#	$(SRCPATH)chemin/de/la/classe/Maclass.java \
#	$(SRCPATH)Main.java
CLASSES = \
	$(SRCPATH)Main.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) bin/*.class
