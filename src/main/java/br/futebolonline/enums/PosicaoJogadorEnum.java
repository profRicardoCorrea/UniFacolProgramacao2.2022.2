package br.futebolonline.enums;

public enum PosicaoJogadorEnum {
	Goleiro("Goleiro"), Lateral("Lateral"), LateralDireito("Lateral Direito"), LateralEsquerdo("Lateral Esquerdo"),
	Zagueiro("Zagueiro"), MeioDeCampo("Meio de Campo"), Volante("Volante"), CabecaDeArea("Cabeca de Área"),
	MeiaAtacante("Meia Atacante"), MeiaOfensivo("Meia Ofensivo"), Armador("Armador"), MeiaArmador("Meia Armador"),
	Atacante("Atacante"), Ponta("Ponta"), CentroAvante("Centro Avante"), Artilheiro("Artilheiro"), Tecnico("Tecnico");

	private String descricao;

	PosicaoJogadorEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static PosicaoJogadorEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (PosicaoJogadorEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}

}
