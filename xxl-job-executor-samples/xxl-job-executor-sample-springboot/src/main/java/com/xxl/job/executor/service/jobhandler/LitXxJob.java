package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author LeeTao
 * @Date 2022/6/28 15:40
 * @Dxplanation 测试job
 *  * 开发步骤：
 *  *    1、任务开发：在Spring Bean实例中，开发Job方法；
 *  *    2、注解配置：为Job方法添加注解 "@XxlJob(value="自定义jobhandler名称", init = "JobHandler初始化方法",
 *  *      destroy = "JobHandler销毁方法")"，注解value值对应的是调度中心新建任务的JobHandler属性的值。
 *  *    3、执行日志：需要通过 "XxlJobHelper.log" 打印执行日志；
 *  *    4、任务结果：默认任务结果为 "成功" 状态，不需要主动设置；如有诉求，比如设置任务结果为失败，
 *  *      可以通过 "XxlJobHelper.handleFail/handleSuccess" 自主设置任务结果；
 */
@Component
@Slf4j
public class LitXxJob {
    private static Logger logger = LoggerFactory.getLogger(SampleXxlJob.class);

    //每分钟执行corn表达式0 * * * * ?
    @XxlJob("testLtJob")
    public void testLtJob(){
        XxlJobHelper.log(" 你好 testLtJob ");
        logger.info("testLtJob成功");


    }

}
