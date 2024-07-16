package lab3;

public class Tree {
    public int ages;
    public boolean alive;
    public String name;

    public Tree(int ages, String name) {
        this.ages = ages;
        this.alive = true;
        this.name = name;
    }

    public Tree(int ages, String name, boolean alive) {
        this.ages = ages;
        this.alive = true;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public void printTree() {
        System.out.println("Имя дерева " + name);
        System.out.println("Возраст дерева " + ages);
        System.out.println("Дерево живое " + (alive ? "Да" : "Нет"));
    }

    public static void main(String[] args) {
        Tree tree1 = new Tree(2, "Береза");
        Tree tree2 = new Tree(3, "Рябина", true);
        Tree tree3 = new Tree();

        System.out.println("Первое дерево");
        tree1.printTree();
        System.out.println("Второе дерево");
        tree2.printTree();
        System.out.println("Третье дерево");
        tree3.printTree();
    }
}