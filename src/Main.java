import model.Person;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        final String FILE_IN = "src" + File.separator + "data" + File.separator + "input.txt";

        final String FILE_OUT = "src" + File.separator + "data" + File.separator + "output.txt";

        Person person1 = null;

        try(BufferedReader br = new BufferedReader(new FileReader(FILE_IN))){

            String fileLine = br.readLine().trim();
            String[] objFields = fileLine.split(" ");
            person1 = new Person(objFields[0], Integer.parseInt(objFields[1]), Double.parseDouble(objFields[2]));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(person1);

    }
}
