package tio.buffered;

import java.io.*;
import java.util.HashMap;

public class CopySort {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> hashMap=new HashMap<String, String>();
        BufferedReader bufferedReader =new BufferedReader(new FileReader("/Users/tanzi/Documents/uploads/2020/stringcut/stringcutsource.txt"));
        BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter("/Users/tanzi/Documents/uploads/2020/stringcut/out.txt"));
        String line;
        while((line=bufferedReader.readLine())!=null){
            String[] arr= line.split("\\.");
            hashMap.put(arr[0],arr[1]);
        }
        for (String key : hashMap.keySet()) {
            String value =hashMap.get(key);
            line=key +"."+value;
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();

    }
}
