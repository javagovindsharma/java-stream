package com.stream.java_stream.lectures;

import com.stream.java_stream.beans.Person;
import java.util.List;
import java.util.stream.IntStream;
import com.stream.java_stream.mockdata.MockData;
import org.junit.Test;

public class Lecture02 {

  @Test
  public void range() throws Exception {

  }

  @Test
  public void rangeIteratingLists() throws Exception {
    List<Person> people = MockData.getPeople();

  }

  @Test
  public void intStreamIterate() throws Exception {
      IntStream.iterate(0, operand -> operand + 1)
          .filter(number -> number % 2 == 0)
          .limit(20)
          .forEach(System.out::println);
  }
}
