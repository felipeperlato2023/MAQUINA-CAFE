package MaquinaCafé;

public class MaquinaCafe {
    
	   int  acucarDisponivel;
	
	
	 void fazerCafe() {
			this.acucarDisponivel = 30;
	 }
	void fazerCafe(int quantidadeAcucar) {
		if (acucarDisponivel < quantidadeAcucar) {
			System.out.println("Não há açucar suficiente para fazer seu café.");
		} else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
		}
	}
	
	
	
	
}
    