IMC APP

La aplicación que realizamos sirve para calcular el Índice de Masa Corporal usando el peso y la altura de una persona. La idea es que el usuario pueda modificar sus datos de forma sencilla y ver el resultado de manera automática.

Instrucciones para instalación y ejecución

Instalar y configurar Android Studio.
Seleccionar la opción Clone Repository en el gestor de proyectos de Android Studio.
Introducir en el campo URL: https://github.com/Tubiruchi/IMCApp.git
Seleccionar la opción Clone.
Esperar a que Android Studio cargue el proyecto.
Ejecutar el proyecto en un dispositivo Android, ya sea virtual o físico.

Funcionalidades principales

Permite ingresar la altura de la persona.
Permite ingresar el peso de la persona.
Permite modificar los valores usando barras ajustables.
También permite escribir los valores manualmente.
Calcula el IMC con los datos ingresados.
Muestra el resultado del IMC.
Muestra una clasificación del resultado, como peso normal, sobrepeso u obesidad.

Conceptos de Kotlin

Funciones: Se usan funciones para separar algunas partes del código, por ejemplo, el cálculo del IMC y la clasificación del resultado.

Condicionales: Se usan para revisar en qué rango cae el resultado del IMC y así mostrar la clasificación correspondiente.

Manejo de datos ingresados por el usuario: La aplicación toma los valores escritos o seleccionados por el usuario y los usa para hacer el cálculo.

Variables: Se usan variables para guardar temporalmente la altura, el peso y el resultado del IMC.

Interfaz con Jetpack Compose: La pantalla fue creada con elementos de Compose como textos, barras y campos para escribir números.

Actualización de valores en pantalla: Cuando el usuario cambia el peso o la altura, la pantalla actualiza el resultado.

Reutilización de código: La misma estructura se usa para la barra de altura y la barra de peso, cambiando solo el texto y los valores.

Operaciones matemáticas: Se usa la fórmula del IMC, que toma el peso y la altura para obtener el resultado.

Conversión de texto a número: Como los datos escritos entran como texto, se convierten a número para poder calcular.

Organización del proyecto: La pantalla principal de la calculadora está separada de la actividad principal de la app.

a) ¿Qué fue lo más difícil de este proyecto y cómo lo resolvieron?

Lo más difícil fue lograr que la aplicación cambiara el resultado cuando se modificaba el peso o la altura. Al principio era fácil pensar solo en poner los campos en pantalla, pero después tuvimos que hacer que todo se conectara correctamente: las barras, los números escritos y el resultado. Lo fuimos resolviendo probando poco a poco hasta que los valores se actualizaron correctamente.

b) ¿Hubo algún concepto de Kotlin que al principio no entendían y que ahora sí comprenden? ¿Cómo llegaron a entenderlo?

Al ser un lenguaje de programación que no muchos habíamos probado, se nos complicaron algunas cosas que podrían considerarse básicas.
Al principio no entendíamos bien cómo hacer que un dato escrito por el usuario pudiera usarse como número dentro del cálculo. Después comprendimos que primero se recibe como texto y luego se convierte para poder hacer operaciones. Lo entendimos mejor cuando lo aplicamos directamente con los valores de peso y altura.

c) Si tuvieran que mejorar o ampliar este proyecto, ¿qué le agregarían y por qué?

Le agregaríamos una explicación de lo que es el IMC y lo que significa cada clasificación, porque no todas las personas saben qué implica estar en peso normal, sobrepeso u obesidad. También podríamos mejorar un poco el diseño para que se vea más bonito, completo y fácil de usar.

d) ¿Qué aprendieron de este proyecto que no aprendieron solo leyendo o viendo videos?

Aprendimos que una aplicación no solo consiste en escribir código, sino en hacer que varios elementos de un mismo sistema trabajen en conjunto. Al hacerlo en el proyecto, entendimos mejor cómo se conectan los datos que ingresa el usuario con el resultado que se muestra en pantalla.
