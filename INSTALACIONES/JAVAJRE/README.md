# Instalación JDK
<p align="center">
  <src img="java.jpeg" width="600" height="500">

## Para instalar el JDK en una máquina linux, necesitamos unos cuantos comandos que ahora veremos;
### Este sirve para actualizar la lista de repositorios

``sudo apt-get update``

  ### Una vez actualizada la lista de repositorios, procedemos a instalar el JDK
  
  ``sudo apt-get install default-jdk``
  
  ### Comprobamos nuestra version de java con
  
  ``java -version``
  
  ### Para instalar una versión específca de java
  
  ``sudo apt install openjdk-11-jdk``
  
  ### Esto depende de que versión queramos, si queremos la 8, escribiremos 8 en vez de 11.
  
  ## El siguiente paso, sería configurar las variables de entorno:
  
   ### Cn este comando nos posicionaremos en la carpeta jvm
   
   ``ls /usr/lib/jvm``

   ### Luego, modificaremos el fichero profile
   
   ``nano /etc/profile``
   ### IMPORTANTE, hacer la ejecucion del comando nano como sudo (administrador) para que puedas guardar el documento y no dé ningún error
   
   ### Lo que hacemos dentro del fichero, es pegar éste código y en version, escribimos la que queramos, la 11 o la 8.
   
   ``# Java version
JAVA_HOME=/usr/lib/jvm/_____openJdk_____
PATH=$PATH:$HOME/bin:$JAVA_HOME/bin
export JAVA_HOME
export JRE_HOME
export PATH``

