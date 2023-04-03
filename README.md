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

Finalmente implementamos la libreria de **JSTL**, que es un conjunto de librerías de
etiquetas simples y estándares que encapsulan la funcionalidad principal que es usada
comúnmente para escribir páginas JSP.

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
* En caso de que algún servlet esté generando código HTML directamente, debe modificar
este comportamiento utilizando un JSP adecuado al caso.
* Aplicar estilos CSS a cada sitio. Todos los archivos JSP deben compartir el mismo
archivo de estilos.
* En caso de que aplique, implemente funciones Javascript, jQuery o librerías que contengan
funcionalidades pertinentes a los casos de uso implementados.
* Todas las páginas deben compartir el mismo menú, a excepción del login.
* Finalmente, implemente un servlet que permita cerrar la sesión de usuario, y redireccionar
al usuario al sitio de login.


## **ABPRO4**
* Crear un paquete de nombre “conexion”.
* En el paquete creado en el punto anterior, agregue una clase con un método que permita
retornar una conexión a la base de datos antes mencionada por medio del patrón Singleton.
* Modificar el comportamiento de los métodos de implementación de la clase Capacitacion.
Debe lograr que la plataforma permita desplegar el listado de capacitaciones registrado en
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





### Integrantes
* Cristian Carrillo
* Priscila Carrillo 
* Kevin Moreno  
* Benjamin Pavez
