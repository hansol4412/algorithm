# 20. 가위 바위 보
# 총 n번의 가위 바위 보 게임을 하여 A가 이기면 A를 출력하고 B가 이기면 B를 출력하고 비기면 D를 출력한다
# 1:가위  2:바위   3:보
# 최종 승자를 마지막에 출력하시오.
n=int(input("몇 번의 게임을 실행할 것인가?:"))
a=[]
b=[]
cntA=0
cntB=0
for i in range(0, n):
    a.append(int(input("A의 값을 입력하시오:")))
    b.append(int(input("B의 값을 입력하시오:")))

for j in range(0,n):
    if(a[j]==b[j]):
        print("D")
    elif(a[j]==1 and b[j]==2):
        print("B")
        cntA=cntA+1
    elif(a[j]==2 and b[j]==3):
        print("B")
        cntA=cntA+1
    elif(a[j]==3 and b[j]==1):
        print("B")
        cntA=cntA+1
    else:
        print("A")
        cntB=cntB+1

if(cntA>cntB): print("최종승자는 A입니다")
elif(cntA<cntB): print("최종승자는 B입니다")
else: print("둘은 비겼습니다.")


