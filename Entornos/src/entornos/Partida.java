package entornos;

import java.sql.Date;

public class Partida {
	
	Date fecha;
	String nombrejuego;
	boolean online;
	Gamer[] jugadores = new Gamer[2];
	
	public Partida() {
		
		this.fecha = null;
		this.nombrejuego = "";
		this.online = false;
		
	}
	
	public Partida (Partida p ) {
		
		this.fecha = p.fecha;
		this.nombrejuego = p.nombrejuego;
		this.online = p.online;
		
	}
	
	public Partida (Date f , String n, boolean o) {
		
		this.fecha = f;
		this.nombrejuego = n;
		this.online = o;
		
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombrejuego() {
		return nombrejuego;
	}

	public void setNombrejuego(String nombrejuego) {
		this.nombrejuego = nombrejuego;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}
	
	
	

}
