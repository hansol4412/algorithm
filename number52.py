# 52. ugly number 
# 어떤 수를 소인수 분해 했을 때 그 소인수가 2 또는 3 또는 5로만 이루어진 수를 ugly number라고 부릅니다.
# 숫자 1은 ugly number의 첫번째 수 입니다.
# 자연수 N이 주어지면 ugly number을 차례로 적을  N번째 ugly number을 출력하시오.
n=int(input("몇번째 ugly number을 찾을까요?"))
ugly=[]
ugly.append(1)
p2=p3=p5=0
min=0
for i in range(1,n):
    #min 찾기
    if(ugly[p2]*2 < ugly[p3]*3): min=ugly[p2]*2
    else : min=ugly[p3]*3
    if(ugly[p5]*5 < min): min=ugly[p5]*5

    #찾은 min 값으로 포인트 증가시키기
    if(min==ugly[p2]*2): p2=p2+1
    if(min==ugly[p3]*3): p3=p3+1
    if(min==ugly[p5]*5): p5=p5+1
    
    ugly.append(min)
print("{0}번째 ugly number는 {1}입니다.".format(n,ugly[n-1]))
