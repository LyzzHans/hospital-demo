package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {
    Nurse underTest = new Nurse("2", "name", 100);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelFrom10To15WhenCaringForPatient() {
        underTest.careForPatient(sickPatient);
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(15, healthLevel);
    }

    @Test

    public void shouldDecreaseBloodLevelFrom20to15WhenDrawingBlood() {
        underTest.drawBlood(sickPatient);
        int bloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, bloodLevel);
    }

    @Test

    public void shouldExpectASalaryOf80k() {
        int salary = underTest.calculatePay();
        assertEquals(80000, salary);
    }
}
