# Sistema de Consulta de Productos para Papelería

## Resumen ejecutivo

### Descripción
Este proyecto consiste en una aplicación web desarrollada en Java utilizando Servlets y JSP, con conexión a una base de datos MySQL. Su propósito es permitir la consulta de productos disponibles en una papelería local, mostrando nombre, precio y existencia de cada artículo.

### Problema identificado
La papelería no contaba con un sistema accesible para consultar productos sin depender directamente de la dueña y esto generaba retrasos en la atención al cliente y dificultades para verificar precios y disponibilidad.

### Solución propuesta
Se desarrolló una aplicación web sencilla que permite buscar productos por nombre y visualizar sus datos en tiempo real. El sistema se ejecuta localmente y puede ser desplegado en la nube si se desea, además, no requiere autenticación ni permisos especiales, lo que facilita su uso desde el mostrador.

### Arquitectura
- **Frontend**: JSP
- **Backend**: Servlets en Java
- **Base de datos**: MySQL
- **Servidor de aplicaciones**: GlassFish
- **IDE de desarrollo**: NetBeans

---

## Tabla de contenidos

- [Resumen ejecutivo](#resumen-ejecutivo)
- [Requerimientos](#requerimientos)
- [Instalación](#instalación)
- [Configuración](#configuración)
- [Uso](#uso)
- [Contribución](#contribución)
- [Roadmap](#roadmap)

---

## Requerimientos

### Software necesario

| Componente             | Versión recomendada |
|------------------------|---------------------|
| Java                   | 8 o superior         |
| NetBeans IDE           | 12 o superior        |
| GlassFish Server       | 5.0                  |
| MySQL Server           | 8.0                  |
| Navegador web          | Cualquiera moderno   |

### Paquetes adicionales

- Conector JDBC para MySQL (`mysql-connector-java-8.0.33.jar`)
- Dependencias Maven si se usa estructura de proyecto con `pom.xml`

---

## Instalación

### ¿Cómo instalar el ambiente de desarrollo?

1. Instalar NetBeans con soporte para Java EE.
2. Instalar MySQL Server y crear la base de datos `papeleria_app`.
3. Configurar GlassFish en NetBeans como servidor de ejecución.
4. Clonar el repositorio del proyecto desde GitHub.
5. Abrir el proyecto en NetBeans y verificar que se reconozca como aplicación web.

### ¿Cómo ejecutar pruebas manualmente?

1. Ejecutar el proyecto desde NetBeans (Run Project).
2. Abrir el navegador y acceder a `http://localhost:8080/Papeleriaweb/`.
3. Usar el formulario para buscar productos por nombre.
4. Verificar que se muestren los resultados correctamente.

### ¿Cómo implementar la solución en producción?

#### Opción local

1. Generar el archivo `.war` desde NetBeans.
2. Desplegar el `.war` en GlassFish local.
3. Asegurarse de que MySQL esté corriendo y accesible.

#### Opción en la nube (Heroku)

1. Crear cuenta en Heroku.
2. Configurar entorno Java en Heroku.
3. Subir el archivo `.war` o usar Git para desplegar.
4. Configurar base de datos remota (Heroku Postgres o MySQL externo).
5. Actualizar las credenciales de conexión en el código fuente.

---

## Configuración

### Configuración del producto (archivos de configuración)

Asegúrate de revisar y adaptar los siguientes archivos antes de ejecutar el sistema:

- `config.properties`: contiene los parámetros de conexión a la base de datos (usuario, contraseña, URL).
- `web.xml`: define el mapeo de servlets y configuración del proyecto web.
- `db.sql`: script para crear la base de datos `papeleria_app` y sus tablas.

Estos archivos deben estar correctamente configurados para que el sistema funcione sin errores de conexión.

### Configuración de los requerimientos

Antes de ejecutar el sistema, verifica que tienes instalado lo siguiente:

- Java JDK 8 o superior
- NetBeans IDE con soporte para Java EE
- GlassFish Server 5.0
- MySQL Server 8.0
- Navegador web moderno

Pasos para configurar el entorno:

1. Clona el repositorio desde GitHub.
2. Importa el proyecto en NetBeans.
3. Configura GlassFish como servidor en NetBeans.
4. Crea la base de datos `papeleria_app` usando el script `db.sql`.
5. Ajusta el archivo `config.properties` con tus credenciales de MySQL.

---

## Uso

### Sección de referencia para usuario final

El sistema permite consultar productos disponibles en la papelería de forma rápida y sencilla.

Pasos para usarlo:

1. Accede a la URL principal del sistema:  
   `http://localhost:8080/Papeleriaweb/`
2. Usa el formulario para buscar productos por nombre.
3. Visualiza los resultados con nombre, precio y existencia.

Este módulo está diseñado para ser intuitivo y accesible desde cualquier navegador.

### Sección de referencia para usuario administrador

El administrador puede realizar las siguientes acciones:

- Registrar nuevos productos
- Editar productos existentes
- Eliminar productos
- Listar todos los productos

Accede al panel de administración mediante la URL:  
`http://localhost:8080/Papeleriaweb/admin.jsp`

> ⚠️ Este módulo requiere autenticación básica (puede ser implementada en futuras versiones).

---

## Contribución

Contribución
Gracias por tu interés en contribuir al proyecto papeleria-app. Si deseas colaborar, sigue estos pasos:

1. Clona el repositorio: 
 `git clone https://github.com/Sebas561/papeleria-app.git`

2. Crea una nueva rama para tus cambios:
   `git checkout -b nombre-de-tu-rama`

4. Realiza tus modificaciones y haz commit:
   `git commit -m "Descripción clara del cambio"`

6. Envía tu rama al repositorio remoto:
   `git push origin nombre-de-tu-rama`

8. Abre un Pull Request desde GitHub y espera la revisión.

Una vez aprobado, se integrará tu contribución a la rama principal (main).

## Roadmap

Estas son las funcionalidades que se planean implementar en futuras versiones del sistema:

- Módulo de autenticación para usuarios y administradores.

- Reportes de productos más consultados y ventas.

- Gestión de inventario con alertas de stock bajo.

- Integración con carrito de compras.

- Versión responsiva para dispositivos móviles.

- Exportación de resultados en PDF o Excel.

