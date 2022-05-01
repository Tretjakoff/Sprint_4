import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String fullName;
    private final boolean expected;

    @Parameterized.Parameters
    public static Object[][] getNewAccount() {
        return new Object[][]{
                {"Иван Иванов", true},
                {"Vasiliy Sidorov", true},
                {"Иван Иванов ", false},
                {" Иван Иванов", false},
                {"ИванИванов", false},
                {" Иван Иванов ", false},
                {"Алла-Виктория Браун", true},
                {"Алла-Виктория Картер", false},
                {"q w", true},
                {"q ", false},
                {" q", false},
                {"", false},
                {" ", false},
        };
    }
    public AccountTest(String fullName, boolean expected) {
        this.fullName = fullName;
        this.expected = expected;
    }

    @Test
    public void fullNameAccountTest(){
        Account account = new Account(fullName);
        boolean effect = account.checkNameToEmboss();
        assertEquals(expected, effect);

    }

}
