package generators.interfaces;

import java.util.List;

public interface Generator<T> {

    List<T> generate(int count);

}
