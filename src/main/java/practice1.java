import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

class practice1 {

    public static final Predicate<Integer> EVEN_PREDICATE = integer -> integer % 2 == 0;
    public static final Predicate<Integer> ODD_PREDICATE = integer -> integer % 2 != 0;

    public static Integer getFirstEven(Stream<Integer> stream) {
        return getFirstEvenInner(stream).get();
    }

    public static String getFirstEvenString(Stream<Integer> stream) {
        return normalizeResult(getFirst(stream, EVEN_PREDICATE));
    }

    public static String getFirstOddString(Stream<Integer> stream) {
        return normalizeResult(getFirst(stream, ODD_PREDICATE));
    }

    private static String normalizeResult(Optional<Integer> first) {
        return first.map(Objects::toString).orElse("NONE");
    }

    private static Optional<Integer> getFirstEvenInner(Stream<Integer> stream) {
        return getFirst(stream, EVEN_PREDICATE);
    }

    private static Optional<Integer> getFirst(Stream<Integer> stream, Predicate<Integer> integerPredicate) {
        return stream.filter(integerPredicate).findFirst();
    }
}