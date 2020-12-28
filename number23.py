# 23. 연속 부분 증가수열
# n개의 숫자가 나열된 수열이 주어집니다. 이 수열 중 연속적으로 증가하는 부분 수열 최대 길이를 구해 출력하시오.
# 값이 같을 때는 증가하는 것으로 생각한다.
n=int(input("숫자를 입력하시오:"))
a=[]
for i in range(0,n):
    a.append(int(input("{0}:".format(i+1))))
    
cnt=0
max=0

for i in range(1,n):
    if(a[i-1]<=a[i]):
        cnt=cnt+1
        if(max<cnt): max=cnt
        
    else: cnt =1

print("증가수열의 최대 길이는 {0}이다.".format(max))
    
