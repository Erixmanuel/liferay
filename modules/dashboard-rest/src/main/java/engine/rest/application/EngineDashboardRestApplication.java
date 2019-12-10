package engine.rest.application;

import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.engine.api.EngineApi;
import com.engine.api.model.BranchOfficeDataDTO;

import engine.rest.conf.RestApplication;

/**
 * @author erhernandez
 */
@ApplicationPath("/engine")
@Component(immediate = true, service = Application.class)
public class EngineDashboardRestApplication extends RestApplication {

	@Reference
	private EngineApi engineApi;

	@GET
	@Path("/branch-office")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BranchOfficeDataDTO> getBranchOffice() {

		return engineApi.getBranchOffice();
	}
}
