# Esto que estás leyendo sirve para instalar maven
### ~~La cosa se tensó~~

<div>
<p align="center">
<img src="maven.png" width="500" height="400">
</div>

## La instalación simple sería poner estos comandos:
```
sudo apt update
```
```
sudo apt install maven
```
### Para verificar la instalación ejecutamos:
``
mvn -version
``
#### Y debería verse algo como:

```Apache Maven 3.6.3
 Maven home: /usr/share/maven
 Java version: 11.0.7, vendor: Ubuntu, runtime: /usr/lib/jvm/java-11-openjdk-amd64
 Default locale: en_US, platform encoding: UTF-8
 OS name: "linux", version: "5.4.0-29-generic", arch: "amd64", family: "unix"
```

### Esto sería todo para la version facil.
	
# Vamos ahora a instalar una versión concreta de Maven

### Comenzamos con un wget
	
	```
	wget https://www.apache.org/dist/maven/maven-3/3.8.2/binaries/apache-maven-3.8.2-bin.tar.gz -P /tmp
	```

### Al completar la descarga, extraemos en el directorio /opt
	
	```
	sudo tar xf /tmp/apache-maven-*.tar.gz -C /opt
	```

### Para tener más control sobre las versiones y actualizaciones de Maven, creamos un directorio de instalación de Maven:
	
	```
	sudo ln -s /opt/apache-maven-3.8.2 /opt/maven
	```

### Cuando se lanza una nueva versión, se puede actualizar la version de Maven desempaquetando la última versión y cambiando el enlace simbólico para señalarla.
	
### A continuacion establecemos las variables de entorno. Para hacer esto, abrimos el editor de texto y creamos un nuevo archivo llamado mavenenv.sh en el directorio /etc/profile.d/
	
	```
	sudo nano /etc/profile.d/maven.sh
	```

### Pegamos el siguiente codigo:

	```
	export M2_HOME=/opt/maven
	export MAVEN_HOME=/opt/maven
 	export PATH=${M2_HOME}/bin:${PATH}
	```

### Apretamos CTRL + O y CTRL + X para salir.

### Haremos que el script sea ejecutable con el siguiente comando:
	```
	sudo chmod +x /etc/profile.d/maven.sh
	```

### Finalmente cargamos las variables de entorno:
	```
	source /etc/profile.d/maven.sh
	```

### Verificamos que se ha instalado maven con 
	```
	mvn -version
	```
	
### Y se tendría que ver algo así:
	```
	Apache Maven 3.8.2 (cecedd343002696d0abb50b32b541b8a6ba2883f)
 	Maven home: /opt/maven
 	Java version: 11.0.7, vendor: Ubuntu, runtime: /usr/lib/jvm/java-11-openjdk-amd64
 	Default locale: en_US, platform encoding: UTF-8
 	OS name: "linux", version: "5.4.0-29-generic", arch: "amd64", family: "unix"
	```
	
