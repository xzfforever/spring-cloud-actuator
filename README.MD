
<li>在传统Spring应用中使用spring-boot-actuator模块提供监控端点
>http://blog.didispace.com/spring-boot-actuator-without-boot/

<li>下面的HealthIndicators会被Spring Boot自动配置
        名称	                      描述
DiskSpaceHealthIndicator	低磁盘空间检测
DataSourceHealthIndicator	检查是否能从DataSource获取连接
MongoHealthIndicator	    检查一个Mongo数据库是否可用（up）
RabbitHealthIndicator	    检查一个Rabbit服务器是否可用（up）
RedisHealthIndicator	    检查一个Redis服务器是否可用（up）
SolrHealthIndicator 	    检查一个Solr服务器是否可用（up）

<li>自定义的健康检查实例，见SelfDefineHealthIndicator