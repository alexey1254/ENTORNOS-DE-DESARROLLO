# Instalación de git:

<div align="center">
    <br>
        <img src="git.png" width="550" height="300">
    <br>
</div>

***Alejandro Marrero Cabrera***

### En este repositorio, enseñaré cómo instalar git.

Lo normal, sería que git estuviese instalado en nuestro equipo, para verlo copiaremos el siguiente código:
```
git --version
```
La salida del comando deberá decir la version de nuestro git, en su defecto, veremos que no reconoce el comando.

Si es así, pasamos a la configuración de git.

Si no, lo instalamos con:

```
sudo apt update
sudo apt install git
```
## Ahora vamos a instalar git desde la fuente:
##### Actualizamos las librerías e instalamos los siguientes paquetes
```
sudo apt update
sudo apt install libz-dev libssl-dev libcurl4-gnutls-dev libexpat1-dev gettext cmake gcc
```
#####  Ahora nos creamos una carpeta y vamos hacia ella.
```
mkdir tmp
cd /tmp
```

##### Descargamos la version de git
```
curl -o git.tar.gz https://mirrors.edge.kernel.org/pub/software/scm/git/git-2.29.3.tar.gz
```
##### Descomprimimos el archivo con tar:
```
tar -zxf git.tar.gz
```
##### Nos dirigimos al nuevo directorio de git
```
cd git-*
```
##### Creamos el paquete y lo instalamos
```
make prefix=/usr/local all
sudo make prefix=/usr/local install
```
##### Sustituimos el proceso de shell para utilizar la version que queremos de git
```
exec bash
```
##### Y ya tenemos git instalado en nuestro equipo, solo faltaría configurarlo.

### Configuración de git:

##### Usaremos los siguientes comandos para configurar nuestro usuario y correo electrónico.

```
git config --global user.name "Tu nombre"
git config --global user.email "tuemail@domain.com"
```

###### ~~Fin del tutorial, si quieres invítame a un café y hablamos de ciberseguridad 😉...~~
