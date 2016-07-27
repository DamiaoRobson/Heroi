package jogo;

import java.util.ArrayList;

public class Mochila {
	
	private double pesoItens;
	private double peso;
	private int danoTotal;
	private int curaTotal;
	private ArrayList<Item> itens;

//	 Construtor mochila
	public Mochila(double peso) {
		this.peso = peso;
		pesoItens = 0;
		danoTotal = 0;
		curaTotal = 0;
		itens = new ArrayList<>();
	}

//	metodo para guardar itens na mochila
	public boolean guardarItem(Item item){
		
//		verificando peso e tipo de item
		if ((item.getPeso() + pesoItens) <= peso){
			
			/*if(item.getNome().equals("Arma")){
				itemsetPesoItens(item.getPeso());
				mochila.setDanoTotal(item.getEfeito()); *Não estou conseguindo somar os valores de dano e cura a mochila
			
			}else if (item.getNome().equals("Pocao")){
				mochila.setCuratotal(item.getEfeito());
			}
			return itens.add(item);*/
		}
		return false;
	}

	
	public double getPesoItens() {
		return pesoItens;
	}

	public void setPesoItens(double pesoItens) {
		this.pesoItens = pesoItens;
	}

	public void setDanoTotal(int danoTotal) {
		this.danoTotal = danoTotal;
	}

	public void setCuraTotal(int curaTotal) {
		this.curaTotal = curaTotal;
	}

	public int getDanoTotal() {
		return danoTotal;
	}

	public int getCuraTotal() {
		return curaTotal;
	}
	
	public void setCuratotal(int cura){
		curaTotal = cura;
	}

	public double getPeso() {
		return peso;
	}


}
