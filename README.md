# Parcial 2T - Calculator
Aplicacion Java usando Spark para calcular las funciones *tan* y *acos*.


## Instalación
Para uso del proyecto requerimos clonar este repositorio. Siga los pasos:

1. Clonar el repositorio con ayuda de git
```
git clone https://github.com/gabrielaasilva/AREP_P2
```

2. Acceder a la carpeta donde hemos clonado
```
cd AREP_P2
```

3. Compilar el proyecto para generar el target
```
mvn package
```

### Conexión EC2

4. Para conectarnos a nuestra maquina virtual usamos la consola y ejecutamos
```
ssh -i "parcialDos.pem" ec2-user@ec2-34-227-65-193.compute-1.amazonaws.com
```

5. La aplicacion se encuentra en el directorio 
```
cd /home/ec2-user/AREP_P2
```

6. Para ejecutar nuestra aplicacion desde la maquina virtual, se utilizará: 
```
java -cp "target/classes:target/dependency/*" edu.escuelaing.calculator
```

## Evidencias
Formato de Salida
![Formato de salida]()

Aplicacion JAVA corriendo en EC2
![ec2Running]()


## Programa hecho con

* [Maven](https://maven.apache.org/) - Dependency Management

## Actor

* **Ana Gabriela Silva** - [gabrielaasilva](https://github.com/gabrielaasilva)
