package methods;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> obj=new HashMap<String,String>();
		
		obj.put("Mani","Capgemini");
		obj.put("naveen","Amazon");
		obj.put("vinny", "Deloitte");
		
		for(String i:obj.keySet()) {
			System.out.println("keys: "+i+" \tvalues: "+obj.get(i));
		}

	}

}
