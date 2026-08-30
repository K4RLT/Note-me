package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class og extends wg {
    public static volatile Long i;

    /* renamed from: k, reason: collision with root package name */
    public static volatile String f9108k;

    /* renamed from: m, reason: collision with root package name */
    public static volatile Long f9110m;

    /* renamed from: o, reason: collision with root package name */
    public static volatile String f9112o;

    /* renamed from: q, reason: collision with root package name */
    public static volatile Long f9114q;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9116h;

    /* renamed from: j, reason: collision with root package name */
    public static final Object f9107j = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f9109l = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f9111n = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static final Object f9113p = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final Object f9115r = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(dg dgVar, wd wdVar, int i10, int i11) {
        super(dgVar, "c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", wdVar, i10, 44);
        this.f9116h = i11;
        switch (i11) {
            case 2:
                super(dgVar, "AeJvLHy+YL60Equ2/UpZQs9Ok34RPgGTn80fnG3Dx4JfdgAW65En0T0IJD/U8yYs", "sawjrbkZQHxExWkkVyDhv0h3fWiUMmvl7E2YVLpKa+A=", wdVar, i10, 22);
                return;
            case 3:
                super(dgVar, "XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", wdVar, i10, 1);
                return;
            case 4:
                super(dgVar, "9v14GmYq1mityfaROUYQVHNDWlAgc2TzwyjcWsJSVQ5o6aEyLVnDo4vbeNXmh2ew", "zGbmNDn+uB00oiAu0ISzPA2QynMDAioh3MLj5VQvTcg=", wdVar, i10, 33);
                return;
            case 5:
                super(dgVar, "PmZORt2h3FILlRchj3l8QFpH1b4WBi8LAKFq8qXvSXgGWHByOiAJxaqMK9WTkxzB", "Ox3joL3a7fFzYIlEQut3utwsOQDntBqHwHmTdzF1H8c=", wdVar, i10, 89);
                return;
            case 6:
                super(dgVar, "2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", wdVar, i10, 49);
                return;
            case 7:
                super(dgVar, "m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", wdVar, i10, 5);
                return;
            case 8:
            default:
                return;
            case 9:
                super(dgVar, "P28XMQKwxb7t4RJM54Abd563bFUm9uASQiuwtqttjr6XDpyPt/FmHs2sVrWjtmTo", "fagQaENWAKeTH7PQjt5vlJiCBcOZOOnM19vGSn9sDlA=", wdVar, i10, 12);
                return;
            case 10:
                super(dgVar, "IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", wdVar, i10, 3);
                return;
            case 11:
                super(dgVar, "sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", wdVar, i10, 73);
                return;
            case 12:
                super(dgVar, "Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", wdVar, i10, 51);
                return;
            case 13:
                super(dgVar, "GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", wdVar, i10, 48);
                return;
        }
    }

    private final void b() {
        wd wdVar = this.f12235d;
        wdVar.b();
        ((je) wdVar.f4845v).G0(-1L);
        wdVar.b();
        ((je) wdVar.f4845v).H0(-1L);
        int[] iArr = (int[]) this.e.invoke(null, this.f12232a.f5418a);
        synchronized (wdVar) {
            long j10 = iArr[0];
            wdVar.b();
            ((je) wdVar.f4845v).G0(j10);
            long j11 = iArr[1];
            wdVar.b();
            ((je) wdVar.f4845v).H0(j11);
            int i10 = iArr[2];
            if (i10 != Integer.MIN_VALUE) {
                wdVar.b();
                ((je) wdVar.f4845v).X(i10);
            }
        }
    }

    private final void c() {
        if (f9108k == null) {
            synchronized (f9109l) {
                try {
                    if (f9108k == null) {
                        f9108k = (String) this.e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        wd wdVar = this.f12235d;
        synchronized (wdVar) {
            String str = f9108k;
            wdVar.b();
            ((je) wdVar.f4845v).f0(str);
        }
    }

    private final void d() {
        if (f9110m == null) {
            synchronized (f9111n) {
                try {
                    if (f9110m == null) {
                        f9110m = (Long) this.e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        wd wdVar = this.f12235d;
        synchronized (wdVar) {
            long longValue = f9110m.longValue();
            wdVar.b();
            ((je) wdVar.f4845v).P0(longValue);
        }
    }

    private final void e() {
        wd wdVar = this.f12235d;
        wdVar.b();
        ((je) wdVar.f4845v).D0("E");
        if (f9112o == null) {
            synchronized (f9113p) {
                try {
                    if (f9112o == null) {
                        f9112o = (String) this.e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        wd wdVar2 = this.f12235d;
        synchronized (wdVar2) {
            String str = f9112o;
            wdVar2.b();
            ((je) wdVar2.f4845v).D0(str);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.an1, com.google.android.gms.internal.ads.vf] */
    private final void f() {
        Boolean bool = (Boolean) g9.r.e.f17698c.a(sl.L3);
        bool.getClass();
        String str = (String) this.e.invoke(null, this.f12232a.f5418a, bool);
        ?? an1Var = new an1(16);
        an1Var.O = -1L;
        an1Var.P = -1L;
        HashMap s10 = an1.s(str);
        if (s10 != null) {
            an1Var.O = ((Long) s10.get(0)).longValue();
            an1Var.P = ((Long) s10.get(1)).longValue();
        }
        wd wdVar = this.f12235d;
        synchronized (wdVar) {
            long j10 = an1Var.O;
            wdVar.b();
            ((je) wdVar.f4845v).F0(j10);
            long j11 = an1Var.P;
            wdVar.b();
            ((je) wdVar.f4845v).Y(j11);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.bg, com.google.android.gms.internal.ads.an1] */
    private final void g() {
        wd wdVar = this.f12235d;
        synchronized (wdVar) {
            String str = (String) this.e.invoke(null, null);
            ?? an1Var = new an1(16);
            HashMap s10 = an1.s(str);
            if (s10 != null) {
                an1Var.O = (Long) s10.get(0);
                an1Var.P = (Long) s10.get(1);
            }
            long longValue = an1Var.O.longValue();
            wdVar.b();
            ((je) wdVar.f4845v).P(longValue);
            long longValue2 = an1Var.P.longValue();
            wdVar.b();
            ((je) wdVar.f4845v).Q(longValue2);
        }
    }

    private final void h() {
        if (f9114q == null) {
            synchronized (f9115r) {
                try {
                    if (f9114q == null) {
                        f9114q = (Long) this.e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        wd wdVar = this.f12235d;
        synchronized (wdVar) {
            long longValue = f9114q.longValue();
            wdVar.b();
            ((je) wdVar.f4845v).C(longValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.wg
    public final void a() {
        switch (this.f9116h) {
            case 0:
                if (i == null) {
                    synchronized (f9107j) {
                        try {
                            if (i == null) {
                                i = (Long) this.e.invoke(null, null);
                            }
                        } finally {
                        }
                    }
                }
                wd wdVar = this.f12235d;
                synchronized (wdVar) {
                    long longValue = i.longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).L(longValue);
                }
                return;
            case 1:
                c();
                return;
            case 2:
                d();
                return;
            case 3:
                e();
                return;
            case 4:
                h();
                return;
            case 5:
                String str = (String) this.e.invoke(null, null);
                wd wdVar2 = this.f12235d;
                synchronized (wdVar2) {
                    wdVar2.b();
                    ((je) wdVar2.f4845v).k0(str);
                }
                return;
            case 6:
                wd wdVar3 = this.f12235d;
                wdVar3.b();
                ((je) wdVar3.f4845v).p0(3);
                try {
                    int i10 = 1;
                    if (true == ((Boolean) this.e.invoke(null, this.f12232a.f5418a)).booleanValue()) {
                        i10 = 2;
                    }
                    wdVar3.b();
                    ((je) wdVar3.f4845v).p0(i10);
                    return;
                } catch (InvocationTargetException e) {
                    if (e.getTargetException() instanceof Settings.SettingNotFoundException) {
                        return;
                    } else {
                        throw e;
                    }
                }
            case 7:
                b();
                return;
            case 8:
                int i11 = 1;
                if (true == ((Boolean) this.e.invoke(null, this.f12232a.f5418a)).booleanValue()) {
                    i11 = 2;
                }
                wd wdVar4 = this.f12235d;
                wdVar4.b();
                ((je) wdVar4.f4845v).s0(i11);
                return;
            case 9:
                wd wdVar5 = this.f12235d;
                wdVar5.b();
                ((je) wdVar5.f4845v).J0(-1L);
                long longValue2 = ((Long) this.e.invoke(null, this.f12232a.f5418a)).longValue();
                wdVar5.b();
                ((je) wdVar5.f4845v).J0(longValue2);
                return;
            case 10:
                f();
                return;
            case 11:
                wd wdVar6 = this.f12235d;
                try {
                    int i12 = 1;
                    if (true == ((Boolean) this.e.invoke(null, this.f12232a.f5418a)).booleanValue()) {
                        i12 = 2;
                    }
                    wdVar6.b();
                    ((je) wdVar6.f4845v).r0(i12);
                    return;
                } catch (InvocationTargetException unused) {
                    wdVar6.b();
                    ((je) wdVar6.f4845v).r0(3);
                    return;
                }
            case 12:
                g();
                return;
            default:
                wd wdVar7 = this.f12235d;
                wdVar7.f(3);
                boolean booleanValue = ((Boolean) this.e.invoke(null, this.f12232a.f5418a)).booleanValue();
                synchronized (wdVar7) {
                    try {
                        if (booleanValue) {
                            wdVar7.f(2);
                        } else {
                            wdVar7.f(1);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og(dg dgVar, String str, String str2, wd wdVar, int i10, int i11, int i12) {
        super(dgVar, str, str2, wdVar, i10, i11);
        this.f9116h = i12;
    }
}
