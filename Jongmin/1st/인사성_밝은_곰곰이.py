import sys

N = int(sys.stdin.readline())
chat = []
tmp = []
cnt = 0

for _ in range(N):
  msg = sys.stdin.readline().rstrip()

  if msg=="ENTER":
    chat.append(tmp)
    tmp=[]
  else:
    tmp.append(msg)
chat.append(tmp)

for i in chat:
  cnt += len(list(set(i)))

print(cnt)