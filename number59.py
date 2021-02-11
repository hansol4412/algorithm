# 59. 부분집합 (DFS)
# 자연수 n이 주어지면 1부터 n까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하시오.
# 재귀에 이용한 완전탐색을 하며, 이진트리 전위 순회 방식으로 출력한다.
n=int(input("수를 입력하세요:"))
a=[0,0,0,0]

def DFS(x):
    if(x==n+1):
        for i in range(1, n+1):
            if(a[i]==1):
                print(i, end=" ")
        print()
    else:
        a[x]=1
        DFS(x+1)
        a[x]=0
        DFS(x+1)

DFS(1)
