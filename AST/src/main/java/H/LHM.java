package H;

import java.util.LinkedHashMap;

public class LHM {
	
	String brand;
	int cc;
	LHM( String brand,int cc){
		this.brand=brand;
		this.cc=cc;
	}
	
	public static void main(String[] args) {
		LinkedHashMap<LHM, String> bikes = new LinkedHashMap<>();
		bikes.put(new LHM("bajaj", 200), "NS200");
		bikes.put(new LHM("yamaha", 150), "FZS");
		bikes.put(new LHM("suzuki", 150), "Gixxer");
		bikes.put(new LHM("RE", 350), "hunter");
		
		for(LHM e:bikes.keySet()) {
			System.out.println(bikes.get(e));
		}
	}
}
