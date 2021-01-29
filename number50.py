#50. 영지 선택
''' 왕은 현수에게 땅을 하사하기로 했다. 전체 땅에는 오렌지 나무의 갯수가 적혀있는데 현수는 오렌지 나무를 좋아한다.
	따라서 하사 받을 땅의 가로와 세로가 정해지면 오렌지 나무가 최대가 되는 땅을 선택하여 오렌지 나무의 갯수를 출력하라.'''
tr=int(input("전체 토지 가로:"))
tc=int(input("전체 토지 세로:"))
arr=[list(map(int,input().split(" "))) for _ in range(tr)]        
hr=int(input("하사받을 토지 가로:"))
hc=int(input("하사받을 토지 세로:"))

max=0
for i in range(0, tr-hr+1):
    for j in range(0, tc-hc+1):
        sum=0
        for n in range(i, i+hr):
            for m in range(j, j+hc):
                sum=sum+arr[n][m]
        if(sum>max): max=sum

print("하사 받은 땅의 오렌지 갯수는 {0}개 입니다".format(max))
