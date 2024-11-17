package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        System.out.println("dataA의 주소값: " + dataA);
        changeReference(dataA);
        System.out.println("\n메서드 호출 후: dataA.value = " + dataA.value);
    }

    static void changeReference(Data dataX) {
        System.out.println("\n파라미터로 받은 dataX의 주소값: " + dataX);
        dataX.value = 20;
    }
}
