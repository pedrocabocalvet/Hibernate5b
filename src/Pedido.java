import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Pedido {
	
	int id;
	Date fecha;
	private Set<Item> itemsAtributo = new HashSet<Item>();
	
	
	

	public Set<Item> getItemsAtributo() {
		return itemsAtributo;
	}
	public void setItemsAtributo(Set<Item> itemsAtributo) {
		this.itemsAtributo = itemsAtributo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	
	
	

}
