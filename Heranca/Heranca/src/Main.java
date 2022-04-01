
public class Main {
	public static void main(String[] args) {
		Carro carro1= new Carro();
		carro1.setAno(1980);
		carro1.setMarca("Ford");
		carro1.setModelo("Fiesta");
		carro1.setQuatroPortas(true);
		
		
		carro1.imprimeDados();
		
		
		Moto moto1 = new Moto();
		moto1.setAno(2022);
		moto1.setMarca("Honda");
		moto1.setModelo("Titan");
		
		
		moto1.imprimeDados();
		moto1.empinar();
		moto1.buzinar();
		
		
		
		Caminhao cam = new Caminhao();
		System.out.println();
		cam.buzinar();
		
		
		
	}
}
