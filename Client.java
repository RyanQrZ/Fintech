class Client{
	private String cpf = "999999999-99";
	private String nome = "Human";
	private String endereco;
	private int idade;

	public void mudaCPF(String cpf){
		if(this.idade <= 60){
			validaCPF(cpf);
		}
		this.cpf = cpf;
	}

	private void validaCPF(String cpf){

	}

}