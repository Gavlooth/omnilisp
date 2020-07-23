// Generated from src/main/antlr4/omnilisp/Omnilisp.g4 by ANTLR 4.8
package omnilisp.grammar;
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
	 * Visit a parse tree produced by {@link OmnilispParser#forms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForms(OmnilispParser.FormsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnilispParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(OmnilispParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnilispParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(OmnilispParser.NumberContext ctx);
}