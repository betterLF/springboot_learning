package springboot.springboot_task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class SpringbootTaskApplicationTests {


    @Autowired
    JavaMailSenderImpl javaMailSender;
    @Test
    void contextLoads() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        //邮件设置
        simpleMailMessage.setSubject("通知今晚开会");
        simpleMailMessage.setText("今晚7点开会");
        simpleMailMessage.setTo("1259846094@qq.com");
        simpleMailMessage.setFrom("2953569760@qq.com");
        javaMailSender.send(simpleMailMessage);
    }

    @Test
    public void test02() throws MessagingException {
        //1、创建一个复杂的消息邮件
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        //邮件设置
        helper.setSubject("通知-今晚开会");
        helper.setText("<b style='color:red'>今天 7:30 开会</b>",true);

        helper.setTo("1259846094@qq.com");
        helper.setFrom("2953569760@qq.com");

        //上传文件
        helper.addAttachment("1.jpg",new File("D:\\下载.jpg"));

       javaMailSender.send(mimeMessage);
    }

}
