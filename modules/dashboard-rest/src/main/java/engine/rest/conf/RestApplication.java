package engine.rest.conf;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestApplication extends Application {


	@Override
    public Set<Object> getSingletons() {

        Set<Object> singletons = new HashSet<>();

        singletons.add(this);

        ObjectMapper mapper = new ObjectMapper();

        mapper.setSerializationInclusion(Include.NON_EMPTY);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        singletons.add(new OsgiJacksonJaxbJsonProvider(mapper,
            OsgiJacksonJaxbJsonProvider.DEFAULT_ANNOTATIONS));

        return Collections.unmodifiableSet(singletons);
    }

}