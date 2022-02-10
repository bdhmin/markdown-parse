import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void markdownTest1() throws IOException {
        // Path fileName = Path.of("break-file-3.md");
        // String contents = Files.readString(fileName);
        // ArrayList<String> links = MarkdownParse.getLinks(contents);	
        // assertEquals(List.of(), links);

        String contents2 = Files.readString(Path.of("./test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents2), expect);
    }

    @Test
    public void markdownTest2() throws IOException {
        String contents = Files.readString(Path.of("./test-file6.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void markdownTest3() throws IOException {
        String contents = Files.readString(Path.of("./test-file7.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void markdownTest4() throws IOException {
        String contents = Files.readString(Path.of("./test-file8.md"));
        List<String> expect = List.of("a link on the first line");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    
}
