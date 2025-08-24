Elegimos realizar un solo ejercicio que busque implementar el patrón VISITOR y Scheduled executor service con delay

Dominio
Una empresa de mudanzas quiere un sistema para poder administrar los servicios de mudanza que ofrece. 
Una mudanza tiene un lugar de origen y destino, un tipo de transporte (camión, camioneta, etc) según el tipo de servicio que ofrece,  la cantidad máxima de km permitidos dentro del servicio y el costo total del servicio . Dentro de la empresa se ofrecen distintos tipo de servicio de mudanza: express, nacional e internacional

Una mudanza express también tiene un servicio de carga y descarga de los objetos transportados por lo que se debe indicar si están en el servicio 

Las mudanzas nacionales deben indicar la cantidad de muebles transportados máximos por transporte  

Por otro lado las mudanzas internacionales debe indicar si posee aduana y el costo extra de las trámites aduaneros

(Para el patrón VISITOR)
Queremos implementar la clase visitante que es la que interactúa con los distintos tipos de mudanzas para agregar funcionalidades nuevas sin modificar las clases ya establecidas

Ejemplo en dominio:
Después de unos meses la empresa quiere agregar un descuento a las mudanzas y además calcular impuestos según el tipo servicio que se ofrece

(Para Scheduled executor service con delay)
Para aplicar el  Scheduled executor service con delay elegimos realizar una funcionalidad cada cierto tiempo

Ejemplo en el dominio:
La empresa de mudanzas desea poder actualizar los precios de sus mudanzas cada cierto tiempo actualizándose según la inflación mensual
