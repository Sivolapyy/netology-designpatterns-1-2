import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    protected int threshold;

    public Filter(int treshold) {
        this.threshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result;

        for (int i : source) {
            if (i <= threshold) {
                logger.log("Элемент " + i + " не проходит");
            } else {
                logger.log("Элемент " + i + " проходит");
            }
        }

        result = source.stream().filter(e -> e > threshold).collect(Collectors.toList());
        logger.log("Прошло фильтр " + result.size() + " элементов из " + source.size());
        return result;
    }

}