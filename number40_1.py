# 40_1. 교집합 (투포인트 알고리즘)
# 두 집합 A, B가 주어지면  두 집합의 교집합을 출력하는 프로그램을 작성하세요.
# 교집합은 오름차순으로 정렬하시오.
# 정렬 후 교집합 구하기
a=[]
b=[]
c=[]
n=int(input("첫번째 배열의 크기를 입력하세요.:"))
for i in range(0,n):
    a.append(int(input()))
a.sort()

m=int(input("두번째 배열의 크기를 입력하세요.:"))
for i in range(0,m):
    b.append(int(input()))
b.sort()
p1=0
p2=0
while(p1<n and p2<m):
    if(a[p1]==b[p2]):
        c.append(a[p1])
        p1=p1+1
        p2=p2+1
    elif(a[p1]<b[p2]):
        p1=p1+1
    else:
        p2=p2+1

print(c)
