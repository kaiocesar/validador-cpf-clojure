(ns validador-cpf-clojure.core
  (:gen-class)
  (:require [validador-cpf-clojure.base :as base_validador] ))

(defn -main
  "Validador de CPF"
  [& args]
  (println (base_validador/validar-cpf "123123123")))
