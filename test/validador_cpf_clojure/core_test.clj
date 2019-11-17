(ns validador-cpf-clojure.core-test
  (:require [clojure.test :refer :all]
            [validador-cpf-clojure.core :refer :all]
            [validador-cpf-clojure.base :refer :all]))

(deftest a-test
  (testing "CPF inválido com mascara"
    (is (= (validar-cpf "321.123.123-22") false)))

  (testing "CPF válido e sem mascara"
    (is (= (validar-cpf "64318475042") true)))

  (testing "CPF zerado"
    (is (= (validar-cpf "00000000000") false)))  
    
  (testing "CPF 111.111.111-11 inválido conhecido"
    (is (= (validar-cpf "11111111111") false)))
    
  (testing "CPF 222.222.222-22 inválido conhecido"
    (is (= (validar-cpf "22222222222") false)))
    
  (testing "CPF 333.333.333-33 inválido conhecido"
    (is (= (validar-cpf "33333333333") false)))
    
  (testing "CPF 444.444.444-44 inválido conhecido"
    (is (= (validar-cpf "44444444444") false)))

  (testing "CPF 555.555.555-55 inválido conhecido"
    (is (= (validar-cpf "55555555555") false)))

  (testing "CPF 666.666.666-66 inválido conhecido"
    (is (= (validar-cpf "66666666666") false)))

  (testing "CPF 777.777.777-77 inválido conhecido"
    (is (= (validar-cpf "77777777777") false)))

  (testing "CPF 888.888.888-88 inválido conhecido"
    (is (= (validar-cpf "88888888888") false)))

  (testing "CPF 999.999.999-99 inválido conhecido"
    (is (= (validar-cpf "99999999999") false))))

