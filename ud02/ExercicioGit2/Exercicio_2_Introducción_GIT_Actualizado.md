
# Exercicio 2 - Introducción GIT

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
   git add ..
   git commit -m "Añadido capitulo 2"
   ```

---

## 5. Crear y Configurar el Archivo `.gitignore`

1. Creé un archivo **capitulo3.txt** y modifiqué el archivo **.gitignore** para ignorarlo:
   ```
   nano capitulo3.txt
   echo "capitulo3.txt" >> .gitignore
   ```

2. Añadí un nuevo capítulo al archivo **indice.txt**:
   ```
   Capitulo 5: Frozen
   ```

3. Añadí y confirmé los cambios:
   ```
   git add indice.txt .gitignore
   git commit -m "Añadido Capitulo 5: Frozen e ignorado capitulo3.txt"
   ```

---

## 6. Modificar las Reglas del `.gitignore`

1. Actualicé el archivo **.gitignore** para ignorar todos los archivos que comiencen con `_`, excepto `_ayuda.txt`:
   ```
   echo "_*" > .gitignore
   echo "!_ayuda.txt" >> .gitignore
   ```

2. Creé dos nuevos archivos: **_logs.txt** y **_ayuda.txt**:
   ```
   echo "Fichero para almacenar logs" > _logs.txt
   echo "Fichero de ayuda." > _ayuda.txt
   ```

3. Intenté añadir todos los archivos:
   ```
   git add *
   ```
   Resultado: Solo se añadió `_ayuda.txt` porque `_logs.txt` fue ignorado.

4. Realicé un commit con los cambios:
   ```
   git commit -m "Añadido capitulo 2"
   ```

---

## 7. Modificar el Capítulo 2 y Confirmar Cambios

1. Modifiqué el archivo **capitulo2.txt** para cambiar su contenido:
   ```
   Caperucita iba por el bosque con su capa roja
   ```

2. Verifiqué los cambios pendientes:
   ```
   git diff
   ```

3. Añadí los cambios al área de preparación y realicé un commit:
   ```
   git add capitulos/capitulo2.txt
   git commit -m "Capitulo 2 modificado"
   ```

4. Realicé otra modificación en el archivo **capitulo2.txt**:
   ```
   Caperucita iba por el bosque con su capa roja
   cuando llegó a casa de su abuela le dijo 
   "Abuela qué ojos más grandes tienes"
   ```

5. Verifiqué los cambios y los añadí al área de preparación:
   ```
   git diff --staged
   git add capitulos/capitulo2.txt
   ```

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

### Resultado:
```
832570f Nuevo mensaje del último commit
9805511 Capitulo 2 modificado
bcba1b0 Añadido Capitulo 5: Frozen e ignorado capitulo3.txt
3360ad5 Añadido capitulo 2
6b71eab Añadido 4: La Bella y la bestia
5d2c3a3 Añadido indice del libro
```

Este historial confirma todas las etapas realizadas en el ejercicio.
