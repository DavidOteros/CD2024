# Resumen Teórico de Tests en JUnit

## 1. **Test de Métodos `set` y `get`**

Los métodos `set` (setters) y `get` (getters) son comunes en las clases que siguen el patrón *POJO* (Plain Old Java Object). Estos métodos permiten establecer y obtener valores de los atributos de la clase.

- **Test de los métodos `get`**: Se prueba que el valor devuelto por el getter sea correcto. Es decir, que el getter devuelva el valor que fue asignado previamente mediante el setter.
  
- **Test de los métodos `set`**: Se prueba que el setter esté correctamente asignando el valor al atributo. Esto puede implicar verificar si el atributo de la clase se modifica correctamente tras llamar al setter.

#### Ejemplo:
```java
public class Persona {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    void testSetterGetter() {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        assertEquals("Juan", persona.getNombre());
    }
}


```

## 2. **Test de Constructores**

Los constructores permiten crear una instancia de la clase con valores iniciales. En los tests de constructores, verificamos si los objetos se crean correctamente y si sus atributos se inicializan como se espera.

#### Ejemplo:

```java
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    void testConstructor() {
        Persona persona = new Persona("Juan", 25);
        assertEquals("Juan", persona.getNombre());
        assertEquals(25, persona.getEdad());
    }
}



```


## 3. **Test del Método `toString()`**

El método `toString()` se utiliza para obtener una representación textual de un objeto. En los tests de `toString()`, se verifica que la salida del método sea la esperada y que contenga la información relevante del objeto.

#### Ejemplo:
```java
public class Persona {
    private String nombre;
    private int edad;

    @Override
    public String toString() {
        return "Persona[nombre=" + nombre + ", edad=" + edad + "]";
    }
}


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    void testToString() {
        Persona persona = new Persona("Juan", 25);
        assertEquals("Persona[nombre=Juan, edad=25]", persona.toString());
    }
}

```




## 4. **Test Parametrizado con `@CsvSource` (JUnit 5)**

Los **tests parametrizados** permiten ejecutar el mismo test con diferentes conjuntos de datos. En JUnit 5, se pueden usar varias fuentes de parámetros, como `@CsvSource`, que permite definir múltiples pares de valores (por ejemplo, una cadena y un número) para ser usados como parámetros en un test.

- **`@CsvSource`**: Permite definir datos directamente en la anotación, usando un formato CSV (valores separados por comas). Cada conjunto de valores será pasado al test como un conjunto de parámetros.

#### Ejemplo:
```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @ParameterizedTest
    @CsvSource({
        "Juan, 25",
        "Ana, 30",
        "Carlos, 20"
    })
    void testConstructorWithCsvSource(String nombre, int edad) {
        Persona persona = new Persona(nombre, edad);
        assertEquals(nombre, persona.getNombre());
        assertEquals(edad, persona.getEdad());
    }
}

```

## Resumen

1. **Test de Setters/Getters**: Verifican que los métodos `set` y `get` funcionan correctamente. Los setters deben modificar los valores de los atributos, y los getters deben devolver esos valores correctamente.
   
2. **Test de Constructores**: Validan que los objetos sean correctamente instanciados con los valores esperados cuando se usa un constructor.

3. **Test del Método `toString()`**: Verifica que la representación textual del objeto sea la correcta, según el formato y los valores que deben aparecer.

4. **Test Parametrizados con `@CsvSource`**: Permite ejecutar un test con diferentes combinaciones de parámetros sin tener que escribir múltiples métodos de prueba. Es útil para pruebas de comportamiento que deben ser verificadas con diferentes entradas.


