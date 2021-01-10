# 37. Least Recently Used (카카오 캐시 변형 문제)
# 캐시메모리는 LRU 알고리즘 즉, 가장 오랫동안 사용하지 않는 것을 제거하는 알고리즘을 사용한다. 
# Cache Miss : 해야할 작업이 캐시에 없는 상태로 모든 작업이 뒤로 밀리고 새로운 작업이 앞에 추가 된다.
# Cache Hit : 해야할 작업이 캐시에 있는 상태로 사용해야 하는 작업 앞에 있는 작업은 뒤로 밀리고 사용하는 작업이 맨 앞으로 온다
# 캐시 크기와 작업수를 입력하고 캐시메모리의 작업 과정을 출력하시오.

n=int(input("캐시메모리 크기를 입력하시오:"))
m=int(input("작업의 수를 입력하시오:"))
a=[]
b=[0 for i in range(n)]

for i in range(0,m):
    a.append(int(input()))


for i in range(0,m):
    temp=a[i]
    pos=-1
    for j in range(0,n):
        if(b[j]==temp):
            pos=j
            
    if(pos==-1):
        for t in range(n-2, -1, -1):
                b[t+1]=b[t]
    else:
        for t in range(pos-1, -1, -1):
                b[t+1]=b[t]
            
    b[0]=temp
    print(b)
     
