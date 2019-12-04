package com.switchfully.gameoflife.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        //GIVEN
        FizzBuzz fizzBuzz = new FizzBuzz();

        //WHEN
        List<String> actual = fizzBuzz.generateFizzBuzz(2);

        //THEN
        Assertions.assertThat(actual).containsExactly("1", "2");
    }
}
