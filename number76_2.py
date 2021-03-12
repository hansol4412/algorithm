# 76_2. 이항계수
''' 이항계수는 N계의 원소를 가지는 집합에서 R개의 원소를 뽑아 부분집합을 만드는 경우의 수
    공식은 nCr로 표현한다. '''
# 재귀함수 사용
# 메모리제이션 사용
n=int(input("n을 입력하시오:"))
r=int(input("r을 입력하시오:"))
dy=[]
for i in range(0,20):
    dy.append([])
    for j in range(0,20):
        dy[i].append(0)


def DFS(n,r):
    if(n==r or r==0): return 1
    if(dy[n][r]>0): return dy[n][r]
    else:
        dy[n][r] = DFS(n-1, r) + DFS(n-1, r-1)
        return dy[n][r]


        
print("{0}C{1}={2}".format(n,r,DFS(n,r)))
