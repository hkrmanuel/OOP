import random

number = random.randrange(1, 100)

print("Welcome to the Guessing Game! \nIm thinking of a number between 1 and 100. Can you guess it?")
run = True
runtime = 0
while run:
    runtime += 1
    usrinput= int(input("Guess:")) 

    if usrinput == number:
        print(f"Yes! You guessed correctly after {runtime} tries! Congratulations.")
        run = False

    elif usrinput > number:
        print("Good try, but thats too high. Try again")
    elif usrinput < number:
        print("Good try, but thats too low. Try again")