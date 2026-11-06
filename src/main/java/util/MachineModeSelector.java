package util;

public final class MachineModeSelector {

    private MachineModeSelector() {}

    public static <T> T selectMode(T[] modes, int mode) {
        if (modes.length == 0) {
            throw new IllegalArgumentException("A machine must have at least one mode");
        }
        // Saved mode indices may outlive recipe maps merged by a GTNH update.
        return modes[Math.max(0, Math.min(mode, modes.length - 1))];
    }
}
