clase factura
Privado Definir precio como Real 

Metodo precio()
Mostrar"Precio" 
Leer precio  
Fin metodo 


Metodo iva(precio)
iva=precio*0.15
Retornar iva 
Fin metodo 
Fin Clase 

Algoritmo 
Definir  recibo como factura 

recibo=new factura 

Mostrar"precio"
recibo.precio 

Mostrar"iva"
recibo.precio.iva 

Fin Algoritmo
---------------------------------------------------------------------
Clase consecionario 
Privado Definir autos_vendidos como Entero
Privado Definir Precio_auto como Real 

Metodo Recolectar_datos(autos_vendidos, Precio_auto)
Mostrar"Cantidad de autos vendidos:"
autos_vendidos

Mostrar"Precio del auto:"
Precio_auto
Fin Metodo

Metodo ganancia(autos_vendidos,Precio_auto)
ganancia= autos_vendidos * Precio_auto
Retornar ganancia 
Fin metodo 
 
Algoritmo
Definir cars como consecionario

cars=new consecionario

Mostrar"ganancia diaria:"
consecionario.Recolectar_datos.ganancia

Fin Algoritmo
------------------------------------------------------------------------