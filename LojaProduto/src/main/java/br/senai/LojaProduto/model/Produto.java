package br.senai.LojaProduto.model;

import jakarta.persistence.*;

@Entity
public class Produto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long codigo;
  private String descricao;
  private Double preco;
  private String status;

  public Produto() {
  }

  public Produto(Long codigo, String descricao, Double preco, String status) {
    this.codigo = codigo;
    this.descricao = descricao;
    this.preco = preco;
    this.status = status;
  }

  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}