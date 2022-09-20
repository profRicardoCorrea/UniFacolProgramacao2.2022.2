package enums;

public enum GeneroEnum {
	Transgenero("Transgênero"),Cisgenero("Cisgênero"), NaoBinário("Não-binário");
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
