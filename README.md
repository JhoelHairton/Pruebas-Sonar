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
## 📂 Codigo para main

```text

import org.example.service.AnagramaChecker;
import org.example.service.impl.AnagramaCheckerImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnagramaChecker checker = new AnagramaCheckerImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Comprobador de Anagramas!");
        System.out.println("------------------------");

        // Pedir las dos palabras al usuario
        System.out.print("Ingresa la primera palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.print("Ingresa la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        // Verificar si son anagramas
        boolean resultado = checker.sonAnagramas(palabra1, palabra2);

        // Mostrar el resultado
        if (resultado) {
            System.out.println("\n¡Son anagramas!");
        } else {
            System.out.println("\nNo son anagramas.");
        }

        scanner.close();
    }
}

```
