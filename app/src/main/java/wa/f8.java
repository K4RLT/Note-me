package wa;

/* loaded from: classes.dex */
public abstract class f8 {
    public static final boolean a(Throwable th) {
        th.getClass();
        int i = 0;
        while (th != null) {
            int i10 = i + 1;
            if (i >= 4) {
                break;
            }
            String name = th.getClass().getName();
            if (!name.equals("android.database.CursorWindowAllocationException") && !name.equals("android.database.sqlite.SQLiteOutOfMemoryException")) {
                th = th.getCause();
                i = i10;
            } else {
                return true;
            }
        }
        return false;
    }
}
