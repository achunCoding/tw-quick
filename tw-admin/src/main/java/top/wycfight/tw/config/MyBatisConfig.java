package top.wycfight.tw.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan({"top.wycfight.tw.mapper","top.wycfight.tw.dao"})
public class MyBatisConfig {
}