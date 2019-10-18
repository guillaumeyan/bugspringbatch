package com.guillaumeyan.bugspringbatch;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BugspringbatchApplicationTests {

	@Test
	void configPropsTest(@Autowired WebTestClient webClient) {
		webClient.get().uri("/actuator/configprops").exchange().expectStatus().isOk();
	}

}
