package de.akquinet.arquillian.jm;

import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * @author <a href="mailto:michaelschuetz83@gmail.com">Michael Schuetz</a>
 */
@Local
public interface HelloEJB {

    public String sayHelloEJB(String name);
}
