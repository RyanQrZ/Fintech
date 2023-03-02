class Main{
	public static void main(String[] args){

		Conta c1 = new Conta();

		c1.deposita(1000);

		System.out.println("Saldo: " + c1.getSaldo());

	}
}