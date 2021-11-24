package anand.com.springApp.start.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortingAlgorithm{

   public int[] sorted(int[] numbers){
       return numbers;
   }
}
