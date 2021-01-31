#51. 영지 선택 (large)
''' 왕은 현수에게 땅을 하사하기로 했다. 전체 땅에는 오렌지 나무의 갯수가 적혀있는데 현수는 오렌지 나무를 좋아한다.
    따라서 하사 받을 땅의 가로와 세로가 정해지면 오렌지 나무가 최대가 되는 땅을 선택하여 오렌지 나무의 갯수를 출력하라.'''
#파이썬은 땅을 입력받지 않고 미리 입력해 놓는다
tr=6
tc=7
arr=[[0, 0, 0, 0, 0, 0, 0, 0],
     [0, 3, 5, 1, 3, 1, 3, 2],
     [0, 1, 2, 1, 3, 1, 1, 2],
     [0, 1, 3, 1, 5, 1, 3, 4],
     [0, 5, 1, 1, 3, 1, 3, 2],
     [0, 3, 1, 1, 3, 1, 1, 2],
     [0, 1, 3, 1, 3, 1, 2, 2]]

hr=int(input("하사받을 토지 가로:"))
hc=int(input("하사받을 토지 세로:"))
dy=[]

#dy 초기화
for i in range(0,tr+1):
    dy.append([])
    for j in range(0, tc+1):
        dy[i].append(0)
#dy 계산
for i in range(1,tr+1):
    for j in range(1,tc+1):
        dy[i][j]=dy[i-1][j]+dy[i][j-1]-dy[i-1][j-1]+arr[i][j]
        
#dy 출력
for i in range(1,tr+1):
    for j in range(1,tc+1):
        print(dy[i][j], end=" ")
    print()

#받을 오렌지 계산   
max=0
for i in range (hr,tr+1):
    sum=0
    for j in range(hc,tc+1):
        sum = dy[i][j] - dy[i-hr][j] - dy[i][j-hc] +dy[i-hr][j-hc]
        if(sum>max): max=sum

print("하사 받은 땅의 오렌지 갯수는 {0}개 입니다".format(max))


       
