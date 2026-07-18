# Llanquihue Tour

## Descripción del proyecto
Llanquihue Tour es un proyecto desarrollado en lenguaje Java utilizando Programación Orientada a Objetos, cuyo propósito es modelar un sistema modular para la gestión de una empresa de turismo.
El sistema organiza la información de clientes, empleados, guías turísticos, proveedores, productos, reservas y órdenes de compra mediante una arquitectura orientada a objetos, aplicando principios de encapsulamiento, composición, herencia, polimorfismo e interfaces.
Además, la aplicación utiliza archivos de texto como fuente de datos, permitiendo una solución reutilizable y fácilmente extensible para futuras versiones del sistema.

---
# Objetivos del proyecto (Semana 9 - EFT)
- Aplicar los principios fundamentales de Programación Orientada a Objetos.
- Diseñar una arquitectura modular organizada por paquetes.
- Gestionar colecciones dinámicas de objetos.
- Leer información desde archivos de texto (.txt).
- Reutilizar clases mediante herencia y composición.
- Implementar interfaces comunes para distintas entidades.
- Desarrollar una base técnica reutilizable para un futuro sistema comercial.

---
# Tecnologías utilizadas
- Lenguaje Java
- Plataforma Apache NetBeans
- Programación Orientada a Objetos
- Java Collections Framework (ArrayList)
- Archivos de texto (.txt)

---
# Estructura del proyecto
```
LlanquihueTour
│
├── app
│     └── Main.java
│
├── model
│     ├── Persona.java
│     ├── Cliente.java
│     ├── Empleado.java
│     ├── GuiaTuristico.java
│     ├── Proveedor.java
│     ├── Direccion.java
│     ├── Rut.java
│     ├── Tarjeta.java
│     ├── Producto.java
│     ├── Reserva.java
│     ├── OrdenCompra.java
│     ├── ServicioTuristico.java
│     ├── RutaGastronomica.java
│     ├── PaseoLacustre.java
│     ├── ExcursionCultural.java
│     └── Registrable.java
│
├── data
│     ├── GestorClientes.java
│     ├── GestorProductos.java
│     ├── GestorServicios.java
│     ├── GestorReservas.java
│     └── GestorOrdenCompra.java
│
├── utils
│     ├── LectorTXT.java
│     ├── ConversorDatos.java
│     ├── ValidadorRut.java
│     └── RutInvalidoException.java
│
└── resources
      ├── clientes.txt
      ├── productos.txt
      ├── servicios.txt
      ├── reservas.txt
      └── ordenes.txt
```

---
# Principios de POO aplicados

## Encapsulamiento
Todas las clases poseen atributos privados (`private`) y métodos públicos (`getters` y `setters`), protegiendo la información y controlando el acceso a los datos.

---
## Composición
Se implementó composición utilizando objetos dentro de otros objetos.

Ejemplos:
- Persona contiene un objeto `Rut`.
- Persona contiene un objeto `Direccion`.
- Persona contiene un objeto `Tarjeta`.
- Reserva contiene un `Cliente`.
- OrdenCompra contiene un `Cliente` y un `Producto`.

---
## Herencia
Se diseñó una jerarquía de clases para reutilizar atributos y comportamientos.

```
Persona
│
├── Cliente
├── Empleado
│      └── GuiaTuristico
└── Proveedor
```

También se implementó una jerarquía para los servicios turísticos.

```
ServicioTuristico
│
├── RutaGastronomica
├── PaseoLacustre
└── ExcursionCultural
```

---
## Polimorfismo
Las diferentes clases de servicios turísticos son administradas mediante una colección común de tipo:

```java
ArrayList<ServicioTuristico>
```

permitiendo trabajar con distintas subclases utilizando una única referencia.

---
## Interfaces
Se implementó la interfaz:

```
Registrable
```

la cual define el método:

```
mostrarResumen()
```

que posteriormente es implementado por las distintas entidades del sistema.

---

# Colecciones utilizadas
Para administrar la información del sistema se utilizaron colecciones dinámicas mediante:

- ArrayList <Cliente>
- ArrayList <Producto>
- ArrayList <ServicioTuristico>
- ArrayList <Reserva>
- ArrayList <OrdenCompra>

Estas colecciones permiten:

- agregar elementos;
- recorrer información;
- buscar objetos;
- filtrar datos;
- mostrar registros.

---
# Lectura de archivos
La información inicial del sistema se obtiene desde archivos de texto ubicados en:

```
src/resources/
```

Archivos utilizados:
- clientes.txt
- productos.txt
- servicios.txt
- reservas.txt
- ordenes.txt

La lectura es realizada por la clase:

```
LectorTXT
```

y posteriormente cada línea es convertida en objetos mediante:

```
ConversorDatos
```

---
# Funcionalidades implementadas
- Registro de clientes.
- Registro de productos.
- Registro de servicios turísticos.
- Registro de reservas.
- Registro de órdenes de compra.
- Búsqueda de clientes.
- Filtrado de clientes por comuna.
- Filtrado de productos por precio.
- Lectura de archivos de texto.
- Recorrido de colecciones.
- Visualización de información por consola.

---
# Como ejecutar el proyecto
1. Abrir el proyecto en NetBeans.
2. Abrir el proyecto **LlanquihueTours**
3. Verificar que todos los archivos `.txt` se encuentren dentro de:

```
src/resources
```

4. Ejecutar la clase:

```
Main.java
```

5. El sistema cargará automáticamente toda la información y mostrará los registros junto con ejemplos de búsqueda y filtrado.

---
# Resultado esperado
Al ejecutar el proyecto se visualizará una salida similar a la siguiente:

```text
========================================
        SISTEMA LLANQUIHUE TOUR
========================================

===== CLIENTES =====

Juan Pérez
RUT: 11.111.111-1
Comuna: Puerto Varas
...

----------------------------------------

María Soto
RUT: 22.222.222-2
Comuna: Frutillar

----------------------------------------

===== PRODUCTOS =====

Código: P001
Nombre: Tour Volcán Osorno
Precio: $25000

----------------------------------------

Código: P002
Nombre: Paseo Lago Llanquihue
Precio: $18000

----------------------------------------

===== SERVICIOS TURÍSTICOS =====

Ruta Gastronómica
Sabores de Puerto Varas

----------------------------------------

Paseo Lacustre
Lago Llanquihue

----------------------------------------

Excursión Cultural
Museo Colonial Alemán

----------------------------------------

===== FILTRO DE CLIENTES =====

Clientes de la comuna Puerto Varas
Juan Pérez

----------------------------------------

===== FILTRO DE PRODUCTOS =====

Productos con precio menor o igual a $20.000
Paseo Lago Llanquihue
Excursión Cultural

----------------------------------------

========================================
Sistema finalizado correctamente.
========================================
```

**Nota:** Los datos mostrados corresponden a la información almacenada en los archivos `.txt` de prueba ubicados en `src/resources/`.

---
# Autor
**Gustavo Zapata Covarrubias**

Estudiante de carrera Analista Programador Computacional
Proyecto academico para el ramo Desarrollo Orientado Objetos I - DUOC UC Online
