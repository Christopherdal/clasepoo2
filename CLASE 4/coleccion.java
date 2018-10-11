clase Capitulo

privado definir numero como entero
privado definir cantidad_pag como entero 
privado definir descripcion como caracter

metodo Capitulo()

	numero = 10000


finmetodo

finclase

clase Libro

definir capitulos como coleccion<Capitulo>


metodo agregar_capitulo(capitulo)

	capitulos.agregar(nuevo(capitulo))




finmetodo

// capitulos.agregar(nuevo Capitulo())

// mostrar capitulo[0].getnumero


finclase

algoritmo
definir cap como Capitulo
definir lib como Libro
cap = nuevo Capitulo()
lib = nuevo Libro()

lib.agregar_capitulos()





finalgoritmo