// Generated from resources/grammars/Omnilisp.g4 by ANTLR 4.8
package Omnilisp.parsers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OmnilispParser}.
 */
public interface OmnilispListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OmnilispParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(OmnilispParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnilispParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(OmnilispParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnilispParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(OmnilispParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnilispParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(OmnilispParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnilispParser#special_form}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_form(OmnilispParser.Special_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnilispParser#special_form}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_form(OmnilispParser.Special_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnilispParser#forms}.
	 * @param ctx the parse tree
	 */
	void enterForms(OmnilispParser.FormsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnilispParser#forms}.
	 * @param ctx the parse tree
	 */
	void exitForms(OmnilispParser.FormsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnilispParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(OmnilispParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnilispParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(OmnilispParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnilispParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(OmnilispParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnilispParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(OmnilispParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnilispParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(OmnilispParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnilispParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(OmnilispParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnilispParser#nil}.
	 * @param ctx the parse tree
	 */
	void enterNil(OmnilispParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnilispParser#nil}.
	 * @param ctx the parse tree
	 */
	void exitNil(OmnilispParser.NilContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnilispParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(OmnilispParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnilispParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(OmnilispParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnilispParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(OmnilispParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnilispParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(OmnilispParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnilispParser#bin}.
	 * @param ctx the parse tree
	 */
	void enterBin(OmnilispParser.BinContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnilispParser#bin}.
	 * @param ctx the parse tree
	 */
	void exitBin(OmnilispParser.BinContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnilispParser#bign}.
	 * @param ctx the parse tree
	 */
	void enterBign(OmnilispParser.BignContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnilispParser#bign}.
	 * @param ctx the parse tree
	 */
	void exitBign(OmnilispParser.BignContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnilispParser#hex}.
	 * @param ctx the parse tree
	 */
	void enterHex(OmnilispParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnilispParser#hex}.
	 * @param ctx the parse tree
	 */
	void exitHex(OmnilispParser.HexContext ctx);
}