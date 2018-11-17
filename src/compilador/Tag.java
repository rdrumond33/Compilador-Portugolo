package compilador;

/**
 * Tag
 */
public enum Tag {

	// fim de arquivo
	EOF,

	// Operadores
	RELOP_LT, // <
	RELOP_LE, // <=
	RELOP_GT, // >
	RELOP_GE, // >=
	RELOP_LT_GT, // <>
	RELOP_EQ, // =
	RELOP_PLUS, // +
	RELOP_MINUS, // -
	RELOP_MULT, // *
	RELOP_DIV, // /
	RELOP_NQ, // !=
	RELOP_ARTIB, // <--

	// Simbolos
	SMB_OP, // (
	SMB_CP, // )
	SMB_SEMICOLON, // ,
	SMB_PontoVirgula, // ;

	// identificador
	ID,

	// numeros
	Numerico,

	// strings
	Literal,
	// Logico
	Logico,
	// Nulo
	Nulo,

	// palavra reservada
	KW_algoritmo, KW_declare, KW_inicio, KW_fim, KW_subrotina, KW_retorne, KW_se, KW_senao, KW_enquanto, KW_para,
	KW_ate, KW_faca, KW_repita, KW_escreva, KW_leia, KW_verdadeiro, KW_falso, KW_ou, KW_e, KW_nao;
}