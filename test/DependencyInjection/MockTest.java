package DependencyInjection;

import org.junit.jupiter.api.Test;

public class MockTest {
    @Test
    public void sublimeTest(){
        Walk dorcasWalk = new DorcasWalk();
        CatWalk catWalk = new CatWalk();

        Human jummie = new Human();
        jummie.walk();
        jummie.setWalk(catWalk);
        jummie.walk();
    }
}
