package lyh.example.flowable;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication()
// 扫描 mybatis mapper 包路径
@MapperScan(basePackages = {
        "lyh.example.flowable"
})
public class FlowableDemoApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Flowable!" );
        SpringApplication.run(FlowableDemoApp.class, args);
    }
}
