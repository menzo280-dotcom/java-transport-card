package application;
import entities.Comum;
import entities.Estudante;
import entities.Idoso;
import entities.Usuario;

public class Program {

	public static void main(String[] args) {

			Usuario u1 = new Estudante(10.00);
			Usuario u2 = new Idoso(3.00);
			Usuario u3 = new Comum(8.00);

			u1.pagarPassagem();
			System.out.println("----------------------");

			u2.pagarPassagem();
			System.out.println("----------------------");

			u3.pagarPassagem();
		}
	}


