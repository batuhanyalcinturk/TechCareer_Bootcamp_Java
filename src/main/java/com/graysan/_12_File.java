package com.graysan;

import java.io.*;
import java.util.Scanner;

public class _12_File {

    private static final String URL = "C:\\..\\UserData.txt";

    public static String getUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birşeyler yazınız");
        String data = scanner.nextLine();
        return data;
    }

    public static void getUserWriter() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(URL, true))) {
            String user = getUser();
            bufferedWriter.write(user+"\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /*String value = "adi1", value2 = "soyadı1";
    System.out.println(value+value2);
    System.out.println(value.concat(value2));*/
    public static void getUserReader() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(URL))) {
            StringBuilder stringBuilder = new StringBuilder();
            String rows = "";
            while ((rows = bufferedReader.readLine()) != null) {
                stringBuilder.append("\n").append(rows);
            }
            String data = stringBuilder.toString();
            System.out.println(data);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

/*
    public static void getUserWriter() throws ArithmeticException, IOException {
        try{
            int sayi=5/0;
            System.out.println(sayi);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("db.close()");
        }
        System.out.println("son satır");
        //throw new ArithmeticException("Hata meydana geldi");
    }
*/

    public static void commonMethod() {
        while (true) {
            Scanner klavye = new Scanner(System.in);
            System.out.println("\nSeçim yapınız");
            System.out.println("1-)Yazma\n2-)Okuma\n3-)Çıkış");
            int chooise = klavye.nextInt();
            switch (chooise) {
                case 1:
                    getUserWriter();
                    break;
                case 2:
                    getUserReader();
                    break;
                case 3:
                    System.out.println("Sistemden çıkış yapılıyor");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Seçim dışında işlem yaptınız");
                    break;
            } //end switch
        } //end while
    } //end method

    public static void main(String[] args) throws IOException {
        commonMethod();
    }
}
