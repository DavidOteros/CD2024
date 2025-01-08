
# Exercicio 3 - Introducción GIT

## 1. Crear y Configurar el Repositorio

1. Navegué hasta el directorio de trabajo y cree un nuevo repositorio llamado **libro**:
   ```
   mkdir libro
   cd libro
   git init
   ```

2. Renombré la rama principal a **main**:
   ```
   git branch -m main
   ```

3. Verifiqué el estado inicial del repositorio:
   ```
   git status
   ```

---

## 2. Crear el Archivo Inicial `indice.txt`

1. Creé el archivo **indice.txt** con el siguiente contenido:
   ```
   Capitulo 1: Introducción
   Capitulo 2: Los tres cerditos
   Capitulo 3: Caperucita roja
   ```

2. Añadí el archivo al área de preparación y realicé un commit:
   ```
   git add indice.txt
   git commit -m "Añadido indice del libro"
   ```

3. Verifiqué el estado del repositorio:
   ```
   git status
   ```

---

## 3. Modificar `indice.txt` para Añadir un Nuevo Capítulo

1. Edité el archivo **indice.txt** para incluir el capítulo 4:
   ```
   Capitulo 4: La bella y la bestia
   ```

2. Añadí los cambios al área de preparación y realicé un commit:
   ```
   git add .
   git commit -m "Añadido 4: La Bella y la bestia"
   ```

3. Mostré el historial del repositorio:
   ```
   git log --oneline
   ```

---

## 4. Crear una Carpeta y un Archivo para el Capítulo 2

1. Creé la carpeta **capitulos** y dentro de ella el archivo **capitulo2.txt**:
   ```
   mkdir capitulos
   cd capitulos
   nano capitulo2.txt
   ```

2. Añadí los cambios al área de preparación y realicé un commit:
   ```
   git add .
   git commit -m "Añadido capitulo 2"
   ```

---

## 5. Crear y Configurar el Archivo `.gitignore`

1. Creé un archivo **capitulo3.txt** 
   ```
   nano capitulo3.txt
   ```

2. Ver el estado del repositorio de forma abreviada:
   ````
   git status -s
   `````
   Me devolvió `?? capitulo3.txt` que significa que el archivo está sin seguimiento

3. Añadí un nuevo capítulo al archivo **indice.txt**:
   ```
   Capitulo 5: Frozen
   ```
4. Ignore el capitulo3.txt con un .gitignore
   ```
   nano .gitignore
   ```
5. Añadí y confirmé los cambio ignorando el capitulo3.txt
   ```
   git add indice.txt .gitignore
   git commit -m "Añadido Capitulo 5: Frozen e ignorado capitulo3.txt"
   ```

---

## 6. Modificar las Reglas del `.gitignore`

1. Actualicé el archivo **.gitignore** para ignorar todos los archivos que comiencen con `_`, excepto `_ayuda.txt`:
   ```
   nano .gitignore
   ```

2. Creé dos nuevos archivos: **_logs.txt** y **_ayuda.txt**:
   ```
   nano _logs.txt
   nano _ayuda.txt
   ```

3. Intenté añadir todos los archivos:
   ```
   git add *
   ```
   Solo se añadió `_ayuda.txt` porque `_logs.txt` fue ignorado.
   > The following paths are ignored by one of your .gitignore files:
   _logs.txt

4. Realicé un commit con los cambios:
   ```
   git commit -m "Añadido capitulo 2"
   ```
5. Realicé cambios en capitulo2.txt
   ````
   nano capitulo2.txt
   `````
6. Hice un `git status`:
   >  On branch main
      Changes not staged for commit:
      (use "git add <file>..." to update what will be committed)
      (use "git restore <file>..." to discard changes in working directory)
      modified:   .gitignore
      modified:   capitulos/capitulo2.txt


---

## 7 Verificar y confirmar Cambios

1. Verifiqué los cambios pendientes:
   ```
   git diff
   ```

2. Añadí los cambios al área de preparación y realicé un commit:
   ```
   git add capitulos/capitulo2.txt
   git commit -m "Capitulo 2 modificado"
   ```

3. Realicé otra modificación en el archivo **capitulo2.txt**:

4. Verifiqué los cambios y los añadí al área de preparación y comprobé que cambios había en ferencia a la última instantanea confirmada
   ```
   git diff --staged
   git add capitulos/capitulo2.txt
   ```
   > diff --git a/capitulos/capitulo2.txt b/capitulos/capitulo2.txt
      index 2d4af63..ec80859 100644
      --- a/capitulos/capitulo2.txt
      +++ b/capitulos/capitulo2.txt
      @@ -1 +1,3 @@
      -Caperucita iba por el bosque con su capa roja
      +Caperucita iba por el bosque con su capa roja 
      +cuando llegó a casa de su abuela le dijo 
      +"Abuela qué ojos más grandes tienes"

---

## 8. Eliminar y Renombrar Archivos

1. Eliminé el archivo **_ayuda.txt** del repositorio:
   ```
   git rm _ayuda.txt
   ```

2. Renombré el archivo **indice.txt** a **indice_libros.txt**:
   ```
   git mv indice.txt indice_libros.txt
   ```

3. Confirmé los cambios con un mensaje adecuado:
   ```
   git commit -m "Elminado ayuda, y cambio de nombre indice a indice_libros"
   ```

4. Modifiqué el mensaje del último commit:
   ```
   git commit --amend -m "Nuevo mensaje del último commit"
   ```

---

## 9. Historial Final

Mostré el historial completo del repositorio para verificar los cambios:
```
git log --oneline
```


