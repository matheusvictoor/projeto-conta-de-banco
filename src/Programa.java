
public class Programa {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		
		minhaConta.deposita(1600);
		
		minhaConta.saca(500);
		
		System.out.println(minhaConta.saldo);	

	}

}
