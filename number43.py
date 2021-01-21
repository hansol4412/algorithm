# 43. 뮤직비디오 (이분검색 응용)
''' 음반에 N개의 곡이 들어가는 데 순서가 그대로 유지된 채로 DVD에 녹화하려고 한다. 
    제작상의 이유로 M개의 DVD를 사용해서 음반을 제작하려한다. 중간에 곡이 짤려서 2개에 DVD로 나눠서 녹음되면 안된다.
    이때 한개의 DVD의 최소 크기 (최소 시간)을 출력하시오. '''
n=int(input("노래의 갯수를 입력하시오.:"))
m=int(input("사용하는 DVD의 갯수를 입력하시오.:"))
a=[]
sum=0
for i in range (0,n):
    a.append(int(input()))
    sum=sum+a[i]
    
    
def count(center):
    cnt=1
    hab=0
    for i in range(0,n):
        if(hab+a[i]>center):
            hab=a[i]
            cnt=cnt+1
        else:
            hab=hab+a[i]
    return cnt
        
    

left=0
right=sum
while(left<=right):
    center=int((left+right)/2)
    if(count(center)<=m):
        right=center-1
        min=center
    else:
        left=center+1

print(min)
