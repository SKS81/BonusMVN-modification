import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    //Делаю Параметризированные тесты
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    //@CsvFileSource(files="src/test/resources/data.csv")
    void calculate(String test, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }


//    @Test
//    public void showIdCalculateForRegisteredAndUnderLimit() {
//        BonusService service = new BonusService();
//
//        long amount = 1_000;
//        boolean registered = true;
//        long expected = 30;
//
//        long actual = service.calculate(amount, registered);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void showIdCalculateForRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        long amount = 1_000_000;
//        boolean registered = true;
//        long expected = 500;
//
//        long actual = service.calculate(amount, registered);
//
//        assertEquals(expected, actual);
//    }
//
//    // Добавляю новые тесты
//    // 1. Незарегистрированный пользователь, в лимите
//    @Test
//    public void showIdCalculateForUnRegisteredAndUnderLimit() {
//        BonusService service = new BonusService();
//
//        long amount = 1_000;
//        boolean registered = false;
//        long expected = 10;
//
//        long actual = service.calculate(amount, registered);
//
//        assertEquals(expected, actual);
//    }
//
//    // 2. Незарегистрированный пользователь, вне лимита
//    @Test
//    public void showIdCalculateForUnRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        long amount = 1_000_000;
//        boolean registered = false;
//        long expected = 500;
//
//        long actual = service.calculate(amount, registered);
//
//        assertEquals(expected, actual);
//    }
//
}