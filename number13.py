# 13. 가장 많이 사용된 자릿수
# N자리의 자연수가 입력되면 자연수의 자릿수 중 가장 많이 사용된 숫자를 출력하는 프로그램을 작성하시오.
# 답이 여러 개일 경우 그 중에서 가장 큰 수를 출력하시오.

n=input("숫자를 입력하세요:");
a = [0 for i in range(10)]

for i in range(0,len(n)):
    a[int(n[i])]= a[int(n[i])]+1
    
max=0
maxN=0

for j in range(0,10):
    if(a[j]>max):
        max=a[j]
        maxN=j
    if(a[j]==max):
        if(j>maxN):
            maxN=j

print("가장 많이 사용된 수는 {0}이다.".format(maxN))
