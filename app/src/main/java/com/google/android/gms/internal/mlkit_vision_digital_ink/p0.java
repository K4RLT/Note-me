package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14781b;

    public /* synthetic */ p0(int i, Object obj) {
        this.f14780a = i;
        this.f14781b = obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        String str;
        km kmVar;
        String str2;
        int i = this.f14780a;
        int i10 = 0;
        int i11 = 4;
        int i12 = 1;
        Object obj2 = this.f14781b;
        switch (i) {
            case 0:
                x0 x0Var = (x0) obj2;
                km kmVar2 = (km) obj;
                s5 s5Var = new s5(i11, x0Var.e);
                switch (((ow) x0Var.f15220f.f14961v).f14768u) {
                    case 3:
                        SharedPreferences sharedPreferences = (SharedPreferences) s5Var.f14961v;
                        js jsVar = (js) kmVar2;
                        boolean z3 = jsVar.z();
                        kmVar = jsVar;
                        if (!z3) {
                            HashSet hashSet = new HashSet();
                            hs hsVar = (hs) jsVar.g();
                            hsVar.b();
                            js.y((js) hsVar.f14430v);
                            k5 k3 = e5.b(sharedPreferences.getAll()).entrySet().k();
                            while (k3.hasNext()) {
                                List b10 = w2.a("|").b((CharSequence) ((Map.Entry) k3.next()).getKey());
                                if (b10.size() >= i11) {
                                    String str3 = (String) b10.get(i10);
                                    String str4 = (String) b10.get(1);
                                    int parseInt = Integer.parseInt((String) b10.get(2));
                                    String str5 = str3 + "|" + str4 + "|" + parseInt;
                                    if (!hashSet.contains(str5)) {
                                        hashSet.add(str5);
                                        String concat = str5.concat("|w");
                                        String concat2 = str5.concat("|c");
                                        long j10 = sharedPreferences.getLong(concat, 0L);
                                        long j11 = sharedPreferences.getLong(concat2, 0L);
                                        xr x9 = yr.x();
                                        es t3 = fs.t();
                                        t3.m(str4);
                                        t3.n(str3);
                                        x9.b();
                                        yr.C((yr) x9.f14430v, (fs) t3.i());
                                        x9.b();
                                        yr.B((yr) x9.f14430v, parseInt);
                                        x9.b();
                                        yr.A((yr) x9.f14430v, j11);
                                        x9.b();
                                        yr.E((yr) x9.f14430v, j10);
                                        hsVar.b();
                                        js.w((js) hsVar.f14430v, (yr) x9.i());
                                        i10 = 0;
                                        i11 = 4;
                                    }
                                }
                            }
                            kmVar = (js) hsVar.i();
                            break;
                        }
                        break;
                    case 4:
                        zr t10 = cs.t();
                        k5 k4 = e5.b(((SharedPreferences) s5Var.f14961v).getAll()).entrySet().k();
                        while (k4.hasNext()) {
                            Map.Entry entry = (Map.Entry) k4.next();
                            try {
                                str = (String) entry.getValue();
                            } catch (ClassCastException | NullPointerException e) {
                                cx.f("SharedPreferences file groups metadata key wasn't a string: %s", e);
                            }
                            if (str != null) {
                                try {
                                    tr trVar = (tr) nw.k(str, tr.O());
                                    String str6 = (String) entry.getKey();
                                    t10.getClass();
                                    str6.getClass();
                                    trVar.getClass();
                                    t10.b();
                                    cs.v((cs) t10.f14430v).put(str6, trVar);
                                } catch (xn e8) {
                                    cx.f("SharedPreferences file groups metadata had unexpected format: %s", e8);
                                }
                            } else {
                                throw null;
                                break;
                            }
                        }
                        kmVar = (cs) t10.i();
                        break;
                    default:
                        ps u9 = rs.u();
                        k5 k10 = e5.b(((SharedPreferences) s5Var.f14961v).getAll()).entrySet().k();
                        while (k10.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) k10.next();
                            try {
                                str2 = (String) entry2.getValue();
                            } catch (ClassCastException | NullPointerException e10) {
                                cx.f("SharedPreferences shared files metadata key wasn't a string: %s", e10);
                            }
                            if (str2 != null) {
                                try {
                                    u9.l((os) nw.k(str2, os.y()), (String) entry2.getKey());
                                } catch (xn e11) {
                                    cx.f("SharedPreferences shared files metadata had unexpected format: %s", e11);
                                }
                            } else {
                                throw null;
                                break;
                            }
                        }
                        kmVar = (rs) u9.i();
                        break;
                }
                return n5.m(kmVar);
            case 1:
                return n5.m(((m2) obj2).l(obj));
            case 2:
                sl slVar = (sl) obj2;
                Boolean bool = (Boolean) obj;
                Log.i("MddModelManager", "modelRegister initialized: ".concat(String.valueOf(bool)));
                if (bool.booleanValue()) {
                    HashMap hashMap = (HashMap) slVar.f14976d.f18941y;
                    if (Log.isLoggable("DIRecoDownload", 4)) {
                        Log.i("DIRecoDownload", "DigitalInkRecognitionFileDependencyManager: getAllFileGroupNames(). # Entries = " + hashMap.size());
                    }
                    h4 s10 = h4.s(new r3(n4.r(hashMap.keySet()), new rl(i10, slVar)));
                    fa faVar = new fa(i12);
                    ha haVar = new ha(s10, true);
                    haVar.H = new ga(haVar, faVar, ia.f14473u, 1);
                    haVar.w();
                    return haVar;
                }
                return n5.m(Boolean.FALSE);
            case 3:
                tu tuVar = (tu) obj2;
                f9 g8 = tuVar.g(tuVar.f15029c.zzb());
                int i13 = 3;
                ru ruVar = new ru(tuVar, (hx) obj, i13);
                int i14 = g2.f14354a;
                return n5.q(g8, new r0(q1.b(), i13, ruVar), tuVar.f15033h);
            case 4:
                if (((pu) obj) == pu.f14813v) {
                    ((tr) n5.r((ya) obj2)).getClass();
                }
                return va.f15125v;
            default:
                iv ivVar = (iv) obj2;
                return ivVar.f14486a.b(new ys(13), ivVar.f14487b);
        }
    }
}
