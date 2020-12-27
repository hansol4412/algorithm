# 22. 온도의 최대값
# N일의 온도를 측정해서 연속적인 K일의 합을 구해 최대 합의 값을 출력하시오
# ex) n=10, k=2 : 10일의 온도를 측정해서 연속적인 2일의 합을 구해 합이 가장 큰 것을 출력하시오.
n= int(input("몇일 동안 온도를 측정할 것인가:"))
k= int(input("몇칠 동안 온도의 합을 구할 것인가:"))
a=[]
max=-100

for i in range(0,n):
    a.append(int(input("{0}일차 온도를 입력하시오:".format(i+1))))

for i in range(0, n-k+1):
    sum=0
    for j in range(i, i+k):
        sum= sum+a[j]

    if(sum>max): max=sum

print("온도의 최대값은 {0}입니다".format(max))
    
 
