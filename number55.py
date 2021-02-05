#55. 기차 운행 (stack사용)
''' A도시에서 출발한 기차는 교차로에 들려 순서를 조정한 후 B도시로 도착한다.  
    기차별로 번호가 부여되는데  P(push)작업과 O(out)작업을 통해 순서대로 B도시에 도착하도록 작성하여라
    번호 순서대로 도착이 불가능한 작업은 Impossible이라고 출력한다. '''
n=int(input("기차의 수를 입력하시오:"))
print("기차의 출발 순서를 입력하시오:")
train=[]
for i in range(0, n):
    train.append(int(input()))

stack=[]
point=1
ptr=0

while(1):
    if(len(stack)==0 or stack[-1] != point):
        if(ptr==n): break
        else:
            print("P", end=" ")
            stack.append(train[ptr])
            ptr=ptr+1
    if(stack[-1] == point):
        print("O", end=" ")
        stack.pop()
        point= point+1

    
if(len(stack)!=0): print("\nImpossible")
