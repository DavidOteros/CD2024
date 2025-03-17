# **Tipos de Tests en JUnit**

En **JUnit**, se pueden hacer diferentes tipos de **tests** para verificar la funcionalidad de una aplicación en Java. A continuación, se presentan los principales tipos de tests:

---

## **1️⃣ Tests Unitarios**
Son pruebas individuales de los métodos de una clase sin dependencias externas. Se enfocan en validar que cada componente de manera aislada funciona correctamente.  

### **Ejemplo: Testeando un método de suma en una calculadora**  
```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Calculadora {
    public int suma(int a, int b) {
        return a + b;
    }
}

public class CalculadoraTest {
    @Test
    void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.suma(2, 3)); // Se espera que 2+3 sea 5
    }
}
```

✅ **Objetivo**: Verificar que los métodos de una clase devuelven los valores esperados.  

---

## **2️⃣ Tests de Integración**
Prueban la interacción entre varios módulos o clases, verificando que se comuniquen correctamente.  

### **Ejemplo: Verificando que un servicio usa correctamente un repositorio**  
```java
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class ServicioUsuario {
    private RepositorioUsuario repo;

    public ServicioUsuario(RepositorioUsuario repo) {
        this.repo = repo;
    }

    public String obtenerUsuario(int id) {
        return repo.buscarUsuario(id);
    }
}

class RepositorioUsuario {
    public String buscarUsuario(int id) {
        return "Usuario" + id;
    }
}

public class ServicioUsuarioTest {
    @Test
    void testIntegracionServicioYRepositorio() {
        RepositorioUsuario repo = new RepositorioUsuario();
        ServicioUsuario servicio = new ServicioUsuario(repo);

        assertNotNull(servicio.obtenerUsuario(1)); // Verifica que el servicio funcione correctamente con el repo
    }
}
```

✅ **Objetivo**: Asegurar que los componentes trabajen correctamente en conjunto.  

---

## **3️⃣ Tests Funcionales**
Validan que el software cumple con los requisitos funcionales.  

### **Ejemplo: Validar que una contraseña cumple criterios de seguridad**  
```java
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ValidadorContraseña {
    public boolean esSegura(String contraseña) {
        return contraseña.length() >= 8 && contraseña.matches(".*\\d.*");
    }
}

public class ValidadorContraseñaTest {
    @Test
    void testContraseñaSegura() {
        ValidadorContraseña validador = new ValidadorContraseña();
        assertTrue(validador.esSegura("Pass1234")); // La contraseña cumple los requisitos
    }
}
```

✅ **Objetivo**: Evaluar si el sistema cumple con los requerimientos del usuario.  

---

## **4️⃣ Tests de Rendimiento**
Miden el tiempo de ejecución y el consumo de recursos.  

### **Ejemplo: Medir cuánto tarda un método en ejecutarse**  
```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;

class Operaciones {
    public void procesoLento() throws InterruptedException {
        Thread.sleep(500); // Simula un proceso de 500ms
    }
}

public class OperacionesTest {
    @Test
    void testTiempoEjecucion() {
        Operaciones op = new Operaciones();
        assertTimeout(Duration.ofMillis(600), () -> op.procesoLento()); // Debe ejecutarse en menos de 600ms
    }
}
```

✅ **Objetivo**: Garantizar que el código tenga un rendimiento aceptable.  

---

## **5️⃣ Tests de Excepciones**
Verifican que un método lance la excepción esperada en determinadas situaciones.  

### **Ejemplo: Asegurar que se lance una excepción cuando se divide por cero**  
```java
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class Calculadora {
    public int dividir(int a, int b) {
        if (b == 0) throw new ArithmeticException("No se puede dividir por cero");
        return a / b;
    }
}

public class CalculadoraTest {
    @Test
    void testExcepcionDivisionPorCero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }
}
```

✅ **Objetivo**: Validar que el sistema maneje correctamente los errores.  

---

## **6️⃣ Tests de Mocking (Pruebas con Mocks)**
Utilizan herramientas como **Mockito** para simular objetos dependientes sin ejecutarlos realmente.  

### **Ejemplo: Simular un repositorio con Mockito**  
```java
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Servicio {
    private Repositorio repo;

    public Servicio(Repositorio repo) {
        this.repo = repo;
    }

    public String obtenerDato() {
        return repo.obtenerDato();
    }
}

interface Repositorio {
    String obtenerDato();
}

public class ServicioTest {
    @Test
    void testConMock() {
        Repositorio repoMock = mock(Repositorio.class);
        when(repoMock.obtenerDato()).thenReturn("Dato simulado");

        Servicio servicio = new Servicio(repoMock);
        assertEquals("Dato simulado", servicio.obtenerDato());
    }
}
```

✅ **Objetivo**: Evitar la dependencia de servicios externos en las pruebas.  

---

## **📈 Conclusión**

| Tipo de Test | Propósito |
|-------------|------------|
| **Unitarios** | Probar métodos individuales en aislamiento |
| **Integración** | Verificar que varios módulos trabajen juntos |
| **Funcionales** | Asegurar que el sistema cumple con los requisitos |
| **Rendimiento** | Medir la eficiencia del código |
| **Excepciones** | Evaluar el manejo de errores y excepciones |
| **Mocking** | Simular dependencias externas |

Dependiendo del proyecto, puedes combinar diferentes tipos de tests para garantizar un código **robusto, eficiente y confiable**. 🚀

