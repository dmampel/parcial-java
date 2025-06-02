# 📚 Gestión de Autores - JavaFX Application

Una aplicación de escritorio desarrollada en **JavaFX** para la gestión eficiente de autores y escritores. La aplicación permite crear, visualizar, editar y eliminar información de autores utilizando una interfaz gráfica moderna e intuitiva.

## 🚀 Características

- **Interfaz gráfica moderna** construida con JavaFX
- **Base de datos embebida** H2 para almacenamiento persistente
- **Gestión completa de autores** (CRUD operations)
- **Arquitectura MVC** bien estructurada
- **Persistencia de datos** con JPA/Hibernate

## 🛠️ Tecnologías Utilizadas

- **Java 17** - Lenguaje de programación
- **JavaFX 17.0.6** - Framework para interfaz gráfica
- **Maven** - Gestión de dependencias y construcción
- **H2 Database** - Base de datos embebida
- **JPA/Hibernate 6.5.2** - ORM para persistencia de datos

## 📋 Requisitos Previos

Antes de ejecutar la aplicación, asegúrate de tener instalado:

- **Java Development Kit (JDK) 17** o superior
- **Apache Maven 3.6** o superior
- **Git** (para clonar el repositorio)

### Verificar instalaciones:

```bash
java -version
mvn -version
git --version
```

## 🔧 Instalación y Configuración

### 1. Clonar el Repositorio

```bash
git clone <URL_DEL_REPOSITORIO>
cd parcial-java
```

### 2. Compilar el Proyecto

```bash
mvn clean compile
```

### 3. Ejecutar la Aplicación

```bash
mvn javafx:run
```

## 🎯 Ejecución Rápida

Para usuarios experimentados, ejecuta directamente:

```bash
git clone <URL_DEL_REPOSITORIO> && cd parcial-java && mvn javafx:run
```

## 📁 Estructura del Proyecto

```
parcial-java/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/parcial/parcial/
│       │       ├── App.java                    # Clase principal
│       │       ├── controllers/
│       │       │   └── MainViewController.java # Controlador principal
│       │       └── model/
│       │           ├── Autor.java             # Entidad Autor
│       │           ├── AutorManager.java      # Gestor de autores
│       │           └── Persona.java           # Clase base
│       └── resources/
│           ├── com/parcial/parcial/views/
│           │   └── main-view.fxml             # Vista principal
│           └── META-INF/
│               └── persistence.xml            # Configuración JPA
├── data/                                      # Base de datos H2
├── pom.xml                                   # Configuración Maven
└── README.md
```

## 🗄️ Base de Datos

La aplicación utiliza **H2 Database** como base de datos embebida. Los datos se almacenan automáticamente en el directorio `data/` y persisten entre ejecuciones de la aplicación.

### Características de la Base de Datos:
- **Automática**: Se crea y configura automáticamente
- **Embebida**: No requiere instalación externa
- **Persistente**: Los datos se mantienen entre sesiones

## 🚨 Solución de Problemas

### Error: "JavaFX runtime components are missing"

Si encuentras este error, asegúrate de usar el comando Maven:
```bash
mvn javafx:run
```

### Error: "JAVA_HOME not set"

Configura la variable de entorno JAVA_HOME:
```bash
# Windows (PowerShell)
$env:JAVA_HOME = "C:\Program Files\Java\jdk-17"

# Windows (CMD)
set JAVA_HOME=C:\Program Files\Java\jdk-17

# Linux/Mac
export JAVA_HOME=/path/to/java-17
```

### Error de compilación Maven

Limpia y recompila el proyecto:
```bash
mvn clean install
mvn javafx:run
```

## 📖 Uso de la Aplicación

1. **Iniciar la aplicación** con `mvn javafx:run`
2. **Agregar autores** usando el formulario principal
3. **Visualizar la lista** de autores registrados
4. **Editar o eliminar** autores existentes
5. **Los datos se guardan automáticamente** en la base de datos

## 👨‍💻 Autores
1. Delfina Mampel
2. Lautaro Montecchiani
3. Julio Leiva
4. Matias Torres

Desarrollado como proyecto académico para la gestión de autores y escritores.
