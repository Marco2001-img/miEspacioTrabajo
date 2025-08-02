package principal;


public interface IMetodos {
	public void create(Object carros);
	public void update(int indice, Object carros);
	public void mostrar();
	public void delete(int indice);
	public Object found(int indice);

}
