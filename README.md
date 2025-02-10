# Laboratorio 3: Testing - TDD

## Pre-requisitos
Antes de comenzar, asegúrate de tener instaladas las siguientes herramientas:

- **Java**: OpenJDK Runtime Environment 17.x.x
- **Apache Maven**: 3.9.x
- **JUnit**: 5.x.x
- **Docker**

## Objetivos
En este laboratorio aprenderemos a:

- Escribir y ejecutar **pruebas unitarias**.
- Utilizar anotaciones `@Test` del framework **JUnit**.
- Aplicar el enfoque **Test-Driven Development (TDD)**.

## Descripción del Proyecto
El proyecto consiste en un **sistema de gestión de bibliotecas**, con las siguientes clases principales:

- `Libro`: Representa un libro en la biblioteca.
- `Usuario`: Representa a un usuario que puede tomar libros prestados.
- `Prestamo`: Representa el préstamo de un libro a un usuario.
- `Biblioteca`: Gestiona los préstamos, verifica disponibilidad de libros y mantiene un registro de los préstamos realizados.
