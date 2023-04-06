# Trabajo grupal modulo 5 



***Una empresa de asesorías en prevención de riesgos necesita contar con un sistema de información
que le permita administrar los principales procesos que se llevan a cabo en ella día a día***

Se solicita crear un sistema implementando los conceptos de aplicaciones web utilizando una arquitectura multicapa .

## **Desarrollo**


En primer lugar, preparamos el entorno utilizando el programa **Eclipse JEE IDE** y la libreria JRE **Apache Tomcat V10** que nos permite levantar un servidor local.

Luego implementamos **Servlets** que son modulos escritos en java que permiten determinar el comportamiento para extender sus capacidades de respuesta a los clientes al utilizar las potencialidades de Java.
Utilizando los protocolos HTTP
Esto nos permite tener manejo de la informacion y determinar que se muestra a cada usuario.

Una vez tenemos el comportamiento utilizamos **JSP(Java Server Pages)** que nos permite  crear una serie de
plantillas HTML que incluyen código incrustado (llamados sniplets) mediante marcadores
especiales.

Implementamos la libreria de **JSTL**, que es un conjunto de librerías de
etiquetas simples y estándares que encapsulan la funcionalidad principal que es usada
comúnmente para escribir páginas JSP.

Se genero una base de datos generada en **SQL** y se accede a ella mediante la biblioteca **JBDC(Java Database Conectivity)**

Ademas se utilizaron los patrones de diseño **MVC(Modelo Vista Controlador)**, **DAO(Data Object Access)** y **Singleton** para
tener el código bien organizado, legible y mantenible, además permiten reutilizar
código y aumenta la escalabilidad en el proyecto.

Por ultimo, se realiza el despliegue de la aplicacion mediante el gestor del servidor **Apache Tomcat**.

Hasta el momento las funcionalidades que tiene el proyecto son:
* Login y log out
* Formulario de contacto
* Crear y listar capacitaciones
* Crear y listar usuarios

## **ABPRO1**

* Se solicita crear tres servlets, uno para cada uno de los tres primeros casos de uso de la lista
anterior(Inicio, Contacto, Crear Capacitación).



## **ABPRO2**
* Crear un servlet para el caso de uso Listar Capacitaciones. Por lo pronto solo debe desplegar
el sitio HTML creado en los ejercicios de la unidad anterior.
* Crear un servlet para el caso de uso Login. Al igual que en el caso anterior, el servlet solo
debe desplegar un formulario HTML para el acceso a la plataforma.
* El formulario declarado en el punto anterior debe llevar un servlet de ingreso. Este servlet
debe verificar que el usuario ingresado sea igual a “admin” y que la clave sea igual a “1234”.
Si alguno de estos valores no coincide, se debe redireccionar al usuario al login.
Si los datos de acceso son correctos, se debe crear una sesión para el usuario, y
redireccionarlo al servlet perteneciente al caso de uso Contacto.
* En los servlets correspondientes a Contacto, Crear Capacitaciones y Listar Capacitaciones,
no se puede desplegar el diseño respectivo si es que no se ha creado una sesión de usuario
anteriormente. En caso de que eso suceda, se debe redireccionar al usuario al login, de lo
contrario se debe mantener en el mismo servlet.


## **ABPRO3**
* En caso de que algún servlet esté generando código HTML directamente, modificar
este comportamiento utilizando un JSP adecuado al caso.
* Aplicar estilos CSS a cada sitio. Todos los archivos JSP deben compartir el mismo
archivo de estilos.
* En caso de que aplique, implementar funciones Javascript, jQuery o librerías que contengan
funcionalidades pertinentes a los casos de uso implementados.
* Todas las páginas deben compartir el mismo menú, a excepción del login.
* Finalmente, implemente un servlet que permita cerrar la sesión de usuario, y redireccionar
al usuario al sitio de login.


## **ABPRO4**
* Crear un paquete de nombre “conexion”.
* En el paquete creado en el punto anterior, agregue una clase con un método que permita
retornar una conexión a la base de datos antes mencionada por medio del patrón Singleton.
* Modificar el comportamiento de los métodos de implementación de la clase Capacitacion.
Se debe lograr que la plataforma permita desplegar el listado de capacitaciones registrado en
la base de datos, y que al mismo tiempo permita registrar un nuevo registro en la base de
datos.
* En el caso del formulario de creación de una nueva capacitación, los datos se deben validar
por medio de Javascript o jQuery. Aplique las validaciones indicadas en ejercicios de
módulos anteriores relacionadas con este caso de uso.

## **ABPRO5**
* Cambiar el nombre del paquete que contiene los servlets, y use el nombre “controlador”.
* Crear un paquete de nombre “modelo”.
* En el paquete anteriormente creado, debe agregar las clases: Capacitacion, Usuario, Cliente,
Administrativo, Profesional. Los atributos de cada clase deben estar en sintonía con el
resultado esperado.
* Agregar un servlet correspondiente al caso de uso “Listado de Usuarios”, el cual debe
desplegar el diseño HTML creado en ejercicios anteriores.
* Agregar el servlet correspondiente al caso de uso “Crear Usuario”, el cual debe desplegar
el formulario creado en ejercicios anteriores.
* Siguiendo la misma línea del ejercicio anterior, se pide mantener la responsividad del sitio,
los estilos CSS, funciones Javascript y acciones jQuery que apliquen a cada caso.
* Los servlets creados solo pueden ser accedidossi existe una sesión de usuario
activa.

##**ABPRO5.1**
* Revision en caso de que no se hayan agregado los accesores, los mutadores, los constructores o el método toString en alguna de las clases creadas en
el paquete “modelo”.
* Crear un paquete de nombre “interfaces”.
* En el paquete anterior, crear una interface para la clase Capacitacion. En ella deben estar
declarados dos métodos: uno que retorne una lista de objetos de tipo Capacitacion (no debe
recibir ningún parámetro), y otro que reciba un objeto de tipo Capacitacion y lo “registre”
en sistema (no se pide que almacene nada, solo se simulará una acción).
* Crear un paquete de nombre “implementacion”.
* En el paquete creado en el paso anterior, agregar una clase que “implemente” la interface
creada; esto lo obligará a incorporar acciones para los métodos definidos. Para el caso del
método que entrega un listado de capacitaciones, se genera una rutina que retorne una lista
de al menos tres objetos creados manualmente. En el caso del método que crea una
capacitación, generar una rutina que reciba un objeto, y que despliegue sus datos por
consola de Java.
* Modificar el servlet que lista las capacitaciones, y haga una rutina tal que llame a la clase
de implementación, y que utilice el método respectivo para obtener el listado de
capacitaciones. Dicho listado debe desplegarlo por medio de la vista JSP utilizada en el caso
de uso correspondiente.
* Modificar el servlet que permite crear una capacitación. Dicho servlet debe desplegar el
formulario de creación de capacitaciones; al procesar el formulario, sus datos deben ser
recuperados por otro servlet, el cual generará un objeto de tipo Capacitacion, y usando
dicho objeto llamará al método de creación de un registro en sistema. Una vez llamado al
método, debe desplegar un mensaje alusivo a través de una vista JSP especialmente creada
para este efecto.

## **ABPRO6**

* Agregar al sitio actual una funcionalidad que permita desplegar el listado de usuarios.
Incorpore para ello las clases que sean necesarias en los diferentes paquetes.
* Generar un archivo WAR que contenga el proyecto actual.
* Cargar el archivo WAR en una instancia local del servidor Tomcat.
* Ejecutar la plataforma ingresando directamente desde el navegador a la dirección de
Tomcat.



### Integrantes
* Cristian Carrillo
* Priscila Carrillo 
* Kevin Moreno  
* Benjamin Pavez
