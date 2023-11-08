import sys, math

N = int(sys.stdin.readline())

data = []
answer = []
cnt = {}

for _ in range(N):
  tmp = int(sys.stdin.readline())
  data.append(tmp)

  if tmp in cnt:
    cnt[tmp] += 1
  else:
    cnt[tmp] = 1

#print(cnt)
  
mean = sum(data) / len(data)
middle = sorted(data)[len(data)//2]
frequence = []

# 최빈값 찾기 #############
# 딕셔너리 이용 ###########
m = max(cnt.values())

for i in cnt.keys():
  if cnt[i] == m:
    frequence.append(i)

frequence.sort(reverse=True)
if len(frequence) > 1:
  frequence.pop()
###########################

# 평균을 구할 때, 반올림 함수가 없으니
# 천장 함수와 바닥 함수를 이용
# 양수일 경우에 0.5를 더해서 바닥함수 적용 
# ex) 1.8+0.5 = 2.3 -> 2, 하지만 1.3 + 0.5 = 1.8 -> 1
# 음수일 경우에 0.5를 빼서 천장함수 적용 
# ex) -2.7 - 0.5 = -3.2-> -3 하지만 -2.1 - 0.5 = -2.6 -> -2

answer.append(math.floor(mean+0.5) if mean > 0 else math.ceil(mean-0.5))
answer.append(middle)
answer.append(frequence[-1])
answer.append(max(data)-min(data))

for i in answer:
  print(i)

