# TODO

# Contexte
Ce premier TP va vous permettre de vous familiariser avec les différents niveaux de tests
logiciels (unitaires, intégrations et fonctionnel) au travers d’un exemple simple.
Le développement va se faire en Java avec JetBrains IntelliJ, les frameworks Junit et Moquito.
Pour plus de simplicité, nous utiliserons des projets Gradle afin de simplifier la mise en place
du projet et des tests.
Un tuto sur le sujet : https://www.youtube.com/watch?v=6V6G3RyxEMk
Livrables
- Un lien vers un repo Git contenant :
Vos projets de tests et code de production
# Enoncé
## Cas nominal
L’objectif est de développer une application console permettant gérer une liste
de tâches simples.
L’application doit permettre à l’utilisateur de réaliser les actions suivantes :
- Ajouter une tâche
- Marquer une tâche comme terminée
- Supprimer une tâche
- Afficher la liste des tâches
Pour ce faire vous devez développer une classe Task représentant une tâche et
ses tests unitaires associées. Une tâche est caractérisée par les attributs
suivants :
- Un identifiant (entier)
- Une description (chaîne)
- Un état (booléen)
Il faudra également développer une classe TaskList responsable de gérer la liste
de tâches et ses tests unitaires/intégration associés.
Enfin une classe TaskManager, qui sera le point d’entrée depuis la classe Main
de votre application console.
La classe TaskManager doit afficher un menu avec les différentes options citées
ci-dessus, et ce tant que l’utilisateur n’a pas entré « exit ».
Il faudra également implémenter des tests fonctionnels de l’application qui
devront simuler des actions utilisateurs et valider toutes les fonctionnalités
proposées par l’application.
Attention, dans ce cas l’application console est considéré comme une interface
graphique, donc cette couche est à contourner lors des tests.
Il va donc falloir rendre votre code testable pour que lors de l’exécution normale
de l’application on interagisse « pour de vrai » avec la console (println et
scanner), et lorsque l’on exécute les tests les entrées/sorties utilisateur soit
simulée et vérifiée en utilisant la librairie Moquito.
Note : La classe TaskManager ne doit comporter aucunes interactions avec la
console (println et scanner).
## Evolutions
Maintenant que vous avez votre code et vos tests de base, vous aurez peut-être
remarqué que notre application présente un défaut dans l’énoncé initial : il est
possible d’ajouter deux tâches ayant le même identifiant.
Corriger ce fonctionnement en interdisant l’ajout d’une tâche ayant un
identifiant déjà existant dans la liste. Mettez à jour vos tests en fonction.
Cela peut être le bon moment pour s’initier au TDD
## Bonus
Après avoir poussé votre projet dans un repo GitHub, configurer une intégration
continue à l’aide de GitHub actions, afin de lancer une compilation de votre
projet et le lancement des tests.
Configuration du build : https://www.youtube.com/watch?v=UkDRXoDCLTg
