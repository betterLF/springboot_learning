package springboot.springboot_admq.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import springboot.springboot_admq.bean.Book;


@Service
public class BookService {

//    @RabbitListener(queues = "feili")
    public void receive(Book book){
        System.out.println("收到消息："+book);
    }

//    @RabbitListener(queues = "nq.emp")
    public void receive02(Message message){
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }
}
