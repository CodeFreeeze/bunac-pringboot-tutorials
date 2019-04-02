package gloffice.config.database.mysql;

//import javax.inject.Inject;
//import javax.sql.DataSource;

//@Configuration
//@EnableConfigurationProperties({JpaProperties.class})
//@EnableJpaRepositories(basePackages =  {"com.pccw.immd.cdsapi.dao","com.pccw.immd.cdsapi.repository"}
//        ,entityManagerFactoryRef = "commonEmf"
//        ,transactionManagerRef = "transactionManager"
//)
//@ComponentScan(basePackages = {"gloffice"})
//@Profile("glofficeDsp")
public class DefaultDBConfiguration extends JpaDBConfig {

//    private final Logger LOG = LoggerFactory.getLogger(DefaultDBConfiguration.class);
//
//    @Inject
//    private Environment env;
//
//    @Primary
//    @Bean("defaultDsp")
//    @Profile("glofficeDsp")
//    @ConfigurationProperties(prefix = "gloffice.datasource")
//    public DataSourceProperties cdsapiDsp() {
//        LOG.info("read DataSourceProperties for gloffice.datasource");
//        return new DataSourceProperties();
//    }
//
//    @Primary
//    @Profile("glofficeDsp")
//    @Bean("commonDs")
//    @ConfigurationProperties(prefix = "gloffice.datasource")
//    public DataSource dataSourceGLoffice(@Qualifier("glofficeDsp") DataSourceProperties dsProperties) {
//        if (env.acceptsProfiles("release")) { //release version must use JNDI
//            return processJndiDs(dsProperties);
//        } else {
//            return DataSourceBuilder.create().type(AtomikosDataSourceBean.class).build();
//        }
//    }
//
//
//    @Primary
//    @Bean(name = "commonEmf")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("commonDs") DataSource dataSource) {
//        return builder.dataSource(dataSource)
//                .packages(new String[]{"gloffice.domain.entity"})
//                .jta(true)
//                .persistenceUnit("cdsPersistenceUnit")
//                .properties(super.additionalMapPara(dataSource))
//                .build();
//    }






}
