package demo;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Map<String, String> get() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Message", "Hello Azure...");
		return map;
	}
	
	@GET
	@Path("/error")
	@Produces({ MediaType.APPLICATION_JSON })
	public void error() {
		int a = 1/0;
	}

}
