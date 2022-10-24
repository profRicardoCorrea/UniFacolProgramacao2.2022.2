package br.futebolonline.enums;

 
public enum JogadorStatusEnum {
	Titular("Titular"),Reserva("Reserva"),DepartamentoMedico("Departamento Medico"),Irregular("Irregular");
	
	private String descricao;
	
	JogadorStatusEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static JogadorStatusEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (JogadorStatusEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}

}
