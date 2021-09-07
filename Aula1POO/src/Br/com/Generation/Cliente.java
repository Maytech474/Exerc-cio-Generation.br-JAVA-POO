package Br.com.Generation;

public class Cliente {
	
		private String clienteNome;
		private double clientePeso;
		private double clienteAltura;
		private String  clienteRG;
		
		// Setters --> Acessar os dados e modificá-los;
		// Getters --> Recuperar os dados que foram modificados;
		
		public void setNome(String clienteNome) {
			this.clienteNome = clienteNome;
		}
		
		public String getNome() {
			return clienteNome;
		}
		
		public void setPeso(double clientePeso) {
			this.clientePeso = clientePeso;
		}
		
		public double getPeso() {
			return clientePeso;
		}
		
		public void setAltura(double clienteAltura) {
			this.clienteAltura = clienteAltura;
		}
		
		public double getAltura() {
			return clienteAltura;
		}
		public void setRG(String string) {
			this.clienteRG = string;
		}
		
		public String getRG() {
			return clienteRG;
		}
		
		
	}
