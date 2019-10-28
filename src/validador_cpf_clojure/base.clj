(ns validador-cpf-clojure.base)

(defn validar-cpf [cpf]
    (if-not (= (count cpf) 11)
        false
        (reduce + (map read-string (re-seq #"\d" cpf))) ))

; posso tentar utilizar zipmap pra mesclar as listas e reduzir-la afim de utilizar chave e valor como operação    