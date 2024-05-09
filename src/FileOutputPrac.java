import java.io.*;

public class FileOutputPrac {
    public static void main(String[] args) throws IOException {
        // 문자열을 파일에 작성할 때 FileOutputStream 은 String을 Byte 로 변환해야하기 때문에 번거롭다.
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\JHSHIN\\Desktop\\temp.txt");
//
//        for (int i = 1; i < 11; i++) {
//            String data = i + "번째 줄입니다.\r\n";
//            fos.write(data.getBytes());
//        }
//        fos.close();

        // FileWriter 을 사용하면 FileOutputStream 을 이용하는 것보다 간편하지만,
        // 문자열 마지막에 줄바꿈 기호를 삽입해줘야하는 번거로움이 있다.
//        FileWriter fw = new FileWriter("C:\\Users\\JHSHIN\\Desktop\\temp2.txt");
//        for (int i = 1; i < 11; i++) {
//            String data = i + "번째 줄입니다.\r\n";
//            fw.write(data);
//        }
//
//        fw.close();

        // PrintWriter 을 사용하면 FileWriter 을 사용했을 때의 번거로움이 없다.
        PrintWriter pw = new PrintWriter("C:\\Users\\JHSHIN\\Desktop\\temp3.txt");
        for (int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.";
            pw.println(data);
        }
        pw.close();
    }
}
