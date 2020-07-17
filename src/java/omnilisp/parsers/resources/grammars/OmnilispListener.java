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
	 * Enter a parse tree produced by {@link OmnilispParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(OmnilispParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnilispParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(OmnilispParser.NumberContext ctx);
}