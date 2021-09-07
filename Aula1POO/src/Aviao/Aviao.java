package Aviao;

public class Aviao {
	
		private String Modelo;
		private double Ano;
		private String Cor;
		private double Peso;
		
		// Setters --> Acessar os dados e modificá-los;
		// Getters --> Recuperar os dados que foram modificados;
		
		public void setModelo(String Modelo) {
			this.Modelo = Modelo;
		}
		
		public String getModelo() {
			return Modelo;
		}
		
		public void setAno(double Ano) {
			this.Ano = Ano;
		}
		
		public double getAno() {
			return Ano;
		}
		
		public void setCor(String Cor) {
			this.Cor = Cor;
		}
		
		public String getCor() {
			return Cor;
		}
		public void setPeso(double Peso) {
			this.Peso = Peso;
		}
		
		public double getPeso() {
			return Peso;
		}
		
		
	}
