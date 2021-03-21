#77. 친구인가
'''
현수네 반 학생은 N명이고, 모든 학생은 1부터 N까지 번호가 부여되어 있다. 
현수에게는 각각 두 명의 학생의 친구관꼐가 번호로 표현된 숫자쌍이 주어진다. 
 만약 (1,2) (2,3) (3,4)의 숫자 쌍이 주어지면 1번 학생과2번 학생이 친구이고, 2번 학생와 3번 학생이
친구이고, 3번 학생과 4번학생이 친구이다. 이는 연결되어 1번 학생과 4번 학생이 친구가 될 수 있다
학생의 친구관계를 나타내는 숫자 쌍이 주어지면 득정 두 명이 친구인지 판벼라는 프로그램을 작성하시오.
친구관계가 맞으면 YES, 아니면 NO를 출력한다. '''
# Union & Find 자료구조
n=int(input("학생수를 입력하시오:"))
m=int(input("학생 쌍을 입력하시오:"))
unf=[]
unf.append(0)
for i in range(1,n+1):
    unf.append(i)

def Find(v):
    if(v==unf[v]):
        return v;
    else:
        unf[v]=Find(unf[v])
        return unf[v]
def Union(a,b):
    k1=Find(a)
    k2=Find(b)
    if(k1 != k2): unf[k1]=k2
    
arr=[]
arr=[list(map(int, input().split())) for _ in range(m)]

for i in range(0,m):
    Union(arr[i][0], arr[i][1])

st1=int(input("시작:"))
st2=int(input("끝:"))

fa=Find(st1)
fb=Find(st2)
if(fa == fb):print("{0}과 {1}은 친구 사이 입니다.".format(st1, st2))
else: print("{0}과 {1}은 친구 사이가 아닙니다.".format(st1, st2))
