class Conta{
	private int id = 123;
	private double saldo, limite;
	Client titular = new Client();
	private String agencia = "Banco do Brasil S.A";
	DataAbertura abertura = new DataAbertura();

	public void transferePara(Conta destino, double valor){
		boolean isTrue = this.saca(valor);
		if(isTrue){
			destino.deposita(valor);
		}
	}

	public boolean saca(double valor){
		if((this.saldo > 0) && (this.saldo > valor)){
			this.saldo -= valor;
			return true;
		}
		else{
			return false;
		}
	}

	public void deposita(double valor){
		this.saldo += valor;
	}

	public double rendimento(){
		double rentabilidade = (this.saldo * 0.1);
		return rentabilidade;
	}

	public String recuperaDados(){
		String dados = "ID: " + this.id;
		dados += "\nTitular: " + this.titular.nome;
		dados += "\nCPF: " + this.titular.cpf;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nData de abertura: " + this.abertura.format();
		dados += "\nAgencia: " + this.agencia;

		return dados;
	}

}