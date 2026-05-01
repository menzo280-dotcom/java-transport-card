package entities;

public class Idoso extends Usuario {

		public Idoso(double saldo) {
			super(saldo);
		}

		@Override
		public void pagarPassagem() {
			System.out.println("Idoso isento de tarifa.");
			System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
		}
	}
