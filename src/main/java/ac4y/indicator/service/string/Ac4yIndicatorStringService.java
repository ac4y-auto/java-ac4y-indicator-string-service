package ac4y.indicator.service.string;

import ac4y.indicator.service.object.Ac4yIndicatorObjectService;
import ac4y.indicator.service.object.transfer.TransferRequest;

import javax.xml.bind.JAXBException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ac4yIndicatorStringService {

	private static final Logger LOG = LogManager.getLogger(Ac4yIndicatorStringService.class);
	
	// * transfer

	public String transfer(String request) throws JAXBException {

		return new Ac4yIndicatorObjectService().transfer(
						(TransferRequest) new TransferRequest().getFromJson(request)
				).getAsJson();

	} // transfer

} // Ac4yIndicatorStringService