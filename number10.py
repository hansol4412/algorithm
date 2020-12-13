# 10.자릿수의 합
'''N개의 자연수가 입력되면 각 자연수의 자릿수의 합을 구하고 그 합이 최대인 자연수를 출력하는 프로그램을 작성하시오.
   자리수의 합이 최대인 자연수가 여러개인 경우 그 중 값이 가장 큰 값을 출력하시오.'''
# int digit_sum(int x)의 메소드를 사용하여 프로그래밍하시오.

def digit_num(a):
    num=0
    
    while(a>=1):
        num = num + a%10
        a=int(a/10);
        
    return num

       
n=int(input("입력할 수의 갯수를 입력하시오:"))
max=0
maxN=0
for i in range(0,n):
    a=int(input("수를 입력하시오:"))
    digit=digit_num(a)
    if(digit>max):
        max=digit
        maxN=a
    if(digit==max):
        if(maxN<a): maxN=a

print(maxN)




    
    
