package ModuloPOO;

public class Point {

    public Point(int x, int y) {
        validateCoordenates(x, y);
        this.x = x;
        this.y = y;
    }

    private int x = 0, y = 0;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        validateCoordenates(x, this.y);
        this.x = x;
    }

    public void setY(int y) {
        validateCoordenates(this.x, y);
        this.y = y;
    }

    public void moveBy(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    public void validateCoordenates(int x, int y) {
        // Classe que será usada para validação dos dados inseridos em x e y
        if (x < 0 || x > 400 || y < 0 || y > 400) {
            throw new IllegalArgumentException("Coordinates must be between 0 and 400");
        }
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;
        Point point = (Point) object;
        return x == point.x && y == point.y;
    }

    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + "}";
    }

    public static void main(String[] args) {
        Point p = new Point(5, 450); //
        System.out.println(p.toString());

    }
//    (1) Implemente um construtor para que seja possivel criar uma instancia de Point da seguinte forma: Point p = new Point(10, 10);
//    (2) Verifique questao de "data hiding" para assegurar um encapsulamento onde os fields nao sejam visiveis fora do modulo
//    (3) Existe um contrato [invariante de classe] que exige que as coordenadas representadas pela classe Point sejam positivas e menores ou iguais a 400, ou seja, (x >=0 && x <= 400) && (y >=0 && y <= 400). Assegure para que a classe mantenha essa integridade ao ser manipulada por codigo clientes.
// PT2
//    (1) Sobrescrever o metodo equals [herdado de Object] para que a classe possa ter um criterio de comparacao e ser usada tranquilamento em estrutura de dados como ArrayList.
//    (2) Sobrescrever o metodo toString para que retorne uma representacao em String do estado [fields x e y] do objeto Point
//    (3) Implemente uma subclasse chamada ScreenPoint [herda de Point]; em ScreenPoint assegure o seguinte invariante de classe
//    (x >=0 && x <= 300) && (y >=0 && y <= 300);
}
