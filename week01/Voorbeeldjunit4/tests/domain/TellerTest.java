package domain;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class TellerTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Teller.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    private
    Teller
            teller;

    @Before
    public void
    setUp()
            throws
            Exception {
        teller
                =
                new
                        Teller();
    }

    @Test
    public void
    add() {
        teller
                .add();
        teller
                .add();
        assertEquals
                (
                        2
                        ,
                        teller
                                .getTeller());
    }

    @Test
    public void
    reset() {
    }

}
