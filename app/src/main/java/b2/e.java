package b2;
import i1.k;

import com.google.android.gms.internal.ads.wd0;

/* loaded from: classes.dex */
public final class e implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final e f1441a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f1442b;

    @Override // k
    public final boolean b() {
        Boolean bool = f1442b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw wd0.m("canFocus is read before it is written");
    }

    @Override // k
    public final void d(boolean z3) {
        f1442b = Boolean.valueOf(z3);
    }
}
