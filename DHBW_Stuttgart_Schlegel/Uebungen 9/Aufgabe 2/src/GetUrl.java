import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class GetUrl
{
    public static void main(String[] args)
    {
        InputStream l_Input = null;
        OutputStream l_Output = null;
        try
        {
            // Check the arguments
            if ((args.length != 1) && (args.length != 2))
                throw new IllegalArgumentException("Wrong number of arguments");

            // Set up the streams
            URL l_Url = new URL(args[0]);   // Create the URL
            l_Input = l_Url.openStream();        // Open a stream to it
            if (args.length == 2)   // Get an appropriate output stream
                l_Output = new FileOutputStream(args[1]);
            else l_Output = System.out;

            // Now copy bytes from the URL to the output stream
            byte[] l_ByteBuffer = new byte[4096];
            int l_BytesRead;
            while((l_BytesRead = l_Input.read(l_ByteBuffer)) != -1)
            {
                l_Output.write(l_ByteBuffer, 0, l_BytesRead);
            }
        }
        // On exceptions, print error message and usage message.
        catch (Exception ex) {
            System.err.println(ex);
            System.err.println("Usage: java GetURL  []");
        }
        finally {  // Always close the streams, no matter what.
            try { l_Input.close();  l_Output.close(); } catch (Exception ex) {}
        }
    }
}
