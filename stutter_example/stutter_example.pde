Player p;

void setup() {
  size(500, 500);
  p = new Player(width/2, height/2);
}

void draw() {
  background(0);
  p.draw();
}

void keyPressed() {
  switch (key) {
  case Buttons.PLAYER_1_JOYSTICK_UP:
    p.move(Direction.UP);
    break;
  case Buttons.PLAYER_1_JOYSTICK_DOWN:
    p.move(Direction.DOWN);
    break;
  case Buttons.PLAYER_1_JOYSTICK_LEFT:
    p.move(Direction.LEFT);
    break;
  case Buttons.PLAYER_1_JOYSTICK_RIGHT:
    p.move(Direction.RIGHT);
    break;
  }
}

