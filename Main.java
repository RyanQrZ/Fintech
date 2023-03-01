class Main{
	public static void main(String[] args){

		Conta c1 = new Conta();
		Conta c2 = new Conta();

		c1.titular.nome = "Ryan";
		c1.abertura.dia = 17;
		c1.abertura.mes = 11;
		c1.abertura.ano = 2023;

		c1.saca(500);

		System.out.println();

	}
}