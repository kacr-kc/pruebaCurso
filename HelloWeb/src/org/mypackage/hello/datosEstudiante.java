package org.mypackage.hello;

import java.text.SimpleDateFormat;
import java.util.Date;
public class datosEstudiante {
	
	String nombre;
	String fecha;
	String agno;
	String semestre;
	
	public datosEstudiante(){
		
		nombre=null;
		fecha=null;
		agno=null;
		semestre=null;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		
		//muestra una cadena de texto con dia mes y año separado
		SimpleDateFormat sdf =  new SimpleDateFormat("dd/M/yyyy");
		this.fecha = sdf.format(new Date());
		String[] fechaD = this.fecha.split("/");
		
		//cadena de texto de la fecha que se envia a este método
		String[] fechaLD = fecha.split("/");
		
		//fechas igual a tamaño 3 es decir día mes y año
		if(fechaD.length==fechaLD.length)
		{
			//separo y convierto a variable entero cada valor de cadena de texto
			int d1=Integer.parseInt(fechaD[0]);
			int m1=Integer.parseInt(fechaD[1]);
			int y1=Integer.parseInt(fechaD[2]);
			
			int d2=Integer.parseInt(fechaLD[0]);
			int m2=Integer.parseInt(fechaLD[1]);
			int y2=Integer.parseInt(fechaLD[2]);
			
			//prueba de que ya pasó o no la fecha de mi cumpleaño
			if(d1>=d2 && m1>=m2)
				this.fecha = String.valueOf(y1-y2);
			else if(m2>m1)
				this.fecha = String.valueOf(y1-y2-1);
			else if(m2==m1 && d1>=d2)
				this.fecha = String.valueOf(y1-y2);
			else if(m2==m1 && d2>=d1)
				this.fecha = String.valueOf(y1-y2-1);
			
			//comprueba si ud ya nació o es un bebe para hacer eso
			if(y2>=y1)
				this.fecha="Ud no ha nacido o es un bebe para estar haciendo esto";
			//altera el resultado de las fechas
		}else
			this.fecha = "Ud que inventa hermano";
		
		//this.fecha=fecha;
	}

	public String getAgno() {
		return agno;
	}

	public void setAgno(String agno) {
		this.agno = agno;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		
		//declaro variable local
		int a=0;
		
		//Guardo año que ingresó a la universidad agno e int
		int agin = Integer.parseInt(getAgno());
		
		//Guardo fecha actual en una cadena de string
		SimpleDateFormat sdf =  new SimpleDateFormat("dd/M/yyyy");
		String date= sdf.format(new Date());
		String[] dateSemestre = date.split("/");
		
		//guardo mes y año en variables enteros
		int mes = Integer.parseInt(dateSemestre[1]);
		int year = Integer.parseInt(dateSemestre[2]);
		
		//primera mitad primer semestre y segunda mitad segundo semestre y le adiciono semestre
		
		if(mes>0 && mes<5){
			a = (year-agin)*2+Integer.parseInt(semestre);
		}
		else if(mes>5 && mes<11){
			a = (year-agin)*2+1+Integer.parseInt(semestre);
		}
		
		//muestra resultado en la página
		this.semestre=a+"";
			
		//this.semestre = semestre;
	}
}
