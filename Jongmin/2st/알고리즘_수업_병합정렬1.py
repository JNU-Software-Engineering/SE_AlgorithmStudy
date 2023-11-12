import random
def merge_sort(data, p, r, empty):
  if p<r:
    middle = (p+r) // 2

    # 왼쪽 분할
    merge_sort(data ,p ,middle, empty)
    #print(f"start = {p} , end = {middle}")

    # 오른쪽 분할
    merge_sort(data, middle + 1, r, empty)
    #print(f"start = {middle+1} , end = {r}")

    #병합 과정
    merge(data, p, r, middle, empty)


# 병합 함수
def merge(data, p, r, middle, empty):

  i = p
  j = middle + 1

  tmp = []

  while(i <= middle and j <= r):
    if(data[i]<=data[j]):
      tmp.append(data[i])
      i+=1
    else:
      tmp.append(data[j])
      j+=1
  
  # 왼쪽 배열 부분이 남은 경우
  # 배열을 2로 계속 나누는데 길이가 같게 나눠질 수는 없으므로
  # 어느 한 쪽은 1개 이상으로 남을 수 있다.
  # 분할된 배열을 내부에서 정렬된 상태이므로 데이터만 추가해준다.
  while i<=middle:
    tmp.append(data[i])
    i+=1

  # 오른쪽 배열 부분이 남은 경우
  while j<=r:
    tmp.append(data[j])
    j+=1

  i = p
  k = 0

  while i<=r:
    data[i] = tmp[k]
    empty.append(tmp[k])
    k+=1
    i+=1
##################################################

N, K = map(int, input().split())
_list = list(map(int, input().split()))
empty = []

merge_sort(_list,0,len(_list)-1, empty)
#print(_list)

try:
  print(empty[K-1])
except:
  print(-1)