package strategy;

import java.util.*;

public class Client {

		private ArrayList <String> lista ;
		private ListConverter lister;
		
		
		public Client(ListConverter lister) {
			this.lista =  new ArrayList <String>();
			this.lister = lister;
		}
		
		public void add(String word) {
			lista.add(word);
			
		}
		
		public void printLista() {
			String result= "";
			result = result + lister.listToString(lista);
			System.out.println("Listalla on: \n"+result);
		}
		
		public void setListConverter(ListConverter lister) {
			this.lister = lister;
		}
	}
		
	


