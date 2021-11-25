import Pages.FrontPage;
import Pages.RegisterPage;
import Pages.SuccessfulRegPage;
import org.testng.annotations.Test;

public class TestRegistration extends BaseTest {

    @Test
    public void TestReg() {
        FrontPage.goToFrontPage();
        FrontPage.goToRegisterPage();
        RegisterPage.register();
        SuccessfulRegPage.verifyReg("Your Account Has Been Created!");
    }
}
