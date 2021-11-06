# Manipulación básica de git.


##### Después de haber instalado git, vamos a crear un repositorio, para ello nos posicionamos en la carpeta donde queramos clonar nuestro repositorio, en mi caso el escritorio.

```
cd Escritorio/
```
##### Creamos una carpeta con
```
 mkdir (nombre de la carpeta)
 ```
 ##### Entramos en la carpeta con 
 ```
 cd (nombre de la carpeta)
 ```
 ##### Iniciamos el repositorio con
 ```
 git init
 ```
 ##### Creamos un archivo txt de prueba con nano
 ```
 nano indice.txt
 ```
 ##### Vemos el estado con git status

##### Con el comando cat y el operador ">" para redirigir el texto al archivo

```
cat > indice.txt
Capitulo 1...
Capitulo 2...
```
##### Finalmente vemos las diferencias entre ambos documentos y aplicamos los cambios. (yo le añadí los capitulos 3 y 4 para ver la diferencia.)
