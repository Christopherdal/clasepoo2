
clase Mascota

definir nombre como caracter
definir edad como entero


metodo setnombre( v_nombre como caracter)
	nombre=v_nombre


fin metodo

metodo getedad() como entero
	retornar edad
	
Fin Clase 




algoritmo

definir mascota como Mascota


mascota=nuevo Mascota()

mostrar "ingrese el nombre"
leer variable

mascota.setnombre(variable)

mostrar mascota.getedad()


fin algoritmo