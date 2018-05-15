contador=1
limite=3
prom=0
cadena="{0}\t{1}\t{2}\t{3}\t{4}\n".format("nombre","nota1","nota2","nota3","prom")
while(contador<=limite):
	nombre=input("Ingrese su nombre:\n")
	nota1=input("Ingrese primera nota:\n")
	nota2=input("Ingrese segunda nota:\n")
	nota3=input("Ingrese tercera nota:\n")
	suma =int(nota1+nota2+nota3)
	prom =float(suma/limite)
	cadena="{0}{1}\t{2}\t{3}\t{4}\t{5}\n".format(cadena,nombre,float(nota1),float(nota2),float(nota3),float(prom))
	contador=contador+1

print(cadena)