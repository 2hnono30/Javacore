package TimGiaTriLonNhatAndGhiRaFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()){throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine())!= null){numbers.add(Integer.parseInt(line));}
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }
    public void writeFile (String path, int max){
        try {
            FileWriter fileWriter = new FileWriter(path,true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write("Giá Trị Lớn Nhất : " + max);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int findMax (List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0;i<numbers.size();i++){
            if(max<numbers.get(i)) max= numbers.get(i);
        }return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("G:\\Javacore\\Javacore\\IO_TestFile\\src\\TimGiaTriLonNhatAndGhiRaFile\\dataBate\\number.txt");
        int maxvalue = findMax(numbers);
        readAndWriteFile.writeFile("G:\\Javacore\\Javacore\\IO_TestFile\\src\\TimGiaTriLonNhatAndGhiRaFile\\dataBate\\result.txt",maxvalue);
    }
}
