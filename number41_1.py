#41_1. 연속된 자연수의 합
#양의 정수가 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성합니다.

# 15 = (n+1) + (n+2) + (n+3) + ...
n=int(input("수를 입력하시오:"))
t=2 # 덧셈에 필요한 수
cnt=0
tmp=n
temp=n-1
while(temp>0):
    temp=temp-t
    if(temp%t==0):
        for i in range(1,t):
            print("{0} + ".format(int(temp/t)+i), end="")
        print("{0} = {1}".format(int(temp/t)+t, n))
        cnt=cnt+1

    t=t+1

"""
# 15 = (n) + (n+1) + (n+2) +  ...
n=int(input("수를 입력하시오:"))
t=2
cnt=0
temp=n
while(temp>0):
    temp=temp-(t-1)
    if(temp/t==0):break
    if(temp%t==0):
        print(int(temp/t),end="")
        for i in range(1, t):
            print(" + {0}".format(int(temp/t)+i), end="")
            cnt=cnt+1
        print(" = {0}".format(n))
    t=t+1
"""    
    
        
