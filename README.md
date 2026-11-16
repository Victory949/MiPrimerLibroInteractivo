Mi primer libro interactivo

minilibro interactivo educativo desarrollado en Java con swing, para el curso TM-2100 Fundamentos
de programacion (Universidad de Costa Rica, Sede del Pacifico), II Semestre 2026 - area 4

------------Tema del libro-------------

Estructuras de control condicionales en Java. El libro explica, con una descripcion breve
y un ejemplo de codigo en cada pagina:

  1. La estructura if
  2. La estructura if-else
  3. La estructura swich

Despues de las tres paginas educativas, el usuario resuelve una actividad de tres preguntas
de seleccion, puede realizar hasta 3 intentos y consultar el historial de sus resultados

----------Como funciona------------------

  1. Se muestra la portada con el titulo y el tema, y los botones Iniciar y Salir
  2. Al iniciar la lectura, el usuario navega por las tres paginas con Anterior y Siguiente. Cada una
     muestra su explicacion y un ejemplo de codigo
  3. Con siguiente (o Actividad) llega a la actividad, que muestra una pregunta a la vez con tres
     opciones
  4. Al contestar la tercera pregunta, el programa verifica las respuestas y muestra la cantidad
     de aciertos
  5. El usuario puede repetir la actividad hasta un maximo de tres intentos
  6. Resultados muestra el historial de los intentos realizados
  7. Menu regresa a la portada

----------Como ejecutar------------------
  1. Clonar el repositorio o descomprimir el ZIP del proyecto
  2. abrir la carpeta en netBeans (file -> Open Project)
  3. Clic derecho sobre el proyecto -> Clean and Build
  4. Ejecutar la calse main.principal (clic derecho -> Run file) o usar el boton Run Project

----------Clases principales------------

//model//

-'Pagina': clase abstracta con titulo, contenido y numero de pagina; declara 'mostrarContenido() 

-'PaginaInformativa': hereda de 'Pagina': pagina educativa con su ejemplo de codigo 

-'PaginaActividad': hereda de 'Pagina; pagina con las preguntas de la actividad 

-Preguntas': enunciado y opciones de una pregunta 

-'Elemento': el libro, administra un 'ArrayList<Pagina> 

-'Actividades': verifica respuestas, calcula aciertos y guarda los intentos en una matriz 3x3 

//view//

-'GUI_VistaMenu': portada del libro

-'GUI_VistaInformacion': ventana de lectura, actividad y resultados

//controlador//

-'controladorSistema': abre el menu y crea el libro

-'controladorLibro': maneja la navegacion la actividad y los resultados

//main//

-'Principal': inicia la aplicacion
