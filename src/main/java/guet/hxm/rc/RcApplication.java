package guet.hxm.rc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
//springboot启动类，在这个类中，引入kaptcha.xml文件
@SpringBootApplication
@MapperScan("guet.hxm.rc.dao")
@ImportResource(locations={"classpath:kaptcha.xml"})
public class RcApplication {

    public static void main(String[] args) {
        SpringApplication.run(RcApplication.class, args);
    }

}
