package compilador;

import java.util.HashMap;
import java.util.Map;

public class Ts {

	private HashMap<String, Token> tabelaSimbolos; // Tabela de simbolos

	public Ts() {
		tabelaSimbolos = new HashMap<String, Token>();

		// Inserindo as palavras reservadas
		Token word;
		word = new Token(Tag.KW_algoritmo, "algoritmo", 0, 0);
		this.tabelaSimbolos.put("algoritmo", word);

		word = new Token(Tag.KW_declare, "declare", 0, 0);
		this.tabelaSimbolos.put("declare", word);

		word = new Token(Tag.KW_inicio, "inicio", 0, 0);
		this.tabelaSimbolos.put("inicio", word);

		word = new Token(Tag.KW_fim, "fim", 0, 0);
		this.tabelaSimbolos.put("fim", word);

		word = new Token(Tag.KW_subrotina, "subrotina", 0, 0);
		this.tabelaSimbolos.put("subrotina", word);

		word = new Token(Tag.KW_retorne, "retorne", 0, 0);
		this.tabelaSimbolos.put("retorne", word);

		word = new Token(Tag.Logico, "logico", 0, 0);
		this.tabelaSimbolos.put("logico", word);

		word = new Token(Tag.Numerico, "numerico", 0, 0);
		this.tabelaSimbolos.put("numerico", word);

		word = new Token(Tag.Literal, "literal", 0, 0);
		this.tabelaSimbolos.put("literal", word);

		word = new Token(Tag.Nulo, "nulo", 0, 0);
		this.tabelaSimbolos.put("nulo", word);

		word = new Token(Tag.KW_se, "se", 0, 0);
		this.tabelaSimbolos.put("se", word);

		word = new Token(Tag.KW_senao, "senao", 0, 0);
		this.tabelaSimbolos.put("senao", word);

		word = new Token(Tag.KW_enquanto, "enquanto", 0, 0);
		this.tabelaSimbolos.put("enquanto", word);

		word = new Token(Tag.KW_para, "para", 0, 0);
		this.tabelaSimbolos.put("para", word);

		word = new Token(Tag.KW_ate, "ate", 0, 0);
		this.tabelaSimbolos.put("ate", word);

		word = new Token(Tag.KW_faca, "faca", 0, 0);
		this.tabelaSimbolos.put("faca", word);

		word = new Token(Tag.KW_repita, "repita", 0, 0);
		this.tabelaSimbolos.put("repita", word);

		word = new Token(Tag.KW_escreva, "escreva", 0, 0);
		this.tabelaSimbolos.put("escreva", word);

		word = new Token(Tag.KW_leia, "leia", 0, 0);
		this.tabelaSimbolos.put("leia", word);

		word = new Token(Tag.KW_verdadeiro, "verdadeiro", 0, 0);
		this.tabelaSimbolos.put("verdadeiro", word);

		word = new Token(Tag.KW_falso, "falso", 0, 0);
		this.tabelaSimbolos.put("falso", word);

		word = new Token(Tag.KW_ou, "ou", 0, 0);
		this.tabelaSimbolos.put("ou", word);

		word = new Token(Tag.KW_e, "e", 0, 0);
		this.tabelaSimbolos.put("e", word);

		word = new Token(Tag.KW_nao, "nao", 0, 0);
		this.tabelaSimbolos.put("nao", word);

	}

	public void put(String i, Token w) {
		tabelaSimbolos.put(i, w);
	}

	public Token retornaToken(String lexema) {
		Token token = tabelaSimbolos.get(lexema);
		return token;
	}
	
	 @Override
	    public String toString() {
	        String saida = "";
	        int i = 1;
	        for(Map.Entry<String, Token> entry : tabelaSimbolos.entrySet()) {
	            saida += ("posicao " + i + ": \t" + entry.getValue().toString()) + "\n";
	            i++;
	        }
	        return saida;
	    }

}