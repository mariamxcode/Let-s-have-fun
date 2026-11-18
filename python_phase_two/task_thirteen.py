counter = 1
while counter <= 10:
    score = int(input("Enter score: "))
    for number in range(score+1):
        if number * number == score:
            print(score)
    counter+=1
    



