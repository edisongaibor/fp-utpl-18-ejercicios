Algoritmo sin_titulo
	Escribir "Ingrese su nombre porfavor"
	leer nombre
	Escribir"Ingrese su apellido porfavor"
	leer apellido
	Escribir "Ingrese el costo del telefono deseado"
	leer precio
	Escribir "Cuantos telefonos desea comprar"
	leer cantidad
	subtotal<-cantidad*precio
	Escribir "Ingrese tipo de cliente"
	leer tipocliente
	Si tipocliente=1 Entonces
		descuento=subtotal*0.10
	FinSi
	Si tipocliente=2 Entonces
		descuento=subtotal*0.20
	FinSi
	Si tipocliente=3 Entonces
		descuento=subtotal*0.30
	FinSi
	total<-subtotal-descuento
	imprimir"Nombre:",nombre ,apellido
	imprimir"tipocliente:",tipocliente
	imprimir"cantidad de celulares:",cantidad
	imprimir"precio cada celular:",precio
	imprimir"subtotal a pagar:",subtotal
	imprimir"descuento:",descuento
	imprimir"Valor total a pagar:",total
FinAlgoritmo
