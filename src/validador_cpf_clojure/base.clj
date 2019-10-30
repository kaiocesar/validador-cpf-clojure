(ns validador-cpf-clojure.base)


(defn str-to-int [string]
    (map (fn [n] (Integer/parseInt n)) (re-seq #"\d" string)) )

(defn calculo-dv [cpf val_start val_end]
    (map * (range val_start val_end -1) (str-to-int cpf)) )

(defn validar-cpf [cpf]
    (if-not (= (count cpf) 11)
        false
        (Math/ceil (/ (* (reduce + (calculo-dv cpf 10 1)) 10) 11)) ))