package wa;
import g5.r;
import q.x;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class y6 {
    public static final r a(Context context, Class cls, String str) {
        if (!mf.f.u(str)) {
            if (!str.equals(":memory:")) {
                return new r(context, cls, str);
            }
            x.n("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        x.n("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }
}
