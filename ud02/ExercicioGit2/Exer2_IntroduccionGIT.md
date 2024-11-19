# Exercicio 2 - Introducción GIT


## 1. Crear y Configurar el Repositorio

1. Cree un directorio llamado **pagina_web**:
   ```
   mkdir pagina_web
   cd pagina_web
   ```
2. Inicialicé un repositorio Git:
   ```
   git init
   ```

## 2. Crear el Archivo Inicial `index.html`

1. Creé un archivo **index.html**:
   ```
   nano index.html
   ```
2. Le hice **git add**:
   ```
   git add index.html
   ```
3. Realicé el primer commit:
   ```
   git commit -m "Primera página html"
   ```
   Resultado: Se registró un commit que contiene el archivo `index.html` inicial.

## 3. Modificar `index.html` para Añadir un Listado de Ciudades

1. Se editó el archivo **index.html** para incluir un listado de ciudades que visitar:

2. Se añadió el archivo modificado al área de preparación:
   ```
   git add index.html
   ```
3. Realicé un commit para registrar los cambios:
   ```
   git commit -m "Añadidas 3 ciudades que visitar"
   ```

## 4. Crear Carpetas para Cada Ciudad

1. Cree una carpeta para cada ciudad:
   ```
   mkdir madrid oslo venecia
   ```
2. Dentro de cada carpeta, se creó un archivo **index.html** con información de cada ciudad. 
3. Añadí todas las carpetas y archivos al área de preparación:
   ```
   git add .
   ```
4. Se realizó un commit para registrar todos los nuevos archivos:
   ```
   git commit -m "Añadida información sobre las ciudades a visitar"
   ```

## 5. Historial de Commits

Para ver el historial de cambios realizados, se ejecutó el siguiente comando:
```
git log 
```
### Resultado:
```
56cec3e Añadida información sobre las ciudades a visitar
3fa0814 Añadidas 3 ciudades que visitar
687cc8c Primera página html
```

Este historial muestra los tres commits realizados hasta el momento.

