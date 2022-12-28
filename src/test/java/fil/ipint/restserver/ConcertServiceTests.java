package fil.ipint.restserver;

import fil.ipint.Entity.Concert;
import fil.ipint.Exception.NotFoundException;
import fil.ipint.Service.ServiceInterface.ConcertService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ConcertServiceTests {

	@Autowired
	private ConcertService concertService;
	/**
	* Test method for {@link
	//fil.ipint.resaconcert.service.ConcertService#getById(java.lang.Lo
	ng)}.
	* @throws NotFoundException
	 * @throws  
	*/
	@Test
	void testGetById() throws NotFoundException {
	Optional<Concert> res = concertService.getConcertById( 1L );
	assertNotNull(res, "concert found");
	assertThat(res).isNotNull();
	}

}
