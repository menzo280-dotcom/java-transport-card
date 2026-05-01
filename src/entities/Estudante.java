package entities;

public class Estudante extends Usuario{

		public Estudante(double saldo) {
			super(saldo);
		}
		@Override
		public void pagarPassagem() {

			double meiaTarifa = tarifa / 2;

			if (saldo >= meiaTarifa) {
				saldo -= meiaTarifa;

				System.out.println("Passagem estudantil paga com sucesso!");
				System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));

			} else {
				System.out.println("Saldo insuficiente.");
			}
		}
	}

