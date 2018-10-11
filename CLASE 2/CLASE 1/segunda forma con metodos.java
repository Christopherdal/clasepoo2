clase Alumno
definir nombre como caracter
definir nro_telefono como entero
definir nro_cedula como alfanumerico
definir edad como entero
definir calif_exam_parcial1 como real
definir calif_exam_parcial2 como real
definir calif_exam_parcial3 como real
definir calif_evaluacion_continua como real
definir calif_trabajo_practico como real

metodo info_personal()
	mostrar "ingresar nombre alumno"
	leer alumno1.nombre

	mostrar "ingresar nro_telefono"
	leer alumno1.nro_telefono

	mostrar "ingresar nro_cedula"
	leer alumno1.edad
	
fin metodo

metodo leernota()
	mostrar "ingresar calificacion del examen parcial nro. 1"
	leer calif_exam_parcial1 

	mostrar "ingresar calificacion del examen parcial nro. 2"
	leer calif_exam_parcial2 

	mostrar "ingresar calificacion del examen parcial nro. 3"
	leer calif_exam_parcial3 

	mostrar "ingresar calificacion de la evaluacion continua"
	leer alumno1.calif_evaluacion_continua

	mostrar "ingresar calificacion de la trabajo practico"
	leer calif_trabajo_practico

fin metodo

metodo procesarnota()
	
	total_nota_escal_100=calif_exam_parcial1+calif_exam_parcial2+calif_exam_parcial3
	total_nota_escal_20=total_nota_escal_100/5
	total_nota_escal_4=
	mostrar "tu nota final en la escala de 100 puntos es: " total_nota_escal_100
	mostrar "tu nota en la escala de 20 puntos es: " total_nota_escal_20
	mostrar "tu nota en la escala de 4 puntos es: " total_nota_escal_4
fin metodo

fin clase

/*cuerpo principal*/
algoritmo mostrar_resultado

definir alumno1 como alumno

 alumno1=nuevo alumno()
 
 alumno1.info_personal()
alumno1.leernota()
alumno1.procesarnota()



	fin algoritmo
