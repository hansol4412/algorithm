# 42. 이분검색
''' 임의의 N개의 숫자가 압력으로 주어지고, N개의 수를 오름차순으로 정렬한 다음 N개의 수 중
    한 개의 수인 key가 주어지면 이분검색으로 key가 정렬된 상태에서 몇번째 있는지 구하는 프로그램을 작성하시오 '''
n=int(input("숫자의 리스트의 크기를 입력하시오:"))
m=int(input("찾으려는 숫자를 입력하시오:"))
a=[]
for i in range (0, n):
    a.append(int(input()))
a.sort()
left=0
right=n-1
while(1):
    center=int((left+right)/2)
    if(a[center]==m):
        print("{0}번 째에 {1} 있습니다.".format(center+1,m))
        break
    elif(a[center]>m):
        right=center-1
    else:
        left=center+1
 
