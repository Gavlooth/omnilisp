(ns user
    (:require
     [clojure.tools.namespace.repl  :as tn]
     [clojure.tools.logging :as log]
     #_[clojure.core.async :as async]
     [clojure.pprint :refer [cl-format]]
     [omnilisp.parser :as op]
     #_[state :refer [system]])
  (:import (java.io ByteArrayInputStream)
           (org.antlr.v4.runtime.tree ParseTreeWalker)))
(def form-test
  "
  (define foo 3)

  (define bar (+ foo 4))

  (println bar)")

(def a-stream (ByteArrayInputStream. (.getBytes form-test)))

(def a-parser (op/create-tree a-stream))

(def a-visitor (op/make-visitor))
#_(.visitForm a-visitor (:tree a-parser))
#_(map :name (:members (clojure.reflect/reflect (second a-parser))))
#_(map :name (:members (clojure.reflect/reflect  Eval)))

(defn go []
   (tn/refresh))


