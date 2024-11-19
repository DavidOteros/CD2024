# Apuntes

## Comandos de Terminator

- `ls`: Muestra las carpetas del directorio actual.
- `clear`: Limpia la terminal.
- `cat`: Permite visualizar el contenido de un archivo.
- `cd`: Permite moverse al directorio deseado. Si presionas dos veces la tecla tabulador, muestra las opciones disponibles.
- `man`: Muestra el manual de un comando. Ejemplo: `man cat`. Para salir del manual, utiliza la tecla **q** (de *quit*).
- `ls -a`: Muestra todos los archivos, incluyendo los ocultos.
- `ll`: Lista los archivos con información detallada, incluyendo los ocultos.
- `touch`: Para crear archivos vacíos Ejemplo: `touch index.html`
- `pwd`: Muestra la ruta completa del directorio actual.
- `./`: Representa el directorio actual.
- `rm`: Permite eliminar archivos o carpetas.
- `mv`: Permite mover o renombrar archivos.
  - Ejemplo para renombrar: `mv hola.java HolaMundo.java`.
  - Ejemplo para mover: `mv hola.java /home/vagrant/Desktop/CD2024/`.
- `history`: Muestra el historial de comandos utilizados. Puedes ejecutar un comando del historial escribiendo `!` seguido del número del comando. Ejemplo: `!70`.
- `gcc`: Compila archivos en C. Si añades `-o` seguido de un nombre, defines el archivo de salida. Ejemplo: `gcc hola.c -o hola`.
- **Ctrl + D**: Salir de un intérprete.
- `sudo`: Permite ejecutar comandos con permisos de administrador.
- `apt`: Herramienta avanzada de gestión de paquetes en sistemas Linux basados en Debian. Permite instalar, actualizar o eliminar programas.
  - Si presionas dos veces la tecla tabulador después de escribir un comando incompleto, muestra las opciones disponibles. Ejemplo: Escribe `apt` y presiona tab dos veces.
- `&`: Si usas `&` al final de un comando (por ejemplo, `firefox &`), el programa seguirá ejecutándose en segundo plano aunque cierres la terminal.
- `nano`: Editor de texto en terminal.
- `sudo apt dist-upgrade`: Actualiza todo el sistema.
- `touch`: Crea archivos vacíos.
- `cd ..`: Permite moverse al directorio superior (ir hacia atrás).




## Comandos básicos de Git

- `git init`: Inicializa un repositorio de Git en el directorio actual.
- `git add <archivo>`: Añade un archivo al área de preparación (staging area).
- `git commit -m "<mensaje>"`: Realiza un commit con un mensaje descriptivo.
- `git status`: Muestra el estado actual del repositorio (archivos modificados, en staging, etc.).
- `git log`: Muestra el historial de commits.
- `git log --oneline`: Muestra el historial de commits en una sola línea por commit.
- `git checkout <commit>`: Permite moverse a un commit específico (para explorar su estado).
- `git switch -`: Vuelve a la rama o estado anterior después de usar `checkout`.
- `git add .`: Añade todos los archivos del directorio actual al área de preparación.
- `git rm <archivo>`: Elimina un archivo del repositorio y del directorio.
- `.gitignore`: Se utiliza para ignorar ciertos archivos o carpetas en el repositorio. Para configurarlo, crea y edita un archivo llamado `.gitignore`. 
Para crearlo utiliza `touch .git ignore`
- `git branch -m main <nuevo_nombre>` Se utiliza para cambiar de nombre a la rama local
- `git commit --amend -m <mensaje>` Te permite cambiar el nombre del anterior commit que hayas hecho
- `git mv <archivo> <nombre del archivo al que quieres cambiar>`: Te permite cambiar de nombre un archivo
- `git diff`: Para ver qué has cambiado pero aún no has preparado
-  `git diff --staged`: Este comando compara tus cambios preparados con la última instantánea confirmada. Si ejecutamos ahora `git diff –staged` no veremos nada (ya que no hay nada preparado).

el -git ignore se hace siempre en la raíz del respositorio

git add * añade esos archivos y carpetas al área de preparación (staging area) para que estén listos para ser confirmados (committed). El `git add *`excluye los archivos ocultos

## Notas sobre Java

- El nombre de una clase en Java debe coincidir con el nombre del archivo que la contiene.
- **Ctrl + Espacio**: Abre bloques predefinidos de código en algunos entornos de desarrollo.
- Los puntos de control deben colocarse donde se ejecutan las variables, no donde se definen.