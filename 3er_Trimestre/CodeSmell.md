
------

## 🧱 CATEGORÍA: **BLOATERS**

> **Descripción general:**
>  Los *Bloaters* son fragmentos de código que han crecido demasiado con el tiempo. No suelen romper el programa, pero lo hacen difícil de leer, entender y mantener.

------

### 🧩 1. **Data Clump (Agrupación de datos)**

#### 🧠 ¿Qué es?

Ocurre cuando **varias variables** suelen viajar juntas por el código, se repiten en muchos métodos o clases, y **claramente pertenecen al mismo concepto**.

#### 🚩 ¿Por qué es un problema?

- Duplica código y lógica innecesariamente.
- Aumenta la posibilidad de errores si hay que modificar todas esas variables por separado.
- Indica que **falta una abstracción**, como una clase.

#### ❌ Ejemplo (Código con mal olor):

```java
public void printInvoice(String customerName, String customerAddress, String customerPhone) {
    // se pasan siempre juntas
}
```

#### ✅ Solución (Código mejorado):

Agrupar esas variables en una clase:

```java
public class Customer {
    String name;
    String address;
    String phone;
}

public void printInvoice(Customer customer) {
    // ahora es más limpio y escalable
}
```

------

### 🧩 2. **Large Class (Clase gigante)**

#### 🧠 ¿Qué es?

Una clase que **hace demasiadas cosas**. Tiene muchos métodos y campos, y abarca responsabilidades que deberían estar separadas en varias clases.

#### 🚩 ¿Por qué es un problema?

- Viola el principio de **Responsabilidad Única (SRP)**.
- Difícil de leer, probar y mantener.
- Cambiar algo puede afectar otras partes sin querer.

#### ❌ Ejemplo (Código con mal olor):

```java
public class EmployeeManager {
    public void calculateSalary() {}
    public void printPayslip() {}
    public void updateDatabase() {}
    public void sendEmail() {}
    public void logActivity() {}
}
```

#### ✅ Solución (Código mejorado):

Separar responsabilidades en clases más pequeñas:

```java
public class PayrollService {
    public void calculateSalary() {}
}

public class EmailService {
    public void sendEmail() {}
}
```

------

### 🧩 3. **Long Method (Método demasiado largo)**

#### 🧠 ¿Qué es?

Un método que contiene **muchas líneas de código** y realiza **múltiples tareas**.

#### 🚩 ¿Por qué es un problema?

- Difícil de entender y seguir la lógica.
- Reutilización y testeo se complican.
- Mezcla distintos niveles de abstracción.

#### ❌ Ejemplo (Código con mal olor):

```java
public void generateReport() {
    connectToDB();
    fetchUserData();
    formatData();
    createPDF();
    sendToPrinter();
    logCompletion();
}
```

#### ✅ Solución (Código mejorado):

Extraer métodos con nombres claros:

```java
public void generateReport() {
    List<User> users = fetchUserData();
    Report report = createReport(users);
    sendReport(report);
}
```

------

### 🧩 4. **Long Parameter List (Lista de parámetros larga)**

#### 🧠 ¿Qué es?

Ocurre cuando un método requiere **muchos parámetros**. Esto lo hace difícil de usar, leer y mantener.

#### 🚩 ¿Por qué es un problema?

- El orden de los parámetros puede ser confuso.
- Aumenta el riesgo de errores.
- A menudo indica que **falta un objeto** que agrupe esos datos.

#### ❌ Ejemplo (Código con mal olor):

```java
public void registerUser(String name, String email, String phone, String address, String city, String country) {
    // muchos parámetros
}
```

#### ✅ Solución (Código mejorado):

Crear un objeto para agrupar los datos:

```java
public class UserData {
    String name, email, phone, address, city, country;
}

public void registerUser(UserData user) {
    // más claro y limpio
}
```

------

### 🧩 5. **Primitive Obsession (Obsesión por los tipos primitivos)**

#### 🧠 ¿Qué es?

Usar tipos primitivos como `String`, `int`, `float` para representar conceptos complejos del dominio, en vez de crear clases específicas.

#### 🚩 ¿Por qué es un problema?

- Falta validación, encapsulamiento y claridad.
- Código repetido y menos expresivo.
- Difícil de extender.

#### ❌ Ejemplo (Código con mal olor):

```java
public class User {
    private String phoneNumber; // solo un String
}
```

#### ✅ Solución (Código mejorado):

Crear una clase con lógica propia:

```java
public class PhoneNumber {
    private final String number;

    public PhoneNumber(String number) {
        if (!number.matches("\\d{9}")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
```

------

Perfecto, sigamos con la siguiente categoría:

------

## 🧩 CATEGORÍA: **OBJECT-ORIENTATION ABUSERS**

> **Descripción general:**
>  Estos *code smells* aparecen cuando el diseño orientado a objetos **no se aplica bien** o se **abusa de él**. El resultado es código que no aprovecha los beneficios de la orientación a objetos, como la herencia, el encapsulamiento o el polimorfismo.

------

### 🧩 1. **Alternative Classes with Different Interfaces (Clases alternativas con interfaces diferentes)**

#### 🧠 ¿Qué es?

Son clases que **realizan tareas similares** pero tienen **nombres de métodos distintos** o **interfaces inconsistentes**, lo que **complica el uso intercambiable** de estas clases.

#### 🚩 ¿Por qué es un problema?

- Rompe la **consistencia** y dificulta el mantenimiento.
- Impide el uso de polimorfismo.
- El programador debe recordar nombres diferentes para lo mismo.

#### ❌ Ejemplo (Código con mal olor):

```java
public class PdfExporter {
    public void exportToPdf(String data) {}
}

public class CsvExporter {
    public void writeCsv(String data) {}
}
```

#### ✅ Solución (Código mejorado):

Usar una interfaz común:

```java
public interface Exporter {
    void export(String data);
}

public class PdfExporter implements Exporter {
    public void export(String data) {
        // exportar a PDF
    }
}

public class CsvExporter implements Exporter {
    public void export(String data) {
        // exportar a CSV
    }
}
```

------

### 🧩 2. **Refused Bequest (Herencia rechazada)**

#### 🧠 ¿Qué es?

Sucede cuando una subclase **hereda de una clase base** pero **no necesita** o **no usa parte de esa herencia**, o incluso **sobrescribe métodos que no necesita**.

#### 🚩 ¿Por qué es un problema?

- Muestra que hay una **mala jerarquía de herencia**.
- La subclase depende de cosas que **no debería conocer**.
- Viola el principio de sustitución de Liskov (LSP).

#### ❌ Ejemplo (Código con mal olor):

```java
public class Bird {
    public void fly() {}
}

public class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}
```

#### ✅ Solución (Código mejorado):

Usar **composición** o **jerarquías más adecuadas**:

```java
public interface Bird {}

public interface FlyingBird extends Bird {
    void fly();
}

public class Eagle implements FlyingBird {
    public void fly() {
        // vuela
    }
}

public class Ostrich implements Bird {
    // no vuela
}
```

------

### 🧩 3. **Switch Statement (Sentencia switch)**

#### 🧠 ¿Qué es?

Aparece cuando el comportamiento de un objeto depende de un `switch` o `if-else` que selecciona el tipo de acción según un valor (generalmente un tipo o estado).

#### 🚩 ¿Por qué es un problema?

- Si agregas un nuevo tipo, debes **modificar el switch en todos lados**.
- Es más difícil de extender y testear.
- Rompe el principio de **abierto/cerrado** (OCP).

#### ❌ Ejemplo (Código con mal olor):

```java
public void processPayment(Payment payment) {
    switch (payment.getType()) {
        case "CreditCard": /* lógica */ break;
        case "Paypal": /* otra lógica */ break;
    }
}
```

#### ✅ Solución (Código mejorado):

Usar polimorfismo:

```java
public interface Payment {
    void process();
}

public class CreditCardPayment implements Payment {
    public void process() {
        // lógica tarjeta
    }
}

public class PaypalPayment implements Payment {
    public void process() {
        // lógica Paypal
    }
}
```

------

### 🧩 4. **Temporary Field (Campo temporal)**

#### 🧠 ¿Qué es?

Ocurre cuando un atributo de una clase **solo se usa ocasionalmente**, en situaciones muy específicas o por uno de varios métodos.

#### 🚩 ¿Por qué es un problema?

- La clase se vuelve **menos cohesiva**.
- Añade **complejidad innecesaria**.
- Esconde **comportamientos acoplados** que podrían moverse a otra clase.

#### ❌ Ejemplo (Código con mal olor):

```java
public class Report {
    private String pdfFont; // solo se usa si es un PDF

    public void generatePdfReport() {
        // usa pdfFont
    }

    public void generateHtmlReport() {
        // no usa pdfFont
    }
}
```

#### ✅ Solución (Código mejorado):

Extraer subclases o delegar:

```java
public abstract class Report {
    public abstract void generate();
}

public class PdfReport extends Report {
    private String font;

    public void generate() {
        // usa font
    }
}

public class HtmlReport extends Report {
    public void generate() {
        // no necesita font
    }
}
```

------

Perfecto, continuamos con la siguiente categoría de *code smells*:

------

## 🔄 CATEGORÍA: **CHANGE PREVENTERS**

> **Descripción general:**
>  Estos *smells* dificultan o impiden hacer **cambios en el código** sin modificar muchas partes del sistema. Si cambiar una sola cosa implica tocar muchas clases o archivos, estás ante un **change preventer**.

------

### 🔄 1. **Divergent Change (Cambio divergente)**

#### 🧠 ¿Qué es?

Sucede cuando una sola clase **se ve afectada por múltiples razones para cambiar**. Es decir, **cada cambio requiere modificar esa clase**, aunque los motivos del cambio sean muy distintos.

#### 🚩 ¿Por qué es un problema?

- Rompe el principio de **responsabilidad única (SRP)**.
- La clase es un **punto crítico de mantenimiento**.
- Pequeños cambios pueden introducir errores inesperados.

#### ❌ Ejemplo (Código con mal olor):

```java
public class Employee {
    public void calculatePay() {}      // lógica financiera
    public void generateReport() {}    // lógica de presentación
    public void saveToDatabase() {}    // lógica de persistencia
}
```

#### ✅ Solución (Código mejorado):

Dividir responsabilidades en clases distintas:

```java
public class Payroll {
    public void calculatePay(Employee e) {}
}

public class ReportGenerator {
    public void generateReport(Employee e) {}
}

public class EmployeeRepository {
    public void save(Employee e) {}
}
```

------

### 🔄 2. **Shotgun Surgery (Cirugía de escopeta)**

#### 🧠 ¿Qué es?

Ocurre cuando **un solo cambio lógico** obliga a **modificar muchas clases o métodos diferentes** que están distribuidos por todo el código.

#### 🚩 ¿Por qué es un problema?

- Es fácil olvidar un lugar donde hay que hacer el cambio.
- Hace el mantenimiento **lento y propenso a errores**.
- Señal de que el comportamiento **está demasiado disperso**.

#### ❌ Ejemplo (Código con mal olor):

Cambiar el formato del número de teléfono obliga a tocar:

- `Customer`
- `Order`
- `Invoice`
- `UserProfile`
   Cada uno tiene su propia lógica de validación de teléfono.

#### ✅ Solución (Código mejorado):

Centralizar la lógica en una clase:

```java
public class PhoneNumber {
    private final String number;

    public PhoneNumber(String number) {
        if (!number.matches("\\d{9}")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.number = number;
    }

    public String getFormatted() {
        return number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6);
    }
}
```

------

### 🔄 3. **Parallel Inheritance Hierarchies (Jerarquías de herencia paralelas)**

#### 🧠 ¿Qué es?

Aparece cuando por cada clase de una jerarquía tienes que crear otra clase en **otra jerarquía relacionada**. Es como si las dos jerarquías **crecieran juntas**.

#### 🚩 ¿Por qué es un problema?

- Aumenta el trabajo y la complejidad.
- Las clases están **acopladas innecesariamente**.
- Impide la reutilización clara de código.

#### ❌ Ejemplo (Código con mal olor):

```java
public class Rectangle { }
public class Circle { }

public class RectangleRenderer { }
public class CircleRenderer { }
```

Cada vez que creas una nueva figura, tienes que crear su renderer. Las jerarquías crecen a la par.

#### ✅ Solución (Código mejorado):

Usar **composición** o **interfaces**:

```java
public interface Shape {
    void draw(Renderer renderer);
}

public interface Renderer {
    void render(Rectangle r);
    void render(Circle c);
}

public class Rectangle implements Shape {
    public void draw(Renderer renderer) {
        renderer.render(this);
    }
}

public class Circle implements Shape {
    public void draw(Renderer renderer) {
        renderer.render(this);
    }
}
```

------

¡Perfecto! Seguimos entonces con:

------

## 🧹 CATEGORÍA: **DISPENSABLES**

> **Descripción general:**
>  Estos *code smells* representan **código innecesario**, redundante o que simplemente **no debería estar ahí**. Elimina este tipo de código para mejorar la claridad y reducir el mantenimiento.

------

### 🧹 1. **Data Class (Clase de datos)**

#### 🧠 ¿Qué es?

Una clase que **solo contiene campos (getters y setters)** pero **no tiene lógica de comportamiento**.

#### 🚩 ¿Por qué es un problema?

- Estas clases son **pasivas** y rompen el encapsulamiento.
- A menudo son manipuladas por otras clases, lo que genera **acoplamiento innecesario**.
- Generalmente indican que **la lógica está en el lugar equivocado**.

#### ❌ Ejemplo (Código con mal olor):

```java
public class Person {
    private String name;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
```

#### ✅ Solución (Código mejorado):

Mover comportamiento **relevante** a la clase:

```java
public class Person {
    private String name;
    private int age;

    public void celebrateBirthday() {
        this.age++;
    }

    public boolean isAdult() {
        return age >= 18;
    }
}
```

------

### 🧹 2. **Dead Code (Código muerto)**

#### 🧠 ¿Qué es?

Código que **ya no se usa**, como variables, métodos, clases o bloques condicionales que **nunca se ejecutan**.

#### 🚩 ¿Por qué es un problema?

- Aumenta el **ruido visual**.
- Puede confundir a otros desarrolladores.
- Hace más difícil el mantenimiento.

#### ❌ Ejemplo (Código con mal olor):

```java
public void sendEmail() {
    String debugMessage = "Sending email..."; // nunca se usa
    // lógica de envío
}
```

#### ✅ Solución (Código mejorado):

Simplemente eliminarlo:

```java
public void sendEmail() {
    // lógica de envío
}
```

------

### 🧹 3. **Duplicate Code (Código duplicado)**

#### 🧠 ¿Qué es?

Fragmentos de código **idénticos o muy similares** que se repiten en más de un lugar.

#### 🚩 ¿Por qué es un problema?

- Hace que el mantenimiento sea **más difícil y riesgoso**.
- Si hay que hacer un cambio, hay que hacerlo en **todos los lugares duplicados**.
- Aumenta el tamaño del código innecesariamente.

#### ❌ Ejemplo (Código con mal olor):

```java
public void printUserDetails(User u) {
    System.out.println(u.getName());
    System.out.println(u.getEmail());
}

public void logUserDetails(User u) {
    System.out.println(u.getName());
    System.out.println(u.getEmail());
}
```

#### ✅ Solución (Código mejorado):

Extraer método común:

```java
public void showUserInfo(User u) {
    System.out.println(u.getName());
    System.out.println(u.getEmail());
}
```

------

### 🧹 4. **Lazy Class (Clase perezosa o innecesaria)**

#### 🧠 ¿Qué es?

Una clase que **no hace lo suficiente como para justificar su existencia**. Tal vez existía antes y se simplificó, o se creó con la idea de crecer, pero **no lo hizo**.

#### 🚩 ¿Por qué es un problema?

- Aumenta innecesariamente la complejidad.
- Ocupa espacio sin aportar valor.
- Puede confundir a otros desarrolladores.

#### ❌ Ejemplo (Código con mal olor):

```java
public class NameValidator {
    public boolean isValid(String name) {
        return name != null && !name.isEmpty();
    }
}
```

Esto podría estar directamente en otra clase si **solo se usa una vez**.

#### ✅ Solución (Código mejorado):

Integrar en un lugar más apropiado:

```java
public class User {
    public static boolean isValidName(String name) {
        return name != null && !name.isEmpty();
    }
}
```

------

### 🧹 5. **Speculative Generality (Generalización innecesaria)**

#### 🧠 ¿Qué es?

Código que fue escrito **pensando en un uso futuro** que **nunca llegó**. Como clases abstractas o métodos que no se usan, pero están "por si acaso".

#### 🚩 ¿Por qué es un problema?

- Añade **complejidad innecesaria**.
- Ocupa espacio mental para cosas que **no tienen uso real**.
- Viola el principio **YAGNI (You Aren’t Gonna Need It)**.

#### ❌ Ejemplo (Código con mal olor):

```java
public abstract class Animal {
    public abstract void swim(); // no todos los animales nadan
}
```

Si solo hay perros y gatos en el sistema, `swim()` sobra.

#### ✅ Solución (Código mejorado):

Solo generalizar cuando **realmente hay necesidad**:

```java
public abstract class Animal {
    public abstract void makeSound();
}
```

O simplemente no hacer la clase abstracta si no hay subtipos:

```java
public class Dog {
    public void bark() {}
}
```

------

¡Genial! Vamos entonces con la **última categoría**:

------

## 🔗 CATEGORÍA: **COUPLERS**

> **Descripción general:**
>  Los *code smells* de esta categoría aparecen cuando hay **demasiado acoplamiento** entre clases, es decir, **dependen demasiado unas de otras**. Esto hace que el sistema sea **frágil, difícil de mantener y de modificar**.

------

### 🔗 1. **Feature Envy (Envidia de funciones)**

#### 🧠 ¿Qué es?

Un método que **utiliza más datos de otra clase** que de la propia. En lugar de operar sobre sus propios datos, **depende demasiado** de otra clase.

#### 🚩 ¿Por qué es un problema?

- Muestra que el comportamiento **está en la clase equivocada**.
- Aumenta el **acoplamiento**.
- Rompe la **cohesión** de las clases.

#### ❌ Ejemplo (Código con mal olor):

```java
public class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println(invoice.getCustomer().getName());
        System.out.println(invoice.getCustomer().getAddress());
        System.out.println(invoice.getTotal());
    }
}
```

El `InvoicePrinter` **conoce demasiado** a `Customer`.

#### ✅ Solución (Código mejorado):

Mover comportamiento al lugar que tiene los datos:

```java
public class Customer {
    public String getDetails() {
        return name + "\n" + address;
    }
}

public class Invoice {
    public String getDetails() {
        return customer.getDetails() + "\nTotal: " + total;
    }
}

public class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println(invoice.getDetails());
    }
}
```

------

### 🔗 2. **Inappropriate Intimacy (Intimidad inapropiada)**

#### 🧠 ¿Qué es?

Dos clases que **acceden constantemente a detalles internos** una de la otra. Es como si fueran **demasiado cercanas**, violando el **encapsulamiento**.

#### 🚩 ¿Por qué es un problema?

- Fuerte **acoplamiento**.
- Cambiar una clase probablemente **rompe la otra**.
- Difícil de testear y mantener.

#### ❌ Ejemplo (Código con mal olor):

```java
public class ClassA {
    private ClassB b;

    public void doSomething() {
        b.internalMethod(); // uso excesivo de métodos internos
        b.anotherInternalCall();
    }
}
```

#### ✅ Solución (Código mejorado):

Usar interfaces, delegación o **reubicar lógica**:

```java
public class ClassB {
    public void doWork() {
        internalMethod();
        anotherInternalCall();
    }
}

public class ClassA {
    private ClassB b;

    public void doSomething() {
        b.doWork();
    }
}
```

------

### 🔗 3. **Message Chain (Cadena de mensajes)**

#### 🧠 ¿Qué es?

Cuando un método accede a un objeto, luego accede al objeto **dentro** de ese objeto, y así sucesivamente (e.g. `a.getB().getC().getD()`).

#### 🚩 ¿Por qué es un problema?

- Alto **acoplamiento a la estructura interna**.
- Si cambia la estructura, hay que cambiar muchas llamadas.
- Difícil de entender y mantener.

#### ❌ Ejemplo (Código con mal olor):

```java
String country = order.getCustomer().getAddress().getCountry();
```

#### ✅ Solución (Código mejorado):

Delegar las llamadas:

```java
public class Order {
    public String getCustomerCountry() {
        return customer.getCountry();
    }
}

public class Customer {
    public String getCountry() {
        return address.getCountry();
    }
}
```

Ahora se accede de forma más limpia:

```java
String country = order.getCustomerCountry();
```

------

### 🔗 4. **Middle Man (Intermediario inútil)**

#### 🧠 ¿Qué es?

Una clase que **solo delega llamadas** a otras clases sin añadir lógica propia. Funciona como un "intermediario" innecesario.

#### 🚩 ¿Por qué es un problema?

- Añade una capa innecesaria.
- No aporta comportamiento útil.
- Hace que el sistema sea **más complejo sin necesidad**.

#### ❌ Ejemplo (Código con mal olor):

```java
public class Manager {
    private Worker worker;

    public void work() {
        worker.work();
    }
}
```

#### ✅ Solución (Código mejorado):

Eliminar el intermediario si no agrega valor:

```java
Worker worker = new Worker();
worker.work();
```

------

### ✅ RESUMEN FINAL

| Categoría             | Smells principales                         |
| --------------------- | ------------------------------------------ |
| **Bloaters**          | Large Class, Long Method, Data Clump...    |
| **OO Abusers**        | Refused Bequest, Switch Statement...       |
| **Change Preventers** | Shotgun Surgery, Divergent Change...       |
| **Dispensables**      | Dead Code, Lazy Class, Speculative...      |
| **Couplers**          | Feature Envy, Message Chain, Middle Man... |

