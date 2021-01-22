# 44. 마구간 정하기 (이분검색 응용)
''' N개의 마구간과 M마리의 말이 있습니다. 마구간 마다 한마리의 말을 넣어 배치했을 때 가장 가까운 두 말의 거리가
    최대가 되는 값을 출력하시오 '''
n=int(input("마구간의 갯수를 입력하시오.:"))
m=int(input("말의 갯수를 입력하시오.:"))
a=[]
for i in range(0, n):
    a.append(int(input()))
a.sort()

def find(center):
    cnt=1
    pos=a[0]
    for i in range(1, n):
        if(a[i]-pos>=center):
            pos=a[i]
            cnt=cnt+1
    return cnt



left=a[0]
right=a[n-1]
while(left<=right):
    center=int((left+right)/2)
    if(find(center)>=m):
       left=center+1
       result=center
    else:
        right=center-1

print(result)
