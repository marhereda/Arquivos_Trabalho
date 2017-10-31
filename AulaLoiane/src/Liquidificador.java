
public class Liquidificador {
	private int  velocidade;
	private int  velocidademaxima;
	private char estado;
	public void setvelocidade( int v){
		velocidade = v;
	}
	public int getvelocidade(){
		return velocidade;
	}
	public void setvelocidademaxima( int vm){
		velocidademaxima = vm;
	}
	public int getvelocidademaxima(){
		return velocidademaxima;
	}
	public void  setdesligar(){
		estado = 'd';
		velocidade = '0';
	}
	public void setligar(){
		estado = 'L';
		velocidade = '1';
	}
	public char getestado(){
		return estado;
	}
}
