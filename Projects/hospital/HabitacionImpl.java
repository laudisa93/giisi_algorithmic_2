package hospital;

public class HabitacionImpl implements Habitacion{
	
	private Integer numero;
	private Boolean libre;
	
	public HabitacionImpl(){
		numero = 0;
		libre = false;
	}
	
	public HabitacionImpl(Integer numero, Boolean libre){
		this.numero = numero;
		this.libre = libre;
	}
	
	public Integer getNumero(){
		return numero;
	}
	
	public Boolean getLibre(){
		return libre;
	}
	
	public void setLibre(Boolean l){
		libre = l;
	}
	
	public boolean equals(Object o){
		boolean res = false;
		if (o instanceof Habitacion){
			Habitacion aux = (Habitacion) o;
			res = getNumero().equals(aux.getNumero());
		}
		
		return res;
	}
	
	public String toString(){
		return "" + getNumero();
	}
	
	
	// TODO 3.2 Implementar el método compareTo en la clase HabitacionImpl
}
