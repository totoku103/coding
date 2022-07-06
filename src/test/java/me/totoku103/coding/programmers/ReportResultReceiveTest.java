package me.totoku103.coding.programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class ReportResultReceiveTest {

    public static Stream<Arguments> provider() {
        Stream<Arguments> build = Stream.<Arguments>builder()
                .add(new Arguments(
                        new String[]{"muzi", "frodo", "apeach", "neo"},
                        new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
                        2,
                        new int[]{2, 1, 1, 0}))
                .add(new Arguments(
                        new String[]{"con", "ryan"},
                        new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},
                        3,
                        new int[]{0, 0}))
                .build();
        return build;
    }

    @ParameterizedTest
    @MethodSource(value = {"provider"})
    @DisplayName("신고 결과 받기")
    public void solution(Arguments arguments) {
        final int[] solution = new ReportResultReceive().solution(arguments.getIdList(), arguments.getReport(), arguments.getK());
        Assertions.assertArrayEquals(arguments.getResult(), solution);
    }

    public static class Arguments {
        private String[] idList;
        private String[] report;
        private int k;
        private int[] result;

        public Arguments(String[] idList, String[] report, int k, int[] result) {
            this.idList = idList;
            this.report = report;
            this.k = k;
            this.result = result;
        }

        public String[] getIdList() {
            return idList;
        }

        public String[] getReport() {
            return report;
        }

        public int getK() {
            return k;
        }

        public int[] getResult() {
            return result;
        }
    }
}