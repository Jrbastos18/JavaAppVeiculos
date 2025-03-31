/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaappveiculos;

/**
 *
 * @author junio
 */
public class Veiculo {
    // ATRIBUTOS
    private String tipo_veiculo;
    private String marca;
    private String modelo;
    private int ano_fab;
    private String combustivel;
    private String placa;
    private double valor;
    
    // CONSTRUTORES
    // Construtor Default
    public Veiculo(){
    }
    
    // Construtor Completo
    public Veiculo(String p_tipo_veiculo, String p_marca, String p_modelo, int p_ano_fab, String p_combustivel, String p_placa, double p_valor) {
        this.tipo_veiculo = p_tipo_veiculo;
        this.marca = p_marca;
        this.modelo = p_modelo;
        this.ano_fab = p_ano_fab;
        this.combustivel = p_combustivel;
        this.placa = p_placa;
        this.valor = p_valor;
    }
    
    // MÉTODOS
    // SETTERS
    public void setTipo_veiculo(String p_tipo_veiculo) {
        this.tipo_veiculo = p_tipo_veiculo;
    }

    public void setMarca(String p_marca) {
        this.marca = p_marca;
    }

    public void setModelo(String p_modelo) {
        this.modelo = p_modelo;
    }

    public void setAno_fab(int p_ano_fab) {
        this.ano_fab = p_ano_fab;
    }

    public void setCombustivel(String p_combustivel) {
        this.combustivel = p_combustivel;
    }

    public void setPlaca(String p_placa) {
        this.placa = p_placa;
    }

    public void setValor(double p_valor) {
        this.valor = p_valor;
    }
    
    // GETTERS
    public String getTipo_veiculo() {
        return this.tipo_veiculo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno_fab() {
        return this.ano_fab;
    }

    public String getCombustivel() {
        return this.combustivel;
    }

    public String getPlaca() {
        return this.placa;
    }

    public double getValor() {
        return this.valor;
    }
}
