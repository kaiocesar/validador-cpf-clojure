(ns validador-cpf-clojure.base)

(defn validar-cpf [cpf]
    (if-not (= (count cpf) 11)
        false
        true))