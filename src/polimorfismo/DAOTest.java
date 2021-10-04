package polimorfismo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DAOTest {

	/*
	public static void main(String[] args) {
		ArquivoDAOImpl arquivoDAO = new ArquivoDAOImpl();
		arquivoDAO.sava();
	}
	*/
	
	// salvando em arquivo ou banco de dados as duas opções
	
	/*
	public static void main(String[] args) {
		GenericDAO arquivoDAO = new DataBaseDAOImpl();
		arquivoDAO.sava(); 
		List<String> lista = new ArrayList<>();
		lista.add("mauro");
		lista.add("jorge");
		lista.add("Joaquim");
		lista.add("pedro");
		for(String nome : lista) {
			System.out.println("Nome : " + nome);
		}
		*/
	// tipo de lista, array ou linked
	
	
	public static void main(String[] args) {
		GenericDAO arquivoDAO = new DataBaseDAOImpl();
		arquivoDAO.sava(); 
		List<String> lista = new LinkedList<>();
		lista.add("mauro");
		lista.add("jorge");
		lista.add("Joaquim");
		lista.add("pedro");
		for(String nome : lista) {
			System.out.println("Nome : " + nome);
		}
	
	
		
	}
}
