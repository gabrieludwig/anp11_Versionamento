package GUI;

import java.io.Serializable;

public abstract class AbstractDesejo implements Serializable {

    public String titulo;
    public String descricao;
    public String dataPrevista;
    public boolean concluido;

    public AbstractDesejo(String titulo, String descricao, String dataPrevista, boolean concluido) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataPrevista = dataPrevista;
        this.concluido = concluido;
    }

    public AbstractDesejo() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(String dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }    
}