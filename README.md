## Lab ARSW4

## Daniel Ricardo Ruge Gomez
### Taller

#### 1

 ![alt text](image.png)

#### 2 

![alt text](image-1.png)

#### 3

Con @Service, Spring detecta este bean gracias al component-scan,con @Autowired Spring inyecta la dependencia.
y Con @Qualifier("englishChecker") resolvemos el conflicto entre EnglishSpellChecker y SpanishSpellChecker.

![alt text](image-6.png)

#### 4 

programa de prueba y salida 

![alt text](image-3.png)

#### 5

ajustamos 

![alt text](image-4.png)

probamos

![alt text](image-5.png)

### Laboratorio

#### 1

dependencias:

![alt text](image-2.png)

configuracion:

![alt text](image-14.png)

anotaciones:

![alt text](image-8.png)

![alt text](image-9.png)


#### 2

extendemos BlueprintsPersistence

![alt text](image-10.png)

completamos los métodos getBlueprint y getBlueprintsByAuthor:

![alt text](image-13.png)

agregamos pruebas:

![alt text](image-12.png)
![alt text](image-11.png)

### 3 

Hacemos un programa en el que cree (mediante Spring) una instancia de BlueprintServices, y rectifique la funcionalidad del mismo.

![alt text](image-15.png)

### 4

creamos la abstraccion

![alt text](image-16.png)

filtro de redundancia:

![alt text](image-17.png)

filtrao de submuestreo:

![alt text](image-18.png)

Ajustamos BlueprintsServices para que use un filtro

![alt text](image-19.png)

configuramos un filtro:

![alt text](image-20.png)

### 5 

agregamos las pruebas

![alt text](image-21.png)

![alt text](image-22.png)

