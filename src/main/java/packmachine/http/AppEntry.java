package packmachine.http;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import packmachine.http.boundary.CityResource;
import packmachine.http.boundary.PackResource;
import packmachine.http.boundary.PersonResource;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by krzysztof on 14.10.17.
 */
@ApplicationPath("/")
public class AppEntry extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes= new HashSet<>();
        classes.add(CityResource.class);
        classes.add(PackResource.class);
        classes.add(PersonResource.class);
//        classes.add(GradeResource.class);
        return classes;
    }
}
