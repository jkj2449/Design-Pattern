package observer;

import org.junit.Test;

public class ObserverTest {
    @Test
    public void test() {
        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
        scoreRecord.setDataSheetView(dataSheetView);

        for (int index = 1; index <= 5; index++) {
            int score = index * 10;
            System.out.println("Adding " + score);

            // 10 20 30 40 50을 추가함, 추가할 때마다 최대 3개의 점수만 출력함
            scoreRecord.addScore(score);
        }
    }
}
