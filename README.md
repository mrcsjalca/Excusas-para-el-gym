# Excusas Para El Gym

<p align="center">
  <img src="https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android" />
  <img src="https://img.shields.io/badge/Kotlin-2.0+-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin" />
  <img src="https://img.shields.io/badge/Min%20SDK-24%20(Nougat)-orange?style=for-the-badge" alt="Min SDK" />
  <img src="https://img.shields.io/badge/Target%20SDK-37-blue?style=for-the-badge" alt="Target SDK" />
  <img src="https://img.shields.io/badge/UI-Material%20Design%203-black?style=for-the-badge&logo=material-design&logoColor=white" alt="Material 3" />
</p>

<p align="center">
  <b>Generador de pretextos infalibles para cuando la fuerza de voluntad pierde contra el sofá.</b><br>
  <i>Porque faltar al gimnasio está mal, pero faltar con una buena excusa es un arte.</i>
</p>

---

## Captura de Pantalla

<img width="371" height="762" alt="image" src="https://github.com/user-attachments/assets/def146b6-5b89-46c0-8b20-74a69b7193ad" />

---

## ¿Qué es esta app?

**Excusas Para El Gym** es una aplicación nativa para Android desarrollada en **Kotlin** pensada con humor para todos aquellos días en los que encontrar motivación es misión imposible. Con solo presionar un botón, la app genera pretextos aleatorios clasificados científicamente por su nivel de gravedad y pereza.

### Características Principales

- **Generador Dinámico e Instantáneo:** Obtén una excusa fresca y convincente al instante con un solo toque.
- **Categorización Visual por Nivel de Pereza:** Cada excusa incluye su propio badge y color temático adaptado a la intensidad del pretexto.
- **Diseño Moderno "Dark Gym":** Interfaz estilizada en tonos oscuros (`#11141D`), acentos energéticos naranja fitness y componentes Material Card elevados.
- **Soporte Edge-to-Edge:** Experiencia inmersiva adaptada a las barras del sistema en pantallas modernas.
- **Ligera y Rápida:** Cero dependencias pesadas, carga inmediata y arquitectura limpia.

---

## Clasificación de Excusas

Las excusas están categorizadas en cuatro rigurosos niveles de procrastinación deportiva:

| Nivel | Color | Descripción | Ejemplo |
| :--- | :---: | :--- | :--- |
| **Pereza Ligera** | Verde (`#4CAF50`) | Pequeños contratiempos cotidianos. | *"Olvidé cargar los auriculares y entrenar sin música es un peligro para la salud mental."* |
| **Pereza Moderada** | Amarillo (`#FFC107`) | Argumentos pseudo-médicos o logísticos. | *"A esta hora el gimnasio está lleno y no pienso hacer fila para una máquina."* |
| **Pereza Extrema** | Rojo (`#F44336`) | Fuerzas de la física y el cosmos en tu contra. | *"Siento que hoy la gravedad en mi casa está al menos un 30% más pesada que ayer."* |
| **Absoluta Pereza** | Morado (`#9C27B0`) | Rendición total en armonía espiritual. | *"Hoy me declaro en día de descarga biológica, celular y espiritual obligatoria."* |

---

## Tecnologías y Librerías

- **Lenguaje:** [Kotlin](https://kotlinlang.org/)
- **Plataforma:** Android Nativo
- **Arquitectura:** Modelo repositorio desacoplado (`ExcusasRepository`, `TipoPereza`, `Excusa`)
- **Interfaz (UI):**
  - XML Layouts con `ConstraintLayout`
  - `NestedScrollView` con soporte responsive
  - `MaterialCardView` y `MaterialButton` de [Material Components](https://github.com/material-components/material-components-android)
  - Vectores optimizados (`ic_dice`, `ic_dumbbell`, `ic_quote`, etc.)
- **Compatibilidad:**
  - `minSdk`: 24 (Android 7.0 Nougat o superior)
  - `targetSdk` / `compileSdk`: 37

---

## Estructura del Proyecto

```text
ExcusasParaElGym/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/org/insbaixcamp/excusasparaelgym/
│   │   │   │   ├── MainActivity.kt        # Lógica de la pantalla principal y eventos
│   │   │   │   └── ExcusasData.kt         # Modelos de datos (TipoPereza, Excusa) y repositorio
│   │   │   ├── res/
│   │   │   │   ├── drawable/              # Iconos vectoriales y fondos redondeados
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_main.xml  # Maquetación UI moderna
│   │   │   │   └── values/                # Strings, colores temáticos y temas
│   │   │   └── AndroidManifest.xml
│   │   └── test/                          # Pruebas unitarias
│   └── build.gradle.kts                   # Configuración del módulo de la app
├── screenshots/
│   └── preview.png                        # Captura usada en este README
├── build.gradle.kts                       # Configuración de build raíz
└── README.md
```

---

## Instalación y Puesta en Marcha

Si quieres clonar el proyecto y probarlo en tu dispositivo o emulador:

### 1. Clonar el repositorio
```bash
git clone https://github.com/mrcsjalca/Excusas-para-el-gym.git
```

### 2. Abrir en Android Studio
1. Abre **Android Studio**.
2. Selecciona **File > Open...** y elige la carpeta del proyecto `ExcusasParaElGym`.
3. Espera a que Gradle sincronice las dependencias del proyecto.

### 3. Compilar y Ejecutar
- Conecta tu teléfono Android con la depuración USB activada o crea un emulador (AVD) con **Android 7.0+**.
- Presiona el botón verde de **Run (Shift + F10)** o ejecuta mediante terminal:

```bash
# En Windows (PowerShell / CMD)
.\gradlew.bat assembleDebug

# En Linux / macOS
./gradlew assembleDebug
```

---

## Roadmap / Próximas Mejoras

- [ ] Botón para **Compartir excusas** por WhatsApp, Telegram y redes sociales.
- [ ] Botón para **Copiar al portapapeles** con un solo toque.
- [ ] Medidor visual de **Credibilidad** del pretexto.
- [ ] Función para que el usuario **agregue sus propias excusas personalizadas**.
- [ ] Notificación diaria recordándote tu excusa del día.
- [ ] Widget para la pantalla de inicio de Android.

---

## Autor

Desarrollado con dedicación (y un poco de pereza) por:

- **Marcos** — [@mrcsjalca](https://github.com/mrcsjalca)
- **Centro:** INS Baix Camp

---

<p align="center">
  <i>"El primer paso para no ir al gimnasio es convencerte a ti mismo."</i>
</p>
