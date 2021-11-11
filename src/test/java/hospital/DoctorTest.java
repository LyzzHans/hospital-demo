package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DoctorTest {
    Doctor underTest = new Doctor("1", "name", "specialty");
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelOfPatientFrom10to20WhenProvidingCare() {
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(20, patientHealthLevel);
    }

    @Test

    public void shouldDecreaseBloodLevelFrom20to15WhenDrawingBlood(){
        underTest.drawBlood(sickPatient);
        int bloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, bloodLevel);
    }

    @Test

    public void shouldExpectASalaryOf90k(){
        int salary = underTest.calculatePay();
        assertEquals(90000, salary);
    }

}
