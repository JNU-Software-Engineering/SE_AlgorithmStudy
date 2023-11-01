from math import factorial

T = int(input())
result = []

for i in range(T):
    N,M = map(int,input().split())
    answer = 0 if N==0 else int(factorial(M)//factorial(M-N)//factorial(N))
    print(answer)

