# DefTree: Define every piece of info until I know it all
## Purpose:
The goal of this project is to dissect every word in a definition until I understand all of them by breaking down each term more and more until it gets to such fundamental concepts that I understand how all of it works. Every definition should eventually resolve to these "root" definitions, which are words that I already understand and therefore need no definition. Circular definitions should be impossible, and I will implement mechanisms to ensure this. Some definitions may be many layers deep and may be either complete or incomplete. A definition is complete when all of its branches resolve to roots. A definition's "branch" is basically any "sub-definition", or any word in its definition that is NOT a root, where root is defined as a word in the definition which I already know to such a degree that writing its definition would be redundant.

## Data:
### definitions.txt
> A collection of words whose definitions were previously unknown or unclear to me (list of _definitions_ as defined below)
### roots.txt
>A collection of words whose definitions I already knew (list of _roots_ as defined below)

## Concepts:
### Definition
> A word in the definitions.txt file that is followed by a single dash and then a simple, one-line explanation of said word.
### Root
> A word which I already know to such a degree that writing its definition would be redundant.
### Branch
> A word which I do not know already, and therefore requires further expounding. A branch is considered higher-level than the current definition.
### Leaf
> A word which currently has no higher level definition, meaning no words are written in terms 
### Tree
> A set of definitions in which every relevant word is chained together in a hierarchical structure ending at its roots.
### DefinitionQueue
> A queue of definitions that are next in line to be added to the definitions.txt file.

## Main operation: adding a new definition
1. User wants to add a definition of a new word to a file called definitions.txt (this definition gets pulled from definitionQueue, so if a definition is to be added, it must first be added to definitionQueue)
2. User is prompted to write a definition for said new word
3. Program iterates through each word in said definition one word at a time and does the following for each:
  - a) checks if the word exists in a file called roots.txt or a file called definitions.txt, if so, continue to the next word, else proceed to step b.
  - b) asks the user if they want to add a definition for said word. If user says no, the word gets added to roots.txt to be filtered out in the future as a word for which no definition is desired, else continue to step c.
  - c) add current word to an array called "definitionQueue", then proceed to the next word and repeat step 3 for all words in the current definition.
4. Repeat steps 1-3 for every word in the definitionQueue, which can and usually will be recursively added to as definitions are traversed. The idea is that every word which the user doesn't yet understand receives a definition until the user has an understandable definition for every word.

## Other features:
### DefinitionQueue.add(nameOfDefToAdd)/.remove(nameOfDefToRemove)/.delete()
_User may break from definitionQueue and choose to continue later and the definitionQueue will be saved for later. DefinitionQueue can also be manually added to or deleted from_

### Read definition
_Read the definition of some term with syntax coloring, and the option to traverse its deftree by selecting from a list of options_
* Example:
  * <p><span style="color:purple; font-weight: bold">Compiler</span> - a program that translates code writtten in a <span style="color:orange">high-level</span> programming language into <span style="color:orange">machine-readable-instructions</span>.</p>

