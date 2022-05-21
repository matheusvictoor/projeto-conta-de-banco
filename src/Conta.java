
public class Conta {

	int numero;
	String titular;
	double saldo;
	
	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	void deposita(double valor) {
		this.saldo += valor;
	}
}
