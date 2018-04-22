Algoritmo sin_titulo
	a=0
	b=0
	Escribir"Ingrese el valor de X"
	leer a
	si a<0 Entonces
		a<-3*a+10
	FinSi
	si a>0 entonces
		b<-a^2+6
	FinSi
	si a==0 Entonces
		b=1
	FinSi
	Imprimir "El valor de y es:",b
FinAlgoritmo
