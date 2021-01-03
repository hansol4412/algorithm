# 31. 탄화수소 질량
# 탄소(C)와 수소(H)로 이루어진 탄화수소에서 탄소는 한 개가 12g, 수소는 한 개가 1g이다. 탄화수소식에서 질량을 구하라
# cf) C1H4의 식은 CH4라고 입력하고 계산한다
str=input("식을 입력하시오:")
cnt=0
hnt=0
position=1
a=[]
for i in range(0,len(str)):
    a.append(str[i])
a.append(" ")



if(a[1]=='h' or a[1]=='H'):
    cnt=1
else:
    for i in range(1,len(a)):
        if(a[i]=='h' or a[i]=='H'): break;
        cnt=cnt*10+int(a[i])
        position=position+1

if(a[position+1]==' '):
    hnt=1
else:
     for i in range(position+1,len(a)):
        if(a[i]==' '): break;
        hnt=hnt*10+int(a[i])
        
            
sum= cnt*12 + hnt

print("탄화수소의 질량은 {0}이다.".format(sum))
    
    
