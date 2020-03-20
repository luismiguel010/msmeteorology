package co.com.fac.rest.msmeteorology;

import co.com.fac.rest.msmeteorology.domains.MeteorologyDomainController;
import co.com.fac.rest.msmeteorology.exceptions.BadRequestException;
import co.com.fac.rest.msmeteorology.services.MeteorologyDomainServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MsmeteorologyApplicationTests {

	@Autowired
	MeteorologyDomainController meteorologyDomainController;
	@Autowired
	MeteorologyDomainServiceImpl meteorologyDomainServiceImpl;

	@Test
	public void saveImageInfraredWebTest() throws BadRequestException {
		//Given
		String date = "202003201450";

		//When
		meteorologyDomainServiceImpl.saveImageInfraredWeb(date);




	}



}
