package genBank;

import gen.Gen;

import java.util.*;



public class GenBankImpl implements GenBank {

	private Set<Gen> genes;
	private String version;
	
	public GenBankImpl() {
		genes = new HashSet<Gen>();
		version = "";
	}
	
	public GenBankImpl(Set<Gen> genes, String version){
		this.genes = genes;
		this.version = version;
	}
	

	public Set<Gen> getGenes(){
		return genes;
	}
	
	public String getVersion(){
		return version;
	}
	
	public void setVersion(String v){
		version = v;
	}
	
	public boolean equals(Object o){
		boolean res = false;
		if(o instanceof GenBank){
			GenBank g = (GenBank)o;
			res = getVersion().equals(g.getVersion()); 
					
		}
		return res;
	}
	
	public String toString(){
		return getVersion();
	}
	
	// TODO 2.2 Implementar los métodos en la clase GenBankImpl
	
	
}
