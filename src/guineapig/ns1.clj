(ns guineapig.ns1
  (:require
          )
  (:use clojure.repl
        clojure.pprint)
  )

(def x-var (def x "x"))
(def x-var-2 (var x))
(def x-var-3 #'x)

(assert (= x-var x-var-2 x-var-3))
(assert (= (class x-var) clojure.lang.Var))


(def x2-var (def x2 "x"))

(assert (and (= x x2)
             (not= x2-var x-var)))


(def y-var (defn y [] "y"))

(def var-map (hash-map 
               x-var "the nickname of Polytechnique."
               x-var-2 "overriding x-var"
               x-var-3 "some string value.",
               
               x2-var "a clone of x",
               y-var "Some function")
  )
(assert (= (-> var-map keys set) #{x-var, x2-var, y-var}))

