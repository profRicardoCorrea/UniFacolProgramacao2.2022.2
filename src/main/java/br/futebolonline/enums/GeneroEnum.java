package br.futebolonline.enums;

public enum GeneroEnum {
	Masculino("Masculino"),Feminino("Feminino"),transgenero("Transg�nero"),GeneroNeutro("G�nero Neutro"), 
	NaoBinario("N�o-Bin�rio"), Agenero("Ag�nero"), Pang�nero("Pang�nero");
	private String descricao;

	GeneroEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static GeneroEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (GeneroEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}
}
