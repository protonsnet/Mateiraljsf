package br.ufrn.imd.material.dominio;

import java.math.BigDecimal;
import java.util.Date;

public class Material {
	private int id;
	private String codigo;
	private String descricao;
	private Date dataCadastro;
	private Usuario usuarioCadastro;

	private String nome;
	private String especificacao;
	private GrupoMaterial grupoMaterial;
	private int estoqueMinimo;
	private int pontoPedido;
	private UnidadeMedida unidadeEstoque;
	private UnidadeMedida unidadeEntrada;
	private BigDecimal fatorConversaoEntrada;
	private UnidadeMedida unidadeSaida;
	private BigDecimal fatorConversaoSaida;
	private String dadosAdicionais;
	private ClassificacaoMaterial classificacao;
	private int catmat;
	private String condicaoAmazenagem;
	private StatusMaterial status;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecificacao() {
		return especificacao;
	}
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	public GrupoMaterial getGrupoMaterial() {
		return grupoMaterial;
	}
	public void setGrupoMaterial(GrupoMaterial grupoMaterial) {
		this.grupoMaterial = grupoMaterial;
	}
	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}
	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}
	public int getPontoPedido() {
		return pontoPedido;
	}
	public void setPontoPedido(int pontoPedido) {
		this.pontoPedido = pontoPedido;
	}
	public UnidadeMedida getUnidadeEstoque() {
		return unidadeEstoque;
	}
	public void setUnidadeEstoque(UnidadeMedida unidadeEstoque) {
		this.unidadeEstoque = unidadeEstoque;
	}
	public UnidadeMedida getUnidadeEntrada() {
		return unidadeEntrada;
	}
	public void setUnidadeEntrada(UnidadeMedida unidadeEntrada) {
		this.unidadeEntrada = unidadeEntrada;
	}
	public BigDecimal getFatorConversaoEntrada() {
		return fatorConversaoEntrada;
	}
	public void setFatorConversaoEntrada(BigDecimal fatorConversaoEntrada) {
		this.fatorConversaoEntrada = fatorConversaoEntrada;
	}
	public UnidadeMedida getUnidadeSaida() {
		return unidadeSaida;
	}
	public void setUnidadeSaida(UnidadeMedida unidadeSaida) {
		this.unidadeSaida = unidadeSaida;
	}
	public BigDecimal getFatorConversaoSaida() {
		return fatorConversaoSaida;
	}
	public void setFatorConversaoSaida(BigDecimal fatorConversaoSaida) {
		this.fatorConversaoSaida = fatorConversaoSaida;
	}
	public String getDadosAdicionais() {
		return dadosAdicionais;
	}
	public void setDadosAdicionais(String dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}
	public ClassificacaoMaterial getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(ClassificacaoMaterial classificacao) {
		this.classificacao = classificacao;
	}
	public int getCatmat() {
		return catmat;
	}
	public void setCatmat(int catmat) {
		this.catmat = catmat;
	}
	public String getCondicaoAmazenagem() {
		return condicaoAmazenagem;
	}
	public void setCondicaoAmazenagem(String condicaoAmazenagem) {
		this.condicaoAmazenagem = condicaoAmazenagem;
	}
	public StatusMaterial getStatus() {
		return status;
	}
	public void setStatus(StatusMaterial status) {
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Usuario getUsuarioCadastro() {
		return usuarioCadastro;
	}
	public void setUsuarioCadastro(Usuario usuarioCadastro) {
		this.usuarioCadastro = usuarioCadastro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Material other = (Material) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
}
