sum = 0
counter = 1
while counter <= 10:
    score = int(input("Enter score: "))
    sum+=score;
    counter+=1;

average = sum /float(counter)
print(sum, end=", ")
print(average)

