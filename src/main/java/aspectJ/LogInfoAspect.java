package aspectJ;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Aspect//表示当前是一个切面
@Component
public class LogInfoAspect {

    /**
     * 定义切入点，通知增强哪些方法。
     * "execution(* service.StuService.*(..))" 是定义切入点表达式，
     * 该切入点表达式的意思是匹配service包中StuService类的任意方法的执行。
     * 其中execution()是表达式的主体，第一个*表示的是返回类型，使用*代表所有类型；
     * service表示的是需要匹配的包名，后面第二个*表示的是类名，使用*代表匹配包中所有的类；
     * 第三个*表示的是方法名，使用*表示所有方法； 后面(..)表示方法的参数，其中“..”表示任意参数。
     * 另外，注意第一个*与包名之间有一个空格。
     */
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("execution(* service.StuService.*(..))")//@Pointcut切入点
    private void pointCut() {
    }

    @Before("pointCut()")
    public void beforLogInfo() {
        System.out.println("Hello Springboot！！！");
        System.out.println("当前方法被调用！！！");

    }

    @Before("pointCutMy()")
    public void logBeforeMethodExecution(JoinPoint joinPoint) {
        logger.info("执行方法之前，进行日志记录: 被执行的方法是：" + joinPoint.getSignature().getName());
    }
}