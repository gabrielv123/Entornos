package entornos;

import java.util.ArrayList;

public class Gamer extends Usuario {

	String Nickname;
	ArrayList<Partida> jugadores = new ArrayList<>();

	public Gamer() {

		super();
		this.Nickname = "";
	}

	public Gamer(Gamer g) {

		super(g);
		this.Nickname = "";

	}

	public Gamer(String n, String d, int e, String nic) {

		super(n, d, e);
		this.Nickname = nic;

	}

	public String getNickname() {
		return Nickname;
	}

	public void setNickname(String nickname) {
		Nickname = nickname;
	}

	public void setEdad(int edad) {

		if (edad > 18) {

			this.edad = edad;
		}

		else {

			this.edad = 0;

		}

	}

}
