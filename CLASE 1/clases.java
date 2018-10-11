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

fin clase

/*cuerpo principal*/
algoritmo nota_final
	definir alumno1 alumno2 alumno3 como Alumno

	alumno1=nuevo Alumno()
/*entradas*/
	mostrar "ingresar nombre alumno"
	leer alumno1.nombre

	mostrar "ingresar nro_telefono"
	leer alumno1.nro_telefono

	mostrar "ingresar nro_cedula"
	leer alumno1.edad

	mostrar "ingresar calificacion del examen parcial nro. 1"
	leer alumno1.calif_exam_parcial1

	mostrar "ingresar calificacion del examen parcial nro. 2"
	leer alumno1.calif_exam_parcial2

	mostrar "ingresar calificacion del examen parcial nro. 3"
	leer alumno1.calif_exam_parcial3

	mostrar "ingresar calificacion de la evaluacion continua"
	leer alumno1.calif_evaluacion_continua

	mostrar "ingresar calificacion de la trabajo practico"
	leer calif_trabajo_practico

/*procesos*/
calif_total=alumno1.calif_exam_parcial1+alumno1.calif_exam_parcial2+alumno1.calif_exam_parcial3+calif_evaluacion_continua+calif_trabajo_practico
calif_total_escala100=calif_total
calif_total_escala20=calif_total/
calif_total_escala4=calif_total/
/*salidas*/
	mostrar "tu nombre es: " alumno1.nombre

alumno2=nuevo alumno()

	alumno2.nombre="christopher"
	alumno2.calif_exam_parcial1=
	alumno2.calif_exam_parcial2=
	alumno2.calif_exam_parcial3=

	alumno2.calif_evaluacion_continua=
	alumno2.calif_trabajo_practico=




	fin algoritmo
