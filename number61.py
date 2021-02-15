#61. 특정 수 만들기 (DFS)
'''  N개의 원소로 구성된 자연수 집합이 주어지면 집합의 원소와 "+", "-" 연산을 사용하여 특성 수인 M을 만드는
     경우가 몇가지 있는지 출력하는 프로그램을 작성하세요.
     각 원소는 연산에 한번만 사용됩니다. '''
n=int(input("원소의 갯수를 입력하시오:"))
a=[]
check=[]
global cnt
cnt=0
for i in range(0,n):
    a.append(int(input()))
    check.append(0)

m=int(input("만들려는 숫자를 입력하시오:"))

def DFS(x,sum):
    if(x==n):
        if(sum==m):
            global cnt
            cnt=cnt+1
            for i in range(0,n):
                if(check[i]==1):
                    print("+ {0} ".format(a[i]), end="")
                if(check[i]==-1):
                    print("- {0} ".format(a[i]), end="")
            print(" = {0}".format(m))
                    
        
    else:
        check[x]=1
        DFS(x+1, sum+a[x])
        check[x]=0
        DFS(x+1, sum)
        check[x]=-1
        DFS(x+1, sum-a[x])

DFS(0,0)
print("{0}를 만들수 있는 조합의 갯수는 {1}개 입니다".format(m,cnt))
      
        
