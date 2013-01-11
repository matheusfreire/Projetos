package entidades;

abstract class Eletronicos extends Produtos implements VendaParcelada {
	public double precoFinal (){
		return this.precoLiquido() * 1.1;
	}
}
