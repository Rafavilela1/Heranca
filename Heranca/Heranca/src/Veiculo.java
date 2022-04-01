
public class Veiculo {
	
	protected static String marca,modelo;
	protected static int ano;
	
	
	public void buzinar(){
		System.out.println("BIBI");
	}
	
	public void imprimeDados() {
		System.out.println("Marca:" + marca);
		System.out.println("Modelo:" + modelo);
		System.out.println("Ano:" + ano);
	}
	
	
	public static String getMarca() {
		return marca;
	}
	public static void setMarca(String marca) {
		Veiculo.marca = marca;
	}
	public static String getModelo() {
		return modelo;
	}
	public static void setModelo(String modelo) {
		Veiculo.modelo = modelo;
	}
	public static int getAno() {
		return ano;
	}
	public static void setAno(int ano) {
		Veiculo.ano = ano;
	}
	
	
}
