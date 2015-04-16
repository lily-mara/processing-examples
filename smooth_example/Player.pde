public class Player {
  public static final int SPEED = 5;
  public static final int SIZE = 50;

  private int x;
  private int y;

  private boolean moveRight;
  private boolean moveUp;
  private boolean moveLeft;
  private boolean moveDown;

  public Player(int x, int y) {
    this.x = x;
    this.y = y;

    moveRight = false;
    moveLeft = false;
    moveUp = false;
    moveDown = false;
  }

  public void draw() {
    if (moveRight) {
      x += SPEED;
    }
    if (moveLeft) {
      x -= SPEED;
    }
    if (moveUp) {
      y -= SPEED;
    }
    if (moveDown) {
      y += SPEED;
    }

    rect(x, y, SIZE, SIZE);
  }

  public void move(Direction d) {
    switch (d) {
    case UP:
      moveUp = true;
      break;
    case DOWN:
      moveDown = true;
      break;
    case LEFT:
      moveLeft = true;
      break;
    case RIGHT:
      moveRight = true;
      break;
    }
  }

  public void stop(Direction d) {
    switch (d) {
    case UP:
      moveUp = false;
      break;
    case DOWN:
      moveDown = false;
      break;
    case LEFT:
      moveLeft = false;
      break;
    case RIGHT:
      moveRight = false;
      break;
    }
  }
}

