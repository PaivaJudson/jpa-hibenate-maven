package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Judson Paiva", "judsonpaiva16@gmail.com");
		Pessoa p2 = new Pessoa(2, "Leonor Paiva", "leonajose2020@gmail.com");
		Pessoa p3 = new Pessoa(3, "Jéssica Paiva", "jessicavanda@gmail.com");
		
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}
}
