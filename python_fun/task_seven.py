sum = 0
counter = 1
even_counter = 0;
while counter <= 10:
    score = int(input("Enter score: "))
    if score % 2==0:
        sum+=score;
        even_counter+=1

    counter+=1

average =float(sum) / even_counter;
print(sum, end=", ");
print(average);

