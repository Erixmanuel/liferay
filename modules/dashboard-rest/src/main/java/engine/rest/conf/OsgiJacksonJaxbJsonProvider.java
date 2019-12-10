package engine.rest.conf;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.cfg.Annotations;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.osgi.service.component.annotations.Component;

@Component(service = JacksonJaxbJsonProvider.class)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OsgiJacksonJaxbJsonProvider extends JacksonJaxbJsonProvider {

    public OsgiJacksonJaxbJsonProvider() {
        super();
    }

    public OsgiJacksonJaxbJsonProvider(Annotations... annotationsToUse) {
        super(annotationsToUse);
    }

    public OsgiJacksonJaxbJsonProvider(ObjectMapper mapper, Annotations[] annotationsToUse) {
        super(mapper, annotationsToUse);
    }

}
