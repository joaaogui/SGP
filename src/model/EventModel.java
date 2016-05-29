package model;
import javax.persistence.*;

@Entity
public class EventModel {
	
	@Id
	@GeneratedValue
	@Column  
	private int id;
	@Column
	private String nomeEvento;
	@Column
	private String dataInicial;
	@Column
	private String dataFinal;
	@Column
	private String observacao;
	@Column
	private String tipoEvento;
	
	public EventModel(){
		
	}
	
	public EventModel(int id, String nomeEvento, String dataInicial, String dataFinal, String observacao){
		this.id = id;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.observacao = observacao;
	}
	
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getDataInicial() {
		return dataInicial;
	}
	
	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public String getDataFinal() {
		return dataFinal;
	}
	
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}	

}
