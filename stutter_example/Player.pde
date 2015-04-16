public class Player {
  public static final int SPEED = 10;
  public static final int SIZE = 50;

  private int x;
  private int y;

  public Player(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void draw() {
    rect(x, y, SIZE, SIZE);
  }

  public void move(Direction d) {
    switch (d) {
    case UP:
      y -= SPEED;
      break;
    case DOWN:
      y += SPEED;
      break;
    case LEFT:
      x -= SPEED;
      break;
    case RIGHT:
      x += SPEED;
      break;
    }
  }
}

