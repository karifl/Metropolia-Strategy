package strategy;

import java.util.*;

public class Alkiorivi implements ListConverter {

	@Override
	public String listToString(ArrayList<String> x) {
		@SuppressWarnings("unchecked")
		Iterator <String> roller = x.iterator();
		String content="";
		if (roller.hasNext() == false)
		{
			System.out.println("Lista on tyhjä!");
		}else {
		while(roller.hasNext()) {
			String word = roller.next().toString();
			//System.out.println(word);
			content = content + word + " \n";
		}
		}
		//System.out.println("Content sisältää: " +content);
		
		// TODO Auto-generated method stub
		return content;
	}

}
