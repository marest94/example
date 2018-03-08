
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.app.soap.clients.UserClient;
import com.spring.app.soap.configs.UserClientConfig;
import com.spring.app.soap.wsdl.GetUserResponse;

public class RunUserClient {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	        ctx.register(UserClientConfig.class);
	        ctx.refresh();
	        
		UserClient userClient = ctx.getBean(UserClient.class);
		System.out.println("For User ID: 1");
		GetUserResponse response = userClient.getUserById(1);
		System.out.println("Name:" + response.getUser().getName());
		System.out.println("LastName:" + response.getUser().getLastName());
		System.out.println("YearOfBirth:" + response.getUser().getYearOfBirth());
	}
} 