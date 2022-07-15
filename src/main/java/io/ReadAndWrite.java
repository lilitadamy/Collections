package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {
    FileReader in = null;
    FileWriter out = null;

    public ReadAndWrite(String in, String out) throws IOException {
        this.in = new FileReader(in);
        this.out = new FileWriter(out);

        try {
            this.in = new FileReader(in);
            this.out = new FileWriter(out);

            int c;
            while ((c = this.in.read()) != -1) {
                this.out.write(c);
            }
        }finally {
            if (in != null) {
                this.in.close();
            }
            if (out != null) {
                this.out.close();
            }
        }
    }
}
