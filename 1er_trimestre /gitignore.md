# Cómo añadir algo a un `.gitignore`

## Pasos para añadir algo a un `.gitignore`:

1. **Localiza el archivo `.gitignore`:**
   - Debe estar en la raíz del repositorio.
   - Si no existe, créalo manualmente:
     ```bash
     touch .gitignore
     ```

2. **Abre el archivo `.gitignore`:**
   - Usa cualquier editor de texto (por ejemplo, `nano`, `vim`, VSCode).
     ```bash
     nano .gitignore
     ```

3. **Añade el patrón o archivo que deseas ignorar:**
   - Para ignorar un archivo específico, como `config.json`:
     ```plaintext
     config.json
     ```
   - Para ignorar todos los archivos con una extensión específica (por ejemplo, `.log`):
     ```plaintext
     *.log
     ```

4. **Guarda y cierra el archivo:**
   - En `nano`, presiona `Ctrl+O`, luego `Enter` para guardar y `Ctrl+X` para salir.

5. **Verifica los cambios:**
   - Asegúrate de que el archivo o patrón está funcionando correctamente con:
     ```bash
     git status
     ```
   - Los archivos ignorados no aparecerán en la lista de archivos sin seguimiento.

---

## Ejemplo de un `.gitignore` básico:

```plaintext
# Ignorar carpetas específicas
node_modules/
dist/

# Ignorar archivos específicos
.env
config.json

# Ignorar archivos por extensión
*.log
*.tmp

# Ignorar todo en una carpeta específica
secret_files/*
```

**Nota importante:**
Si ya has añadido un archivo al control de versiones (con git add), ignorarlo en .gitignore no lo eliminará automáticamente del seguimiento.
Para solucionarlo, debes eliminarlo del índice de Git:

```
git rm --cached archivo_a_ignorar
````

Luego, añade el archivo al .gitignore y haz un commit:

``` bash
echo "archivo_a_ignorar" >> .gitignore
git add .gitignore
git commit -m "Añadir archivo_a_ignorar al .gitignore"
```