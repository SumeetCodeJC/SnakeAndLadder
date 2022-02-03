package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
	//Declaring Variables for Players Position
    int playerPosition = 0;

    //Method to Show Player Current Position
    private void showPosition() {
        //Displaying Player Position
        System.out.println("Player Starting Position = "+ playerPosition);
    }
    public static void main(String[] args) {
        //Displaying Welcome Message
        System.out.println("Welcome to Snake and Ladder Simulator Problem.");

        //Creating Object for Player
        SnakeAndLadder player1 = new SnakeAndLadder();

        //Showing Player Position
        player1.showPosition();
    }
}


