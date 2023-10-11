package shubhaDhang;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import shubhaDhang.config.ComponentScanConfig;
import shubhaDhang.data_access.StudentDao;
import shubhaDhang.util.UserInputService;


public class App 
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao=context.getBean(StudentDao.class);
        UserInputService userInputService=context.getBean(UserInputService.class);

    }
}
