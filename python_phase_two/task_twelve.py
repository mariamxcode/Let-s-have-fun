sum = 0
counter = 1
while counter <= 10:
    score = int(input("Enter score: "))
    if score % 2 != 0 and score % 3 != 0 or score == 2:
        sum+=score;
    counter+=1

average = float(sum) /counter
print(sum,end=", ")
print(average)

