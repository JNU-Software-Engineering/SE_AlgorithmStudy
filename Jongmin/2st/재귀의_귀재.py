def recursion(s, l, r, cnt=0):
    if l >= r: return 1, cnt+1
    elif s[l] != s[r]: return 0, cnt+1
    else: return recursion(s, l+1, r-1, cnt+1)

def isPalindrome(s):
    return recursion(s, 0, len(s)-1)

T = int(input())
list = []
for i in range(T):
    list.append(isPalindrome(str(input())))

for i,j in list:
    print(i, j)

    

