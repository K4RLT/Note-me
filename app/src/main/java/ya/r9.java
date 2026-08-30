package ya;
import j.b;
import b1.h;
import e7.d;
import ic.a;
import ic.j;

import android.content.Context;
import com.google.android.gms.internal.ads.yh0;

/* loaded from: classes.dex */
public abstract class r9 {
    public static a a(String str, String str2) {
        a aVar = new a(str, str2);
        yh0 b10 = a.b(a.class);
        b10.f12880w = 1;
        b10.f12883z = new h(10, aVar);
        return b10.b();
    }

    public static a b(String str, androidx.datastore.preferences.protobuf.s1 s1Var) {
        yh0 b10 = a.b(a.class);
        b10.f12880w = 1;
        b10.a(j.b(Context.class));
        b10.f12883z = new d(str, 6, s1Var);
        return b10.b();
    }
}
