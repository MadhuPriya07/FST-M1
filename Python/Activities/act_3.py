user1_name= input("First Player Name: ")
user2_name= input("Second Player Name: ")

#Save their answer choices
while True:
    user1_answerchoice= input(user1_name+" What do you choose among rock,paper,scissor? ").lower
    user2_answerchoice= input(user2_name+" What do you choose among rock,paper,scissor? ").lower

    if user1_answerchoice==user2_answerchoice:
        print("Its a tie!!")
    elif user1_answerchoice=='rock':
        if user2_answerchoice=='scissor':
            print("Rock Wins")
        else:
            print("Paper Wins")
    elif user1_answerchoice=='scissor':
        if user2_answerchoice=='paper':
            print("Scissor Wins")
        else:
            print("Rock Wins")
    elif user1_answerchoice=='paper':
        if user2_answerchoice=='rock':
            print("Paper Wins")
        else:
            print("Scissor Wins")
    else:
        print("You have not entered a valid Value. Try again")
    repeat=input("Do you want to play the game again? Yes/No ").lower

    if(repeat=='yes'):
        pass
    elif(repeat=='no'):
        raise SystemExit
    else:
        print("You selected an invalid option")
        raise SystemExit
    
