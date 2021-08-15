package kernel;

import java.lang.reflect.*;
import java.util.*;
import static java.lang.System.*;

public class Boot {

    private Boot() {
    }

    private static void usage() {
        err.println("usage: Boot" + " <cacheSize> <diskName> <diskSize> <shell>" + " [ <shell parameters> ...]");
        exit(-1);
    }
}