package cn.com.yzton.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = SecondDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "secondarySqlSessionFactory")
public class SecondDataSourceConfig {
    static final String PACKAGE = "cn.com.yzton.secondary.dao";
    static final String MAPPER_LOCATION = "classpath:cn/com/yzton/secondary/dao/*.xml";

    @Value("${spring.datasource.secondary.driver-class-name}")
    private String driverClass;
    @Value("${spring.datasource.secondary.url}")
    private String url;
    @Value("${spring.datasource.secondary.username}")
    private String username;
    @Value("${spring.datasource.secondary.password}")
    private String password;

    @Bean(name = "secondaryDataSource")
    public DataSource secondaryDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "secondarySqlSessionFactory")
    public SqlSessionFactory secondarySqlSessionFactory(@Qualifier("secondaryDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().
                getResources(SecondDataSourceConfig.MAPPER_LOCATION));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "secondTransactionManager")
    public DataSourceTransactionManager secondTransactionManager() {
        return new DataSourceTransactionManager(secondaryDataSource());
    }
}
