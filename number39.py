# 39. 배열합치기
# 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출려하는 프로그램을 작성하세요.
# 병합정렬
a=[]
b=[]
c=[]
n=int(input("첫번째 배열의 크기를 입력하세요.:"))
for i in range(0,n):
    a.append(int(input()))

m=int(input("두번째 배열의 크기를 입력하세요.:"))
for i in range(0,m):
    b.append(int(input()))

p1=0
p2=0
while(p1<n and p2<m):
    if(a[p1]<=b[p2]):
        c.append(a[p1])
        p1=p1+1
        
    #if(a[p1]>b[p2]):
    else:
        c.append(b[p2])
        p2=p2+1
       

while(p1<n):
    c.append(a[p1])
    p1=p1+1
while(p2<m):
    c.append(b[p2])
    p2=p2+1

print(c)
    
    
