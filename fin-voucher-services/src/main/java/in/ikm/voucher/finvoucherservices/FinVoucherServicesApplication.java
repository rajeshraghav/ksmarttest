package in.ikm.voucher.finvoucherservices;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class FinVoucherServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinVoucherServicesApplication.class, args);
	}
@Configuration
	public class ModelMapperConfig {
		@Bean
		public ModelMapper modelMapper() {
			return new ModelMapper();
		}
	}
}
