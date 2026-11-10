# Sistema de Catálogo de Biblioteca

## Descripción
Este proyecto desarrolla un sistema de catálogo bibliotecario utilizando Java y Programación Orientada a Objetos.

Permite registrar y organizar diferentes materiales de biblioteca, como libros y revistas, almacenando sus características generales y sus datos específicos. También permite recorrer la colección, identificar los tipos de materiales y obtener estadísticas de los elementos registrados.

## Funcionamiento del programa

El programa crea una colección con cuatro materiales:

- **Libro:** Rayuela, de Julio Cortázar, publicado en 1963 por Sudamericana, con 635 páginas.
- **Revista:** National Geographic, edición 215, publicada en marzo de 2023.
- **Libro:** El Aleph, de Jorge Luis Borges, publicado en 1949 por Losada, con 180 páginas.
- **Revista:** Muy Interesante, edición 88, publicada en junio de 2024.

El programa realiza dos recorridos:

### 1. Catálogo completo
Recorre la colección utilizando un ciclo `for` y muestra la información de cada material mediante el método `mostrarCatalogo()`.

Además, los libros indican si son considerados de lectura larga, condición que se cumple cuando tienen más de 400 páginas.

### 2. Recorrido específico
Utiliza `instanceof` para identificar si cada elemento es un `Libro` o una `Revista`.

- Para los libros, muestra el nombre del autor y el título.
- Para las revistas, muestra una referencia corta con el título, número de edición, mes y año de publicación.

Finalmente, presenta la cantidad total de libros y revistas registrados.

**Resultado del conteo:**
- Total de libros: 2.
- Total de revistas: 2.

## Clases principales

| Clase | Responsabilidad |
|---|---|
| `MaterialBiblioteca` | Clase base que contiene los atributos y métodos generales de los materiales. |
| `Libro` | Hereda de `MaterialBiblioteca` y agrega autor, cantidad de páginas y la evaluación de lectura larga. |
| `Revista` | Hereda de `MaterialBiblioteca` y agrega número de edición, mes de publicación y referencia corta. |
| `Main` | Crea la colección, realiza los recorridos y calcula la cantidad de materiales por tipo. |

## Conceptos de programación aplicados

- **Herencia:** `Libro` y `Revista` heredan de la clase `MaterialBiblioteca`.
- **Encapsulamiento:** se utilizan atributos `protected` en la clase base y atributos `private` en las clases derivadas.
- **Polimorfismo:** se utiliza una lista de tipo `List<MaterialBiblioteca>` para almacenar distintos tipos de materiales.
- **Sobrescritura de métodos:** las clases derivadas redefinen `getTipo()` y `mostrarCatalogo()`.
- **Uso de `super`:** permite reutilizar el constructor y el método de visualización de la clase padre.
- **Colecciones:** se utiliza `ArrayList` para almacenar dinámicamente los materiales.
- **Operador `instanceof`:** permite comprobar el tipo concreto de cada objeto.
- **Casting:** se realiza una conversión explícita para acceder a los métodos específicos de cada clase.
- **Métodos específicos:** `esLecturaLarga()` y `getReferenciaCorta()` implementan comportamientos propios de cada material.

## Tecnologías utilizadas

- Lenguaje: Java.
- Entorno de desarrollo: IntelliJ IDEA.
- Colecciones: `ArrayList` y `List`.
- Paradigma: Programación Orientada a Objetos.

## Ejecución

<img width="430" height="806" alt="image" src="https://github.com/user-attachments/assets/9e653aeb-7ae9-40bc-a69f-6933f3c30d4a" />

## Resultado esperado

El programa muestra las fichas técnicas de los cuatro materiales registrados, identifica los libros y revistas mediante `instanceof` y presenta el total de cada categoría.

Rayuela aparece como lectura larga porque supera las 400 páginas, mientras que El Aleph no cumple esa condición.

## Objetivo del ejercicio

Aplicar los conceptos de herencia, polimorfismo, colecciones y conversión de tipos, desarrollando un catálogo que permita administrar diferentes materiales bibliotecarios mediante una clase base común.

## Estructura del proyecto

```text
SistemaCatalogoBiblioteca/
├── MaterialBiblioteca.java
├── Libro.java
├── Revista.java
├── Main.java
└── README.md
```

**Nombre sugerido para el repositorio:** `sistema-catalogo-biblioteca`
