package me.totoku103.coding.programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LottosHighestAndLowestRankingTest {

    public static Stream<Argument> provider() {
        return Stream.<Argument>builder()
                .add(new Argument(new int[]{44, 1, 0, 0, 31, 25},
                        new int[]{31, 10, 45, 1, 6, 19},
                        new int[]{3, 5}))
                .add(new Argument(new int[]{0, 0, 0, 0, 0, 0},
                        new int[]{38, 19, 20, 40, 15, 25},
                        new int[]{1, 6}))
                .add(new Argument(new int[]{45, 4, 35, 20, 3, 9},
                        new int[]{20, 9, 3, 45, 4, 35},
                        new int[]{1, 1}))
                .build();
    }

    @ParameterizedTest
    @MethodSource(value = {"provider"})
    @DisplayName("로또의 최고 순위와 최저 순위")
    public void solution(Argument argument) {
        final int[] solution = new LottosHighestAndLowestRanking().solution(argument.getLottos(), argument.getWinNums());
        Assertions.assertArrayEquals(argument.getResult(), solution);
    }

    private static class Argument {
        private final int[] lottos;
        private final int[] winNums;
        private final int[] result;

        public Argument(int[] lottos, int[] winNums, int[] result) {
            this.lottos = lottos;
            this.winNums = winNums;
            this.result = result;
        }

        public int[] getLottos() {
            return lottos;
        }

        public int[] getWinNums() {
            return winNums;
        }

        public int[] getResult() {
            return result;
        }
    }
}