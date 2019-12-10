# Desplegar modulos
## Herramientas
* Gradle 4.10
* Liferay Community 7.0

# Instalación

1. descargar instancia de [liferay 7.0](https://sourceforge.net/projects/lportal/files/Liferay%20Portal/7.0.2%20GA3/liferay-ce-portal-tomcat-7.0-ga3-20160804222206210.zip/download)
2. iniciar el bundle
3. desplegar jar de la carpeta de libs
4. copiar el archivo `gradle.properties` en la ruta `./<user>/.gradle/` y modificar las propiedades con los valores correctos.
5. ubicarse en la raiz de la carpeta modules `./modules` y ejecutar el comando gradle clean deploy

# Notas
la prueba no la pude terminar, presente complicaciones con el ambiente de liferay.

solo esta desarrollado un pequeño segmento en back-end `java`

cualquier consulta a la orden.
