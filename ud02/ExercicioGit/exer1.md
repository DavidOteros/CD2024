
## Creo a carpeta ExercicioGit
>mkdir ExercicioGit/


## Creo os arquivos de texto
>nano david.txt actividades.txt


## Engadimos os arquivos

> git add david.txt

> git add actividades.txt

##  Facemos commit

> git commit -m "Exer 1"

## Modificamos "actividades.txt"

>nano david.txt

##  Facemos commit

> git commit -m "David.txt modificado"

## Creamos nova carpeta con 2 ficheros
> mkdir 2ficheros

> cd 2ficheros/ 

> touch kk.txt cc.txt

## Eliminamos afición do ficheiro

>nano actvidades.txt

## Creamos arquivo .gitignore

>cd ..

>cd..

>nano .gitignore 

## Añadimos .gitignore y actividades.txt y hacemos git commit

>git add .gitignore

>cd ud02/ExercicioGit/ 

>git add actividades.txt

>git commit -m "Eliminada afición e ignorada 2ficheros"

## Ver el historial de commits 

>git log --oneline

## Desfacer cambios con git checkout

>git checkout 2bc0f11

## Ver o contido dos arquivos 

> cat david.txt (Hola mi nombre es David, tengo 26 años y estudio DAW.)

> cat actividades.txt (Me gusta ir a andar, la música y pinchar)

## Voltamos ao main pra ver o contido mais recente

> git switch - 

> cat david.txt actividades.txt

![Screenshot ](/ud02/ExercicioGit/git%20switch.jpg)

