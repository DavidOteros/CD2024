
# Exercicio GIT 1

## Creación de la carpeta ExercicioGit
Primero, creo una carpeta llamada `ExercicioGit` para almacenar todos los archivos relacionados con este ejercicio:

```
mkdir ExercicioGit/
```

## Creación de los archivos de texto
Luego, creo dos archivos de texto dentro de esta carpeta, `david.txt` y `actividades.txt`, utilizando el editor `nano`:

```
nano david.txt actividades.txt
```

## Añadimos los archivos al control de versiones
Una vez creados los archivos, los añado al control de versiones con los siguientes comandos:

```
git add david.txt
git add actividades.txt
```

## Realizo el primer commit
Después de añadir los archivos, hago un commit para registrar los cambios en el repositorio:

```
git commit -m "Exer 1"
```

## Modificación del archivo "actividades.txt"
Modifico el archivo `actividades.txt` para añadir más información:

```
nano actividades.txt
```

## Hago commit de los cambios
Luego de modificar el archivo `actividades.txt`, hago un nuevo commit para registrar la modificación:

```
git commit -m "David.txt modificado"
```

## Creación de una nueva carpeta con dos ficheros
A continuación, creo una nueva carpeta llamada `2ficheros` y dentro de ella dos ficheros vacíos, `kk.txt` y `cc.txt`:

```
mkdir 2ficheros
cd 2ficheros/
touch kk.txt cc.txt
```

## Eliminación de la sección de aficiones del archivo "actividades.txt"
Elimino la sección de aficiones en el archivo `actividades.txt`:

```bash
nano actividades.txt
```

## Creación del archivo .gitignore
Ahora, creo un archivo `.gitignore` en el directorio raíz del proyecto para ignorar la carpeta `2ficheros`:

```
cd ..
nano .gitignore
```

## Añadir y hacer commit del archivo .gitignore y actividades.txt
Añado el archivo `.gitignore` y también el archivo `actividades.txt` para hacer un commit con las modificaciones:

```
git add .gitignore
cd ud02/ExercicioGit/
git add actividades.txt
git commit -m "Eliminada afición e ignorada 2ficheros"
```

## Visualización del historial de commits
Para ver el historial de commits del proyecto, utilizo el siguiente comando:

```
git log --oneline
```

## Deshacer cambios con git checkout
Deshago los cambios utilizando `git checkout` para volver a un commit específico:

```
git checkout 2bc0f11
```

## Ver el contenido de los archivos
Para verificar el contenido de los archivos, uso el comando `cat`:

```
cat david.txt
# Salida: Hola mi nombre es David, tengo 26 años y estudio DAW.

cat actividades.txt
# Salida: Me gusta ir a andar, la música y pinchar
```

## Volver a la rama principal para ver el contenido más reciente
Finalmente, vuelvo a la rama principal (`main`) para ver el contenido actualizado:

```
git switch -
cat david.txt actividades.txt
```

## Captura de pantalla del resultado
![Screenshot](/ud02/ExercicioGit1/resultadoex1.jpg)

