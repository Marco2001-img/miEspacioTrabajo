package contactos;

public interface IAgendaContact {
	public void guardar(AgendaContact ac);
	public AgendaContact buscar(AgendaContact ac);
	public void Editar(AgendaContact ac);
	public void eliminar(AgendaContact ac);
	public void Mostrar();

}
