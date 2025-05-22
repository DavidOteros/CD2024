
**CHECKSTYLE**

        mvn checkstyle:check

**Posibles fallos no checkstyle**

# ✅ Apuntes: Errores comunes de Checkstyle y cómo solucionarlos

---

## 1. ❌ NewlineAtEndOfFile

- **Error:** El archivo no termina con una línea en blanco.
- **Solución:** Añade una línea vacía al final del archivo (pulsa `Enter` al final).

---

## 2. ❌ FileTabCharacter

- **Error:** Uso de tabulaciones (`\t`) en lugar de espacios.
- **Solución:** Configura tu editor para usar **espacios en vez de tabs** (generalmente 4 espacios).

---

## 3. ❌ LineLength

- **Error:** Línea demasiado larga (más de 100/120 caracteres).
- **Solución:** Divide la línea en varias partes.

```java
        // ❌
        System.out.println("Este es un mensaje muy largo que no cabe en una sola línea correctamente");

        // ✅
        System.out.println("Este es un mensaje muy largo " +
                        "que no cabe en una sola línea correctamente");

```

## 4. ❌ MissingJavadocMethod / MissingJavadocType

- **Error:** Falta JavaDoc en clases o métodos públicos.

**Solución**: Añade comentarios JavaDoc.

```java
        /**
         * Representa un coche.
         */
        public class Coche {
            /**
             * Muestra la información.
             */
            public void mostrar() { ... }
        }

```

## 5. ❌ WhitespaceAround / NoWhitespaceBefore

- **Error**: Espacios mal colocados en operadores o paréntesis.

**Solución:**
 ```java
        // ❌
        if(x==1){return;}

        // ✅
        if (x == 1) {
            return;
        }



 ```

## 6. ❌ LeftCurly / RightCurly

**Error**: Llaves mal colocadas.

**Solución:**

```java
        // ❌
        if (x == 1)
        {
            hacerAlgo();
        }

        // ✅
        if (x == 1) {
            hacerAlgo();
        }


```



## 7. ❌ EmptyBlock
**Error:** Bloque vacío sin explicación.

**Solución:**


```java
                try {
                    // Intencionalmente vacío
                } catch (Exception e) {
                    manejarError();
                }

```



## 8. ❌ MagicNumber
**Error:** Uso de números sin nombre descriptivo.

**Solución:**
```java
            // ❌
            if (velocidad > 120) { ... }

            // ✅
            private static final int VELOCIDAD_MAXIMA = 120;
            if (velocidad > VELOCIDAD_MAXIMA) { ... }


```


## 9. ❌ MethodLength / ClassFanOutComplexity

**Error:** Método demasiado largo o clase demasiado compleja.

**Solución:** Refactoriza dividiendo métodos o simplificando dependencias.


## 10.❌ UnusedImports / ImportOrder
**Error:** Importaciones sin usar o mal ordenadas.

**Solución:**

Elimina los import innecesarios.

Orden correcto: java.*, luego javax.*, luego tus propios paquetes.

¡Sí! Además de los 10 errores de Checkstyle que ya mencionaste (muy bien explicados, por cierto), hay **muchos más errores comunes** que Checkstyle puede detectar. Aquí te comparto algunos adicionales que pueden aparecer en entornos reales:

------

## 11. ❌ `Indentation`

- **Error:** Las líneas no están correctamente indentadas.
- **Solución:** Ajusta la sangría según la configuración del proyecto (por defecto: 4 espacios por nivel).

------

## 12. ❌ `ParameterName`, `LocalVariableName`, `MemberName`

- **Error:** Nombres de variables, parámetros o atributos que **no siguen las convenciones**.
- **Solución:** Usa nombres con estilo camelCase y descriptivos.

```java
// ❌
int X;
String NOMBRE_USUARIO;

// ✅
int x;
String nombreUsuario;
```

------

## 13. ❌ `VisibilityModifier`

- **Error:** Falta el modificador de visibilidad (como `public`, `private`, etc.) en clases, métodos o variables.
- **Solución:** Declara siempre el modificador de visibilidad explícitamente.

```java
// ❌
int edad;

// ✅
private int edad;
```

------

## 14. ❌ `FinalClass`, `FinalParameters`, `FinalLocalVariable`

- **Error:** Falta el uso de `final` donde podría aplicarse (según la política del proyecto).
- **Solución:** Marca clases, parámetros o variables como `final` si no deben modificarse.

```java
// ✅
public final class Constantes {
    public static final int MAX = 100;
}
```

------

## 15. ❌ `EqualsHashCode`

- **Error:** La clase sobrescribe `equals` pero no `hashCode`, o viceversa.
- **Solución:** Siempre sobrescribe **ambos** juntos si sobreescribes alguno.

------

## 16. ❌ `IllegalCatch`

- **Error:** Capturar excepciones genéricas como `Exception` o `Throwable`.
- **Solución:** Captura excepciones específicas.

```java
// ❌
catch (Exception e) { ... }

// ✅
catch (IOException e) { ... }
```

------

## 17. ❌ `IllegalThrows`

- **Error:** Declarar que un método lanza excepciones genéricas (como `Exception` o `Throwable`).
- **Solución:** Declara excepciones más específicas.

------

## 18. ❌ `MissingSwitchDefault`

- **Error:** Falta una cláusula `default` en un `switch`.
- **Solución:** Siempre incluye un `default`.

------

## 19. ❌ `ReturnCount`

- **Error:** Demasiados `return` en un mismo método.
- **Solución:** Intenta tener un único `return` o pocos, si la política del proyecto lo exige.

------

## 20. ❌ `BooleanExpressionComplexity`

- **Error:** Condicionales (`if`, `while`, etc.) con expresiones booleanas demasiado complejas.
- **Solución:** Divide la lógica en variables auxiliares con nombres descriptivos.

------

## REGEX Single LINE:

significa que en la línea **56** del archivo `Fecha.java`, hay **espacios al final de la línea**, lo cual viola la regla `RegexpSingleline`.

---

## **Error de "Indentation" (Sangría)** 

significa que el código no está alineado correctamente según las reglas del estilo que estás usando. La sangría es el espacio que se deja al comienzo de una línea para mostrar jerarquía o estructura (normalmente se usa 4 espacios o 1 tabulación por nivel).

------

### ¿Por qué pasa este error?

Por ejemplo, en Java, el cuerpo de una clase, método o bloque debe estar indentado respecto a la declaración que lo contiene.

**Ejemplo correcto:**

```java
public class Fecha {          // nivel 0 (sin sangría)
    private int dia;          // nivel 1 (4 espacios)
    private int mes;          // nivel 1 (4 espacios)

    public Fecha() {          // nivel 1 (4 espacios)
        this.dia = 1;        // nivel 2 (8 espacios)
        this.mes = 1;        // nivel 2 (8 espacios)
    }
}
```

Si alguna línea está alineada mal, como:

```java
public class Fecha {
private int dia;  // aquí falta sangría
    private int mes;

public Fecha() {    // aquí falta sangría
    this.dia = 1;
    this.mes = 1;
}
}
```

Entonces tendrás un error de indentación.

------

### En tu error específico:

```
[ERROR] src/main/java/com/davidotero/Fecha.java:[5,1] (indentation) Indentation: 'member def modifier' estás en el nivel de sangrado 0, pero esto no es el nivel correcto. Se esperaba el nivel 4.
```

Significa que en la línea 5, columna 1, hay una declaración de un miembro (por ejemplo, una variable o método) que está al nivel 0 (sin espacios al inicio), pero debería tener 4 espacios porque está dentro de una clase.

------

### ¿Cómo arreglarlo?

1. Asegúrate que todo lo que está dentro de la clase esté indentado 4 espacios hacia adentro.

Ejemplo:

```java
package com.davidotero;

public class Fecha {       // nivel 0
    private int dia;       // nivel 1 (4 espacios)
    private int mes;       // nivel 1 (4 espacios)
    private int anio;      // nivel 1 (4 espacios)

    // métodos también al mismo nivel
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;   // nivel 2 (8 espacios)
        this.mes = mes;
        this.anio = anio;
    }
}
```

------

¿Quieres que te ayude a revisar y corregir tu archivo `Fecha.java` para que tenga la indentación correcta? Pégamelo aquí y te lo arreglo.
