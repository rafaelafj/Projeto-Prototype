
public class PrototypeTeste {

	 public static void main(String args[]) throws CloneNotSupportedException {
		  
	      System.out.println("***Exemplo do padr�o Prototype***\n");
	      Carro chevrolet = new Chevrolet("Cruze Sport v6");
	      chevrolet.preco = 100000;
	      Carro ford = new Ford("Focus 2.0");
	      ford.preco=500000;
	  
	      Carro bc1;
	      //Clone do Objeto Chevrolet
	      bc1 = chevrolet.clone();
	  
	      //Configurando pre�o que ser� maior que 100000
	      bc1.preco = chevrolet.preco + Carro.setPreco();
	      System.out.println("Nome do Carro: "+ bc1.getNomeModelo() + ", Pre�o do Carro: " + bc1.preco);
	  
	      //Clone do Objeto Ford
	      bc1 = ford.clone();
	  
	      //Configurando pre�o que ser� maior que 500000
	      bc1.preco = ford.preco + Carro.setPreco();
	      System.out.println("Nome do Carro: "+ bc1.getNomeModelo() + ", Pre�o do Carro: "+bc1.preco);
	  
	   }

}


