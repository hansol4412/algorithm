# 21. 카드게임
'''0부터 9까지 숫자가 적힌 카드를 가지고 게임을 한다. 두 사람이 카드를 한장 씩 냈을 때 큰 수를 가진 사람이 이긴다.
   이겼을 때 3점을 주고 졌을 때는 점수를 부여하지 않는다. 비겼을 때는 1점을 부여한다
   10번의 게임을 하고 두 사람의 총점 계산과 이긴  사람을 출력하시오.
   총 승점이 같은 경우에는, 마지막에 이긴 사람을 게임의 승자로 정한다.'''
a=[]
b=[]
cntA=0
cntB=0
for i in range(0,10):
    a.append(int(input("{0}번째 A의 카드값을 입력하시오:".format(i+1))))
    b.append(int(input("{0}번째 B의 카드값을 입력하시오:".format(i+1))))

    if(a[i]>b[i]): cntA = cntA+3
    elif(a[i]<b[i]): cntB = cntB+3
    else :
        cntA= cntA+1
        cntB= cntB+1


print(cntA)
print(cntB)
if(cntA>cntB): print("A가 이겼습니다.")
elif(cntA<cntB): print("B가 이겼습니다.")
else:
    for j in range(9,-1,-1):
        if(a[j]>b[j]):
            print("A가 이겼습니다.")
            break
        elif(a[j]<b[j]):
            print("B가 이겼습니다.")
            break
        else:
            pass
