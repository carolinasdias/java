package aula_10;

import java.util.Optional;

public class ExeOptional {

	public static void main(String[] args) {
		
		String[] palavras = new String[10];
		String palavra = "";
		
		
		for (var p : palavras) {
			System.out.println(p);
		}
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		
		if(checaNulo.isPresent()) {
			palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		}else
			System.out.println("A palavra é nula!");
		
		
		
		System.out.println(palavra);

		}
		
	}


