import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Bean{
	
	public Paddle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }
	
	public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
	
	public void reset() {
        x = PADDLE_X_START;
        y = PADDLE_Y_START;
    }
	
	public boolean hitPaddle(int ballX, int ballY) {
        if ((ballX >= x) && (ballX <= x + width)
                && ((ballY >= y) && (ballY <= y + height))) {
            return true;
        }
        return false;
    }
}
