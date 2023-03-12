
class garrafasCerveja99 {

	public static void main(String[] args) {
		int cervejaNum = 99;
		String palavra = "garrafas";
		
		while (cervejaNum > 0) {
			
			if (cervejaNum ==1) {
				palavra = "garrafa"; //Está no singular propositalmente.
			}
		
			System.out.println(cervejaNum + " " + palavra + " de cerveja na parede");
			System.out.println(cervejaNum + " " + palavra + " de cerveja.");
			System.out.println("Derruba uma garrafa no chão.");
			System.out.println("Faça uma rodada");
			cervejaNum = cervejaNum - 1;
			
			if (cervejaNum > 0) {
				System.out.println(cervejaNum + " " + palavra + " de cerveja na parede.");
			} else {
				System.out.println("Não mais garrafas de cerveja na parede");
			} // Fim do else
			
		} // Fim do loop while
	} // Fim do método main
} // Fim da classe