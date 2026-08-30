package og;

import com.google.android.gms.internal.ads.wd0;
import java.util.Locale;
import ya.dc;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final sg.h f21979d;
    public static final sg.h e;

    /* renamed from: f, reason: collision with root package name */
    public static final sg.h f21980f;

    /* renamed from: g, reason: collision with root package name */
    public static final sg.h f21981g;

    /* renamed from: h, reason: collision with root package name */
    public static final sg.h f21982h;
    public static final sg.h i;

    /* renamed from: a, reason: collision with root package name */
    public final sg.h f21983a;

    /* renamed from: b, reason: collision with root package name */
    public final sg.h f21984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21985c;

    static {
        char[] cArr = sg.h.f25275x;
        f21979d = dc.a(":");
        e = dc.a(":status");
        f21980f = dc.a(":method");
        f21981g = dc.a(":path");
        f21982h = dc.a(":scheme");
        i = dc.a(":authority");
    }

    public b(sg.h hVar, sg.h hVar2) {
        this.f21983a = hVar;
        this.f21984b = hVar2;
        this.f21985c = hVar2.b() + hVar.b() + 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f21983a.equals(bVar.f21983a) && this.f21984b.equals(bVar.f21984b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21984b.hashCode() + ((this.f21983a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String i10 = this.f21983a.i();
        String i11 = this.f21984b.i();
        byte[] bArr = jg.b.f19199a;
        Locale locale = Locale.US;
        return wd0.n(i10, ": ", i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(sg.h hVar, String str) {
        this(hVar, dc.a(str));
        char[] cArr = sg.h.f25275x;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(dc.a(str), dc.a(str2));
        char[] cArr = sg.h.f25275x;
    }
}
