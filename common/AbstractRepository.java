package common;

import java.io.IOException;
import java.util.Map;

public abstract class AbstractRepository {
    public abstract Map<String, ?> save(Map<String, ?> paramMap) throws IOException;

    public abstract Map<String, ?> melon(Map<String, ?> paramMap) throws IOException;
}