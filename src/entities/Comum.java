package entities;

public class Comum extends Usuario {

		public Comum(double saldo) {
			super(saldo);
		}

		@Override
		public void pagarPassagem() {

			if (saldo >= tarifa) {
				saldo -= tarifa;

				System.out.println("Passagem normal paga com sucesso!");
				System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));

			} else {
				System.out.println("Saldo insuficiente.");
			}
		}
	}
