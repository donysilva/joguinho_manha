package joguinho_manha;

	//classes java importadas
	import java.util.Random;
	import java.util.Scanner;
	public class Main {
		public static void main (String[] args) {
			
			//Classe Scanner para digitar na tela do console
			Scanner in = new Scanner (System.in);
			String nome;
			
			//Método Randon contagem akeatória de 0 a 99
			Random rand = new Random();
			System.out.println("Seja bem vindo ao jogo! Insira seu nome: ");		
					nome = in.nextLine();
					System.out.println("Seja muito bem vindo " + nome);
					System.out.println("Você deseja avançar em qual direção?(w,a,s,d)");	
					
					/*variável para digitação na tela*/
					String comando=in.nextLine();			
					
					//Se o comando for "w"
					if (comando.equals("w")) {			
						
						/*vc está indo pra frente o inimigo surgiu*/
							System.out.println("Você está indo para frente");
							System.out.println("um inimigo surgiu, o que deseja fazer(a=atacar, "
									+ "c(correr)");	
							
							/* repete variável para digitação na tela*/
							comando = in.nextLine();					
							
							//Se o comando for "a" entra rand.nextInt
							if(comando.equals("a")){
								
								// numeração aleatória probabuilidade 75% vitória e 75% derrota
								if (rand.nextInt(100) < 75) {
									
									//verdadeiro vitória vc ganho o jogo
									System.out.println("Você ganhou o jogo");								
								}else {
									
									//falso vc perdeu o jogo
									System.out.println("Você perdeu o jogo");
								}													
							}else {
								
								// se o comando for "c"  entra no "else" fim do jogo vc correu
								System.out.println("Você correu, "
										+ "o jogo terminou-");
							}		 
					}						
				}
		}
