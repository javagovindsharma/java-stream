package com.stream.java_stream.lectures;


import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.function.Predicate;
import org.junit.Test;

public class Lecture06 {

  final Predicate<Integer> numbersLessThan10 = n -> n > 5 && n < 10;

  @Test
  public void findAny() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  }

  @Test
  public void findFirst() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  }
}

