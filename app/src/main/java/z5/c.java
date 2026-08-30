package z5;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f31913c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f31914a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31915b;

    public c(String str, String str2) {
        this.f31914a = str;
        this.f31915b = str2;
        f31913c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f31911a;
        String str = this.f31915b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ((!"eng".equals(str2) && !"userdebug".equals(str2)) || !hashSet.contains(str.concat(":dev"))) {
                return false;
            }
            return true;
        }
        return true;
    }
}
