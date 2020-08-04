package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    private GradeService GradeService;

    @BeforeEach
    void setUp() {
        StubGradeSystem stubGradeSystem = new StubGradeSystem();
        GradeService = new GradeService(stubGradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        double result = GradeService.calculateAverageGrades(1);
        Assertions.assertEquals(85.0, result);
    }
}
