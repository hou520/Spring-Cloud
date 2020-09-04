package rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.stereotype.Component;

/**
 * @author WH
 * @version 1.0
 * @date 2019/11/23 13:11
 */
@Component
@RabbitListener(queues = "msm_fanout")
//@RabbitListener(queues = "routing_key.msm_fanout")
public class SmsConsumer implements RabbitTemplate.ConfirmCallback {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("短信队列接受到的消息为" + msg);

    }

    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {

    }
}
