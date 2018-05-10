package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Funciones {
	public static int traerAnio(GregorianCalendar f) {
		return f.get(Calendar.YEAR);

	}

	public static String traerFechaCorta(GregorianCalendar f) {
		String fechaCorta = f.get(Calendar.DAY_OF_MONTH) + "/" + (f.get(Calendar.MONTH) + 1) + "/"
				+ f.get(Calendar.YEAR); 
		return fechaCorta;
	}

	public static boolean esBisiesto(int anio) {
		boolean bandera= false;
		if (anio % 4 == 0 & (anio % 100 != 0 || anio % 400 == 0)) {
			bandera= true;
		}

		return bandera;
	}

	public static int traerMes(GregorianCalendar f) {

		return f.get(Calendar.MONTH) + 1;
	}

	public static int traerDia(GregorianCalendar f) {

		return f.get(Calendar.DAY_OF_MONTH);
	}

	public static boolean esFechaValida(int anio, int mes, int dia) {
		boolean bandera=false;
		mes = mes - 1;
		if (mes >= 1 || mes <= 12) {

			if (mes == 0 || mes == 2 || mes == 4 || mes == 6 || mes == 7 || mes == 9 || mes == 11) {

				if (dia >= 1 && dia <= 31) {
					bandera= true;
				}

			}

			else if (mes == 3 || mes == 5 || mes == 8 || mes == 10) {

				if (dia >= 1 && dia <= 30) {
					bandera= true;
				}

			}

			else if (esBisiesto(anio) == true) {

				if (dia >= 1 && dia <= 29 && mes == 1) {

					bandera= true;
				}

			}

		}
		return bandera;
	}

	public static GregorianCalendar traerFecha(int anio, int mes, int dia){
		mes=mes-1;
		GregorianCalendar fecha= new GregorianCalendar(anio, mes, dia);	

		return fecha;
	}

	public static GregorianCalendar traerFecha(String f)
	{
		String[] fs= f.split("/");
		int dia = Integer.parseInt(fs[0]);
		int mes = Integer.parseInt(fs[1]);
		int anio = Integer.parseInt(fs[2]);
		GregorianCalendar fecha = new GregorianCalendar(anio, mes-1, dia);
		return fecha;
	}


	public static String traerFechaCortaHora(GregorianCalendar f) {
		String fechaCortaHora = f.get(Calendar.DAY_OF_MONTH) + "/" + (f.get(Calendar.MONTH) + 1) + "/"
				+ f.get(Calendar.YEAR)+" - "+f.get(Calendar.HOUR)+":"+f.get(Calendar.MINUTE)+":"+f.get(Calendar.SECOND); // definir fecha corta dd/mm/aaaa

		return fechaCortaHora;
	}

	public static GregorianCalendar traerFechaProxima(GregorianCalendar f, int cantDias){
		//GregorianCalendar fechaProxima= new GregorianCalendar(f.set(Calendar.DATE,cantDias),f.get(Calendar.MONTH),f.get(Calendar.YEAR));

		f.add(Calendar.DATE, cantDias);
		return f;

	}

	public static boolean esDiaHabil(GregorianCalendar f){
		boolean bandera;

		if(f.get(Calendar.DAY_OF_WEEK)==0 || f.get(Calendar.DAY_OF_WEEK)==7){
			bandera= false;
		}
		else {bandera=true;}

		return bandera;
	}

	public static String traerDiaDeLaSemana(GregorianCalendar f)
	{
		String dia = "";

		switch(f.get(Calendar.DAY_OF_WEEK))
		{
		case 1:
			dia="Domingo";
			break;
		case 2:
			dia="Lunes";
			break;
		case 3:
			dia="Martes";
			break;
		case 4:
			dia="Miercoles";
			break;
		case 5:
			dia="Jueves";
			break;
		case 6:
			dia="Viernes";
			break;
		case 7:
			dia="Sabado";
			break;
		}
		return dia;
	}

	public static String traerMesEnLetras(GregorianCalendar f)
	{
		String mes = "";
		switch(f.get(Calendar.MONTH))
		{
		case 0:
			mes="Enero";
			break;
		case 1:
			mes="Febrero";
			break;
		case 2:
			mes="Marzo";
			break;
		case 3:
			mes="Abril";
			break;
		case 4:
			mes="Mayo";
			break;
		case 5:
			mes="Junio";
			break;
		case 6:
			mes="Julio";
			break;
		case 7:
			mes="Agosto";
			break;
		case 8:
			mes="Septiembre";
			break;
		case 9:
			mes="Octubre";
			break;
		case 10:
			mes="Noviembre";
			break;
		case 11:
			mes="Diciembre";
			break;
		}
		return mes;
	}
	public static String traerFechaLarga(GregorianCalendar f)
	{
		String fecha = traerDiaDeLaSemana(f) + ", "+ traerDia(f) + " de " + traerMesEnLetras(f) + " de " + traerAnio(f);
		return fecha;
	}

	public static boolean sonFechasIguales(GregorianCalendar f, GregorianCalendar f2)
	{
		boolean bandera=false;
		if(f.compareTo(f2)==1)
		{
			bandera=true;
		}
		return bandera;

	}
	public static boolean sonFechasHorasIguales(GregorianCalendar f, GregorianCalendar f2)
	{
		boolean bandera=false;
		if(f.compareTo(f2)==1)
		{
			bandera=true;
		}
		return bandera;

	}
	public static int cantDeDiasDeUnMes(int anio, int mes){

		int dia=0;
		mes= mes-1;
		GregorianCalendar f= new GregorianCalendar(anio,mes,1);
		dia= f.getActualMaximum(Calendar.DAY_OF_MONTH);
		return dia;
	}

	public static boolean esNumero(char c) {
		boolean bandera = false;
		if (Character.isDigit(c) == true)/*funcion que devuelve true si el parametro es un numero*/
			bandera = true;
		return bandera;

	}

	public static boolean esCaracter(char c) {
		boolean bandera = false;
		if (Character.isDigit(c) == false)
			bandera = true;
		return bandera;

	}

	public static boolean esCadenaNros(String cadena) {
		int i = 0;
		char[] caracteres = new char[cadena.length()];
		int cantcaracteres;
		boolean bandera = true;
		for (i = 0; i < cadena.length(); i++) {
			caracteres[i] = cadena.charAt(i);
		}
		cantcaracteres = cadena.length();
		i = 0;
		while (bandera == true && i < cantcaracteres) {
			if (Character.isDigit(caracteres[i]) == true)
				i++;
			else
				bandera = false;

		}
		return bandera;
	}

	public static boolean esCadenaLetras(String cadena) {
		int i = 0;
		char[] caracteres = new char[cadena.length()];
		int cantcaracteres;
		boolean bandera = true;
		for (i = 0; i < cadena.length(); i++) {
			caracteres[i] = cadena.charAt(i);
		}
		cantcaracteres = cadena.length();
		i = 0;
		while (bandera == true && i < cantcaracteres) {
			if (Character.isDigit(caracteres[i]) == false)
				i++;
			else
				bandera = false;

		}
		return bandera;
	}

	public static double aproximar2Decimal(double valor) {
		double aentero = valor * 1000;
		int n = (int) Math.floor(aentero);/*toma solo parte entera*/
		double un = (double) n / 10;
		int f = (int) un;
		double d = un - f;
		double g = (d * 10);
		aentero = valor * 100;
		int j = (int) aentero;/*toma solo parte entera,igual que el anterior*/
		if (g >= 5)
			j = j + 1;
		double m = (double) j / 100;
		return m;
	}
	
	@Override
	public String toString() {
		return "Funciones [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
		+ "]";
	}

	public static double convertirADouble ( int n ){
		return (( double) n);
		}
}
