package ModuloPOO;

public class ScreenPoint extends Point{

    public ScreenPoint(int x, int y) {
        super(x, y);
//        validateCoordenates(x, y);
    }

    @Override
    public void validateCoordenates(int x, int y) {
        // Classe que será usada para validação dos dados inseridos em x e y
        if (x < 0 || x > 300 || y < 0 || y > 300) {
            throw new IllegalArgumentException("Coordinates must be between 0 and 300");
        }
    }

    public static void main(String[] args) {
        Point point = new ScreenPoint(30, 350);
        System.out.println(point.getY());
    }


}
