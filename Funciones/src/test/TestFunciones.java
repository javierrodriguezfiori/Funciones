package test;


import java.util.GregorianCalendar;
import modelo.Funciones;
public class TestFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
GregorianCalendar fecha= new GregorianCalendar();
GregorianCalendar fecha2= new GregorianCalendar();
System.out.println("AÑO: "+Funciones.traerAnio(fecha));
System.out.println("FECHA CORTA: "+Funciones.traerFechaCorta(fecha));
System.out.println("MES: "+Funciones.traerMes(fecha));
System.out.println("DIA: "+Funciones.traerDia(fecha));
System.out.println("AÑO BISIESTO:" +Funciones.esBisiesto(1996));
System.out.println("FECHA VALIDA: "+Funciones.esFechaValida(1606, 2, 29));
System.out.println("Fecha: "+Funciones.traerFechaCorta(Funciones.traerFecha(2015,12,25)));
System.out.println("Fecha:" + Funciones.traerFechaCorta(Funciones.traerFecha("02/11/2012")));
System.out.println("Fecha Corta Hora: "+Funciones.traerFechaCortaHora(fecha));
System.out.println("Fecha Proxima: "+Funciones.traerFechaCorta(Funciones.traerFechaProxima(fecha, 2)));
System.out.println("Es dia habil: "+Funciones.esDiaHabil(fecha2));
System.out.println("Traer dia de la semana: "+Funciones.traerDiaDeLaSemana(fecha2));
System.out.println("Traer Mes en letra: "+Funciones.traerMesEnLetras(fecha));
System.out.println("Traer fecha larga: "+Funciones.traerFechaLarga(fecha));
System.out.println("Fechas Iguales: "+Funciones.sonFechasIguales(fecha, fecha2));
System.out.println("Fechas, Horas Iguales: "+Funciones.sonFechasHorasIguales(fecha, fecha2));
System.out.println("Cantidad de dias: "+Funciones.cantDeDiasDeUnMes(2016, 10));
System.out.println("Es numero: "+Funciones.esNumero('9'));
System.out.println("Es caracter: "+Funciones.esCaracter('E'));
System.out.println("Es cadena de numeros: "+Funciones.esCadenaNros("23565"));
System.out.println("Es cadena de letras: "+Funciones.esCadenaLetras("abcdeY"));
System.out.println("Aproximar a decimal: "+Funciones.aproximar2Decimal(6.9856987));

	}



}
