// Generated from resources/grammars/Omnilisp.g4 by ANTLR 4.8
package Omnilisp.parsers;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OmnilispParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OmnilispVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OmnilispParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(OmnilispParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnilispParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(OmnilispParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnilispParser#special_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_form(OmnilispParser.Special_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnilispParser#forms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForms(OmnilispParser.FormsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnilispParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(OmnilispParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnilispParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(OmnilispParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnilispParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(OmnilispParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnilispParser#nil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(OmnilispParser.NilContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnilispParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(OmnilispParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnilispParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(OmnilispParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnilispParser#bin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin(OmnilispParser.BinContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnilispParser#bign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBign(OmnilispParser.BignContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnilispParser#hex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(OmnilispParser.HexContext ctx);
}