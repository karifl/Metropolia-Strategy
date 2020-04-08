package strategy;

import java.util.*;


public class KahdenAlkionrivi implements ListConverter {

	@Override
	public String listToString(ArrayList<String> x) {
		// TODO Auto-generated method stub
		String jono[] = new String[10];

		String content="";
		int size = 0;
		int end = x.size();
		
		for(size=0; size < end;size++) {
			if (size == end ) {
				break;
			}
			else {
			//	System.out.println("Jonoon " + x.get(size));
				jono[size] = x.get(size);
			}
		
		}
		//System.out.println("Over here!");
		int i =0;
		for(i=0;i < jono.length-1;i++) {
			if(jono[i] == null) {
				break;
			}
			
			if (i % 2 == 0) {
				content = content + "\n";
			}
			content = content +" " + jono[i];
		}
			
		//System.out.println("Content on: " + content);
		
		
		//System.out.println("Content sisältää: " +content);
		
		
		return content;
	}

}
