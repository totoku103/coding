package me.totoku103.coding.programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NewIdRecommendTest {

    @ParameterizedTest
    @CsvSource(value = {
            "...!@BaT#*..y.abcdefghijklm, bat.y.abcdefghi",
            "z-+.^., z--",
            "=.=, aaa",
            "123_.def, 123_.def",
            "abcdefghijklmn.p, abcdefghijklmn",
    })
    @DisplayName("신규 아이디 추천")
    public void solution(String newId, String result) {
        final String solution = new NewIdRecommend().solution(newId);
        Assertions.assertEquals(result, solution);
    }
}