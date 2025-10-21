package desafio.models;

public class Curso extends Conteudo {
	
	public int cargaHoraria;
	
	public Curso (String titulo, String descricao, int cargaHoraria)
	{
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}

	public double calcularXp()
	{
		return 10d * cargaHoraria;
	}
	
	public int getCargaHoraria() { return cargaHoraria; }
	public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }
	
}
