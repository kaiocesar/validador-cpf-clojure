# Introduction to validador-cpf-clojure

#### composição do cpf

- o cpf é formado por 11 números
- possui uma mascara ###.###.###-## (4 grupos de numeros separados por ponto e hifen)
- a validação acontece com a verificação dos 9 primeiros grupos, ou seja, os 3 primeiros grupos
- o calculo de verificação dos 9 primeiros números resulta nos 2 ultimos números
- sequencias de numeros repetidos são considerados "CPF invalidos conhecidos", por exemplo 111.111.111-11 ... 999.999.999-99

#### regra da validação

considerando o CPF `529.982.247-25` como exemplo!

- os primeiros 9 números serão utilizados para calcular o primeiro digito verificador, logo `529.982.247`

- os primeiros 10 números serão utilizados para calcular o segundo digito verificador, logo `529.982.247-2`

- o calculo do primeiro digito verificador será resultado pela soma da multiplicação de cada número pela ordem decrescente de `10 a 2` logo o calculo será `5 * 10 + 2 * 9 + 9 * 8 + 9 * 7 + 8 * 6 + 2 * 5 + 2 * 4 + 4 * 3 + 7 * 2`

- o resultado do primeiro digito verificado será multiplicado por 10 e divido por 11

- se o resultado do primeiro digito verificador for igual ao 10° número da sequencia dada, logo pode-se prosseguir para o calculo do segundo digito verificador, caso contrário o cpf é inválido.

- o calculo do segundo digito verificador funciona igual ao primeiro, porém a sequencia decrescente se dá por `11 a 2` logo o calculo será `5 * 11 + 2 * 10 + 9 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 2 * 5 + 4 * 4 + 7 * 3 + 2 * 2`

- o resultado do calculo do 2° DV será multiplicado por 10 e dividido por 11 da mesma forma que o 1° DV