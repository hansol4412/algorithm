# 24. Jolly Jumpers
# N개의 정수로 이루어진 수열에 대해 서로 인접하는 수의 차가 1에서 N-1까지  값을 모두 가지면 YES, 아니면 NO
n = int(input("숫자를 입력하시오:"))
a=[]
b=[0 for i in range(n)]
for i in range(0,n):
    a.append(int(input("수를 입력하시오:")))

for i in range(1,n):
    minus=abs(a[i]-a[i-1])
    b[minus]=1

flag=1
for i in range(1,n):
    if(b[i]<1):
        flag=0
        break

if(flag==1): print("YES")
if(flag==0): print("No")



