# Gestor de incidencias

## Descripcion

Este proyecto es una aplicacion Java de consola para consultar incidencias de soporte informatico en un centro educativo, por ejemplo problemas con ordenadores, impresoras o la conexion de red.

## Funcionalidades

- Listar todas las incidencias.
- Consultar las incidencias abiertas.
- Buscar incidencias por identificador o titulo.
- Consultar los datos de una incidencia mediante su ID.
- Utilizar el menu interactivo o argumentos desde la consola.

## Requisitos

- **Java JDK 17**.
- **Maven** (o el wrapper Maven incluido).
- **IntelliJ IDEA** para abrir el proyecto.

## Estructura de archivos

```text
proyecto-base-maven-gestor-incidencias/
├── src/main/java/es/centro/incidencias/
│   ├── App.java
│   ├── GestorIncidencias.java
│   ├── Incidencia.java
│   └── IncidenciaNoEncontradaException.java
├── docs/
│   ├── index.html
│   └── apidocs/
│       └── index.html
├── .mvn/wrapper/
├── mvnw
├── mvnw.cmd
├── pom.xml
├── .gitignore
└── README.md
```

## Clases principales

| Clase | Responsabilidad |
| --- | --- |
| `App` | Inicia la aplicacion y presenta el menu de opciones. |
| `GestorIncidencias` | Conserva el listado y realiza las busquedas y consultas. |
| `Incidencia` | Representa los datos de una incidencia. |
| `IncidenciaNoEncontradaException` | Informa de un ID que no se encuentra en el listado. |

## Compilacion y ejecucion

Desde una terminal abierta en la carpeta del proyecto:

```bash
mvn clean compile exec:java
```

En Windows, tambien se puede utilizar el wrapper incluido:

```bat
.\mvnw.cmd clean compile exec:java
```

La aplicacion muestra un menu cuando se ejecuta sin argumentos. Tambien admite los comandos `ayuda`, `listar`, `abiertas`, `buscar <texto>` y `detalle <id>`.

## Documentacion Javadoc

Para generar la documentacion:

```bash
mvn javadoc:javadoc
```

O mediante el wrapper en Windows:

```bat
.\mvnw.cmd javadoc:javadoc
```

La documentacion generada se puede consultar en `docs/apidocs/index.html`.

## Documentacion en GitHub Pages


La documentación Javadoc del proyecto se puede consultar en el siguiente enlace:

[Ver documentación Javadoc](https://davilomi.github.io/documentacion-proyecto-ud1-david-lozano-miragaya/)


## Autor

**David Lozano Miragaya**
