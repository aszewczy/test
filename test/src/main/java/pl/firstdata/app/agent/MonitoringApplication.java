package pl.firstdata.app.agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pl.firstdata.app.agent.config.AppConfig;
import pl.firstdata.app.response.builder.MessageParamsConfiguration;
import pl.firstdata.app.response.builder.ResponseLoggerConfiguration;
import pl.firstdata.app.response.message.ResponseLogger;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("pl")
public class MonitoringApplication implements CommandLineRunner {

	@Autowired 
	AppConfig appConfig;
	
	private static final Log log = LogFactory.getLog(MonitoringApplication.class);
	
	@Bean
	public ResponseLoggerConfiguration.Builder responseLoggerConfig() {
		ResponseLoggerConfiguration.Builder responseLoggerConfigurationBuilder = new ResponseLoggerConfiguration.Builder()
				.withMaxSize(appConfig.getMaxSize()).withOutputFileName(appConfig.getOutputFileName() + "\\monitoring_service");
		return responseLoggerConfigurationBuilder;
	}

	@Bean
	public ResponseLogger responseLogger() {
		ResponseLoggerConfiguration.Builder responseLoggerConfig = responseLoggerConfig();
		ResponseLogger responseLogger = new ResponseLogger(responseLoggerConfig.build(),
				new MessageParamsConfiguration());
		return responseLogger;
	}

	public static void main(String[] args) {
		SpringApplication.run(MonitoringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("=======Starting Monitoring Service");	
	}

}
