// Generated from src/grammars/omnilisp.g4 by ANTLR 4.8
package omnilisp.parsers.java;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link omnilispParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface omnilispVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link omnilispParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(omnilispParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link omnilispParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(omnilispParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by {@link omnilispParser#forms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForms(omnilispParser.FormsContext ctx);
	/**
	 * Visit a parse tree produced by {@link omnilispParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(omnilispParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link omnilispParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(omnilispParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link omnilispParser#nil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(omnilispParser.NilContext ctx);
	/**
	 * Visit a parse tree produced by {@link omnilispParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(omnilispParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link omnilispParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(omnilispParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link omnilispParser#hex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(omnilispParser.HexContext ctx);
	/**
	 * Visit a parse tree produced by {@link omnilispParser#bin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin(omnilispParser.BinContext ctx);
	/**
	 * Visit a parse tree produced by {@link omnilispParser#bign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBign(omnilispParser.BignContext ctx);
	/**
	 * Visit a parse tree produced by {@link omnilispParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(omnilispParser.NumberContext ctx);
}