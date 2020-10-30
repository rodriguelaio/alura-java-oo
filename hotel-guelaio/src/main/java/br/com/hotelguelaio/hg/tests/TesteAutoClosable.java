package br.com.hotelguelaio.hg.tests;

//Ao implementar a interface AUTOCLOSABLE eu crio uma classe que fecha automaticamrnte
//caso surja um erro e toda instrucao implementada no metodo CLOSE será executada
//como seria num bloco FINALLY
public class TesteAutoClosable implements AutoCloseable {


	//Esse metodo serve para eu escrever o que orifinalmente iria no
	//bloco FINALLY do meu bloco TRY/CATCH
	@Override
	public void close() /*throws Exception */{ //Não necessariamente preciso jogar
		System.out.println("wow"); //uma exceção no metodo close(). Basta somente implementa-lo.
	}
}


//Para referenciar essa classe, deve seguir a seguinte sintaxe:
//try (TesteAutoClosable testeAutoClosable = new TesteAutoClosable()){ }