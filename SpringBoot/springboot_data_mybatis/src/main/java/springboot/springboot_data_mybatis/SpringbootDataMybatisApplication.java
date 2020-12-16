package springboot.springboot_data_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//使用MapperScan批量扫描所有的mapper
@MapperScan(value = "springboot.springboot_data_mybatis.mapper")
@SpringBootApplication
public class SpringbootDataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDataMybatisApplication.class, args);
    }

}
