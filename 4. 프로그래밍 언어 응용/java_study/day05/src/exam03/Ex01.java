package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Human human = new Human(); // Human, Animal
        human.move();

        Animal bird = new Bird(); // Bird, Animal
        bird.move();

        Animal tiger = new Tiger(); // Tiger, Animal
        tiger.move();
    }
}