# ProyectoIntegrador

Manual Técnico: Calculadora de Derivadas Implícitas
Introducción
Este manual técnico describe el desarrollo de una calculadora de derivadas implícitas utilizando el método de cascada. El proyecto está diseñado para calcular derivadas parciales de funciones implícitas con respecto a las variables x e y. El sistema utiliza la biblioteca DJep para el análisis y la manipulación de expresiones matemáticas.
 
Requisitos del Sistema
Requisitos Funcionales
•	Ingreso de Funciones: El usuario debe poder ingresar una función implícita en términos de x e y.
•	Cálculo de Derivadas: El sistema debe calcular las derivadas parciales de la función con respecto a x e y. 
•	Visualización de Resultados: Los resultados de las derivadas deben mostrarse en la interfaz gráfica.
•	Limpieza de Campos: El usuario debe poder limpiar los campos de entrada y salida.
Requisitos No Funcionales
•	Interfaz Gráfica: La aplicación debe contar con una interfaz gráfica intuitiva y fácil de usar.
•	Manejo de Errores: El sistema debe manejar errores de sintaxis en la entrada de funciones.
Diseño del Sistema
Arquitectura del Sistema
El sistema sigue una arquitectura basada con el método de cascada, donde cada componente se desarrolla de manera secuencial y se integra progresivamente. La estructura del proyecto se divide en tres capas principales:
•	Capa de Presentación (Interfaz Gráfica):
o	Interfaz2: Clase que maneja la interfaz gráfica del usuario (GUI).
o	Componentes: Campos de texto, botones y etiquetas para la interacción con el usuario.
•	Capa de Lógica de Negocio:
o	Controlador: Clase que gestiona la lógica de la aplicación y actúa como intermediario entre la interfaz y el modelo.
o	Derivacion: Clase que realiza el cálculo de las derivadas utilizando la biblioteca DJep.
•	Capa de Datos:
o	DJep: Biblioteca externa utilizada para el análisis y la manipulación de expresiones matemáticas.


Diagrama de Clases UML

Descripción de Componentes
Interfaz Gráfica (Interfaz2)
La clase Interfaz2 es responsable de la interfaz gráfica del usuario. Utiliza **Java Swing** para crear ventanas, botones, campos de texto y etiquetas.
•	Componentes Principales:
o	txtFyX: Campo de texto para ingresar la función.
o	funcionX: Campo de texto para mostrar la derivada con respecto a \( x \).
o	funcionY: Campo de texto para mostrar la derivada con respecto a \( y \).
o	btnCalcular: Botón para calcular las derivadas.
o	btnLimpiar: Botón para limpiar los campos.
•	Métodos Principales:
o	btnCalcularActionPerformed:** Maneja el evento de clic en el botón "Calcular".
o	btnLimpiarActionPerformed:** Maneja el evento de clic en el botón "Limpiar".
Controlador
La clase Controlador actúa como intermediario entre la interfaz gráfica y la lógica de negocio. Gestiona las operaciones de derivación y maneja los errores.
•	Métodos Principales:
o	derivarX: Calcula la derivada parcial con respecto a x.
o	derivarY: Calcula la derivada parcial con respecto a y.
Derivacion
La clase Derivacion es el núcleo del sistema. Utiliza la biblioteca DJep para analizar y derivar las funciones ingresadas por el usuario.
•	Métodos Principales:
o	derivarX: Realiza la derivación con respecto a x.
o	derivarY: Realiza la derivación con respecto a y.
Flujo de Trabajo
Ingreso de la Función:
•	El usuario ingresa una función implícita en el campo txtFyX.
Cálculo de Derivadas:
•	Al hacer clic en "Calcular", la función se envía a la clase Derivacion.
•	Se calculan las derivadas parciales con respecto a x e y.
•	Los resultados se muestran en los campos funcionX y funcionY.
Limpieza de Campos:
•	Al hacer clic en "Limpiar", se borran todos los campos de entrada y salida.
Manejo de Errores
•	Errores de Sintaxis: Si la función ingresada no es válida, el sistema muestra un mensaje de error y no realiza el cálculo.
•	Errores en DJep: Si ocurre un error durante el análisis o la derivación, el sistema captura la excepción y muestra un mensaje de error.
Pruebas
Pruebas Unitarias
•	Prueba de Derivación: Verificar que las derivadas se calculan correctamente para funciones conocidas.
•	Prueba de Interfaz: Verificar que los botones y campos de texto funcionan como se espera.
Pruebas de Integración
•	Integración Interfaz-Controlador: Verificar que la interfaz gráfica se comunica correctamente con el controlador.
•	Integración Controlador-Derivacion: Verificar que el controlador llama correctamente a los métodos de derivación.
Conclusiones
El sistema de cálculo de derivadas implícitas desarrollado con el método de cascada es una herramienta eficaz para estudiantes y profesionales que necesitan calcular derivadas parciales de funciones implícitas. La arquitectura modular y el uso de la biblioteca DJep garantizan un alto nivel de precisión y facilidad de uso.
Recomendaciones
•	Mejoras en la Interfaz: Agregar más opciones de personalización, como cambiar el tema de la interfaz.
•	Funcionalidades Adicionales: Implementar la capacidad de graficar funciones y sus derivadas.
•	Optimización: Mejorar el manejo de errores para proporcionar mensajes más descriptivos.
Anexos
 
 
 

 
 

Código Fuente
El código fuente completo del proyecto se encuentra subido a GitHub.
https://github.com/Jordy-Segura/ProyectoIntegrador.git 
Bibliotecas Utilizadas
•	DJep: Biblioteca para el análisis y manipulación de expresiones matemáticas.
•	Java Swing: Biblioteca para la creación de interfaces gráficas en Java.

