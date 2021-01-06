public class AiController {
    public PlayerController playerController;
    public Rect ball;

    public AiController(PlayerController plrController, Rect ball){
        this.playerController = plrController;
        this.ball = ball;
    }

    public void update(double dt){
        playerController.update(dt);
        if (ball.y < playerController.rect.y){
            playerController.moveUP(dt);
        } else if (ball.y + ball.height > playerController.rect.y + playerController.rect.height){
            playerController.moveDown(dt);
        }
    }
}
