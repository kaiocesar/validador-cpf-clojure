(ns validador-cpf-clojure.core-test
  (:require [clojure.test :refer :all]
            [validador-cpf-clojure.core :refer :all]
            [validador-cpf-clojure.base :as base_validador]))

(deftest a-test
  (testing "Testar a validação"
    (is (= (base_validador/validar-cpf "321.123.123-22") "validado"))))
