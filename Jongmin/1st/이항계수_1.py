from math import factorial

N,K = map(int, input().split())

print(int(factorial(N)/factorial(N-K)/factorial(K)))
