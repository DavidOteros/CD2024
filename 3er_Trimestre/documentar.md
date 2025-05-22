**JAVA DOC**

ACTUALIZAR DOCUMENTACION

mvn clean -> limpa os archivos vellos
mvn compile -> compila o código desde cero 
mvn javadoc:javadoc -> generar a documentacion 






# 📚 Documentación en Java con Javadoc

## 🧩 ¿Qué es Javadoc?

`Javadoc` es una herramienta que genera documentación HTML a partir de comentarios especiales en el código fuente Java.  
Se usa para documentar **clases, métodos, atributos, constructores, etc.**

---

## ✅ Cómo escribir documentación con Javadoc

Los comentarios Javadoc comienzan con `/** ... */` y van justo encima de lo que documentan.

### Ejemplo básico:

```java
/**
 * Calculadora con operaciones básicas.
 */
public class Calculadora {

    /**
     * Suma dos enteros.
     *
     * @param a primer número
     * @param b segundo número
     * @return la suma de a y b
     */
    public int sumar(int a, int b) {
        return a + b;
    }
}
```

### Etiquetas comunes:

| Etiqueta     | Para qué sirve                         |
|--------------|----------------------------------------|
| `@param`     | Describe un parámetro del método       |
| `@return`    | Describe el valor devuelto             |
| `@throws`    | Explica excepciones que puede lanzar   |
| `@see`       | Enlace a otras clases o métodos        |
| `@author`    | Autor del código                       |
| `@version`   | Versión de la clase                    |

---

## 🛠️ Cómo generar la documentación con Maven

```bash
mvn javadoc:javadoc
```

Esto crea un sitio web de documentación en:

```
target/site/apidocs/index.html
```

---

## 👀 Cómo ver la documentación

1. Abre el archivo:
   ```
   target/site/apidocs/index.html
   ```
   en tu navegador.

2. Verás documentación navegable por paquete, clase, método, etc.

---

## ⭐ Recomendaciones para una buena documentación

| Consejo                                           | Por qué                                           |
|--------------------------------------------------|--------------------------------------------------|
| 🧾 Comenta cada clase y método                   | Mejora el mantenimiento y comprensión            |
| 🔤 Usa lenguaje claro y profesional              | Piensa en quien lo leerá                         |
| 🧪 Documenta entradas y salidas (`@param`, `@return`) | Muy valorado en revisiones                      |
| 📛 No repitas el nombre del método en la descripción | Sé descriptivo y útil                        |
| 📚 Úsalo junto con Checkstyle                    | Puedes obligarte a documentar todo               |
| 🔍 No documentes código obvio                   | Documentar por documentar no ayuda               |
| ✨ Genera el HTML y revísalo visualmente         | Te da una idea clara del resultado final         |

---

## 🎓 Bonus: Integración con Checkstyle

Puedes activar reglas para obligarte a documentar clases y métodos públicos en tu `pom.xml`:

```xml
<module name="JavadocMethod"/>
<module name="JavadocType"/>
```

---
