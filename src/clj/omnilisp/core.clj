(ns omnilisp.core
  (:require [omnilisp.parser])
  (:import [omnilisp Eval]))



;; (defn parse-onminlisp [source]
;;  "Parse 'source using the Omnilispt parser."
;;  (let [input (ANTLRInputStream. source)
;;        lexer (OmnilisptLexer. input)
;;        tokens (CommonTokenStream. lexer)
;;        parser (OmnilisptParser. tokens)
;;        tree (.compilationUnit parser)]
;;    (.visit (make-visitor) tree)))
;;

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

