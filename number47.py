# 47. 봉우리
''' 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여 있습니다.
    각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리가 몇 개 있는지 출력하시오 '''
# 파이썬은 미리 값을 입력한 상태
a=[ [0, 0, 0, 0, 0, 0, 0],
    [0, 5, 3, 7 ,2 ,3 ,0],
    [0, 3, 7, 1, 6, 1, 0],
    [0, 7, 2, 5, 3, 4, 0],
    [0, 4, 3, 6, 4, 1, 0],
    [0, 8, 7, 3, 5, 2, 0],
    [0, 0, 0, 0, 0, 0, 0]]
x=[-1, 0, 1, 0]
y=[0, -1, 0, 1]

cnt=0

for i in range(1,6):
    for j in range(1,6):
        flag=1
        
        for t in range(0,3):
            if(a[i][j]<=a[i+x[t]][j+y[t]]):
                flag=0
                break
                
        if(flag==1):cnt=cnt+1



print("봉우리의 갯수는 {0}개 입니다".format(cnt))

