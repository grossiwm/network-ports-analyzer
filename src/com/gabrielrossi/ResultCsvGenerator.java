package com.gabrielrossi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class ResultCsvGenerator {
    public static void generate(Set<Result> results, String outputName) {

        File file = new File("files/output/"+outputName+".csv");
        try (
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter writer = new BufferedWriter(fileWriter)
                ) {

            results.forEach(r-> {
                try {
                    StringBuilder line = new StringBuilder(r.toString());
                    List<String> shifts = List.of("dawn","evening", "morning", "night");
                    for (String s : shifts) {
                        if (outputName.contains(s))
                            line.append(";").append(s);
                    }
                    writer.write(line.toString());
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
