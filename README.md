# 🚗 CabifyCore - System Transport Engine (Java)

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=java)
![Architecture](https://img.shields.io/badge/Architecture-OOP%20%2F%20Domain%20Driven-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

Sistema de gestión de movilidad urbana y despacho de viajes basado en **Programación Orientada a Objetos (POO)** en Java. El proyecto simula la arquitectura del núcleo de una plataforma de transporte como Uber o Cabify, aplicando buenas prácticas de encapsulamiento, manejo de estados y modelado de dominio.

---

## 🛠️ Características & Reglas de Negocio (Módulo 1)

- **Gestión de Vehículos (`Vehiculo`):** Modelado de flota con atributos encapsulados (Patente, Modelo, Año) e inmutabilidad orientada a seguridad.
- **Gestión de Conductores (`Chofer`):** Control de disponibilidad en tiempo real, asociación de vehículos únicos y gestión de estados operativo/disponible.
- **Encapsulamiento Estricto:** Acceso y modificación de datos desacoplados mediante métodos accesores (`Getters`/`Setters`) y reglas de validación en constructor.

---

## 🏗️ Arquitectura de Clases

```text
  +------------------+         1 : 1          +------------------+
  |     Chofer       | ---------------------> |     Vehiculo     |
  +------------------+                        +------------------+
  | - idChofer       |                        | - patente        |
  | - nombre         |                        | - modelo         |
  | - disponible     |                        | - anio           |
  | - vehiculo       |                        +------------------+
  +------------------+                        | + obtenerFicha() |
  | + ocupar()       |                        +------------------+
  | + liberar()      |
  | + obtenerPerfil()|
  +------------------+