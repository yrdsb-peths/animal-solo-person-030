import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label scoreL = new Label(0, 80);
    int level = 1;
    public MyWorld() {
        //creates a cell of 600, 400
        super(600, 400, 1, false);
        
        //creates an elephant
        Elephant e = new Elephant();
        addObject(e, 300, 350);
        //creates a lable
        addObject(scoreL, 50, 50);
        
        //creates the apples
        createApple();
    }
    //End the game and draw "gameOver"
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 80);
        addObject(gameOverLabel, 300, 200);
    }
    //increase score
    public void increaseScore()
    {
        score++;
        scoreL.setValue(score++);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    //creates the apples in random x positions
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
        
    }
}
