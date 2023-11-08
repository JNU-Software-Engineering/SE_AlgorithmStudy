# 단어 빈도수 높을 수록 앞
# 길이 길 수록 앞
# 사전 순으로 앞

# 문자열 정렬은, sort(), sorted()의 key attribute를 이용하자.

import sys
N,M = map(int,sys.stdin.readline().split())

words = []
dict_ = {}

for _ in range(N):
  word = sys.stdin.readline().rstrip()

  # 단어 길이가 M보다 작으면 pass
  if len(word)<M:
    continue

  if word in dict_:
    dict_[word] += 1
  else:
    dict_[word] = 1

  words.append(word)



answer = sorted(sorted(list(set(words))), reverse=True, key=lambda x : (dict_[x], len(x)))
"""
sorted(list(set(words)), reverse=True, key=lambda x : (words.count(x), len(x), x))
로 작성하면 마지막 조건 x에서 문자열의 아스키 코드 값을 기준으로 내림차순 정렬을 하므로
사전 순과 맞지 않다.
"""
for i in answer:
  sys.stdout.write(i+"\n")