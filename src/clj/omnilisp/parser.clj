(ns omnilisp.parser
  (:import [omnilisp.parsers
            OmnilispBaseVisitor
            OmnilispLexer OmnilispParser]
           [org.antlr.v4.runtime
            ANTLRInputStream CommonTokenStream]
           [org.antlr.v4.runtime.tree
            ParseTree ParseTreeWalker]))

(def state (atom []))

(def state-2 (atom []))

(gen-class
 :impl-ns omnilisp.parser
 :name omnilisp.Eval
 :extends  omnilisp.parsers.OmnilispParser
 :prefix "eval-")

(defn eval-enterImportDeclaration [ ctx]
  (swap! state conj ctx))


(defn eval-exitImportDeclaration [ ctx]
  (swap! state-2 conj ctx))

#_(defn omni-parse [source]
    "Parse 'source using the Java parser."
    (let [visitor
          input (ANTLRInputStream. source)
          lexer (JavaLexer. input)
          tokens (CommonTokenStream. lexer)
          parser (JavaParser. tokens)
          tree (.compilationUnit parser)]
      (.visit (make-visitor) tree)))

#_(import omnilisp EvalVisitor)
;; (defn parse-onminlisp [source]
;;  "Parse 'source using the Omnilispt parser."
;;  (let [input (ANTLRInputStream. source)
;;        lexer (OmnilisptLexer. input)
;;        tokens (CommonTokenStream. lexer)
;;        parser (OmnilisptParser. tokens)
;;        tree (.compilationUnit parser)]
;;    (.visit (make-visitor) tree)))
;;
;;
;;

;; #_(defn interop-compare
;;     ([this a b c d e f
;;        (.superCompare this a b c d e f)])
;;     ([this ^WritableComparable w1 ^WritableComparable w2
;;        (.compareTo (.getSymbol ^SymbolPair w1)
;;                    (.getSymbol ^SymbolPair w2))]))
;;
;; (gen-class  :extends java.io.StringReader
;;             :exposes-methods {read readSuper})
;;
;; (defn -read
;;   ([this] (. this readSuper))
;;   ([this cbuf off len] 456))
;;

;; public class EvalVisitor extends ExpressionsBaseVisitor<Integer> {
;;
;;   @Override
;;   public Integer visitOpExpr(@NotNull ExpressionsParser.OpExprContext ctx) {
;;                                                                             int left = visit(ctx.left);
;;                                                                             int right = visit(ctx.right);
;;                                                                             String op = ctx.op.getText();
;;                                                                             switch (op.charAt(0)) {
;;                                                                                                    case '*': return left * right;
;;                                                                                                    case '/': return left / right;
;;                                                                                                    case '+': return left + right;
;;                                                                                                    case '-': return left - right;
;;                                                                                                    default: throw new IllegalArgumentException("Unknown operator " + op)}};
;;
;;
;;
;;   @Override
;;   public Integer visitStart(@NotNull ExpressionsParser.StartContext ctx) {
;;                                                                           return this.visit(ctx.expr())};
;;
;;
;;   @Override
;;   public Integer visitAtomExpr(@NotNull ExpressionsParser.AtomExprContext ctx) {
;;                                                                                 return Integer.valueOf(ctx.getText())};
;;
;;
;;   @Override
;;   public Integer visitParenExpr(@NotNull ExpressionsParser.ParenExprContext ctx) {
;;                                                                                   return this.visit(ctx.expr())};
;;
;;
;;   public static void main(String[] args) {
;;                                           String expression = "2 * (3 + 4)";
;;                                           ExpressionsLexer lexer = new ExpressionsLexer(new ANTLRInputStream(expression));
;;                                           ExpressionsParser parser = new ExpressionsParser(new CommonTokenStream(lexer));
;;                                           ParseTree tree = parser.start();
;;                                           Integer answer = new EvalVisitor().visit(tree);
;;                                           System.out.printf("%s = %s\n", expression, answer)}};
;;
;;



;;  grammar Expressions);
;;
;; start : expr ;
;;
;; expr  : left=expr op=('*'|'/') right=expr #opExpr
;;       | left=expr op=('+'|'-') right=expr #opExpr
;;       | atom=INT #atomExpr
;;       ;
;;
;; INT   : ('0'..'9')+ ;
;;
;; WS    : [ \t\r\n]+ -> skip ;


#_(defn- make-visitor []
     (proxy [JavaBaseVisitor] []
       (visitImportDeclaration [ctx]
         ... do something ...
         (.visitChildren this ctx))))


#_(defn parse-java [source]
    "Parse 'source using the Java parser."
    (let [input (ANTLRInputStream. source)
          lexer (JavaLexer. input)
          tokens (CommonTokenStream. lexer)
          parser (JavaParser. tokens)
          tree (.compilationUnit parser)]
      (.visit (make-visitor) tree)))

