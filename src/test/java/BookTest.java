import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.*;

public class BookTest{

    @Test
    public void testNameAttribute() {

        Book obj = new Book("Patterns of Enterprise Application Architecture");
        assertThat(obj, hasProperty("name"));
        assertThat(obj, hasProperty("name", is("Patterns of Enterprise Application Architecture")));

    }


}
