import org.junit.*;
import static org.junit.Assert.fail;

public class ClassNameTest {
    @BeforeClass    //公开表态无返回值
    public static void beforeClass() throws Exception{
        //每次测试类执行前执行一次，主要用来初使化公共资源等
    }
    @AfterClass     //公开表态无返回值
    public static void afterClass() throws Exception{
        //每次测试类执行完成后执行一次，主要用来释放资源或清理工作
    }
    @Before
    public void setup() throws Exception {
        //每个测试案例执行前都会执行一次
    }
    @After
    public void teardown() throws Exception {
        //每个测试案例执行完成后都会执行一次
    }
    @Test
    public void testMethodName_give_…_when_…_then_…() {
        fail("失败");
    }
}
