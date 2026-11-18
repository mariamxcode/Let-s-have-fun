sum = 0
counter = 1
while counter <= 10:
    score = int(input("Enter score: "))

    if counter % 2==0:
        sum+=score
    counter+=1

print(sum)
