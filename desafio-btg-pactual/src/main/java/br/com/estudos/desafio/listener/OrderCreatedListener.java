package br.com.estudos.desafio.listener;

import static br.com.estudos.desafio.config.ApplicationConfiguration.ORDER_CREATED_QUEUE;

import br.com.estudos.desafio.listener.dto.OrderCreatedEvent;
import br.com.estudos.desafio.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedListener {

    private final Logger logger = LoggerFactory.getLogger(OrderCreatedListener.class);
    private final OrderService orderService;

    public  OrderCreatedListener(OrderService orderService) {
        this.orderService = orderService;
    }
    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message) {
        logger.info("message consumed: {}", message);
        orderService.save(message.getPayload());

    }
}
