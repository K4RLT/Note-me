package eb;
import d.b;
import j2.r;
import j2.s;
import j2.w;
import j2.x;
import k0.y;
import n.e;
import n.r0;
import q0.d;
import q1.c;
import q1.i;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.js;
import com.google.android.gms.internal.measurement.a5;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.o5;
import com.google.android.gms.internal.measurement.s3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class u0 extends d3 implements f {
    public final e A;
    public final e B;
    public final e C;
    public final e D;
    public final w0 E;
    public final z5.h F;
    public final e G;
    public final e H;
    public final e I;

    /* renamed from: y, reason: collision with root package name */
    public final e f16384y;

    /* renamed from: z, reason: collision with root package name */
    public final e f16385z;

    /* JADX WARN: Type inference failed for: r2v1, types: [e, r0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [e, r0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [e, r0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [e, r0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [e, r0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [e, r0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [e, r0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [e, r0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [e, r0] */
    public u0(h3 h3Var) {
        super(h3Var);
        this.f16384y = new r0(0);
        this.f16385z = new r0(0);
        this.A = new r0(0);
        this.B = new r0(0);
        this.C = new r0(0);
        this.G = new r0(0);
        this.H = new r0(0);
        this.I = new r0(0);
        this.D = new r0(0);
        this.E = new w0(this);
        this.F = new z5.h(10, this);
    }

    public static n1 E(int i) {
        int i10 = x0.f16451b[d.b(i)];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return null;
                    }
                    return n1.AD_PERSONALIZATION;
                }
                return n1.AD_USER_DATA;
            }
            return n1.ANALYTICS_STORAGE;
        }
        return n1.AD_STORAGE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e, r0] */
    public static e F(com.google.android.gms.internal.measurement.j2 j2Var) {
        r0 r0Var = new r0(0);
        for (com.google.android.gms.internal.measurement.m2 m2Var : j2Var.E()) {
            r0Var.put(m2Var.p(), m2Var.q());
        }
        return r0Var;
    }

    @Override // eb.d3
    public final boolean A() {
        return false;
    }

    public final long B(String str) {
        String a10 = a(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(a10)) {
            try {
                return Long.parseLong(a10);
            } catch (NumberFormatException e) {
                f().D.h("Unable to parse timezone offset. appId", y(str), e);
                return 0L;
            }
        }
        return 0L;
    }

    public final com.google.android.gms.internal.measurement.j2 C(String str, byte[] bArr) {
        Long l10;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.x();
        }
        try {
            com.google.android.gms.internal.measurement.j2 j2Var = (com.google.android.gms.internal.measurement.j2) ((com.google.android.gms.internal.measurement.i2) m0.H(com.google.android.gms.internal.measurement.w(), bArr)).a();
            js jsVar = f().I;
            String str2 = null;
            if (j2Var.J()) {
                l10 = Long.valueOf(j2Var.u());
            } else {
                l10 = null;
            }
            if (j2Var.H()) {
                str2 = j2Var.z();
            }
            jsVar.h("Parsed config. version, gmp_app_id", l10, str2);
            return j2Var;
        } catch (h5 e) {
            f().D.h("Unable to merge remote config. appId", y(str), e);
            return com.google.android.gms.internal.measurement.x();
        } catch (RuntimeException e8) {
            f().D.h("Unable to merge remote config. appId", y(str), e8);
            return com.google.android.gms.internal.measurement.x();
        }
    }

    public final m1 D(String str, n1 n1Var) {
        u();
        U(str);
        com.google.android.gms.internal.measurement.e2 L = L(str);
        if (L != null) {
            Iterator it = L.t().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.gms.internal.measurement.b2 b2Var = (com.google.android.gms.internal.measurement.b2) it.next();
                if (E(b2Var.q()) == n1Var) {
                    int i = x0.f16452c[d.b(b2Var.p())];
                    if (i != 1) {
                        if (i == 2) {
                            return m1.GRANTED;
                        }
                    } else {
                        return m1.DENIED;
                    }
                }
            }
        }
        return m1.UNINITIALIZED;
    }

    public final void G(String str, com.google.android.gms.internal.measurement.i2 i2Var) {
        HashSet hashSet = new HashSet();
        r0 r0Var = new r0(0);
        r0 r0Var2 = new r0(0);
        r0 r0Var3 = new r0(0);
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.j2) i2Var.f13639v).C()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.f2) it.next()).p());
        }
        for (int i = 0; i < ((com.google.android.gms.internal.measurement.j2) i2Var.f13639v).t(); i++) {
            com.google.android.gms.internal.measurement.g2 g2Var = (com.google.android.gms.internal.measurement.g2) ((com.google.android.gms.internal.measurement.j2) i2Var.f13639v).q(i).l();
            if (g2Var.d().isEmpty()) {
                f().D.g("EventConfig contained null event name");
            } else {
                String d2 = g2Var.d();
                String c10 = c(g2Var.d(), e, q1.f16327g);
                if (!TextUtils.isEmpty(c10)) {
                    g2Var.b();
                    com.google.android.gms.internal.measurement.h2.q((com.google.android.gms.internal.measurement.h2) g2Var.f13639v, c10);
                    i2Var.b();
                    com.google.android.gms.internal.measurement.s((com.google.android.gms.internal.measurement.j2) i2Var.f13639v, i, (com.google.android.gms.internal.measurement.h2) g2Var.a());
                }
                if (((com.google.android.gms.internal.measurement.h2) g2Var.f13639v).u() && ((com.google.android.gms.internal.measurement.h2) g2Var.f13639v).s()) {
                    r0Var.put(d2, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.h2) g2Var.f13639v).v() && ((com.google.android.gms.internal.measurement.h2) g2Var.f13639v).t()) {
                    r0Var2.put(g2Var.d(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.h2) g2Var.f13639v).w()) {
                    if (((com.google.android.gms.internal.measurement.h2) g2Var.f13639v).p() >= 2 && ((com.google.android.gms.internal.measurement.h2) g2Var.f13639v).p() <= 65535) {
                        r0Var3.put(g2Var.d(), Integer.valueOf(((com.google.android.gms.internal.measurement.h2) g2Var.f13639v).p()));
                    } else {
                        f().D.h("Invalid sampling rate. Event name, sample rate", g2Var.d(), Integer.valueOf(((com.google.android.gms.internal.measurement.h2) g2Var.f13639v).p()));
                    }
                }
            }
        }
        this.f16385z.put(str, hashSet);
        this.A.put(str, r0Var);
        this.B.put(str, r0Var2);
        this.D.put(str, r0Var3);
    }

    public final void H(String str, com.google.android.gms.internal.measurement.j2 j2Var) {
        int p10 = j2Var.p();
        w0 w0Var = this.E;
        if (p10 == 0) {
            w0Var.e(str);
            return;
        }
        f().I.f(Integer.valueOf(j2Var.p()), "EES programs found");
        s3 s3Var = (s3) j2Var.D().get(0);
        try {
            com.google.android.gms.internal.measurement.v vVar = new com.google.android.gms.internal.measurement.v();
            j6.i iVar = vVar.f13941a;
            v0 v0Var = new v0(0);
            v0Var.f16438b = this;
            v0Var.f16439c = str;
            ((HashMap) ((o5) iVar.f18927x).f13873u).put("internal.remoteConfig", v0Var);
            v0 v0Var2 = new v0(2);
            v0Var2.f16438b = this;
            v0Var2.f16439c = str;
            ((HashMap) ((o5) iVar.f18927x).f13873u).put("internal.appMetadata", v0Var2);
            c7.t tVar = new c7.t();
            tVar.f3991b = this;
            ((HashMap) ((o5) iVar.f18927x).f13873u).put("internal.logger", tVar);
            vVar.a(s3Var);
            w0Var.d(str, vVar);
            f().I.h("EES program loaded for appId, activities", str, Integer.valueOf(s3Var.p().p()));
            Iterator it = s3Var.p().r().iterator();
            while (it.hasNext()) {
                f().I.f(((com.google.android.gms.internal.measurement.r3) it.next()).p(), "EES program activity");
            }
        } catch (com.google.android.gms.internal.measurement.j0 unused) {
            f().A.f(str, "Failed to load EES program. appId");
        }
    }

    public final void I(String str, String str2, String str3, byte[] bArr) {
        byte[] bArr2;
        Integer num;
        boolean z3;
        boolean z9;
        y();
        u();
        fa.y.e(str);
        com.google.android.gms.internal.measurement.i2 i2Var = (com.google.android.gms.internal.measurement.i2) C(str, bArr).l();
        G(str, i2Var);
        H(str, (com.google.android.gms.internal.measurement.j2) i2Var.a());
        com.google.android.gms.internal.measurement.j2 j2Var = (com.google.android.gms.internal.measurement.j2) i2Var.a();
        e eVar = this.C;
        eVar.put(str, j2Var);
        this.G.put(str, ((com.google.android.gms.internal.measurement.j2) i2Var.f13639v).A());
        this.H.put(str, str2);
        this.I.put(str, str3);
        this.f16384y.put(str, F((com.google.android.gms.internal.measurement.j2) i2Var.a()));
        i w10 = w();
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((com.google.android.gms.internal.measurement.j2) i2Var.f13639v).B()));
        int i = 0;
        while (i < arrayList.size()) {
            com.google.android.gms.internal.measurement.o1 o1Var = (com.google.android.gms.internal.measurement.o1) ((com.google.android.gms.internal.measurement.p1) arrayList.get(i)).l();
            if (((com.google.android.gms.internal.measurement.p1) o1Var.f13639v).t() != 0) {
                int i10 = 0;
                while (i10 < ((com.google.android.gms.internal.measurement.p1) o1Var.f13639v).t()) {
                    com.google.android.gms.internal.measurement.q1 q1Var = (com.google.android.gms.internal.measurement.q1) ((com.google.android.gms.internal.measurement.p1) o1Var.f13639v).q(i10).l();
                    com.google.android.gms.internal.measurement.q1 q1Var2 = (com.google.android.gms.internal.measurement.q1) ((a5) q1Var.clone());
                    e eVar2 = eVar;
                    String c10 = c(((com.google.android.gms.internal.measurement.r1) q1Var.f13639v).w(), e, q1.f16327g);
                    if (c10 != null) {
                        q1Var2.b();
                        com.google.android.gms.internal.measurement.r1.s((com.google.android.gms.internal.measurement.r1) q1Var2.f13639v, c10);
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    int i11 = 0;
                    while (i11 < ((com.google.android.gms.internal.measurement.r1) q1Var.f13639v).p()) {
                        com.google.android.gms.internal.measurement.t1 q10 = ((com.google.android.gms.internal.measurement.r1) q1Var.f13639v).q(i11);
                        com.google.android.gms.internal.measurement.q1 q1Var3 = q1Var;
                        boolean z10 = z9;
                        String c11 = c(q10.t(), q1.f16322a, q1.f16323b);
                        if (c11 != null) {
                            com.google.android.gms.internal.measurement.s1 s1Var = (com.google.android.gms.internal.measurement.s1) q10.l();
                            s1Var.b();
                            com.google.android.gms.internal.measurement.t1.p((com.google.android.gms.internal.measurement.t1) s1Var.f13639v, c11);
                            com.google.android.gms.internal.measurement.t1 t1Var = (com.google.android.gms.internal.measurement.t1) s1Var.a();
                            q1Var2.b();
                            com.google.android.gms.internal.measurement.r1.r((com.google.android.gms.internal.measurement.r1) q1Var2.f13639v, i11, t1Var);
                            z9 = true;
                        } else {
                            z9 = z10;
                        }
                        i11++;
                        q1Var = q1Var3;
                    }
                    if (z9) {
                        o1Var.b();
                        com.google.android.gms.internal.measurement.p1.r((com.google.android.gms.internal.measurement.p1) o1Var.f13639v, i10, (com.google.android.gms.internal.measurement.r1) q1Var2.a());
                        arrayList.set(i, (com.google.android.gms.internal.measurement.p1) o1Var.a());
                    }
                    i10++;
                    eVar = eVar2;
                }
            }
            e eVar3 = eVar;
            if (((com.google.android.gms.internal.measurement.p1) o1Var.f13639v).v() != 0) {
                for (int i12 = 0; i12 < ((com.google.android.gms.internal.measurement.p1) o1Var.f13639v).v(); i12++) {
                    com.google.android.gms.internal.measurement.x1 u9 = ((com.google.android.gms.internal.measurement.p1) o1Var.f13639v).u(i12);
                    String c12 = c(u9.t(), i, q1.f16329j);
                    if (c12 != null) {
                        com.google.android.gms.internal.measurement.w1 w1Var = (com.google.android.gms.internal.measurement.w1) u9.l();
                        w1Var.b();
                        com.google.android.gms.internal.measurement.x1.q((com.google.android.gms.internal.measurement.x1) w1Var.f13639v, c12);
                        o1Var.b();
                        com.google.android.gms.internal.measurement.p1.s((com.google.android.gms.internal.measurement.p1) o1Var.f13639v, i12, (com.google.android.gms.internal.measurement.x1) w1Var.a());
                        arrayList.set(i, (com.google.android.gms.internal.measurement.p1) o1Var.a());
                    }
                }
            }
            i++;
            eVar = eVar3;
        }
        e eVar4 = eVar;
        w10.y();
        w10.u();
        fa.y.e(str);
        SQLiteDatabase B = w10.B();
        B.beginTransaction();
        try {
            w10.y();
            w10.u();
            fa.y.e(str);
            SQLiteDatabase B2 = w10.B();
            B2.delete("property_filters", "app_id=?", new String[]{str});
            B2.delete("event_filters", "app_id=?", new String[]{str});
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                com.google.android.gms.internal.measurement.p1 p1Var = (com.google.android.gms.internal.measurement.p1) obj;
                w10.y();
                w10.u();
                fa.y.e(str);
                fa.y.h(p1Var);
                if (!p1Var.y()) {
                    w10.f().D.f(y(str), "Audience with no ID. appId");
                } else {
                    int p10 = p1Var.p();
                    Iterator it = p1Var.w().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.r1) it.next()).C()) {
                                w10.f().D.h("Event filter with no ID. Audience definition ignored. appId, audienceId", y(str), Integer.valueOf(p10));
                                break;
                            }
                        } else {
                            Iterator it2 = p1Var.x().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!((com.google.android.gms.internal.measurement.x1) it2.next()).x()) {
                                        w10.f().D.h("Property filter with no ID. Audience definition ignored. appId, audienceId", y(str), Integer.valueOf(p10));
                                        break;
                                    }
                                } else {
                                    Iterator it3 = p1Var.w().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!w10.d0(str, p10, (com.google.android.gms.internal.measurement.r1) it3.next())) {
                                                z3 = false;
                                                break;
                                            }
                                        } else {
                                            z3 = true;
                                            break;
                                        }
                                    }
                                    if (z3) {
                                        Iterator it4 = p1Var.x().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!w10.e0(str, p10, (com.google.android.gms.internal.measurement.x1) it4.next())) {
                                                    z3 = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z3) {
                                        w10.y();
                                        w10.u();
                                        fa.y.e(str);
                                        SQLiteDatabase B3 = w10.B();
                                        B3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(p10)});
                                        B3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(p10)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList.get(i14);
                i14++;
                com.google.android.gms.internal.measurement.p1 p1Var2 = (com.google.android.gms.internal.measurement.p1) obj2;
                if (p1Var2.y()) {
                    num = Integer.valueOf(p1Var2.p());
                } else {
                    num = null;
                }
                arrayList2.add(num);
            }
            w10.k0(str, arrayList2);
            B.setTransactionSuccessful();
            B.endTransaction();
            try {
                i2Var.b();
                com.google.android.gms.internal.measurement.r((com.google.android.gms.internal.measurement.j2) i2Var.f13639v);
                bArr2 = ((com.google.android.gms.internal.measurement.j2) i2Var.a()).c();
            } catch (RuntimeException e) {
                f().D.h("Unable to serialize reduced-size config. Storing full config instead. appId", y(str), e);
                bArr2 = bArr;
            }
            i w11 = w();
            fa.y.e(str);
            w11.u();
            w11.y();
            ContentValues contentValues = new ContentValues();
            contentValues.put("remote_config", bArr2);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            try {
                if (w11.B().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    w11.f().A.f(y(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e8) {
                w11.f().A.h("Error storing remote config. appId", y(str), e8);
            }
            eVar4.put(str, (com.google.android.gms.internal.measurement.j2) i2Var.a());
        } catch (Throwable th) {
            B.endTransaction();
            throw th;
        }
    }

    public final int J(String str, String str2) {
        Integer num;
        u();
        U(str);
        Map map = (Map) this.D.get(str);
        if (map != null && (num = (Integer) map.get(str2)) != null) {
            return num.intValue();
        }
        return 1;
    }

    public final com.google.android.gms.internal.measurement.e2 L(String str) {
        u();
        U(str);
        com.google.android.gms.internal.measurement.j2 O = O(str);
        if (O != null && O.G()) {
            return O.v();
        }
        return null;
    }

    public final n1 M(String str) {
        u();
        U(str);
        com.google.android.gms.internal.measurement.e2 L = L(str);
        if (L != null) {
            for (com.google.android.gms.internal.measurement.c2 c2Var : L.s()) {
                if (n1.AD_USER_DATA == E(c2Var.q())) {
                    return E(c2Var.p());
                }
            }
            return null;
        }
        return null;
    }

    public final com.google.android.gms.internal.measurement.j2 O(String str) {
        y();
        u();
        fa.y.e(str);
        U(str);
        return (com.google.android.gms.internal.measurement.j2) this.C.get(str);
    }

    public final boolean P(String str, n1 n1Var) {
        u();
        U(str);
        com.google.android.gms.internal.measurement.e2 L = L(str);
        if (L != null) {
            for (com.google.android.gms.internal.measurement.b2 b2Var : L.r()) {
                if (n1Var == E(b2Var.q())) {
                    if (b2Var.p() == 2) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean Q(String str, String str2) {
        Boolean bool;
        u();
        U(str);
        if (!"ecommerce_purchase".equals(str2) && !"purchase".equals(str2) && !"refund".equals(str2)) {
            Map map = (Map) this.B.get(str);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final boolean R(String str, String str2) {
        Boolean bool;
        u();
        U(str);
        if (!"1".equals(a(str, "measurement.upload.blacklist_internal")) || !l3.C0(str2)) {
            if ("1".equals(a(str, "measurement.upload.blacklist_public")) && l3.E0(str2)) {
                return true;
            }
            Map map = (Map) this.A.get(str);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final boolean S(String str) {
        u();
        U(str);
        e eVar = this.f16385z;
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    public final boolean T(String str) {
        u();
        U(str);
        e eVar = this.f16385z;
        if (eVar.get(str) != null) {
            if (((Set) eVar.get(str)).contains("os_version") || ((Set) eVar.get(str)).contains("device_info")) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.u0.U(java.lang.String):void");
    }

    @Override // eb.f
    public final String a(String str, String str2) {
        u();
        U(str);
        Map map = (Map) this.f16384y.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }
}