Algoritmo sin_titulo
	escribir "Ecriba 1 para hacer una conversion en grados Celsious y 2 para Farenheit"
	leer temperatura
	escribir "Ingrese la cantidad a convertir"
	leer cant
	si temperatura=1 Entonces
		n<-(9/5)*cant+32
	FinSi
	si temperatura=2 Entonces
		n<-(cant-32)*5/9
	FinSi
	Imprimir "El resultado de la conversion es de: ",n
FinAlgoritmo
