(ns guineapig.ns2
  (:require [guineapig.ns1 :as ns1 :refer [y]])
  (:use clojure.repl
        clojure.pprint)
  )

(def foreign-x-var (var ns1/x))
(assert (= foreign-x-var ns1/x-var))

(def referred-y-var (var y))
(assert (= referred-y-var ns1/y-var))

(def local-x-var (def x "x"))
(assert (not= local-x-var foreign-x-var))

