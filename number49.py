# 49. 블록의 최댓값
# 블록을 정면에서 본 단면과 오른쪽 측면에서 본 단면을 주고 최대 블록갯수을 출력하는 프로그램을 작성하시오.

n=int(input("N*N의 지역에서 N의 값을 입력하세요."))

# N*N 배열 초기화
arr=[]
for i in range(0,n):
    arr.append([])
    for j in range(0,n):
        arr[i].append(0)

a=[]
b=[]
print("정면에서 본 단면을 입력하세요")
for i in range(0,n):
    a.append(int(input()))

print("오른쪽 측면에서 본 단면을 입력하세요")
for i in range(0,n):
    b.append(int(input()))


for i in range(0,n):
    for j in range(0,n):
        arr[j][i]=a[i]

        
cnt=0

for i in range(0,n):
    temp=b[n-i-1]
    for j in range(0,n):
        if(arr[i][j]>temp):
            arr[i][j]=temp
        cnt=cnt+arr[i][j]


for i in range(0,n):
    for j in range(0,n):
        print(arr[i][j], end=" ")
    print()
    
print("블록의 최대 갯수는 {0}개 입니다".format(cnt))

     


