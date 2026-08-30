package hd;

import android.text.TextUtils;
import eb.x;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f18026b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: c, reason: collision with root package name */
    public static k f18027c;

    /* renamed from: a, reason: collision with root package name */
    public final x f18028a;

    public k(x xVar) {
        this.f18028a = xVar;
    }

    public final boolean a(id.a aVar) {
        if (!TextUtils.isEmpty(aVar.f18426c)) {
            long j10 = aVar.f18428f + aVar.e;
            this.f18028a.getClass();
            if (j10 < (System.currentTimeMillis() / 1000) + 3600) {
                return true;
            }
            return false;
        }
        return true;
    }
}
