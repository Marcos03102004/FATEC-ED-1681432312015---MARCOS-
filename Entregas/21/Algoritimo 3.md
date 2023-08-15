# ALGORITMO 3

```http
Function BuscaBinaria(x){
    esq = 1 
    dir = n
        enquanto esq <= dir faca{
            meio = ((esq + dir) /2) 
            se A[meio] == x entao 
                devolve meio 
            senao se x > A[meio] entao 
                    esq = meio + 1 
                senao 
                    dir = meio - 1 
            }
            14 devolve -1
        }
```

### LINHA 2:
```http
esq = 1
```
Instrução: Inserção de valor

**INSTRUÇÃO 1!!**

### LINHA 3:
```http
dir = n
```
Instrução: Inserção de valor

**INSTRUÇÃO 1!!**

### LINHA 4:
```http
enquanto esq <= dir faca{
```
Instrução: Comparação de Valores

**INSTRUÇÃO 1!!**

### LINHA 5:
```http
meio = ((esq + dir) /2)
```
Instrução: Inserção de Valores e Operação Aritmética Simples (Soma/Divisão)

**INSTRUÇÃO 3!!**

### LINHA 6:
```http
se A[meio] == x entao
```
Instrução: Acesso da Valor de um Array e Comparação de Valores

**INSTRUÇÃO 2!!**

### LINHA 7:
```http
devolve meio
```
Instrução: Retorno de valor

**INSTRUÇÃO 1!!**

### LINHA 8:
```http
senao se x > A[meio] entao
```
Instrução: Acesso da Valor de um Array e Comparação de Valores

**INSTRUÇÃO 2!!**

### LINHA 9:
```http
esq = meio + 1
```
Instrução: Inserção de Valores e Operação Aritmética Simples (Soma)

**INSTRUÇÃO 2!!**

### LINHA 9:
```http
Senao
```
Instrução: Comparação

**INSTRUÇÃO 1!!**

### LINHA 11:
```http
dir = meio - 1
```
Instrução: inserção de Valores e Operação Aritmética Simples (Subtração)

**INSTRUÇÃO 2!!**

### LINHA 13:
```http
14 devolve -1
```
Instrução: Retorno de valor

**INSTRUÇÃO 1!!**

### Total de Instruções:

**Neste caso temos umm total de 17 Instruções, mas no pior caso (dir sendo maior que esq), será o produto de instruções dentro do loop com as de fora do loop, as 14 e o número de interações.**
