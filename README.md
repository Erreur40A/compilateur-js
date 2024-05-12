Vous vous trouvez sur la branche `code_gen` du projet de compilation.

## Build
Tapez la commande `make` dans le repertoire `compilation/`

## Execution
Allez dans le dossier `src/` et tapez la commande `java Compilateur monFichier`

## Informations supplémentaire
Lors de l'éxecution de la commande make vous verrez un warning de javacc qui vous dit qu'il y a deux conflits, malheureusement nous n'avons pas compris d`ou venait, ni comment corriger ces conflits malgré plusieurs essaie de débugage.

Lors de l'éxecution de la commande make vous verrez un warning de javac qui vous dit que la méthode `getLine()` et `getColumn()` est *deprecated*, nous ne pouvons pas régler ces problèmes car cela viens des fichiers générer par javacc.