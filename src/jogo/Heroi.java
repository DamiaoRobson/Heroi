package jogo;

public class Heroi {

	private String nome;
	private double HP;
	private Mochila mochila;

	public Heroi(String nome, double peso) {
		this.nome = nome;
		HP = 100;
		mochila = new Mochila(peso);
	}

	// Criar item /nao estou conseguindo somar o dano/cura a mochila!
	public boolean criaItem(String nomeItem, double pesoItem, int danoItem, String tipoItem) {
		Item item = new Item(nomeItem, pesoItem, danoItem, tipoItem);
		return mochila.guardarItem(item);
	}

	// Ataque
	public String ataca(Heroi atacado) {
		atacado.setHP(atacado.getHP() - mochila.getDanoTotal());
		if (atacado.getHP() > 0) {
			return String.format("%s ainda tenho %d de vida.", atacado.getNome(), atacado.getHP());
		} else if (atacado.getHP() > -10) {
			return String.format("%s desmaiou, mas ainda pode ser curado", atacado.getNome());
		} else {
			return String.format("%s desmaiou sem chances de voltar com pocao.", atacado.getNome());
		}
	}

	// Cura
	public void cura() {
		if (mochila.getCuraTotal() <= 100) {
			this.setHP(mochila.getCuraTotal());
		} else {
			this.setHP(100);
		}
		mochila.setCuratotal(0);
	}

//	equals criado pelo eclipse (perguntar melhor forma para esse teste
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Heroi other = (Heroi) obj;
		if (Double.doubleToLongBits(HP) != Double.doubleToLongBits(other.HP))
			return false;
		if (mochila == null) {
			if (other.mochila != null)
				return false;
		} else if (!mochila.equals(other.mochila))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public double getHP() {
		return HP;
	}

	public void setHP(double hP) {
		HP = hP;
	}

}
