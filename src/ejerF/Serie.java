package ejerF;

public class Serie implements Entregable{
    private String titulo;
    private String genero;
    private String creador;
    private int numeroTemporadas;
    private boolean entregado;

    
    public Serie() {
       
    }

    
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = "";
        this.numeroTemporadas = 3;
        this.entregado = false;
    }

    
    public Serie(String titulo, String genero, String creador, int numeroTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = false;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public String toString() {
        return "Serie [titulo=" + titulo + ", genero=" + genero + ", creador=" + creador +
               ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado + "]";
    }


	@Override
	public void entregar() {
		this.entregado = true;
		
	}


	@Override
	public void devolver() {
		this.entregado = false;
		
	}


	@Override
	public boolean isEntregado() {
		return this.entregado;
	}


	@Override
	public int compareTo(Object a) {
        if (a instanceof Serie) {
            Serie otra = (Serie) a;
            return Integer.compare(this.numeroTemporadas, otra.numeroTemporadas);
        } else {
            return 0;
        }
	}
}
