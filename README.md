# Housing projects for CB

## Contenido
  * [Descripción](#descripcion) 
  * [Alcance](#alcance)
  * [Despliegue en Docker utilizando docker-compose](#despliegue)
  
<a name="descripcion"></a>
## Descripción
Proyecto Spring Boot con Autorización OAuth2 (Code flow) y capa de identificación con OpenID, la finalidad del backend es exponer dos endpoints que retornan los proyectos de vivienda que se encuentran disponibles en la constructora, teniendo en cuenta que existen dos tipos de proyectos (de acceso público y de acceso restringido), los proyectos de acceso público pueden ser consultados por cualquier sistema, por otro lado están los proyectos de vivienda con acceso restringido que solo podrán ser accedidos mediante una autorización emitida por Google después de una autenticación en los sistemas de ellos.

Para llevar a cabo la solución se modeló una base de datos compuesta por las siguientes tablas:

* departments: Contiene los departamentos del Colombia.
* towns: Contiene los municipios de Colombia.
* visibility: Contiene los tipos de visibilidad de los proyectos de vivienda (en este caso pública y privada).
* types: Contiene los tipos de proyecto (Casa, apartamento, lote).
* housing_projects: Contiene los proyectos de vivienda.

### Software utilizado:

* Docker: Versión 20.10.7, build 100c701
* Docker compose: Version 2.6.1
* MySQL: Versión 14.14 Distribución 5.7.39
* phpMyAdmin: Versión: 5.2.0

<a name="prerrequisitos"></a>

<a name="alcance"></a>
## Alcance

Desarrollo de dos endpoints, uno de ellos de acceso público y el otro requiere autorización OAuth2 para ser  consultado, se implementó la capa de autenticación con OpenID.

El endpoint de acceso restringido retorna el fullname y el email del usuario que se usó para autenticación en Goolgle.

El backend se expone en el puerto 8080 y phpMyAdmin en el puerto 8081.

## Endpoint de acceso público
http://localhost:8080/housing-projects/

## Endpoint de acceso privado
http://localhost:8080/housing-projects/private-offering

## phpMyAdmin
http://localhost:8081/

Usuario: db_admin

Clave: CyjUavtTojBGiC(V

<a name="despliegue"></a>
## Despliegue de la solución

Para el despliegue de la solución se recomienda ejecutar el siguientes comando:

```bash
    docker-compose -p "housing_projects_cb" up
```





