import java.util.Scanner;

public class sites {
    public static void main (String args []) {
    	Scanner input = new Scanner(System.in);
    	Liquidificador liq = new Liquidificador();
    	liq.setdesligar();
    	liq.setvelocidademaxima(5);
    	liq.setvelocidade(0);
    	System.out.println(" Selecione um op�ao: ");
    	System.out.println(" =================== ");
    	System.out.println(" 1-Ligar ");
    	System.out.println(" 2-Desligar ");
    	System.out.println(" 3-Mostra Estado ");
    	System.out.println(" 4-Trocar Velocidade ");
    	System.out.println(" 5-Atribuir Velocidade Maxima ");
    	System.out.println(" 6-Fim ");
    	int escolha = input.nextInt();input.nextLine();
    	switch(escolha){
    		case 1:
    			if (liq.getestado() == 'd'){
    				liq.setligar();
    				System.out.println(" Liquidificador acaba de entrar em funcionamento ");
    			}else{
    				System.out.println(" ERRO: Liquidificador ja em funcionamento ");
    			}
    			break;
    		case 2:
    			if (liq.getestado() == 'L'){
    				liq.setdesligar();
    				System.out.println(" Liquidificador acaba de ser desligado ");
    			}else{
    				System.out.println(" Erro: Liquidificador ja esta desligado ");
    			}
    			break;
    		case 3:
    			System.out.println(" A velocidade atual do liquidificador �: " + liq.getvelocidade());
    			System.out.println("");
    			System.out.println(" A velocidade maxima do liquidificador �: " + liq.getvelocidademaxima());
    			System.out.println("");
    			System.out.println(" O estado atual do liquidificador �: " + liq.getestado());
    			break;
    		case 4:
    			System.out.println(" Por favor informe uma velocidade positiva maior que zero e no maximo " + liq.getvelocidademaxima());
    			 int vel = input.nextInt();input.nextLine();
    			 liq.setvelocidade(vel);
    			 if (liq.getvelocidade() <= 0  ){
    			 	System.out.println(" ERRO: Informe um numero positivo maior que 0 ");
    			 }else if (liq.getvelocidade() > liq.getvelocidademaxima() ){
    			 	System.out.println(" Erro: informe uma velocidade menor do que 5 ");
    			 }else
    			 	System.out.println(" Liquidificador operando com a nova velocidade: " + liq.getvelocidade());
    			break; 	    			
    		case 5:
    			System.out.println(" Digite uma nova velocidade maxima ! ");
    			System.out.println("");
    			System.out.println(" Que seja maior que zero e positivo. ");
    			int velm = input.nextInt();input.nextLine();
    			liq.setvelocidademaxima(velm);
    			if(liq.getvelocidademaxima() <= 0){
    				System.out.println(" ERRO: Informe um numero positivo maior que 0 ");
    			}else if (liq.getvelocidademaxima() < liq.getvelocidade()){
    				System.out.println(" ERRO: Informe uma velocidade maior que a atual que esta em: " + liq.getvelocidade());
    			}else
    				System.out.println(" Nova velocidade maxima atribuida no liquidificador no valor de: " + liq.getvelocidademaxima());
    			break;				 	
    		case 9:
    			System.out.println (" Obrigado ");
    			break;
    		}
    	} 
    }