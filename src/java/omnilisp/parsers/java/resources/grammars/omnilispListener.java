// Generated from resources/grammars/omnilisp.g4 by ANTLR 4.8
package omnilisp.parsers.java;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link omnilispParser}.
 */
public interface omnilispListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link omnilispParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(omnilispParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link omnilispParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(omnilispParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link omnilispParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(omnilispParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link omnilispParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(omnilispParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link omnilispParser#special_form}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_form(omnilispParser.Special_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link omnilispParser#special_form}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_form(omnilispParser.Special_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link omnilispParser#forms}.
	 * @param ctx the parse tree
	 */
	void enterForms(omnilispParser.FormsContext ctx);
	/**
	 * Exit a parse tree produced by {@link omnilispParser#forms}.
	 * @param ctx the parse tree
	 */
	void exitForms(omnilispParser.FormsContext ctx);
	/**
	 * Enter a parse tree produced by {@link omnilispParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(omnilispParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link omnilispParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(omnilispParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link omnilispParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(omnilispParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link omnilispParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(omnilispParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link omnilispParser#nil}.
	 * @param ctx the parse tree
	 */
	void enterNil(omnilispParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by {@link omnilispParser#nil}.
	 * @param ctx the parse tree
	 */
	void exitNil(omnilispParser.NilContext ctx);
	/**
	 * Enter a parse tree produced by {@link omnilispParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(omnilispParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link omnilispParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(omnilispParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link omnilispParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(omnilispParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link omnilispParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(omnilispParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link omnilispParser#hex}.
	 * @param ctx the parse tree
	 */
	void enterHex(omnilispParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by {@link omnilispParser#hex}.
	 * @param ctx the parse tree
	 */
	void exitHex(omnilispParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by {@link omnilispParser#bin}.
	 * @param ctx the parse tree
	 */
	void enterBin(omnilispParser.BinContext ctx);
	/**
	 * Exit a parse tree produced by {@link omnilispParser#bin}.
	 * @param ctx the parse tree
	 */
	void exitBin(omnilispParser.BinContext ctx);
	/**
	 * Enter a parse tree produced by {@link omnilispParser#bign}.
	 * @param ctx the parse tree
	 */
	void enterBign(omnilispParser.BignContext ctx);
	/**
	 * Exit a parse tree produced by {@link omnilispParser#bign}.
	 * @param ctx the parse tree
	 */
	void exitBign(omnilispParser.BignContext ctx);
	/**
	 * Enter a parse tree produced by {@link omnilispParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(omnilispParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link omnilispParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(omnilispParser.NumberContext ctx);
}