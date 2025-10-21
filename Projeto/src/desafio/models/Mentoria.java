package desafio.models;

import java.time.LocalDate;

public class Mentoria {

	private LocalDate data;
	private String descricao;
	private String titulo;
	
	public Mentoria (String titulo, String descricao, LocalDate data)
	{
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
	}
	
	public double calcularXp()
	{
		return 20d;
	}
	
	public LocalDate getData() { return data; }
	public void setData(LocalDate data) { this.data = data; }
}
