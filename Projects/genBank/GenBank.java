package genBank;

import gen.Gen;


import java.util.Set;

public interface GenBank {
	
	Set<Gen> getGenes();
	String getVersion();
	void setVersion(String v);
	
	// TODO 2.1 Definir los métodos en el interfaz GenBank
	
	

}
