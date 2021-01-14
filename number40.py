# 40. 교집합 (투포인트 알고리즘)
# 두 집합 A, B가 주어지면  두 집합의 교집합을 출력하는 프로그램을 작성하세요.
# 교집합은 오름차순으로 정렬하시오.
# 교집합 구한 후 정렬하시오.
a=[]
b=[]
c=[]
n=int(input("첫번째 배열의 크기를 입력하세요.:"))
for i in range(0,n):
    a.append(int(input()))

m=int(input("두번째 배열의 크기를 입력하세요.:"))
for i in range(0,m):
    b.append(int(input()))

for i in range(0,n):
    for j in range(0,m):
        if(a[i]==b[j]):
            c.append(a[i])

#교집합 정렬하기-버블정렬
for i in range(0,len(c)-1):
    for j in range(0,len(c)-1-i):
        if(c[j]>c[j+1]):
            temp=c[j]
            c[j]=c[j+1]
            c[j+1]=temp

print(c)
 
