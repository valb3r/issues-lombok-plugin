import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Delegate;

import java.util.UUID;

public class Issue {

    public static void main(String[] args) {
        Ctx<Integer> ctx = new Ctx<>();
        var data = ctx.getId();
    }

    public static class Ctx<T> {

        @Delegate
        private Param<T> param;
    }

    @Getter
    @Builder
    public static class Param<T> {

        private final UUID id;
    }
}
