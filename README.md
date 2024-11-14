Calculadora de Seno y Coseno
Este es un proyecto de una aplicación web sencilla que calcula los valores de seno y coseno para ángulos entre 0° y 360°, con intervalos de 15°. La aplicación se desarrolla utilizando Java (con Servlets) y una interfaz HTML.

Descripción
La aplicación permite al usuario obtener los valores de seno y coseno para una serie de ángulos entre 0° y 360°, calculados en el servidor y luego mostrados en una tabla en la interfaz de usuario. El cálculo de estos valores se realiza utilizando las funciones matemáticas Math.sin y Math.cos de Java, que operan con ángulos en radianes.

Características
Cálculo de Seno y Coseno: La aplicación calcula los valores de seno y coseno para los ángulos especificados (0° a 360° en intervalos de 15°).
Interfaz Sencilla: La interfaz web tiene un solo botón para activar el cálculo y mostrar los resultados.
Resultados Dinámicos: Los resultados se presentan en una tabla organizada, con los valores de seno y coseno para cada ángulo.
Tecnologías utilizadas
Java: El backend se implementa utilizando Java y Servlets.
HTML: La interfaz web está construida con HTML.
Tomcat: El servidor utilizado para ejecutar los Servlets.
Instrucciones de instalación
Clonar el repositorio:


git clone https://github.com/tu_usuario/calculadora-seno-coseno.git
Importar el proyecto en tu IDE (por ejemplo, IntelliJ IDEA, Eclipse):

Asegúrate de tener instalado JDK 11 o superior.
Si estás utilizando un servidor como Tomcat, asegúrate de configurarlo correctamente.
Ejecutar la aplicación:

Despliega el proyecto en un servidor de aplicaciones compatible con Servlets (como Apache Tomcat).
Accede a la aplicación a través de tu navegador en la siguiente URL:

http://localhost:8080/seno_coseno/calcular
Interacción con la aplicación:

En la página principal, haz clic en el botón "Calcular".
La aplicación calculará los valores de seno y coseno para los ángulos definidos (0° a 360°) y los mostrará en una tabla.
