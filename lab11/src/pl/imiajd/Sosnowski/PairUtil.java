package pl.imiajd.Sosnowski;

public class PairUtil<T> {
    public static <T> Pair<T> swap(Pair<T> duo){
        Pair<T> last_pair = new Pair<>(duo.getFirst(), duo.getSecond());
        duo.swap();
        return last_pair;
    }
}
