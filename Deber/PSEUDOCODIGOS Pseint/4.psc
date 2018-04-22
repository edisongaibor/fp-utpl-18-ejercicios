Algoritmo sin_titulo
	escribir"Ingresar el costo de los balones que desea comprar"
	leer costo
	escribir"Ingresar el numero de balones que desea comprar"
	leer num
	cadauno<-num*costo
	si num==1 entonces
		subtotal<-costo*num*0.50
	FinSi
	si num==2 Entonces
		subtotal<-costo*num*0.70
	FinSi
	si num>=3 Entonces
		subtotal<-costo*num*0.80
	FinSi
	total<-cadauno-subtotal
	imprimir"El numero de balones que ha comprado son:",num
	imprimir"El precio de cada balon es de:",costo
	imprimir "El valor total de su compra es de:",total
FinAlgoritmo
