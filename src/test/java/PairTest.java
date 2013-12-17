import com.atlassian.fugue.Pair;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author rafos
 */
public class PairTest {

	private final Integer id = 123;
	private final String name = "rafos";

	private final Pair<Integer, String> sut = new Pair<Integer, String>(id, name);


	@Test
	public void shouldReturnLeft() throws Exception {
		// given

		// when
		final Integer left = sut.left();

		// then
		assertThat(left, is(id));
	}

	@Test
	public void shouldReturnRight() throws Exception {
		// given

		// when
		final String right = sut.right();

		// then
		assertThat(right, is(name));
	}
}