package ejerF;

public class VideoJuego implements Entregable{
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    public VideoJuego() {
 
    }

    public VideoJuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        this.entregado = false;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    
    @Override
    public String toString() {
        return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado +
               ", genero=" + genero + ", compania=" + compania + "]";
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
	    if (a instanceof VideoJuego) {
	        VideoJuego otro = (VideoJuego) a;
	        return Integer.compare(this.horasEstimadas, otro.horasEstimadas);
	    }
	    return 0;
	}
}
