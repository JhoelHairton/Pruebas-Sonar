# 🔍 Verificador de Anagramas en Java

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![JUnit5](https://img.shields.io/badge/JUnit-5.8.2-brightgreen)
![Licencia](https://img.shields.io/badge/Licencia-MIT-green)

Aplicación Java que determina si dos palabras son anagramas (mismas letras en diferente orden), con pruebas unitarias y análisis de calidad.

## 🚀 Características

- ✅ Comparación insensible a mayúsculas/minúsculas
- ⚡ Algoritmo eficiente O(n log n) usando `Arrays.sort()`
- 🧪 100% cobertura de pruebas con JUnit 5
- 📊 Integración con SonarQube
- 💻 Interfaz de línea de comandos interactiva

## 📂 Estructura del Proyecto

```text
proyecto-anagramas/
├── src/
│   ├── main/
│   │   └── java/org/example/
│   │       ├── service/
│   │       │   ├── AnagramaChecker.java       ← Interfaz principal
│   │       │   └── impl/
│   │       │       └── AnagramaCheckerImpl.java ← Implementación
│   │       └── Main.java                     ← Clase ejecutable
│   └── test/
│       └── java/
│           └── service/
│               └── AnagramaCheckerTest.java   ← Pruebas unitarias
├── pom.xml                                  ← Configuración Maven
└── README.md                                ← Este archivo

```
