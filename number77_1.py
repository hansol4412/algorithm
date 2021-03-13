#77. 친구인가
'''
현수네 반 학생은 N명이고, 모든 학생은 1부터 N까지 번호가 부여되어 있다. 
현수에게는 각각 두 명의 학생의 친구관꼐가 번호로 표현된 숫자쌍이 주어진다. 
 만약 (1,2) (2,3) (3,4)의 숫자 쌍이 주어지면 1번 학생과2번 학생이 친구이고, 2번 학생와 3번 학생이
친구이고, 3번 학생과 4번학생이 친구이다. 이는 연결되어 1번 학생과 4번 학생이 친구가 될 수 있다
학생의 친구관계를 나타내는 숫자 쌍이 주어지면 득정 두 명이 친구인지 판벼라는 프로그램을 작성하시오.
친구관계가 맞으면 YES, 아니면 NO를 출력한다. '''
import sys
n=int(input("학생수를 입력하시오:"))
m=int(input("학생 쌍을 입력하시오:"))
arr=[]
arr=[list(map(int, input().split())) for _ in range(m)]

list1=[]
list2=[]
list1.append(0)
list2.append(arr[0][0])
for i in range(0,m):
    list1.append(arr[i][0])
    list2.append(arr[i][1])

list1.sort()
list2.sort()

st1=int(input("시작:"))
st2=int(input("끝:"))

point1=0
point2=0
for i in range(1, m+1):
    if(list1[i]==st1):
        point1 = i
    if(list2[i]==st2):
        point2 = i

if(point1==0 or point2==0):
    print("찾는 학생의 번호가 없습니다.")

for i in range(point1, point2+1):
    if(list1[i] != list2[i-1]):
        print("{0}과 {1}은 친구 사이가 아닙니다.".format(st1, st2))
        sys.exit()

print("{0}과 {1}은 친구 사이 입니다.".format(st1, st2))        




        
