package br.futebolonline.enums;

public enum TipoFuncionarioEnum {
Contratado("Contratado"), Clt("CLT"), Diarista("Diarista"), Mensalista("Mensalista");
	private String descricao;

	TipoFuncionarioEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static TipoFuncionarioEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (TipoFuncionarioEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}
}
