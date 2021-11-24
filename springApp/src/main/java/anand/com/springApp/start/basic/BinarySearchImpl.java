package anand.com.springApp.start.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortingAlgorithm sortingAlgorithm;

    public int getNumberOrder(int[] numbers, int number){
        int[] res  = sortingAlgorithm.sorted(numbers);
        return number;
    }
}
