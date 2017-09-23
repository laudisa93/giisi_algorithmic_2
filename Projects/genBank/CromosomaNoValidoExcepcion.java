package genBank;

public class CromosomaNoValidoExcepcion extends RuntimeException{
	
	public CromosomaNoValidoExcepcion(){
		super();
	}
	
	public CromosomaNoValidoExcepcion(String s){
		super(s);
	}

}
