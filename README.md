PRUEBA ANALISTA DE DESARROLLO

Descripción del Proyecto

El proyecto consiste en desarrollar un aplicativo web utilizando JSF, JEE, Maven y desplegado en el servidor de aplicaciones WildFly. El objetivo es permitir al usuario ingresar un texto con un formato específico, procesarlo y generar un texto de salida según ciertas reglas predefinidas.

Funcionalidad del Aplicativo
1. Texto de Entrada:

El usuario puede ingresar líneas de texto, cada una formada por un número seguido de una frase separados por el carácter \.
Ejemplo de formato de entrada:

3\the force is strong in this one
7\take what you can, give nothing back

![Captura de Pantalla 2024-07-15 a la(s) 5 22 42 p  m](https://github.com/user-attachments/assets/b35517a9-6638-49bc-8bdb-79ca5e3fa599)


2. Texto de Salida:

El aplicativo procesa el texto de entrada para generar un texto de salida que consiste en:
El segundo dato del texto de entrada, limpiado de caracteres que no sean letras del alfabeto (a-z).
Un valor booleano (true o false) que indica si el número en la primera columna corresponde al número de palabras en la frase.

Ejemplo de formato de salida:

the force is strong in this one\false
take what you can give nothing back\true

![Captura de Pantalla 2024-07-15 a la(s) 5 23 05 p  m](https://github.com/user-attachments/assets/764889e9-7020-4af8-8547-cbb9dbb4a1e5)



Tecnologías Utilizadas:

Java EE (JEE): Utilizado para la lógica de negocio y procesamiento del texto.
JavaServer Faces (JSF): Framework utilizado para el desarrollo de la interfaz de usuario.
Maven: Herramienta de gestión de proyectos utilizada para la construcción y dependencias del proyecto.
WildFly: Servidor de aplicaciones utilizado para el despliegue y ejecución del aplicativo.


Entrega
El aplicativo está empaquetado como un archivo .war que puede ser desplegado en un servidor WildFly. Las fuentes del proyecto junto con el archivo .war están disponibles en este repositorio.
