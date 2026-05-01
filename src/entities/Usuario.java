package entities;

public abstract class Usuario {
		protected double saldo;
		protected double tarifa = 5.00;

		public Usuario(double saldo) {
			this.saldo = saldo;
		}

		public abstract void pagarPassagem();
	}

