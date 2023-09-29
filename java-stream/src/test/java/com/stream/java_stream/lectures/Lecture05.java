package com.stream.java_stream.lectures;


import static org.assertj.core.api.Assertions.assertThat;

import com.stream.java_stream.beans.Car;
import com.stream.java_stream.beans.Person;
import com.stream.java_stream.beans.PersonDTO;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import com.stream.java_stream.mockdata.MockData;
import org.junit.Test;

public class Lecture05 {

  @Test
  public void understandingFilter() throws Exception {
    ImmutableList<Car> cars = MockData.getCars();

  }

  @Test
  public void ourFirstMapping() throws Exception {
    // transform from one data type to another
    List<Person> people = MockData.getPeople();

  }

  @Test
  public void averageCarPrice() throws Exception {
    // calculate average of car prices

  }

  @Test
  public void test() throws Exception {

  }
}



