package baseline;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

class websiteCreatorTest {

    @Test
    void websiteFolderCreator() {
        websiteCreator w = new websiteCreator();
        File f = w.websiteFolderCreator("test");
        assertTrue(f.exists());
    }

    @Test
    void testHTMLFileCreator() {
        websiteCreator w = new websiteCreator();
        File f = w.HTMLFileCreator("me", "test");
        assertTrue(f.exists());
    }

    @Test
    void testJavaFolderCreator() {
        websiteCreator w = new websiteCreator();
        File f = w.javaFolderCreator("test");
        assertTrue(f.exists());
    }

    @Test
    void testCSSFolderCreator() {
        websiteCreator w = new websiteCreator();
        File f = w.CSSFolderCreator("test");
        assertTrue(f.exists());
    }
}