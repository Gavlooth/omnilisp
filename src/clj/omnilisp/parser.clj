(ns omnilisp.parser
  (:require [clojure.tools.logging :as log]
            [com.rpl.proxy-plus :refer [proxy+]]
            [ clojure.tools.logging :as log])
  (:import [omnilisp.parsers
            OmnilispBaseVisitor
            OmnilispLexer OmnilispParser]
           [org.antlr.v4.runtime
            CharStreams CommonTokenStream]
           [org.antlr.v4.runtime.tree
            ParseTree ParseTreeWalker]))

(def state (atom []))

(defn create-tree [source]
  "Parse 'source using the Java parser."
  (let [input (CharStreams/fromStream  source)
        lexer (OmnilispLexer. input)
        tokens (CommonTokenStream. lexer)
        parser (OmnilispParser. tokens)
        tree   (.forms parser)]
     (zipmap [ :input :lexer :tokens :parser :tree]
             [ input lexer tokens parser tree])))



(defn make-visitor []
  (proxy  [OmnilispBaseVisitor] []
     (visitForms  [ctx]
       (log/info (type ctx))
       (log/info (swap! state conj ctx)))
     (visitForm   [ctx]
       (log/info (swap! state conj ctx))
       (.visitChildren this ctx))
     (visitNumber [ctx]
       (log/info (swap! state conj ctx))
       (.visitChildren this ctx))))
