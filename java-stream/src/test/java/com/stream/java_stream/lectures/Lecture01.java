package com.stream.java_stream.lectures;

import java.io.IOException;
import java.util.List;
import org.junit.Test;
import com.google.common.collect.ImmutableList;
import com.stream.java_stream.beans.Person;
import com.stream.java_stream.mockdata.MockData;


public class Lecture01 {

  @Test
  public void imperativeApproach() throws IOException {
    List<Person> people = MockData.getPeople();
    // 1. Find people aged less or equal 18
    // 2. Then change implementation to find first 10 people

  }

  @Test
  public void declarativeApproachUsingStreams() throws Exception {
    ImmutableList<Person> people = MockData.getPeople();

  }
}
