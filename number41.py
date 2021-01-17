# 41. 연속된 자연수의 합
# 양의 정수가 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성합니다.
n=int(input("숫자를 입력하시오:"))
t=2 #합에 사용되는 숫자의 갯수
cnt=0

while(n>0):
    sum=0
    for i in range(1,t):
        sum=sum+i
        
    if(sum>=n): break
    
    if((n-sum)%t==0):
        x=int((n-sum)/t)
        print(x,end=" ")
        for i in range(1, t):
            print("+",end=" ")
            print(x+i, end=" ")
        print("= {0}".format(n))
        cnt=cnt+1
    else: pass
    
    t=t+1

print(cnt)
        
        
        
