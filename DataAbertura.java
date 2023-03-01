class DataAbertura{
	private int dia;
	private int mes;
	private int ano;

	public String format(){
		String formatado = "" + this.dia + "/" + this.mes + "/" + this.ano;

		return formatado;
	}
}