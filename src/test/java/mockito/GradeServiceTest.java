package mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.mockito.Mockito.*;

public class GradeServiceTest {
    private GradeSystem gradeSystem;
    private GradeService gradeService;

    @BeforeEach
    void setUp() {
        gradeSystem = mock(GradeSystem.class);
        gradeService = new GradeService(gradeSystem);
    }

    @Test
    void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(gradeSystem.gradesFor(1)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));
        Assertions.assertEquals(gradeService.calculateAverageGrades(1), 90.0);
    }
}
