package compilador;

public class Portugolo {

	public static void main(String[] args) {

		Lexema lexer = new Lexema("portugolo\\primeiro_portugolo.ptgl"); // diretorio

		Parser parser = new Parser(lexer);
		parser.Compilador();
		parser.fechaArquivo();

		lexer.printTS();

		System.out.println("			Compilação realizada do Portugolo			");
	}

}
