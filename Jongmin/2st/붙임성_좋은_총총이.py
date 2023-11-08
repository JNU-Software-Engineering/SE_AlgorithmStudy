import sys

N = int(sys.stdin.readline().rstrip())
danced = set()
danced.add("ChongChong")

for _ in range(N):
  person1,person2 = sys.stdin.readline().rstrip().split()

  if (person1 in danced and person2 not in danced) or person1=="ChongChong":
    danced.add(person2)
  elif (person2 in danced and person1 not in danced) or person2=="ChongChong":
    danced.add(person1)

print(len(danced))