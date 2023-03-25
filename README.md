# MultiConversor

El MultiConversor es una aplicación que incluye dos herramientas: un conversor de monedas y un conversor de temperaturas. Esta app te permite conocer el valor actual de una divisa en otra moneda y convertir temperaturas en diferentes unidades de medida.

La aplicación surge como una respuesta al reto "Convertidor de Moneda" propuesto por Alura Latam Oracle-One Next Education.

## Índice

- [Requisitos del Challenge](#requisitos-del-challenge)
- [Extras](#extras)
- [Características](#características)
- [Pasos de instalación](#pasos-de-instalación)
    - [JAR](#ejecutable-jar)
    - [IDE](#a-través-de-un-ide)
- [Proceso](#proceso)
- [License](#licencia)
- [Autor](#autor)

---
# Requisitos del Challenge

Este conversor debe permitir convertir la moneda de un país a las siguientes divisas:

    Peso Argentino
    Dólar Estadounidense
    Euro
    Libra Esterlina
    Peso Chileno

Asimismo, el conversor debe permitir la conversión inversa.

---
### Extras
Como desafío extra te animamos a que dejes fluir tu creatividad, si puedo convertir divisas, ¿tal vez pueda añadir a mi programa otros tipos de conversiones?

---
# Características

El Convertidor de Divisas y Temperaturas cuenta con las siguientes características:

* Uso de API de Exchange Rate Data API
* Tasa de cambio actual de las diferentes divisas disponibles
* Interfaz gráfica intuitiva y atractiva
* Validación de los datos ingresados por el usuario
* Textos informativos para el usuario

---
# Pasos de instalación
### Ejecutable JAR
1. Clonar el repositorio
2. Ejecutar el Jar (multiconversor.jar) que se encuentra en la carpeta raiz del proyecto
3. Disfrute de la aplicación
### A través de un IDE  
1. Clonar el repositorio
2. Abrir el proyecto en su IDE favorito
3. Ejecutar Main y disfrutar de la aplicación

---
# Proceso
### Tecnologías usadas
* Java 17
* GitHub
* Photoshop
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

---
### Validaciones
* Solo son válidos números enteros o decimales
* Para el convertidor de moneda no se aceptan valores negativos o valor 0
* Para poder convertir se deben seleccionar las monedas correspondientes o la temperatura principal

---
# Licencia
Este proyecto está licenciado bajo la Licencia MIT

---
# Autor
- Juan Pablo Avila <br>
  [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/avilajuanp)