/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto.Logica;
/**
 * Classe que armazena as informacoes utilizadas ao longo do programa para informacao de produtos
 */
                                 

/**
 *
 * @author Alex
 */
public class Animais {

    private int id;
    private float numero;
    private String nome;
    private String pai;
    private String mae;
    private String descricao;
    private float lactacao;
    private String nascimento;


    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public float getLactacao() {
        return lactacao;
    }

    public void setLactacao(float lactacao) {
        this.lactacao = lactacao;
    }
    private float peso;



    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

        public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
