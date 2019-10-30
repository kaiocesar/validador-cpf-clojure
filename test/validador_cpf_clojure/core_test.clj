(ns validador-cpf-clojure.core-test
  (:require [clojure.test :refer :all]
            [validador-cpf-clojure.core :refer :all]
            [validador-cpf-clojure.base :as base_validador]))

(deftest a-test
  (testing "CPF inválido com mascara"
    (is (= (base_validador/validar-cpf "321.123.123-22") false)))
    
  (testing "CPF inválido sem mascara"
    (is (= (base_validador/validar-cpf "64318475042") true))))
