package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        //다차원 배열 (2차원 배열)
        //소규모 영화관 좌석
        //A1 - A5
        //B1 - B5
        //C1 - C5

//        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
//        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
//        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};
        // option 드래그 꿀팁!

        //2차원 배열 - (3 x 5 크기)
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        //B2에 접근하려면?
        System.out.println(seats[1][1]);

        //C5에 접근하려면?
        System.out.println(seats[2][4]);


        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        //A3에 접근하려면?
        System.out.println(seats2[0][2]);

        //A5에 접근하려면?
        // System.out.println(seats2[0][4]); <- 배열의 범위를 벗어난다. Error

        //보통 실무는 2차원 정도.

        //3차원 배열 만들기 -> 실무에서는 거의 안씀 (세로 x 가로 x 높이)
        String[][][] marray = new String[][][] {
                { {}, {}, {} },
                { {}, {}, {} },
                { {}, {}, {} }
        };
    }
}
