package com.google.android.gms.internal.ads;
import f9.k;
import l9.f;
import y9.b;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class i6 implements f31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7022a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i6 f6999b = new i6(1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i6 f7000c = new i6(2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i6 f7001d = new i6(3);
    public static final /* synthetic */ i6 e = new i6(4);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ i6 f7002f = new i6(5);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ i6 f7003g = new i6(6);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i6 f7004h = new i6(7);
    public static final /* synthetic */ i6 i = new i6(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ i6 f7005j = new i6(9);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ i6 f7006k = new i6(10);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ i6 f7007l = new i6(11);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ i6 f7008m = new i6(12);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ i6 f7009n = new i6(13);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ i6 f7010o = new i6(14);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ i6 f7011p = new i6(15);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ i6 f7012q = new i6(17);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ i6 f7013r = new i6(18);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ i6 f7014s = new i6(19);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ i6 f7015t = new i6(20);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ i6 f7016u = new i6(21);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ i6 f7017v = new i6(22);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ i6 f7018w = new i6(23);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ i6 f7019x = new i6(24);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ i6 f7020y = new i6(25);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ i6 f7021z = new i6(26);
    public static final /* synthetic */ i6 A = new i6(27);
    public static final /* synthetic */ i6 B = new i6(28);
    public static final /* synthetic */ i6 C = new i6(29);

    public /* synthetic */ i6(int i10) {
        this.f7022a = i10;
    }

    @Override // com.google.android.gms.internal.ads.f31
    public final Object apply(Object obj) {
        ArrayList arrayList = null;
        switch (this.f7022a) {
            case 0:
                return (w6) obj;
            case 1:
                w6 w6Var = (w6) obj;
                int i10 = r6.G;
                return w6Var;
            case 2:
                Throwable th = (Throwable) obj;
                hp hpVar = lp.f8076a;
                if (((Boolean) vm.i.p()).booleanValue()) {
                    k.C.f16817h.d("prepareClickUrl.attestation1", th);
                }
                return "failure_click_attok";
            case 3:
                List list = mw.f8437l;
                return null;
            case 4:
                return "failure_click_attok";
            case 5:
                return new c50((z40) obj);
            case 6:
                return new c50((List) obj);
            case 7:
                n41 n41Var = m50.f8250a;
                return Integer.valueOf(((s40) obj).f10514p);
            case 8:
                ArrayList arrayList2 = new ArrayList();
                for (pn pnVar : (List) obj) {
                    if (pnVar != null) {
                        arrayList2.add(pnVar);
                    }
                }
                return arrayList2;
            case 9:
                ArrayList arrayList3 = new ArrayList();
                for (bc0 bc0Var : (List) obj) {
                    if (bc0Var != null) {
                        arrayList3.add(bc0Var);
                    }
                }
                return arrayList3;
            case 10:
                return Collections.singletonList(ed1.e((na0) obj));
            case 11:
                ArrayList arrayList4 = (ArrayList) obj;
                if (true != arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                }
                return new ul0(1, arrayList);
            case 12:
                b bVar = (b) obj;
                return new dm0(bVar.f30998a, bVar.f30999b, 0);
            case 13:
                return new ql0((String) obj, 5);
            case 14:
                return new wl0(4, (Bundle) obj);
            case 15:
                return new ql0((String) obj, 6);
            case 16:
                return null;
            case 17:
                return (vo0) obj;
            case 18:
                String str = ((xp0) obj).f12601b;
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                if (f.c()) {
                    return "fakeForAdDebugLog";
                }
                return str;
            case 19:
                String str2 = ((xp0) obj).f12600a;
                if (TextUtils.isEmpty(str2)) {
                    return "";
                }
                if (f.c()) {
                    return "fakeForAdDebugLog";
                }
                return str2;
            case 20:
                return null;
            case gl.zzm /* 21 */:
                return null;
            case 22:
                return o01.f8901u;
            case 23:
                return Boolean.FALSE;
            case 24:
                return null;
            case 25:
                return o01.f8903w;
            case 26:
                return o01.f8905y;
            case 27:
                return o01.f8904x;
            case 28:
                return null;
            default:
                return null;
        }
    }
}
