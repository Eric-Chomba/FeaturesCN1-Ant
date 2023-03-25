package tests;

import com.codename1.testing.AbstractTest;

import com.codename1.ui.Display;

public class UnnamedTest2 extends AbstractTest {
    public boolean runTest() throws Exception {
        waitForFormTitle("Features lang :en");
        pointerPress(0.45106384f, 0.23163842f, new int[]{0, 39});
        waitFor(116);
        pointerRelease(0.45106384f, 0.23163842f, new int[]{0, 39});
        waitForUnnamedForm();
        Display.getInstance().getCurrent().setName("Form_1");
        waitForFormTitle("Fingerprint Authentication");
        Display.getInstance().getCurrent().setName("Form_2");
        setText(new int[]{0, 0, 0, 0, 0}, "eric");
        setText(new int[]{0, 0, 0, 1, 0}, "123");
        clickButtonByLabel("Send");
        pointerPress(0.3970588f, 0.21691176f, new int[]{0, 0, 1, 0, 0});
        waitFor(83);
        pointerRelease(0.3970588f, 0.21691176f, new int[]{0, 0, 1, 0, 0});
        pointerPress(0.3970588f, 0.4375f, new int[]{0, 0, 1, 0, 0});
        waitFor(146);
        pointerRelease(0.3970588f, 0.4375f, new int[]{0, 0, 1, 0, 0});
        assertEqual(getToolbarCommands().length, 2);
        executeToolbarCommandAtOffset(0);
        waitForFormTitle("Features lang :en");
        Display.getInstance().getCurrent().setName("Form_3");
        pointerPress(0.35106382f, 0.37288135f, new int[]{0, 36});
        waitFor(40);
        pointerRelease(0.35106382f, 0.37288135f, new int[]{0, 36});
        waitForUnnamedForm();
        Display.getInstance().getCurrent().setName("Form_4");
        waitForFormTitle("L10N & I18N");
        Display.getInstance().getCurrent().setName("Form_5");
        clickButtonByLabel("Swahili");
        clickButtonByLabel("Sheng");
        assertEqual(getToolbarCommands().length, 2);
        executeToolbarCommandAtOffset(0);
        waitForFormName("Form_3");
        pointerPress(0.4638298f, 0.4463277f, new int[]{0, 37});
        waitFor(147);
        pointerRelease(0.4638298f, 0.4463277f, new int[]{0, 37});
        waitForUnnamedForm();
        Display.getInstance().getCurrent().setName("Form_6");
        waitForFormTitle("L10N Manager");
        Display.getInstance().getCurrent().setName("Form_7");
        assertEqual(getToolbarCommands().length, 2);
        executeToolbarCommandAtOffset(0);
        waitForFormName("Form_3");
        pointerPress(0.5425532f, 0.43220338f, new int[]{0, 33});
        waitFor(145);
        pointerRelease(0.5425532f, 0.43220338f, new int[]{0, 33});
        waitForUnnamedForm();
        Display.getInstance().getCurrent().setName("Form_8");
        waitForFormTitle("Files Parsing");
        Display.getInstance().getCurrent().setName("Form_9");
        clickButtonByLabel("JSON");
        clickButtonByLabel("XML");
        assertEqual(getToolbarCommands().length, 2);
        executeToolbarCommandAtOffset(0);
        waitForFormName("Form_3");
        assertTitle("Features lang :en");
        assertTitle("Features lang :en");
        assertTitle("Features lang :en");
        assertTitle("Features lang :en");
        assertLabel("Icon");
        assertLabel("User");
        assertLabel("Input");
        assertLabel("Icon");
        assertLabel("Images");
        assertLabel("Icon");
        assertLabel("Crop");
        assertLabel("Image");
        assertLabel("Icon");
        assertLabel("Maps");
        assertLabel("Icon");
        assertLabel("Route on");
        assertLabel("Map");
        assertLabel("Icon");
        assertLabel("SQLite");
        assertLabel("Icon");
        assertLabel("Tabs");
        assertLabel("Fragments");
        assertLabel("Icon");
        assertLabel("Dync OnBoard");
        assertLabel("&Carousel");
        assertLabel("Icon");
        assertLabel("Bottom");
        assertLabel("Navigation");
        assertLabel("Icon");
        assertLabel("Inifinite Adapter");
        assertLabel("&Container");
        assertLabel("Icon");
        assertLabel("Lists");
        assertLabel("Icon");
        assertLabel("Dynamic");
        assertLabel("Table");
        assertLabel("Icon");
        assertLabel("Trees");
        assertLabel("Icon");
        assertLabel("Dynamic");
        assertLabel("Accordion");
        assertLabel("Icon");
        assertLabel("");
        assertLabel("Share");
        assertLabel("Icon");
        assertLabel("Media");
        assertLabel("Player");
        assertLabel("Icon");
        assertLabel("Pull to");
        assertLabel("Refresh");
        assertLabel("Icon");
        assertLabel("Images");
        assertLabel("View Flip");
        assertLabel("Icon");
        assertLabel("Read");
        assertLabel("SMS");
        assertLabel("Icon");
        assertLabel("Toolbar");
        assertLabel("Search");
        assertLabel("Icon");
        assertLabel("Contacts");
        assertLabel("Icon");
        assertLabel("Collapsing");
        assertLabel("Toolbar");
        assertLabel("Icon");
        assertLabel("Web");
        assertLabel("Icon");
        assertLabel("JavaScript");
        assertLabel("Interation");
        assertLabel("Icon");
        assertLabel("Pickers");
        assertLabel("Icon");
        assertLabel("Swipe");
        assertLabel("Container");
        assertLabel("Icon");
        assertLabel("Charts &");
        assertLabel("Graphs");
        assertLabel("Icon");
        assertLabel("Signature");
        assertLabel("Icon");
        assertLabel("Animation");
        assertLabel("Icon");
        assertLabel("Transition");
        assertLabel("Icon");
        assertLabel("Local");
        assertLabel("Storage");
        assertLabel("Icon");
        assertLabel("Networking");
        assertLabel("Icon");
        assertLabel("Externalize");
        assertLabel("Icon");
        assertLabel("Files");
        assertLabel("Parsing");
        assertLabel("Icon");
        assertLabel("Properties");
        assertLabel("Icon");
        assertLabel("Phone");
        assertLabel("Icon");
        assertLabel("Localization");
        assertLabel("Icon");
        assertLabel("Localization");
        assertLabel("Manager");
        assertLabel("Icon");
        assertLabel("Graphics &");
        assertLabel("Drawing");
        assertLabel("Icon");
        assertLabel("Fingerprint");
        assertLabel("Auth");
        screenshotTest("UnnamedTest2_1");
        assertLabel("Icon");
        assertLabel("User");
        assertLabel("Input");
        assertLabel("Icon");
        assertLabel("Images");
        assertLabel("Icon");
        assertLabel("Crop");
        assertLabel("Image");
        assertLabel("Icon");
        assertLabel("Maps");
        assertLabel("Icon");
        assertLabel("Route on");
        assertLabel("Map");
        assertLabel("Icon");
        assertLabel("SQLite");
        assertLabel("Icon");
        assertLabel("Tabs");
        assertLabel("Fragments");
        assertLabel("Icon");
        assertLabel("Dync OnBoard");
        assertLabel("&Carousel");
        assertLabel("Icon");
        assertLabel("Bottom");
        assertLabel("Navigation");
        assertLabel("Icon");
        assertLabel("Inifinite Adapter");
        assertLabel("&Container");
        assertLabel("Icon");
        assertLabel("Lists");
        assertLabel("Icon");
        assertLabel("Dynamic");
        assertLabel("Table");
        assertLabel("Icon");
        assertLabel("Trees");
        assertLabel("Icon");
        assertLabel("Dynamic");
        assertLabel("Accordion");
        assertLabel("Icon");
        assertLabel("");
        assertLabel("Share");
        assertLabel("Icon");
        assertLabel("Media");
        assertLabel("Player");
        assertLabel("Icon");
        assertLabel("Pull to");
        assertLabel("Refresh");
        assertLabel("Icon");
        assertLabel("Images");
        assertLabel("View Flip");
        assertLabel("Icon");
        assertLabel("Read");
        assertLabel("SMS");
        assertLabel("Icon");
        assertLabel("Toolbar");
        assertLabel("Search");
        assertLabel("Icon");
        assertLabel("Contacts");
        assertLabel("Icon");
        assertLabel("Collapsing");
        assertLabel("Toolbar");
        assertLabel("Icon");
        assertLabel("Web");
        assertLabel("Icon");
        assertLabel("JavaScript");
        assertLabel("Interation");
        assertLabel("Icon");
        assertLabel("Pickers");
        assertLabel("Icon");
        assertLabel("Swipe");
        assertLabel("Container");
        assertLabel("Icon");
        assertLabel("Charts &");
        assertLabel("Graphs");
        assertLabel("Icon");
        assertLabel("Signature");
        assertLabel("Icon");
        assertLabel("Animation");
        assertLabel("Icon");
        assertLabel("Transition");
        assertLabel("Icon");
        assertLabel("Local");
        assertLabel("Storage");
        assertLabel("Icon");
        assertLabel("Networking");
        assertLabel("Icon");
        assertLabel("Externalize");
        assertLabel("Icon");
        assertLabel("Files");
        assertLabel("Parsing");
        assertLabel("Icon");
        assertLabel("Properties");
        assertLabel("Icon");
        assertLabel("Phone");
        assertLabel("Icon");
        assertLabel("Localization");
        assertLabel("Icon");
        assertLabel("Localization");
        assertLabel("Manager");
        assertLabel("Icon");
        assertLabel("Graphics &");
        assertLabel("Drawing");
        assertLabel("Icon");
        assertLabel("Fingerprint");
        assertLabel("Auth");
        screenshotTest("UnnamedTest2_2");
        ensureVisible(new int[]{0, 21, 1, 0, 1});
        ensureVisible(new int[]{0, 39, 1, 0, 0});
        pointerPress(0.26595744f, 0.37570623f, new int[]{0, 25});
        waitFor(127);
        pointerRelease(0.26595744f, 0.37570623f, new int[]{0, 25});
        waitForUnnamedForm();
        Display.getInstance().getCurrent().setName("Form_10");
        waitForFormTitle("Swipe Container");
        Display.getInstance().getCurrent().setName("Form_11");
        ensureVisible("Line4");
        pointerPress(0.090277776f, 0.8070946f, "Form_11");
        waitFor(138);
        pointerRelease(0.090277776f, 0.8070946f, "Form_11");
        assertEqual(getToolbarCommands().length, 2);
        executeToolbarCommandAtOffset(0);
        waitForFormName("Form_3");
        ensureVisible(new int[]{0, 21, 1, 0, 1});
        ensureVisible(new int[]{0, 0, 0, 0, 0});
        pointerPress(0.52340424f, 0.53954804f, new int[]{0, 33});
        waitFor(146);
        pointerRelease(0.52340424f, 0.53954804f, new int[]{0, 33});
        waitForUnnamedForm();
        Display.getInstance().getCurrent().setName("Form_12");
        waitForFormTitle("Files Parsing");
        Display.getInstance().getCurrent().setName("Form_13");
        return true;
    }
}