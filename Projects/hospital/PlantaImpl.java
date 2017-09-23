package hospital;

import java.util.LinkedList;
import java.util.List;

public class PlantaImpl implements Planta{
	
	private String codigo;
	private List<Habitacion> habitaciones;
	
	
	public PlantaImpl(){
		codigo = "";
		habitaciones = new LinkedList<Habitacion>();
	}
	
	public PlantaImpl(String codigo, List<Habitacion> habitaciones){
		this.codigo = codigo;
		this.habitaciones = habitaciones;
	}
	
	public String getCodigo(){
		return codigo;
	}
	public List<Habitacion> getHabitaciones(){
		return habitaciones;
	}

	public boolean equals(Object o){
		boolean res = false;
		if (o instanceof Planta){
			Planta aux = (Planta) o;
			res = getCodigo().equals(aux.getCodigo());
		}
		
		return res;
	}
	
	public String toString(){
		return "[Planta - " + getCodigo();
	}

	// TODO 4.2 Implementar el método compareTo en la clase PlantaImpl
	
	
	// TODO 4.4. Implementar los métodos en la clase PlantaImpl









}
