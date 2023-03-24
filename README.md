# MultiConversor
![](https://github.com/GioScarp/convertidor_monedas/blob/main/convertidor_moneda/resources/Readme_Recursos/Conversor_Multiple.png)

El MultiConversor es una aplicación que incluye dos herramientas: un conversor de monedas y un conversor de temperaturas. Esta app te permite conocer el valor actual de una divisa en otra moneda y convertir temperaturas en diferentes unidades de medida.

La aplicación surge como una respuesta al reto "Convertidor de Moneda" propuesto por Alura Latam Oracle-One Next Education.

## Índice

- [Requisitos del Challenge](#requisitos-del-challenge)
- [Extras](#extras)
- [Demo](#demo)
- [Características](#características)
- [Pasos de instalación](#pasos-de-instalación)
    - [JAR](#ejecutable-jar)
    - [Intellij](#intellij-idea)
- [Proceso](#proceso)
- [License](#licencia)
- [Autor](#autor)

# Requisitos del Challenge

Este conversor debe permitir convertir la moneda de un país a las siguientes divisas:

    Dólar estadounidense
    Euro
    Libra esterlina
    Peso Chileno

Asimismo, el conversor debe permitir la conversión inversa.

### Extras
Como desafío extra te animamos a que dejes fluir tu creatividad, si puedo convertir divisas, ¿tal vez pueda añadir a mi programa otros tipos de conversiones?
# Demo
![](https://github.com/GioScarp/convertidor_monedas/blob/main/convertidor_moneda/resources/Readme_Recursos/Convertidor_Multiple.gif)

# Características
* Consumo de Appi's [Exchange Rate Data API](https://apilayer.com/marketplace/exchangerates_data-api)
* Tasa de cambio actual de las diferentes monedas disponibles
* Interfaz gráfica agradable e intuitiva
* Validaciones a los datos ingresados por parte del usuario
* Texto informativos a medida de que el usuario interactua con la app
# Pasos de instalación
### Ejecutable JAR
1. Clonar el repositorio
2. Ejecutar el Jar (convertidor_moneda.jar) que se encuentra en la carpeta raiz del proyecto
3. Disfrute de la aplicación
### Intellij IDEA
1. Clonar el repositorio
2. Abir proyecto en Intellij
3. Run main y disfrutar la aplicación

# Proceso
### Tecnologías usadas
* Java 17
* GitHub
* Photoshop
### Estructura del proyecto
* Resources
* src
    * Config
        * Properties
    * Controladores
        * Controlador Moneda
        * Controlador Temperatura
    * Vistas
        * Vista Moneda
        * Vista Temperatura
        * Vista Main
#### Clase Moneda
    public class Moneda {
        private String nombre;
        private String simbolo;
        private ImageIcon icono;

        public Moneda(){
        }
    }
#### Clase Temperatura

    public class Temperatura {
        private double temperatura;
        private String simbolo;
        private String nombre;
        private ImageIcon icon;
    
        public Temperatura(){

        }
    }

### Validaciones
* Solo son válidos números enteros o decimales
* Para el convertidor de moneda no se aceptan valores negativos o valor 0
* Para poder convertir se debe seleccionar las monedas correspondientes o la temperatura principal

# Licencia
Este proyecto está licenciado bajo la Licencia MIT
# Autor
Creado con 💙 por Giovanni Scarpetta



Características

El Convertidor de Divisas y Temperaturas cuenta con las siguientes características:

    Uso de API de Exchange Rate Data API
    Tasa de cambio actual de las diferentes divisas disponibles
    Interfaz gráfica intuitiva y atractiva
    Validación de los datos ingresados por el usuario
    Textos informativos para el usuario

Extras

Si deseas agregar más tipos de conversión a la aplicación, eres libre de hacerlo y demostrar tu creatividad.
Demo

Instrucciones de Instalación
Ejecutable JAR

    Clona el repositorio
    Ejecuta el archivo JAR (convertidor_moneda.jar) ubicado en la carpeta raíz del proyecto
    ¡Disfruta la aplicación!

IntelliJ

    Clona el repositorio
    Abre el proyecto en IntelliJ
    Ejecuta el archivo principal y disfruta la aplicación.

Proceso
Tecnologías utilizadas

    Java 17
    GitHub
    Photoshop

Estructura del proyecto

    Recursos
    src
        Configuración
            Propiedades
        Controladores
            Controlador de Moneda
            Controlador de Temperatura
        Vistas
            Vista de Moneda
            Vista de Temperatura
            Vista Principal