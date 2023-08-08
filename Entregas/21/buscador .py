import random
import time

def busca_sequencial(array, valor):
    for i, num in enumerate(array):
        if num == valor:
            return i
    return -1

N = 10
array = [random.randint(1, 100) for _ in range(N)]
K = random.randint(1, 100)

print("Array:", array)
print("Valor K:", K)

inicio = time.time()
indice = busca_sequencial(array, K)
fim = time.time()

if indice != -1:
    print(f"Valor {K} encontrado no índice {indice}.")
else:
    print(f"Valor {K} não encontrado no array.")

tempo_execucao = fim - inicio
print(f"Tempo de execução da busca: {tempo_execucao:.6f} segundos")