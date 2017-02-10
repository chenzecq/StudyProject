import com.sinosoft.controller.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by yangming on 2017/2/10.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                GuohongyueControllerTest.class,
                GuoruisongControllerTest.class,
                GuzhonghuiControllerTest.class,
                MingzhengControllerTest.class,
                ShikunpengControllerTest.class,
                SundongboControllerTest.class,
                YangmingControllerTest.class,
                ZhangyafengControllerTest.class
        }
)
public class SuiteTest {
}
