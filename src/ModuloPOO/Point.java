package ModuloPOO;

public class Point {

    public Point(int x, int y) {
        if(y >= 0 && y <= 400 && x >= 0 && x <= 400) {
            this.x = x;
            this.y = y;
        } else {
            throw new Error("X ou Y deve estar entre 0 e 400");
        }
    }

    private int x = 0, y = 0;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        if(x >= 0 && x <= 400) {
            this.x = x;
        } else {
            throw new Error("X deve estar entre 0 e 400");
        }
    }

    public void setY(int y) {
        if(y >= 0 && y <= 400) {
            this.y = y;
        } else {
            throw new Error("Y deve estar entre 0 e 400");
        }
    }

    public void moveBy(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    public static void main(String[] args) {
        Point p = new Point(5, 10); //

    }
//    (1) Implemente um construtor para que seja possivel criar uma instancia de Point da seguinte forma: Point p = new Point(10, 10);
//    (2) Verifique questao de "data hiding" para assegurar um encapsulamento onde os fields nao sejam visiveis fora do modulo
//    (3) Existe um contrato [invariante de classe] que exige que as coordenadas representadas pela classe Point sejam positivas e menores ou iguais a 400, ou seja, (x >=0 && x <= 400) && (y >=0 && y <= 400). Assegure para que a classe mantenha essa integridade ao ser manipulada por codigo clientes.
}
