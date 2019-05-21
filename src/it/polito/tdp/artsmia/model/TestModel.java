package it.polito.tdp.artsmia.model;

public class TestModel {

	public static void main(String[] args) {

		TestModel main = new TestModel();
		main.run();
		
	}
	
	public void run() {
		Model model = new Model();
		model.creaGrafo();
	}

}
