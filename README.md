# 🌱 microservice-spring-demo

Este proyecto es un microservicio de demostración construido con **Spring Boot 2.7.11** y **Java 8**, ideal para aprender, practicar y escalar hacia arquitecturas más complejas basadas en microservicios. Fue creado por Omar, desarrollador apasionado, esposo comprometido y futuro papá, como parte de su camino de crecimiento técnico y personal.

---

## 🚀 Características

- API REST con rutas organizadas bajo `/api/demo`
- Controlador con saludo personalizado usando `@PathVariable`
- Lógica separada en capa de servicio (`SaludoService`)
- Estructura limpia y extensible para futuras funcionalidades
- Preparado para escalar hacia proyectos reales

---

## 📦 Tecnologías utilizadas

- Java 8
- Spring Boot 2.7.11
- Gradle
- H2 (base de datos en memoria para pruebas)
- IntelliJ IDEA (recomendado)

---

## 📁 Estructura del proyecto

src/
└── main/
└── java/
└── com/
└── nstoala/
└── demo/
├── controller/
│ └── SaludoController.java
├── service/
│ └── SaludoService.java
└── DemoApplication.java


---

## 🛠️ Cómo ejecutar

1. Clona el repositorio:
   ```bash
   git clone https://github.com/NSToala/microservice-spring-demo.git
   cd microservice-spring-demo

   ./gradlew bootRun
