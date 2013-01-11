package entidades;

abstract class Eletronicos extends Produtos {
	public double precoFinal (){
		return this.precoLiquido() * 1.1;
	}
	
}
