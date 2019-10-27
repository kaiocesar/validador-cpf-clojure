# Introduction to validador-cpf-clojure

composição do cpf

- o cpf é formado por 11 números
- possui uma mascara ###.###.###-## (4 grupos de numeros separados por ponto e hifen)
- a validação acontece com a verificação dos 9 primeiros grupos, ou seja, os 3 primeiros grupos
- o calculo de verificação dos 9 primeiros números resulta nos 2 ultimos números
- sequencias de numeros repetidos são considerados "CPF invalidos conhecidos", por exemplo 111.111.111-11 ... 999.999.999-99