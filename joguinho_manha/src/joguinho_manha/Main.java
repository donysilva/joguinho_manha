package joguinho_manha;

	//classes java importadas
	import java.util.Random;
	import java.util.Scanner;
	public class Main {
		public static void main (String[] args) {
			
			//Classe Scanner para digitar na tela do console
			Scanner in = new Scanner (System.in);
			String nome;
			
			//M�todo Randon contagem akeat�ria de 0 a 99
			Random rand = new Random();
			System.out.println("Seja bem vindo ao jogo! Insira seu nome: ");		
					nome = in.nextLine();
					System.out.println("Seja muito bem vindo " + nome);
					System.out.println("Voc� deseja avan�ar em qual dire��o?(w,a,s,d)");	
					
					/*vari�vel para digita��o na tela*/
					String comando=in.nextLine();			
					
					//Se o comando for "w"
					if (comando.equals("w")) {			
						
						/*vc est� indo pra frente o inimigo surgiu*/
							System.out.println("Voc� est� indo para frente");
							System.out.println("um inimigo surgiu, o que deseja fazer(a=atacar, "
									+ "c(correr)");	
							
							/* repete vari�vel para digita��o na tela*/
							comando = in.nextLine();					
							
							//Se o comando for "a" entra rand.nextInt
							if(comando.equals("a")){
								
								// numera��o aleat�ria probabuilidade 75% vit�ria e 75% derrota
								if (rand.nextInt(100) < 75) {
									
									//verdadeiro vit�ria vc ganho o jogo
									System.out.println("Voc� ganhou o jogo");								
								}else {
									
									//falso vc perdeu o jogo
									System.out.println("Voc� perdeu o jogo");
								}													
							}else {
								
								// se o comando for "c"  entra no "else" fim do jogo vc correu
								System.out.println("Voc� correu, "
										+ "o jogo terminou-");
							}		 
					}						
				}
		}
