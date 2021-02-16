# 62. 병합 정렬
# N개의 숫자가 입력되면 오름차순으로 병합 정렬하여 출력하는 프로그램을 작성하시오.
n=int(input("정렬할 숫자의 갯수를 입력하시오:"))
a=[]
temp=[]
for i in range(0,n):
    a.append(int(input()))
    temp.append(0)


def Devide(left, right):
    if(left<right):
        lt=left
        rt=right
        mid=int((lt+rt)/2)
        Devide(lt, mid)
        Devide(mid+1,rt)
        p1=lt
        p2=mid+1
        p3=lt
        while(p1<=mid and p2<=rt):
            if(a[p1]<=a[p2]):
                temp[p3]=a[p1]
                p1=p1+1
                p3=p3+1
            else:
                temp[p3]=a[p2]
                p2=p2+1
                p3=p3+1
        while(p1<=mid):
            temp[p3]=a[p1]
            p1=p1+1
            p3=p3+1
        while(p2<=rt):
            temp[p3]=a[p2]
            p2=p2+1
            p3=p3+1
        for i in range(lt, rt+1):
            a[i]=temp[i]
                
            
        







Devide(0,n-1)
print(a)
