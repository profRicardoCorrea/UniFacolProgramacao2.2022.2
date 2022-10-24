package br.futebolonline.enums;

public enum TimeOperacaoEnum {
	cadastrar("cadastrar"),atualizar("atualizar"),remover("remover"),listar("listar");
	private String descricao;

	TimeOperacaoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static TimeOperacaoEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (TimeOperacaoEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}

}
