# OrthoSpace

## Description
Un orthophoniste est un spécialiste de la rééducation du langage. Il aide les personnes de tous âges présentant des difficultés de parole, de langage, de communication, d'apprentissage et de déglutition (action de mastiquer ou d'avaler) afin de favoriser leur autonomie, leur bien-être et leur intégration dans leurs milieux de vie. Ce projet vise à concevoir et réaliser un logiciel d'aide à la gestion d'un cabinet d'orthophoniste en offrant un moyen simple et efficace pour l'organisation des rendez-vous, la prise en charge et le suivi des patients.

## Fonctionnalités

### 1. Création de Compte
Lors de la première utilisation de l'application, l'orthophoniste crée un compte en entrant ses informations générales:
- Nom
- Prénom
- Adresse
- Numéro de téléphone
- Adresse e-mail
- Mot de passe

### 2. Gestion des Rendez-vous
L'application permet de programmer différents types de rendez-vous via un agenda intégré:
- **Consultation** : Première visite du patient. Informations requises: nom, prénom et âge.
- **Séance de Suivi** : Pour un patient déjà pris en charge. Informations requises: numéro de dossier, type de séance (présentiel ou en ligne).
- **Atelier de Groupe** : Plusieurs patients participent. Informations requises: thématique et numéros de dossiers des participants.

Durée des rendez-vous:
- Consultation: 1h30 pour un adulte, 2h30 pour un enfant
- Autres rendez-vous: 1 heure

### 3. Bilan Orthophonique (BO)
#### Étape 1: Anamnèse
- Questionnaire pour collecter l'histoire du patient. Différentes catégories pour adultes et enfants.

#### Étape 2: Épreuves Cliniques
- **Observations Cliniques** : Texte décrivant le comportement du patient.
- **Tests** : Questionnaires ou exercices avec scores (de 1 à 10).

#### Étape 3: Diagnostic
- Identification des troubles: déglutition, neuro-développementaux, cognitifs.

#### Étape 4: Projet Thérapeutique
- Description de la démarche à adopter pour la prise en charge des troubles.

### 4. Dossier du Patient
- Création d'un dossier unique pour chaque patient avec toutes les informations et documents relatifs: rendez-vous, BO, fiches de suivi.

### 5. Fiche de Suivi
- Liste d'objectifs (court, moyen, long terme). Notes de 1 à 5 pour évaluer l'évolution du patient. Création de nouvelles fiches de suivi lorsque les objectifs sont atteints.

### 6. Gestion des Tests et Anamnèses
- Création, sauvegarde et modification des tests ou anamnèses.

### 7. Consultation du Dossier du Patient
- Visualisation des rendez-vous, observations, comptes-rendus, fiches de suivi, courbes d'évolution, liste des patients par trouble et pourcentage par trouble.

## Installation
1. Clonez le repo:
   ```bash
   git clone "https://github.com/flh-raouf/OrthoSpace"
   ```
2. Accédez au répertoire du projet:
   ```bash
   cd OrthoSpace
   ```
3. Installez l'extension Java pour Visual Studio Code.

4. Importez les fichiers JAR situés dans le dossier `lib` dans la section `Java Projects`.

    Pour cela, suivez ces étapes dans Visual Studio Code:

    - Ouvrez le panneau Java Projects.
    - Cliquez sur `Add JARs` et sélectionnez tous les fichiers JAR dans le dossier `lib`.

###

# Remerciements
Un grand merci à TOUAT Malak pour son aide et son soutien durant la réalisation de ce projet.


