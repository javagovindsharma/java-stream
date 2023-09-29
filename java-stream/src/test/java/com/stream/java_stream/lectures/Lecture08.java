package com.stream.java_stream.lectures;


import com.stream.java_stream.beans.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import com.stream.java_stream.mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;

public class Lecture08 {

  @Test
  public void simpleGrouping() throws Exception {

  }

  @Test
  public void groupingAndCounting() throws Exception {
    ArrayList<String> names = Lists
        .newArrayList(
            "John",
            "John",
            "Mariam",
            "Alex",
            "Mohammado",
            "Mohammado",
            "Vincent",
            "Alex",
            "Alex"
        );


  }

}