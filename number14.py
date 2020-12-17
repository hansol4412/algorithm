# 14. 뒤집은 소수
# N개의 자연수가 입력되면 각 자연수를 뒤집은 수가 소수이면 그 수를 출력하는 프로그램을 작성하시오.
# 뒤집은 메소드인 int reverse(int x)와 소수를 확인하는 메소드 boolean isPrime(int x)를 작성하시오.

def reverse(a):
    sum=0
    while(a>=1):
        sum=sum*10+a%10
        a=int(a/10)
    return sum
            
def isPrime(a1):
    flag = 0
    for i in range(2,a1):
        if(a1%i==0):
            flag = 1
            break
    return flag

        
    
    

n=int(input("입력할 수의 갯수를 입력하세요:"))
t=[]
for i in range(0,n):
    a=int(input("수를 입력하세요:"))
    a1=reverse(a)
    if(isPrime(a1)==0):
        t.append(a1)
print(t)
        
