package eb;
import b.a;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class u2 extends d3 {
    public final s0 A;
    public final s0 B;
    public final s0 C;
    public final s0 D;

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f16387y;

    /* renamed from: z, reason: collision with root package name */
    public final s0 f16388z;

    public u2(h3 h3Var) {
        super(h3Var);
        this.f16387y = new HashMap();
        this.f16388z = new s0(s(), "last_delete_stale", 0L);
        this.A = new s0(s(), "backoff", 0L);
        this.B = new s0(s(), "last_upload", 0L);
        this.C = new s0(s(), "last_upload_attempt", 0L);
        this.D = new s0(s(), "midnight_offset", 0L);
    }

    @Override // eb.d3
    public final boolean A() {
        return false;
    }

    public final String B(String str, boolean z3) {
        String str2;
        u();
        if (z3) {
            str2 = (String) C(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest J0 = l3.J0();
        if (J0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, J0.digest(str2.getBytes())));
    }

    public final Pair C(String str) {
        t2 t2Var;
        d9.a aVar;
        u();
        d1 d1Var = (d1) this.f3443v;
        la.a aVar2 = d1Var.H;
        e eVar = d1Var.A;
        aVar2.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.f16387y;
        t2 t2Var2 = (t2) hashMap.get(str);
        if (t2Var2 != null && elapsedRealtime < t2Var2.f16379c) {
            return new Pair(t2Var2.f16377a, Boolean.valueOf(t2Var2.f16378b));
        }
        eVar.getClass();
        long A = eVar.A(str, v.f16391b) + elapsedRealtime;
        try {
            try {
                aVar = d9.a(d1Var.f16102u);
            } catch (PackageManager.NameNotFoundException unused) {
                if (t2Var2 != null && elapsedRealtime < t2Var2.f16379c + eVar.A(str, v.f16393c)) {
                    return new Pair(t2Var2.f16377a, Boolean.valueOf(t2Var2.f16378b));
                }
                aVar = null;
            }
        } catch (Exception e) {
            f().H.f(e, "Unable to get advertising id");
            t2Var = new t2(A, "", false);
        }
        if (aVar == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = aVar.f15805a;
        if (str2 != null) {
            t2Var = new t2(A, str2, aVar.f15806b);
        } else {
            t2Var = new t2(A, "", aVar.f15806b);
        }
        hashMap.put(str, t2Var);
        return new Pair(t2Var.f16377a, Boolean.valueOf(t2Var.f16378b));
    }
}
