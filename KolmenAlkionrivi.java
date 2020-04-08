package strategy;

import java.util.*;

public class KolmenAlkionrivi implements ListConverter {

	@Override
	public String listToString(ArrayList <String> x) {
		// TODO Auto-generated method stub
		String content= "";
		
		int size = 0;
		int end = x.size();
		
		for(size=0; size < end;size++) {
			if (size == end ) {
				break;
			}
			else if (size % 3 == 0) {
				content = content + "\n";
			}
			
			//	System.out.println("Jonoon " + x.get(size));
				content = content + " "+ x.get(size);
			
		
		}
		
		
		return content;
	}

}
