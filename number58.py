# 58. 이진트리 깊이우선트리(DFS)
n=int(input("노드의 갯수를 입력하시오:"))


# 전위순회 출력    
def DFS_F(x):
    if(x>n):
        return
    else:
        print(x, end=" ")
        DFS_F(x*2)
        DFS_F(x*2+1)

# 중위순회 출력    
def DFS_M(x):
    if(x>n):
        return
    else:
        DFS_M(x*2)
        print(x, end=" ")
        DFS_M(x*2+1)

# 후위순회 출력    
def DFS_B(x):
    if(x>n):
        return
    else:
        DFS_B(x*2)
        DFS_B(x*2+1)
        print(x, end=" ")
    



print("전위순회")
DFS_F(1)
print()
print("중위순회")
DFS_M(1)
print()
print("후위순회")
DFS_B(1)
