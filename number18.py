#// 18. 층간소음
"""
아파트의 한 세대의 측정치가 m값을 넘으면 세대 호수와 작은 경보음이 관리실 모니터에 울린다
한 세대의 n초 동안의 실시간 측정치가 주어지면 최대 연속으로 경보음이 울린 시간을 구하이소.
경보음이 없으면 -1이 출력된다.
"""
n=int(input("몇 초 동안 측성을 할 것인가(n초):"))
m=int(input("경보음 측정치(m):"))
a=[]
max=0
cnt=0
for i in range(0,n):
    a.append(int(input()))
    if(a[i]>m):
        cnt=cnt+1
        if(cnt>max):
            max=cnt
    else:
        cnt=0

if(max==0): print(-1)
else :print(max)
