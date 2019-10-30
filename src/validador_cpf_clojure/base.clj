(ns validador-cpf-clojure.base)


(defn convert-cpf-to-int [cpf]
    (map (fn [x] (Integer/parseInt x)) (re-seq #"\d" cpf)) )

(defn calculo-dv-1 [cpf]
    (map * (range 10 1 -1) (convert-cpf-to-int cpf)) )

(defn validar-cpf [cpf]
    (if-not (= (count cpf) 11)
        false
        (calculo-dv-1 cpf) ))