package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.ads.aa1;
import com.google.android.gms.internal.ads.ae1;
import com.google.android.gms.internal.ads.an1;
import com.google.android.gms.internal.ads.as1;
import com.google.android.gms.internal.ads.bi0;
import com.google.android.gms.internal.ads.cd1;
import com.google.android.gms.internal.ads.ce1;
import com.google.android.gms.internal.ads.dj1;
import com.google.android.gms.internal.ads.dr0;
import com.google.android.gms.internal.ads.ed1;
import com.google.android.gms.internal.ads.ee1;
import com.google.android.gms.internal.ads.fd1;
import com.google.android.gms.internal.ads.fe1;
import com.google.android.gms.internal.ads.fh1;
import com.google.android.gms.internal.ads.fx1;
import com.google.android.gms.internal.ads.gh1;
import com.google.android.gms.internal.ads.gl1;
import com.google.android.gms.internal.ads.gx1;
import com.google.android.gms.internal.ads.ho0;
import com.google.android.gms.internal.ads.hr0;
import com.google.android.gms.internal.ads.id1;
import com.google.android.gms.internal.ads.ir0;
import com.google.android.gms.internal.ads.jd1;
import com.google.android.gms.internal.ads.kc1;
import com.google.android.gms.internal.ads.kh1;
import com.google.android.gms.internal.ads.lh1;
import com.google.android.gms.internal.ads.lr0;
import com.google.android.gms.internal.ads.lx0;
import com.google.android.gms.internal.ads.mh1;
import com.google.android.gms.internal.ads.mw1;
import com.google.android.gms.internal.ads.n80;
import com.google.android.gms.internal.ads.na0;
import com.google.android.gms.internal.ads.nh1;
import com.google.android.gms.internal.ads.o91;
import com.google.android.gms.internal.ads.oh1;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.pf1;
import com.google.android.gms.internal.ads.ph1;
import com.google.android.gms.internal.ads.q91;
import com.google.android.gms.internal.ads.qh1;
import com.google.android.gms.internal.ads.r91;
import com.google.android.gms.internal.ads.rh0;
import com.google.android.gms.internal.ads.rh1;
import com.google.android.gms.internal.ads.s81;
import com.google.android.gms.internal.ads.s91;
import com.google.android.gms.internal.ads.sz;
import com.google.android.gms.internal.ads.v91;
import com.google.android.gms.internal.ads.vd1;
import com.google.android.gms.internal.ads.w91;
import com.google.android.gms.internal.ads.ww1;
import com.google.android.gms.internal.ads.wz;
import com.google.android.gms.internal.ads.x91;
import com.google.android.gms.internal.ads.xd1;
import com.google.android.gms.internal.ads.xe1;
import com.google.android.gms.internal.ads.xk0;
import com.google.android.gms.internal.ads.xy;
import com.google.android.gms.internal.ads.yd1;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class gw implements com.google.android.gms.internal.ads.p7, n9.e, xe1, s81, dr0, n80, pf1, fx1, da, qa, p5.b, ib.g {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14385u;

    /* renamed from: v, reason: collision with root package name */
    public Object f14386v;

    /* renamed from: w, reason: collision with root package name */
    public Object f14387w;

    public gw(List list, Map map) {
        this.f14385u = 9;
        this.f14386v = list;
        this.f14387w = map;
        if (((AtomicBoolean) kc1.f7717a.f11406v).get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                s91 s91Var = (s91) it.next();
                int i = s91Var.f10568c;
                if (!hashSet.contains(Integer.valueOf(i))) {
                    hashSet.add(Integer.valueOf(i));
                    z3 |= s91Var.f10569d;
                } else {
                    throw new GeneralSecurityException(a5.a.j(new StringBuilder(String.valueOf(i).length() + 121), "KeyID ", i, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
            }
            if (!z3) {
                androidx.datastore.preferences.protobuf.s1.q("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                throw null;
            }
        }
    }

    public static final gw B(nh1 nh1Var) {
        xy cd1Var;
        boolean z3;
        if (nh1Var != null && nh1Var.B() > 0) {
            ArrayList arrayList = new ArrayList(nh1Var.B());
            for (mh1 mh1Var : nh1Var.A()) {
                int B = mh1Var.B();
                try {
                    yd1 K = K(mh1Var);
                    jd1 jd1Var = jd1.f7422b;
                    ee1 ee1Var = (ee1) jd1Var.f7423a.get();
                    ee1Var.getClass();
                    if (!ee1Var.f5670b.containsKey(new ce1(yd1.class, (gl1) K.f12856v))) {
                        cd1Var = new cd1(K);
                    } else {
                        cd1Var = jd1Var.e(K);
                    }
                    z3 = false;
                } catch (GeneralSecurityException e) {
                    if (!((AtomicBoolean) kc1.f7717a.f11406v).get()) {
                        cd1Var = new cd1(K(mh1Var));
                        z3 = true;
                    } else {
                        throw e;
                    }
                }
                if (!((AtomicBoolean) kc1.f7717a.f11406v).get() || L(mh1Var.F())) {
                    boolean z9 = true;
                    int F = mh1Var.F();
                    if (B != nh1Var.z()) {
                        z9 = false;
                    }
                    arrayList.add(new s91(cd1Var, F, B, z9, z3));
                } else {
                    androidx.datastore.preferences.protobuf.s1.q("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                    return null;
                }
            }
            return new gw(Collections.unmodifiableList(arrayList), new HashMap());
        }
        androidx.datastore.preferences.protobuf.s1.q("empty keyset");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final gw I(v91 v91Var) {
        gw gwVar;
        int i;
        Integer num;
        int i10;
        com.google.android.gms.internal.ads.mf mfVar = new com.google.android.gms.internal.ads.mf(7);
        ArrayList arrayList = (ArrayList) mfVar.f8337v;
        r91 r91Var = new r91(v91Var);
        com.google.android.gms.internal.ads.s6 s6Var = com.google.android.gms.internal.ads.s6.B;
        r91Var.f10161c = s6Var;
        r91Var.f10159a = true;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((r91) obj).f10159a = false;
        }
        arrayList.add(r91Var);
        gw gwVar2 = null;
        if (!mfVar.f8336u) {
            mfVar.f8336u = true;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int i13 = 0;
            while (i13 < arrayList.size() - 1) {
                int i14 = i13 + 1;
                if (((r91) arrayList.get(i13)).f10161c == s6Var && ((r91) arrayList.get(i14)).f10161c != s6Var) {
                    androidx.datastore.preferences.protobuf.s1.q("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                    return null;
                }
                i13 = i14;
            }
            HashSet hashSet = new HashSet();
            int size2 = arrayList.size();
            Integer num2 = null;
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList.get(i15);
                i15++;
                r91 r91Var2 = (r91) obj2;
                r91Var2.getClass();
                v91 v91Var2 = r91Var2.f10160b;
                com.google.android.gms.internal.ads.s6 s6Var2 = r91Var2.f10161c;
                if (s6Var2 != null) {
                    if (s6Var2 == s6Var) {
                        int i16 = i11;
                        while (true) {
                            gwVar = gwVar2;
                            if (i16 != 0 && !hashSet.contains(Integer.valueOf(i16))) {
                                break;
                            }
                            int i17 = fe1.f6052a;
                            i16 = i11;
                            while (i16 == 0) {
                                byte[] a10 = ae1.a(4);
                                int i18 = a10[i11] & 255;
                                i16 = ((a10[1] & 255) << 16) | (i18 << 24) | ((a10[2] & 255) << 8) | (a10[3] & 255);
                                i11 = 0;
                            }
                            gwVar2 = gwVar;
                        }
                        i = i16;
                    } else {
                        gwVar = gwVar2;
                        i = 0;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    if (!hashSet.contains(valueOf)) {
                        hashSet.add(valueOf);
                        if (true != v91Var2.a()) {
                            num = gwVar;
                        } else {
                            num = valueOf;
                        }
                        xy b10 = fd1.f6043b.b(v91Var2, num);
                        Object obj3 = q91.f9787w;
                        if (obj3.equals(obj3)) {
                            i10 = 3;
                        } else if (q91.f9788x.equals(obj3)) {
                            i10 = 4;
                        } else if (q91.f9789y.equals(obj3)) {
                            i10 = 5;
                        } else {
                            q.x.o("Unknown key status");
                            return gwVar;
                        }
                        boolean z3 = r91Var2.f10159a;
                        s91 s91Var = new s91(b10, i10, i, z3, false);
                        if (z3) {
                            if (num2 == null) {
                                num2 = valueOf;
                            } else {
                                androidx.datastore.preferences.protobuf.s1.q("Two primaries were set");
                                return gwVar;
                            }
                        }
                        arrayList2.add(s91Var);
                        i11 = 0;
                        gwVar2 = gwVar;
                    } else {
                        int i19 = i;
                        throw new GeneralSecurityException(a5.a.j(new StringBuilder(String.valueOf(i19).length() + 31), "Id ", i19, " is used twice in the keyset"));
                    }
                } else {
                    gw gwVar3 = gwVar2;
                    androidx.datastore.preferences.protobuf.s1.q("No ID was set (with withFixedId or withRandomId)");
                    return gwVar3;
                }
            }
            gw gwVar4 = gwVar2;
            if (num2 != null) {
                HashMap hashMap = (HashMap) mfVar.f8338w;
                gw gwVar5 = new gw(arrayList2, hashMap);
                if (hashMap.get(ed1.class) == null) {
                    return gwVar5;
                }
                g5.q.b();
                return gwVar4;
            }
            androidx.datastore.preferences.protobuf.s1.q("No primary was set");
            return gwVar4;
        }
        androidx.datastore.preferences.protobuf.s1.q("KeysetHandle.Builder#build must only be called once");
        return null;
    }

    public static yd1 K(mh1 mh1Var) {
        Integer valueOf;
        int B = mh1Var.B();
        if (mh1Var.G() == 5) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(B);
        }
        return yd1.a(mh1Var.A().z(), mh1Var.A().A(), ed1.B(mh1Var.A().F()), ed1.F(mh1Var.G()), valueOf);
    }

    public static boolean L(int i) {
        int i10 = i - 2;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    public void A(int i, Bundle bundle) {
        mc.b bVar;
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                bVar = (j.i0) this.f14386v;
            } else {
                bVar = (k6.i) this.f14387w;
            }
            if (bVar != null) {
                bVar.h(string, bundle2);
            }
        }
    }

    public nh1 F() {
        try {
            kh1 F = nh1.F();
            for (s91 s91Var : (List) this.f14386v) {
                xy xyVar = s91Var.f10566a;
                int i = s91Var.f10568c;
                int i10 = s91Var.f10570f;
                yd1 yd1Var = (yd1) jd1.f7422b.f(xyVar);
                Integer E = xyVar.E();
                if (E != null && E.intValue() != i) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                lh1 C = mh1.C();
                fh1 B = gh1.B();
                String str = (String) yd1Var.f12855u;
                B.b();
                ((gh1) B.f4845v).D(str);
                om1 om1Var = (om1) yd1Var.f12857w;
                B.b();
                ((gh1) B.f4845v).E(om1Var);
                int p10 = ed1.p((w91) yd1Var.f12858x);
                B.b();
                ((gh1) B.f4845v).G(p10);
                C.b();
                ((mh1) C.f4845v).D((gh1) B.c());
                C.b();
                ((mh1) C.f4845v).H(i10);
                C.b();
                ((mh1) C.f4845v).E(i);
                int I = ed1.I((x91) yd1Var.f12859y);
                C.b();
                ((mh1) C.f4845v).I(I);
                mh1 mh1Var = (mh1) C.c();
                F.b();
                ((nh1) F.f4845v).H(mh1Var);
                if (s91Var.f10569d) {
                    F.b();
                    ((nh1) F.f4845v).G(i);
                }
            }
            return (nh1) F.c();
        } catch (GeneralSecurityException e) {
            androidx.datastore.preferences.protobuf.s1.n(e);
            return null;
        }
    }

    public s91 G() {
        for (s91 s91Var : (List) this.f14386v) {
            if (s91Var != null && s91Var.f10569d) {
                if (s91Var.f10567b == q91.f9787w) {
                    return s91Var;
                }
                q.x.o("Keyset has primary which isn't enabled");
                return null;
            }
        }
        q.x.o("Keyset has no valid primary");
        return null;
    }

    public s91 H(int i) {
        List list = (List) this.f14386v;
        if (i >= 0 && i < list.size()) {
            s91 s91Var = (s91) list.get(i);
            if (L(s91Var.f10570f)) {
                if (!s91Var.e) {
                    return (s91) list.get(i);
                }
                q.x.o(a5.a.j(new StringBuilder(String.valueOf(i).length() + 48), "Keyset-Entry at position ", i, " didn't parse correctly"));
                return null;
            }
            q.x.o(a5.a.j(new StringBuilder(String.valueOf(i).length() + 42), "Keyset-Entry at position ", i, " has wrong status"));
            return null;
        }
        int size = list.size();
        q.x.l(g3.a.f(i, size, "Invalid index ", " for keyset of size ", new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(size).length())));
        return null;
    }

    public Object J(ho0 ho0Var, Class cls) {
        boolean z3;
        List list = (List) this.f14386v;
        nh1 F = F();
        int i = aa1.f4427a;
        int z9 = F.z();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (mh1 mh1Var : F.A()) {
            if (mh1Var.F() == 3) {
                if (mh1Var.z()) {
                    if (mh1Var.G() != 2) {
                        if (mh1Var.F() != 2) {
                            if (mh1Var.B() == z9) {
                                if (!z10) {
                                    z10 = true;
                                } else {
                                    androidx.datastore.preferences.protobuf.s1.q("keyset contains multiple primary keys");
                                    return null;
                                }
                            }
                            if (mh1Var.A().F() != 5) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            z11 &= z3;
                            i10++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(mh1Var.B())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(mh1Var.B())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(mh1Var.B())));
                }
            }
        }
        if (i10 != 0) {
            if (!z10 && !z11) {
                androidx.datastore.preferences.protobuf.s1.q("keyset doesn't contain a valid primary key");
                return null;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (((s91) list.get(i11)).e || !L(((s91) list.get(i11)).f10570f)) {
                    String z12 = F.C(i11).A().z();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(z12).length() + String.valueOf(i11).length() + 44 + 32);
                    sb2.append("Key parsing of key with index ");
                    sb2.append(i11);
                    sb2.append(" and type_url ");
                    sb2.append(z12);
                    sb2.append(" failed, unable to get primitive");
                    throw new GeneralSecurityException(sb2.toString());
                }
            }
            switch (ho0Var.f6853u) {
                case 13:
                    vd1 vd1Var = (vd1) id1.f7114b.f7115a.get();
                    HashMap hashMap = vd1Var.f11891b;
                    if (hashMap.containsKey(cls)) {
                        xd1 xd1Var = (xd1) hashMap.get(cls);
                        return xd1Var.a(this, new j6.l(vd1Var, 9, xd1Var));
                    }
                    throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
                default:
                    if (cls == o91.class) {
                        return cls.cast(an1.a(this, ho0.C));
                    }
                    androidx.datastore.preferences.protobuf.s1.q("AeadConfigurationV1 can only create AEADs");
                    return null;
            }
        }
        androidx.datastore.preferences.protobuf.s1.q("keyset must contain at least one ENABLED key");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public long a(dj1 dj1Var) {
        pf1 pf1Var = (pf1) this.f14386v;
        this.f14387w = dj1Var.f5444a;
        Map map = Collections.EMPTY_MAP;
        try {
            long a10 = pf1Var.a(dj1Var);
            Uri c10 = pf1Var.c();
            if (c10 != null) {
                this.f14387w = c10;
            }
            pf1Var.f();
            return a10;
        } catch (Throwable th) {
            Uri c11 = pf1Var.c();
            if (c11 != null) {
                this.f14387w = c11;
            }
            pf1Var.f();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public void b(as1 as1Var) {
        as1Var.getClass();
        ((pf1) this.f14386v).b(as1Var);
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public Uri c() {
        return ((pf1) this.f14386v).c();
    }

    @Override // n9.e
    public /* synthetic */ Object d(Object obj) {
        com.google.android.gms.internal.ads.as asVar = (com.google.android.gms.internal.ads.as) this.f14386v;
        try {
            ((com.google.android.gms.internal.ads.ks) this.f14387w).f7865z = (n9.p) obj;
            asVar.f();
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
        return new com.google.android.gms.internal.ads.is(asVar);
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public int e(byte[] bArr, int i, int i10) {
        return ((pf1) this.f14386v).e(bArr, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public Map f() {
        return ((pf1) this.f14386v).f();
    }

    public c7.m g() {
        String str = (String) this.f14387w;
        if (!"first_party".equals(str)) {
            if (((String) this.f14386v) != null) {
                if (str != null) {
                    return new c7.m(this);
                }
                q.x.n("Product type must be provided.");
                return null;
            }
            q.x.n("Product id must be provided.");
            return null;
        }
        q.x.n("Serialized doc id must be provided for first party products.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[Catch: JSONException -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {JSONException -> 0x003a, blocks: (B:5:0x0013, B:7:0x002a, B:8:0x003d, B:13:0x0057, B:22:0x006d, B:24:0x0076, B:26:0x0080, B:28:0x0084, B:30:0x009b, B:31:0x00a2, B:34:0x00a3, B:35:0x00aa, B:37:0x00ab, B:38:0x00b2), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[Catch: JSONException -> 0x003a, TryCatch #1 {JSONException -> 0x003a, blocks: (B:5:0x0013, B:7:0x002a, B:8:0x003d, B:13:0x0057, B:22:0x006d, B:24:0x0076, B:26:0x0080, B:28:0x0084, B:30:0x009b, B:31:0x00a2, B:34:0x00a3, B:35:0x00aa, B:37:0x00ab, B:38:0x00b2), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2, types: [ud.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ud.d i(rd.c r14) {
        /*
            r13 = this;
            java.lang.String r0 = ""
            org.json.JSONArray r1 = r14.f24695g
            long r2 = r14.f24694f
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            r4 = 0
            r5 = r4
        Ld:
            int r6 = r1.length()
            if (r5 >= r6) goto Lbb
            org.json.JSONObject r6 = r1.getJSONObject(r5)     // Catch: org.json.JSONException -> L3a
            java.lang.String r7 = "rolloutId"
            java.lang.String r7 = r6.getString(r7)     // Catch: org.json.JSONException -> L3a
            java.lang.String r8 = "affectedParameterKeys"
            org.json.JSONArray r8 = r6.getJSONArray(r8)     // Catch: org.json.JSONException -> L3a
            int r9 = r8.length()     // Catch: org.json.JSONException -> L3a
            r10 = 1
            if (r9 <= r10) goto L3d
            java.lang.String r9 = "FirebaseRemoteConfig"
            java.lang.String r11 = "Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s"
            java.lang.Object[] r12 = new java.lang.Object[]{r7, r8}     // Catch: org.json.JSONException -> L3a
            java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch: org.json.JSONException -> L3a
            android.util.Log.w(r9, r11)     // Catch: org.json.JSONException -> L3a
            goto L3d
        L3a:
            r14 = move-exception
            goto Lb3
        L3d:
            java.lang.String r8 = r8.optString(r4, r0)     // Catch: org.json.JSONException -> L3a
            java.lang.Object r9 = r13.f14386v     // Catch: org.json.JSONException -> L3a
            rd.b r9 = (rd.b) r9     // Catch: org.json.JSONException -> L3a
            rd.c r9 = r9.c()     // Catch: org.json.JSONException -> L3a
            r11 = 0
            if (r9 != 0) goto L4e
        L4c:
            r9 = r11
            goto L54
        L4e:
            org.json.JSONObject r9 = r9.f24691b     // Catch: org.json.JSONException -> L4c
            java.lang.String r9 = r9.getString(r8)     // Catch: org.json.JSONException -> L4c
        L54:
            if (r9 == 0) goto L57
            goto L6d
        L57:
            java.lang.Object r9 = r13.f14387w     // Catch: org.json.JSONException -> L3a
            rd.b r9 = (rd.b) r9     // Catch: org.json.JSONException -> L3a
            rd.c r9 = r9.c()     // Catch: org.json.JSONException -> L3a
            if (r9 != 0) goto L62
            goto L68
        L62:
            org.json.JSONObject r9 = r9.f24691b     // Catch: org.json.JSONException -> L68
            java.lang.String r11 = r9.getString(r8)     // Catch: org.json.JSONException -> L68
        L68:
            if (r11 == 0) goto L6c
            r9 = r11
            goto L6d
        L6c:
            r9 = r0
        L6d:
            int r11 = ud.e.f27191a     // Catch: org.json.JSONException -> L3a
            ud.b r11 = new ud.b     // Catch: org.json.JSONException -> L3a
            r11.<init>()     // Catch: org.json.JSONException -> L3a
            if (r7 == 0) goto Lab
            r11.f27181a = r7     // Catch: org.json.JSONException -> L3a
            java.lang.String r7 = "variantId"
            java.lang.String r6 = r6.getString(r7)     // Catch: org.json.JSONException -> L3a
            if (r6 == 0) goto La3
            r11.f27182b = r6     // Catch: org.json.JSONException -> L3a
            if (r8 == 0) goto L9b
            r11.f27183c = r8     // Catch: org.json.JSONException -> L3a
            r11.f27184d = r9     // Catch: org.json.JSONException -> L3a
            r11.e = r2     // Catch: org.json.JSONException -> L3a
            byte r6 = r11.f27185f     // Catch: org.json.JSONException -> L3a
            r6 = r6 | r10
            byte r6 = (byte) r6     // Catch: org.json.JSONException -> L3a
            r11.f27185f = r6     // Catch: org.json.JSONException -> L3a
            ud.c r6 = r11.a()     // Catch: org.json.JSONException -> L3a
            r14.add(r6)     // Catch: org.json.JSONException -> L3a
            int r5 = r5 + 1
            goto Ld
        L9b:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "Null parameterKey"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3a
            throw r14     // Catch: org.json.JSONException -> L3a
        La3:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "Null variantId"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3a
            throw r14     // Catch: org.json.JSONException -> L3a
        Lab:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "Null rolloutId"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3a
            throw r14     // Catch: org.json.JSONException -> L3a
        Lb3:
            qd.b r0 = new qd.b
            java.lang.String r1 = "Exception parsing rollouts metadata to create RolloutsState."
            r0.<init>(r1, r14)
            throw r0
        Lbb:
            ud.d r0 = new ud.d
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.gw.i(rd.c):ud.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    @Override // p5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p5.a j(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.gw.j(java.lang.String):p5.a");
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public void k() {
        ((pf1) this.f14386v).k();
    }

    @Override // com.google.android.gms.internal.ads.dr0
    public Object l(Object obj) {
        rh0 rh0Var = (rh0) this.f14386v;
        com.google.android.gms.internal.ads.rb rbVar = (com.google.android.gms.internal.ads.rb) this.f14387w;
        rh0Var.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(rbVar.f10190u));
        contentValues.put("gws_query_id", (String) rbVar.f10192w);
        contentValues.put("url", (String) rbVar.f10193x);
        contentValues.put("event_state", Integer.valueOf(rbVar.f10191v - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        k9.f0 f0Var = f9.k.C.f16813c;
        Context context = rh0Var.f10220u;
        k9.t b10 = k9.f0.b(context);
        if (b10 != null) {
            try {
                b10.zzf(new oa.b(context));
                return null;
            } catch (RemoteException e) {
                k9.a0.l("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    @Override // p5.b
    public boolean o() {
        return ((p5.b) this.f14386v).o();
    }

    @Override // ib.g
    public ib.o q(Object obj) {
        vc.a aVar = (vc.a) obj;
        oc.n nVar = ((oc.k) this.f14387w).e;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return wa.h8.e(null);
        }
        return wa.h8.f(Arrays.asList(oc.n.b(nVar), nVar.f21909m.u(null, (Executor) this.f14386v)));
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public /* synthetic */ void mo202r(Object obj) {
        switch (this.f14385u) {
            case 6:
                ((na0) this.f14387w).n((View) this.f14386v, (bi0) obj);
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        switch (this.f14385u) {
            case 6:
                if (((Boolean) g9.r.e.f17698c.a(com.google.android.gms.internal.ads.sl.f10888p6)).booleanValue()) {
                    f9.k.C.f16817h.e("omid native display exp", th);
                    return;
                }
                return;
            default:
                cx.d(th, "%s: Unable to create symlink structure, cleaning up symlinks...", "FileGroupManager");
                try {
                    com.google.android.gms.internal.ads.hb hbVar = (com.google.android.gms.internal.ads.hb) this.f14387w;
                    Context context = (Context) hbVar.f6649u;
                    q2 q2Var = (q2) hbVar.A;
                    tr trVar = (tr) this.f14386v;
                    i iVar = (i) hbVar.f6652x;
                    Uri h3 = f7.h(context, q2Var, trVar);
                    if (iVar.g(h3)) {
                        return;
                    }
                    return;
                } catch (IOException e) {
                    cx.d(e, "%s: Unable to clean up symlink structure after failure", "FileGroupManager");
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f14385u) {
            case 9:
                nh1 F = F();
                int i = aa1.f4427a;
                oh1 z3 = rh1.z();
                int z9 = F.z();
                z3.b();
                ((rh1) z3.f4845v).A(z9);
                for (mh1 mh1Var : F.A()) {
                    ph1 z10 = qh1.z();
                    String z11 = mh1Var.A().z();
                    z10.b();
                    ((qh1) z10.f4845v).A(z11);
                    int F2 = mh1Var.F();
                    z10.b();
                    ((qh1) z10.f4845v).C(F2);
                    int G = mh1Var.G();
                    z10.b();
                    ((qh1) z10.f4845v).D(G);
                    int B = mh1Var.B();
                    z10.b();
                    ((qh1) z10.f4845v).B(B);
                    qh1 qh1Var = (qh1) z10.c();
                    z3.b();
                    ((rh1) z3.f4845v).B(qh1Var);
                }
                return ((rh1) z3.c()).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x03ab, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0126, code lost:
    
        if (")".equals(com.google.android.gms.internal.ads.t8.b(r6, r8)) == false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03f7  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v11, types: [com.google.android.gms.internal.ads.u8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [int] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // com.google.android.gms.internal.ads.p7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(int r19, int r20, com.google.android.gms.internal.ads.r7 r21, byte[] r22) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.gw.w(int, int, com.google.android.gms.internal.ads.r7, byte[]):void");
    }

    @Override // n9.e
    public void z(z8.a aVar) {
        try {
            String canonicalName = ((com.google.android.gms.internal.ads.ks) this.f14387w).f7860u.getClass().getCanonicalName();
            int i = aVar.f31969a;
            String str = aVar.f31970b;
            String str2 = aVar.f31971c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 43 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb2.append(canonicalName);
            sb2.append("failed to loaded mediation ad: ErrorCode = ");
            sb2.append(i);
            sb2.append(". ErrorMessage = ");
            sb2.append(str);
            sb2.append(". ErrorDomain = ");
            sb2.append(str2);
            l9.i.a(sb2.toString());
            com.google.android.gms.internal.ads.as asVar = (com.google.android.gms.internal.ads.as) this.f14386v;
            asVar.K2(aVar.a());
            asVar.o4(i, str);
            asVar.o0(i);
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public ya zza() {
        s0 s0Var = (s0) this.f14387w;
        jm jmVar = s0Var.f14951h;
        String concat = "Initialize ".concat(String.valueOf(s0Var.f14945a));
        jmVar.getClass();
        x1 e = jm.e(concat);
        try {
            synchronized (s0Var.f14950g) {
                try {
                    if (((List) this.f14386v) == null) {
                        this.f14386v = s0Var.i;
                        s0Var.i = Collections.EMPTY_LIST;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList(((List) this.f14386v).size());
            g1 g1Var = new g1((s0) this.f14387w);
            Iterator it = ((List) this.f14386v).iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((ea) it.next()).l(g1Var));
                } catch (Exception e8) {
                    arrayList.add(n5.l(e8));
                }
            }
            h4 s10 = h4.s(arrayList);
            f1 f1Var = new f1(0, this);
            ia iaVar = ia.f14473u;
            ha haVar = new ha(s10, true);
            haVar.H = new ga(haVar, f1Var, iaVar, 1);
            haVar.w();
            e.f(haVar);
            e.close();
            return haVar;
        } catch (Throwable th2) {
            try {
                e.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public int mo205l(Object obj) {
        ww1 ww1Var = (ww1) obj;
        HashMap hashMap = gx1.f6499a;
        Context context = (Context) this.f14386v;
        mw1 mw1Var = (mw1) this.f14387w;
        String str = ww1Var.f12353b;
        return ((str.equals(mw1Var.f8459o) || str.equals(gx1.d(mw1Var))) && ww1Var.f(context, mw1Var, false) && ww1Var.g(mw1Var)) ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public void mo205l(Object obj) {
        hr0 hr0Var = (hr0) this.f14386v;
        ((lr0) obj).l((ir0) hr0Var.f6875u, hr0Var.f6876v, (Throwable) this.f14387w);
    }

    public /* synthetic */ gw(int i, Object obj, Object obj2, boolean z3) {
        this.f14385u = i;
        this.f14386v = obj2;
        this.f14387w = obj;
    }

    public /* synthetic */ gw(Object obj, int i, Object obj2) {
        this.f14385u = i;
        this.f14386v = obj;
        this.f14387w = obj2;
    }

    public gw() {
        this.f14385u = 3;
        this.f14386v = new xk0();
        this.f14387w = new com.google.android.gms.internal.ads.t8();
    }

    public gw(pf1 pf1Var) {
        this.f14385u = 10;
        this.f14386v = pf1Var;
        this.f14387w = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    public /* synthetic */ gw(s0 s0Var) {
        this.f14385u = 12;
        this.f14387w = s0Var;
    }

    public gw(j2 j2Var, z2 z2Var) {
        this.f14385u = 0;
        this.f14386v = j2Var;
        this.f14387w = gn.b(z2Var);
    }

    public /* synthetic */ gw(int i) {
        this.f14385u = i;
    }

    public gw(Context context) {
        this.f14385u = 17;
        this.f14386v = context;
        this.f14387w = null;
    }

    public gw(g5.p pVar, p5.b bVar) {
        this.f14385u = 15;
        bVar.getClass();
        this.f14387w = pVar;
        this.f14386v = bVar;
    }

    public gw(rf.h hVar, rf.b bVar) {
        this.f14385u = 20;
        rf.d dVar = rf.d.f24776u;
        rf.e eVar = rf.e.f24777u;
        this.f14386v = hVar;
        this.f14387w = bVar;
    }

    public gw(oc.k kVar, Executor executor, String str) {
        this.f14385u = 18;
        this.f14387w = kVar;
        this.f14386v = executor;
    }

    @Override // com.google.android.gms.internal.ads.xe1
    /* renamed from: zza */
    public /* synthetic */ pf1 mo210zza() {
        wz wzVar = (wz) this.f14386v;
        pf1 mo210zza = ((xe1) this.f14387w).mo210zza();
        lx0 lx0Var = new lx0(14, wzVar);
        return new sz(wzVar.f12372u, mo210zza, wzVar.H, wzVar.I, wzVar, lx0Var);
    }
}
