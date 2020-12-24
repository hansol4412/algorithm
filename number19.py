# 19. 분노 유발자
"""학생들이 영화를 볼  만약 앞자리에 앉은 키카 큰 학생이 있으면 그 학생보다 작은 학생은 스크린이 보이지 않습니다
   한 줄에 낮은 키 정보가 주어지면 뒷 사람 모두의 시야를 가리는 분노유발작 그 줄에 몇 명 있는지 구하시오.
"""
n=int(input("학생 수를 입력하세요:"))
a=[]
for i in range(0,n):
    a.append(int(input("수를 입력하시오:")))

max=a[n-1]
cnt=0
for j in range(n-1,-1,-1):
    if(a[j]>max):
        cnt=cnt+1
        max = a[j]

print("분노 유발자는 {0}명 입니다.".format(cnt))
