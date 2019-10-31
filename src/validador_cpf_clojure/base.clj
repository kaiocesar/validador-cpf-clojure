(ns validador-cpf-clojure.base)

(defn str-to-int [string]
    (map (fn [n] (Integer/parseInt n)) (re-seq #"\d" string)) )

(defn calculo-dv [cpf val_start val_end]
    (map * (range val_start val_end -1) (str-to-int cpf)) )

(defn validar-cpf [cpf]
    (if-not (= (count cpf) 11)
        false
        (let [dv1 (mod (* (reduce + (calculo-dv cpf 10 1)) 10) 11)
              dv2 (mod (* (reduce + (calculo-dv cpf 11 1)) 10) 11)]
            (if (and (= dv1 (Character/digit (get cpf 9) 10))
                     (= dv2 (Character/digit (get cpf 10) 10)))
                true
                false))))