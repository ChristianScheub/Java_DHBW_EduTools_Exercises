package de.hans.wif.lectures.test.utils;

import com.google.common.collect.Lists;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConsoleIOBaseTest extends DecompilerBasedBaseTest {

    public ConsoleIOBaseTest() {
    }

    public ConsoleIOBaseTest(Class<?> classToBeTested) {
        super(classToBeTested);
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    private final InputStream originalIn = System.in;

    protected void flush() {
        try {
            outContent.flush();
            errContent.flush();

            // now clear the output
            outContent.reset();
            errContent.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //@Before
    @org.junit.jupiter.api.BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    //@After
    @org.junit.jupiter.api.AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
        System.setIn(originalIn);
    }

    protected String getErrorOutput(boolean replaceNewLine) {
        originalErr.println(errContent);

        String output = errContent.toString();

        if (replaceNewLine) {
            if (output.contains("\r\n")) {
                output = output.replaceAll("\r\n", " ");
            }

            output = output.replace('\n', ' ').replace('\r', ' ');
        }

        return output.trim();

        /*
        return replaceNewLine ?
                errContent.toString()
                .replace('\n', ' ')
                .replace('\r', ' ')
                .trim() : errContent.toString();
         */
    }

    protected String getConsoleOutput(boolean replaceNewLine) {
        String output = outContent.toString(StandardCharsets.UTF_8);

        originalOut.println(output);

        if (replaceNewLine) {
            if (output.contains("\r\n")) {
                output = output.replaceAll("\r\n", " ");
            }

            output = output.replace('\n', ' ').replace('\r', ' ');
        }

        return output.trim();
    }


    protected String[] getConsoleOutput() {
        return getConsoleOutput(false).split(System.lineSeparator());
    }

    protected String getLastConsoleOutput() {
        return getLastConsoleOutput(1)[0];
    }

    protected String[] getLastConsoleOutput(int lines) {
        final String[] output = getConsoleOutput();
        final List<String> result = Lists.newArrayList();

        for (int i = output.length - lines; i >= 0 && i < output.length; i++, lines--) {
            result.add(output[i]);
        }

        return result.toArray(new String[0]);
    }

    protected void simulateInput(final String input) {
        ScannerInputStream scannerInputStream = new ScannerInputStream(input);
        System.setIn(scannerInputStream);
    }

    protected void printlnStdOut(final String output) {
        originalOut.println(output);
    }

    protected void printlnStdErr(final String output) {
        originalErr.println(output);
    }

    /**
     * ScannerInputStream is an {@link InputStream} which may serve as an input to a {@link java.util.Scanner} object.
     * <br/>
     * A {@code Scanner} usually reads all bytes from a given stream and then parses the contents into tokens.
     * It is, however, notable, that the {@code Scanner} will always read <b>all</b> bytes from the source, even though
     * they contain more than just a single token.
     * If the {@code Scanner} object is dropped, a new {@code Scanner} cannot find any tokens on the now empty source.
     * <br/>
     * Thus, the {@code ScannerInputStream} will split the input by line separation characters into single streams and
     * <i>feed</i> these parts separately into the scanning process.
     * Then, succeeding tokens will <i>survive</i> reading and parsing the initial token and even will survive
     * changing the {@code Scanner} object.
     * <br/>
     * Note, that the stream will mirror each character read to the standard output stream.
     * It is then possible to retrieve the full output from the standard output stream!
     */
    private static class ScannerInputStream extends InputStream {

        protected List<ByteArrayInputStream> inputStreams;

        public ScannerInputStream(final String input) {
            inputStreams = Arrays.stream(input.split(System.lineSeparator()))   // split input by line separation character
                    .map(s -> s.concat(System.lineSeparator()))                 // add a line separation character to each line of input as this signals "end of token" to Scanner objects
                    .map(s -> new ByteArrayInputStream(s.getBytes()))           // build a new ByteArrayInputStream for each line
                    .collect(Collectors.toList());                              // collect those objects in a list
        }

        @Override
        public int read() {
            if (!inputStreams.isEmpty()) {                      // is there still a stream left where we can read from?
                int character = inputStreams.get(0).read();     // try to read a character from the very first stream in the list

                if (-1 == character) {                          // if we reached the end of the very first stream (i.e. it does not have an input anymore) ...
                    inputStreams.remove(0);               // ... we can kick it out of our list because it is exhausted
                } else {
                    System.out.print((char) character);         // mirror the input to the output stream; useful for separating lines later on, because each
                    // input is usually finalized with a line separator character
                }

                return character;                               // return last character read OR -1 if the current stream is exhausted
            }

            return -1;                                          // no more streams: will always say "no character to read!"
        }
    }


}
