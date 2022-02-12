import static org.junit.Assert.*;
import org.junit.*;

public class SkillTester {
    
    @Test
    public void SkillTester() {
        Skill anish = new Skill();
        assertEquals(0, anish.returnOne());
    }
}
