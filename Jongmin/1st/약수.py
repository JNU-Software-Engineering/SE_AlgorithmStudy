N = int(input())
devisors = list(map(int, input().split()))

devisors.sort()
print(devisors[0]*devisors[-1])