package com.stream.java_stream.lectures;

import com.stream.java_stream.beans.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.stream.java_stream.mockdata.MockData;
import org.junit.Test;

public class Lecture12 {
  @Test
  public void understandingCollect() throws Exception {
    List<String> emails = MockData.getPeople()
        .stream()
        .map(Person::getEmail)
        .collect(Collectors.toList());

    emails.forEach(System.out::println);
  }
}
