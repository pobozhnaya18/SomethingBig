package bud_leaf;
/**
 * Класс "Лист" реализует действия листа.
 *
 */
public class Leaf {
    protected double length;
    public int k = 0;
    /**
     * Конструктор
     *  l длина листа
     *
     */
    public Leaf(double l) {
        this.length = l;
        k++;
    }
}
