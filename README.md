# Pokedex App
### Auteur : Yann GOURGUES
## Présentation
Réalisation dans le cadre d'un projet de 3ème année au sein de l'ESIEA d'une application mobile. Celle-ci affiche une liste de "pokémon", avec pour chacun d'entre eux, un deuxième écran spécifiant ses caractéristiques.

## Consignes respectées
- Une liste d'items utilisant une **recyclerView**
- Un "**splashScreen**" muni d'une **barre de chargement**
- Un **deuxième écran** pour chaque item affichant ses données avec possibilité de scroller
- Appel à une **API Rest**
- **Barre de recherche** permettant de filtrer **suivant 5 caractéristiques**
- Sauvergarde des données en **cache**

## Caractéristiques
### Le SpashScreen
![enter image description here](https://lh3.googleusercontent.com/JZSyphYaIKkDJNWD2FcgmOgSluHV6LwvkZK6NK6V4iwyeFsmY82hnf3w0qXITHCSwgnGAVc1adUl)![enter image description here](https://lh3.googleusercontent.com/iiDeLs69ruszaPvQgOFwk7MgvjCKmzJVN2-ChTqMAmNsfSrS7nrkS3CF1S1wzLCmp29XAYkgYlSA)
### Liste de Pokemon :
Ce Pokedex contient pas moins de 492 pokemons ! Pour chacun d'entre eux nous sont affcihées les caractéristiques suivantes :
- Nom, Id, type, taille, poids, taux de capture, ev donnés
- Talents et talents cachés
- Faiblesses, resistances et immunités
- Statistiques de pv, attaque, défense, attaque spéciale, défense spéciale, vitesse et total
- 4 images différentes (image style 3d, artwork, sprite normal et sprite shiny)


![enter image description here](https://lh3.googleusercontent.com/Z2sAKbzVsV5HTu5-F9s21bZjHYFo3mranu66rx257nUj5ZhZRinn6nsDffpjuUpBHMTrkE5eXHYm)![enter image description here](https://lh3.googleusercontent.com/d9m5qffyplBY8aiq0xvUXbbbw2LtheeMgeKO4CmyVEiE79VO5mIzdepqd57mHrnEi8EVij1-LtSN)

![enter image description here](https://lh3.googleusercontent.com/B8qmQlvdjCvlncUfIJ3LUVTQz1722AdaC-fFkIyZq7qz1hXzSRAafMHJLMuV7r-HF2F4ZBRYCp7r)![enter image description here](https://lh3.googleusercontent.com/Bw8B_iqNhm1uuVDNxSkb3tWXe_SqIHBDdoOPmAlpiLwpLLgQl_vN7ecM5BlV8OTbDwQRt9ezKJUt)![enter image description here](https://lh3.googleusercontent.com/gLtwRXQmmusDmmywkGL5ogoR_fTNjHDgecJWGkgv_aPuzxmYzXo6qW6Ht71P2JW57DfyC0I1-VM1)
> Les statistiques sont affichés sous formes de diagramme pour donner une meilleur idée de leur valeur à l'utilisateur
> Les types, faiblesses, resistances et immunités sont affichés à l'aide d'icon de chaque type pour donner un meilleur visuel
### API REST
L'application utilise les données d'une **API créée de toutes pièces**.
Elle est donc plus facile à manipuler et mettre à jour.
Ainsi donc on a une des seules(voir la seule) API Pokemon française.
### Barre de Recherche
Une barre de recherche a été inclue en raison du grand nombre de données; et pour faciliter encore plus l'utilisateur, il est possible de choisir en fonction de quel critère il veut rechercher un pokemon. Il est donc possible de rechercher en fonction du nom, de l'id, du type, des ev donnés ou des talents.
A chaque caractère rentré, la liste filtrée s'affine.
![enter image description here](https://lh3.googleusercontent.com/vpLwL8630vsjUXSqPImaNEUHNZglTRF8TLXI908RNFn5uxYEWkVyKzr-q24JtEITtRIAhSXFL3ZQ)
![enter image description here](https://lh3.googleusercontent.com/rik4g4HRdXYcMB_HQdbeMH2bJxkBkFlvAD0kIH76RUb3J4JzcXIwA33OYlcVjSNbB7ZuCUemLXhF)
>On voit bien qu'en écrivant "feu"  suivant le filtre choisi, on n'obtient pas la même liste
