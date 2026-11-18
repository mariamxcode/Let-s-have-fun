sum = 0
counter = 1
while counter <= 10:
    score = int(input("Enter score: "))
    for number in range(score+1):
        if number * number == score:
        	sum+=score
    counter+=1

average = float(sum) /counter
print(sum,end=", ")
print(average)

