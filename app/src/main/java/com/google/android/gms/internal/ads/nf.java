package com.google.android.gms.internal.ads;
import dg.a;
import fg.b;
import g9.r;
import q.x;
import r.e;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class nf implements lf {
    public static volatile dg Q = null;
    public static final Object R = new Object();
    public static boolean S = false;
    public static long T;
    public static tf U;
    public static kg V;
    public static d2 W;
    public static hq0 X;
    public static jk0 Y;
    public double D;
    public double E;
    public double F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final DisplayMetrics M;
    public final g9 N;
    public final mf O;
    public ig P;

    /* renamed from: u, reason: collision with root package name */
    public MotionEvent f8682u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedList f8683v = new LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public long f8684w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f8685x = 0;

    /* renamed from: y, reason: collision with root package name */
    public long f8686y = 0;

    /* renamed from: z, reason: collision with root package name */
    public long f8687z = 0;
    public long A = 0;
    public long B = 0;
    public long C = 0;
    public boolean K = false;
    public boolean L = false;

    public nf(Context context, mf mfVar) {
        try {
            bf.a();
            this.M = context.getResources().getDisplayMetrics();
            if (((Boolean) g9.r.e.f17698c.a(sl.C3)).booleanValue()) {
                this.N = new g9();
            }
        } catch (Throwable unused) {
        }
        new HashMap();
        this.O = mfVar;
    }

    public static dg n(Context context, boolean z3) {
        if (Q == null) {
            synchronized (R) {
                try {
                    if (Q == null) {
                        dg a10 = dg.a(context, z3, Y);
                        if (a10.f5429n) {
                            try {
                                if (((Boolean) g9.r.e.f17698c.a(sl.f10774i4)).booleanValue()) {
                                    a10.c("dDkHRfh96kWRNKlCuQv4bcbQkP8hTl8+IryaCt9cMd/svBIVo0Uo/vCqMYwPlijS", "lGOVu04SK1qS7YTVL1GWrSv+Cf1XKJpvbu7KHhGh7cY=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            a10.c("8cGCIT8G/u06HQUQMiN2ifk8cEgbx/Wk97figDVCx+GQZgadMjHBVKMl6PUoXm9E", "8+d2WBKGjAoApH75NCR/Aqn77d5NBFIHb0YR3dAdyeE=", Context.class);
                            if (((Boolean) g9.r.e.f17698c.a(sl.m4)).booleanValue()) {
                                a10.c("iCmAdyXMN2wNdoDGZPKplFblNf0e3f9Gr4uP4gCRDt/ctzDAq8UfSYwC5u9g4DzW", "9N+K+19jT0YQFPQktH9XDgnqiWtwN+75+qmtGpYeo7Q=", new Class[0]);
                            }
                            a10.c("00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", Context.class);
                            a10.c("XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", Context.class);
                            a10.c("m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", Context.class);
                            a10.c("P28XMQKwxb7t4RJM54Abd563bFUm9uASQiuwtqttjr6XDpyPt/FmHs2sVrWjtmTo", "fagQaENWAKeTH7PQjt5vlJiCBcOZOOnM19vGSn9sDlA=", Context.class);
                            Class cls = Boolean.TYPE;
                            a10.c("IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", Context.class, cls);
                            a10.c("GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", Context.class);
                            a10.c("2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", Context.class);
                            a10.c("6fpJXJ/0mHk1BKHieJD271QStaRup/Ve1zgTWQI+7BRFgC5McwJ3e2UlmdWs2x64", "/HyusJxcst6GC6sxvcSXH3tMw8sGRae2S909c2O+Y30=", MotionEvent.class, DisplayMetrics.class);
                            a10.c("t5yhqOem6jC98WR50f+SLS3Uk3sKCmIuutsKOnbEcikRe3zXPIZnZid7K20GrtZF", "M9gaAFNEKOV8YNe1CyHBBl548FwxQflqXjyA5kKaJak=", MotionEvent.class, DisplayMetrics.class);
                            a10.c("y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", new Class[0]);
                            a10.c("9v14GmYq1mityfaROUYQVHNDWlAgc2TzwyjcWsJSVQ5o6aEyLVnDo4vbeNXmh2ew", "zGbmNDn+uB00oiAu0ISzPA2QynMDAioh3MLj5VQvTcg=", new Class[0]);
                            a10.c("XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", new Class[0]);
                            a10.c("c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", new Class[0]);
                            a10.c("AeJvLHy+YL60Equ2/UpZQs9Ok34RPgGTn80fnG3Dx4JfdgAW65En0T0IJD/U8yYs", "sawjrbkZQHxExWkkVyDhv0h3fWiUMmvl7E2YVLpKa+A=", new Class[0]);
                            a10.c("Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", new Class[0]);
                            a10.c("Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", Context.class, cls, String.class);
                            a10.c("X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", StackTraceElement[].class);
                            a10.c("K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", View.class, DisplayMetrics.class, cls, cls);
                            a10.c("NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", Context.class, cls);
                            a10.c("9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", View.class, Activity.class, cls);
                            Class cls2 = Long.TYPE;
                            a10.c("CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", cls2);
                            a10.c("PmZORt2h3FILlRchj3l8QFpH1b4WBi8LAKFq8qXvSXgGWHByOiAJxaqMK9WTkxzB", "Ox3joL3a7fFzYIlEQut3utwsOQDntBqHwHmTdzF1H8c=", new Class[0]);
                            a10.c("sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", Context.class);
                            a10.c("Di5PWAjPtHVrwnaWVY5fRaO+JCXGdUjCOQOYEnFfzjx5tiFy99P00V458wl3+tMS", "24rToqMdm9KIBSWWVKIVzZ6Fu9mGVX1qRD30P4LVPjg=", Context.class);
                            a10.c("0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", NetworkCapabilities.class, cls2, cls2);
                            a10.c("/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", List.class);
                            a10.c("4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", cls2, cls2, cls2, cls2);
                        }
                        Q = a10;
                    }
                } finally {
                }
            }
        }
        return Q;
    }

    public static eg p(dg dgVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method d2 = dgVar.d("6fpJXJ/0mHk1BKHieJD271QStaRup/Ve1zgTWQI+7BRFgC5McwJ3e2UlmdWs2x64", "/HyusJxcst6GC6sxvcSXH3tMw8sGRae2S909c2O+Y30=");
        if (d2 != null && motionEvent != null) {
            try {
                return new eg((String) d2.invoke(null, motionEvent, displayMetrics));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new Exception(e);
            }
        }
        throw new Exception();
    }

    public static final void r(List list) {
        ExecutorService executorService;
        if (Q != null && (executorService = Q.f5419b) != null && !list.isEmpty()) {
            try {
                executorService.invokeAll(list, ((Long) g9.r.e.f17698c.a(sl.f10934s3)).longValue(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                char[] cArr = fg.f6059a;
                StringWriter stringWriter = new StringWriter();
                e.printStackTrace(new PrintWriter(stringWriter));
                Log.d("nf", "class methods got exception: " + stringWriter.toString());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final synchronized void a(int i, int i10, int i11) {
        try {
            if (this.f8682u != null) {
                if (((Boolean) g9.r.e.f17698c.a(sl.f10885p3)).booleanValue()) {
                    m();
                } else {
                    this.f8682u.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.M;
            if (displayMetrics != null) {
                float f10 = displayMetrics.density;
                this.f8682u = MotionEvent.obtain(0L, i11, 1, i * f10, i10 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f8682u = null;
            }
            this.L = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final synchronized void b(MotionEvent motionEvent) {
        Long l10;
        try {
            if (this.K) {
                m();
                this.K = false;
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 2) {
                    double rawX = motionEvent.getRawX();
                    double rawY = motionEvent.getRawY();
                    double d2 = rawX - this.E;
                    double d10 = rawY - this.F;
                    this.D += Math.sqrt((d10 * d10) + (d2 * d2));
                    this.E = rawX;
                    this.F = rawY;
                }
            } else {
                this.D = 0.0d;
                this.E = motionEvent.getRawX();
                this.F = motionEvent.getRawY();
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 != 1) {
                        if (action2 != 2) {
                            if (action2 == 3) {
                                this.f8687z++;
                            }
                        } else {
                            this.f8685x += motionEvent.getHistorySize() + 1;
                            eg k3 = k(motionEvent);
                            Long l11 = k3.R;
                            if (l11 != null && k3.U != null) {
                                this.B = l11.longValue() + k3.U.longValue() + this.B;
                            }
                            if (this.M != null && (l10 = k3.S) != null && k3.V != null) {
                                this.C = l10.longValue() + k3.V.longValue() + this.C;
                            }
                        }
                    } else {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.f8682u = obtain;
                        LinkedList linkedList = this.f8683v;
                        linkedList.add(obtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.f8686y++;
                        this.A = l(new Throwable().getStackTrace());
                    }
                } catch (xf unused) {
                }
            } else {
                this.G = motionEvent.getX();
                this.H = motionEvent.getY();
                this.I = motionEvent.getRawX();
                this.J = motionEvent.getRawY();
                this.f8684w++;
            }
            this.L = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String c(Context context, String str, View view, Activity activity) {
        return o(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final void e(StackTraceElement[] stackTraceElementArr) {
        g9 g9Var;
        if (((Boolean) g9.r.e.f17698c.a(sl.C3)).booleanValue() && (g9Var = this.N) != null) {
            g9Var.f6330a = new ArrayList(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String f(Context context) {
        char[] cArr = fg.f6059a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return o(context, null, 1, null, null);
        }
        q.x.o("The caller must not be called from the UI thread.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final void g(View view) {
        if (!((Boolean) g9.r.e.f17698c.a(sl.f10979v3)).booleanValue()) {
            return;
        }
        if (this.P == null) {
            dg dgVar = Q;
            this.P = new ig(dgVar.f5418a, dgVar.f5430o);
        }
        this.P.a(view);
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String h(Context context, String str, View view) {
        return o(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String i(Context context, View view, Activity activity) {
        return o(context, null, 2, view, activity);
    }

    public final wd j(Context context) {
        long j10;
        long j11;
        kg kgVar = V;
        if (kgVar != null && kgVar.f7736d) {
            kgVar.f7734b = System.currentTimeMillis();
        }
        d2 d2Var = W;
        d2Var.f5251b = d2Var.f5250a;
        d2Var.f5250a = SystemClock.uptimeMillis();
        wd B0 = je.B0();
        mf mfVar = this.O;
        String str = (String) mfVar.f8337v;
        if (!TextUtils.isEmpty(str)) {
            B0.b();
            ((je) B0.f4845v).E0(str);
        }
        dg n10 = n(context, mfVar.f8336u);
        if (n10.f5419b != null) {
            int e = n10.e();
            ArrayList arrayList = new ArrayList();
            if (!n10.f5429n) {
                B0.g(16384L);
            } else {
                arrayList.add(new ng(n10, B0, e, context, (sd) mfVar.f8338w, X));
                arrayList.add(new pg(n10, B0, T, e));
                arrayList.add(new og(n10, B0, e, 3));
                arrayList.add(new lg(n10, B0, e, context));
                arrayList.add(new og(n10, B0, e, 4));
                arrayList.add(new mg(n10, B0, e, context));
                arrayList.add(new og(n10, B0, e, 7));
                arrayList.add(new og(n10, B0, e, 9));
                arrayList.add(new og(n10, B0, e, 10));
                arrayList.add(new og(n10, B0, e, 0));
                arrayList.add(new og(n10, B0, e, 2));
                arrayList.add(new og(n10, B0, e, 13));
                arrayList.add(new og(n10, B0, e, 6));
                arrayList.add(new og(n10, B0, e, 12));
                arrayList.add(new tg(n10, B0, e));
                kg kgVar2 = V;
                long j12 = -1;
                if (kgVar2 != null) {
                    if (kgVar2.f7736d) {
                        j11 = kgVar2.f7734b - kgVar2.f7733a;
                    } else {
                        j11 = -1;
                    }
                    long j13 = kgVar2.f7735c;
                    kgVar2.f7735c = -1L;
                    j12 = j11;
                    j10 = j13;
                } else {
                    j10 = -1;
                }
                arrayList.add(new sg(n10, B0, e, U, j12, j10));
                arrayList.add(new og(n10, B0, e, 11));
                og ogVar = new og(n10, "Di5PWAjPtHVrwnaWVY5fRaO+JCXGdUjCOQOYEnFfzjx5tiFy99P00V458wl3+tMS", "24rToqMdm9KIBSWWVKIVzZ6Fu9mGVX1qRD30P4LVPjg=", B0, e, 76, 8);
                B0 = B0;
                arrayList.add(ogVar);
                arrayList.add(new og(n10, B0, e, 5));
                if (((Boolean) g9.r.e.f17698c.a(sl.m4)).booleanValue()) {
                    og ogVar2 = new og(n10, "iCmAdyXMN2wNdoDGZPKplFblNf0e3f9Gr4uP4gCRDt/ctzDAq8UfSYwC5u9g4DzW", "9N+K+19jT0YQFPQktH9XDgnqiWtwN+75+qmtGpYeo7Q=", B0, e, 82, 1);
                    B0 = B0;
                    arrayList.add(ogVar2);
                }
            }
            r(arrayList);
        }
        return B0;
    }

    public final eg k(MotionEvent motionEvent) {
        Method d2 = Q.d("t5yhqOem6jC98WR50f+SLS3Uk3sKCmIuutsKOnbEcikRe3zXPIZnZid7K20GrtZF", "M9gaAFNEKOV8YNe1CyHBBl548FwxQflqXjyA5kKaJak=");
        if (d2 != null && motionEvent != null) {
            try {
                return new eg((String) d2.invoke(null, motionEvent, this.M));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new Exception(e);
            }
        }
        throw new Exception();
    }

    public final long l(StackTraceElement[] stackTraceElementArr) {
        Method d2 = Q.d("X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=");
        if (d2 != null && stackTraceElementArr != null) {
            try {
                return new rf((String) d2.invoke(null, stackTraceElementArr)).P.longValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new Exception(e);
            }
        }
        throw new Exception();
    }

    public final void m() {
        this.A = 0L;
        this.f8684w = 0L;
        this.f8685x = 0L;
        this.f8686y = 0L;
        this.f8687z = 0L;
        this.B = 0L;
        this.C = 0L;
        LinkedList linkedList = this.f8683v;
        if (!linkedList.isEmpty()) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        } else {
            MotionEvent motionEvent = this.f8682u;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f8682u = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String o(android.content.Context r22, java.lang.String r23, int r24, android.view.View r25, android.app.Activity r26) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nf.o(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.List] */
    public final void q(dg dgVar, wd wdVar, View view, Activity activity, boolean z3, Context context) {
        g9.r rVar;
        long j10;
        long j11;
        long j12;
        int i;
        boolean z9;
        Long l10;
        int i10;
        boolean z10;
        MotionEvent motionEvent;
        ArrayList arrayList;
        int i11 = 1;
        if (!dgVar.f5429n) {
            wdVar.g(16384L);
            arrayList = Arrays.asList(new xe(dgVar, i11, wdVar));
        } else {
            synchronized (this) {
                try {
                    try {
                        eg p10 = p(dgVar, this.f8682u, this.M);
                        Long l11 = p10.O;
                        if (l11 != null) {
                            long longValue = l11.longValue();
                            wdVar.b();
                            ((je) wdVar.f4845v).K0(longValue);
                        }
                        Long l12 = p10.P;
                        if (l12 != null) {
                            long longValue2 = l12.longValue();
                            wdVar.b();
                            ((je) wdVar.f4845v).L0(longValue2);
                        }
                        Long l13 = p10.Q;
                        if (l13 != null) {
                            long longValue3 = l13.longValue();
                            wdVar.b();
                            ((je) wdVar.f4845v).M0(longValue3);
                        }
                        if (this.L) {
                            Long l14 = p10.R;
                            if (l14 != null) {
                                long longValue4 = l14.longValue();
                                wdVar.b();
                                ((je) wdVar.f4845v).F(longValue4);
                            }
                            Long l15 = p10.S;
                            if (l15 != null) {
                                long longValue5 = l15.longValue();
                                wdVar.b();
                                ((je) wdVar.f4845v).G(longValue5);
                            }
                        }
                    } catch (xf unused) {
                    }
                    ee z11 = fe.z();
                    if (this.f8684w > 0) {
                        DisplayMetrics displayMetrics = this.M;
                        char[] cArr = fg.f6059a;
                        if (displayMetrics != null && displayMetrics.density != 0.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            long b10 = fg.b(this.D, displayMetrics);
                            z11.b();
                            ((fe) z11.f4845v).L(b10);
                            long b11 = fg.b(this.I - this.G, this.M);
                            z11.b();
                            ((fe) z11.f4845v).M(b11);
                            long b12 = fg.b(this.J - this.H, this.M);
                            z11.b();
                            ((fe) z11.f4845v).N(b12);
                            long b13 = fg.b(this.G, this.M);
                            z11.b();
                            ((fe) z11.f4845v).Q(b13);
                            long b14 = fg.b(this.H, this.M);
                            z11.b();
                            ((fe) z11.f4845v).R(b14);
                            if (this.L && (motionEvent = this.f8682u) != null) {
                                long b15 = fg.b(((this.G - this.I) + motionEvent.getRawX()) - this.f8682u.getX(), this.M);
                                if (b15 != 0) {
                                    z11.b();
                                    ((fe) z11.f4845v).O(b15);
                                }
                                long b16 = fg.b(((this.H - this.J) + this.f8682u.getRawY()) - this.f8682u.getY(), this.M);
                                if (b16 != 0) {
                                    z11.b();
                                    ((fe) z11.f4845v).P(b16);
                                }
                            }
                        }
                    }
                    try {
                        eg k3 = k(this.f8682u);
                        Long l16 = k3.O;
                        if (l16 != null) {
                            long longValue6 = l16.longValue();
                            z11.b();
                            ((fe) z11.f4845v).A(longValue6);
                        }
                        Long l17 = k3.P;
                        if (l17 != null) {
                            long longValue7 = l17.longValue();
                            z11.b();
                            ((fe) z11.f4845v).B(longValue7);
                        }
                        long longValue8 = k3.Q.longValue();
                        z11.b();
                        ((fe) z11.f4845v).H(longValue8);
                        if (this.L) {
                            Long l18 = k3.S;
                            if (l18 != null) {
                                long longValue9 = l18.longValue();
                                z11.b();
                                ((fe) z11.f4845v).C(longValue9);
                            }
                            Long l19 = k3.R;
                            if (l19 != null) {
                                long longValue10 = l19.longValue();
                                z11.b();
                                ((fe) z11.f4845v).F(longValue10);
                            }
                            Long l20 = k3.T;
                            if (l20 != null) {
                                if (l20.longValue() != 0) {
                                    i10 = 2;
                                } else {
                                    i10 = 1;
                                }
                                z11.b();
                                ((fe) z11.f4845v).S(i10);
                            }
                            long j13 = this.f8685x;
                            if (j13 > 0) {
                                DisplayMetrics displayMetrics2 = this.M;
                                char[] cArr2 = fg.f6059a;
                                if (displayMetrics2 != null && displayMetrics2.density != 0.0f) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (z9) {
                                    l10 = Long.valueOf(Math.round(this.C / j13));
                                } else {
                                    l10 = null;
                                }
                                if (l10 != null) {
                                    long longValue11 = l10.longValue();
                                    z11.b();
                                    ((fe) z11.f4845v).D(longValue11);
                                } else {
                                    z11.b();
                                    ((fe) z11.f4845v).E();
                                }
                                long round = Math.round(this.B / this.f8685x);
                                z11.b();
                                ((fe) z11.f4845v).G(round);
                            }
                            Long l21 = k3.W;
                            if (l21 != null) {
                                long longValue12 = l21.longValue();
                                z11.b();
                                ((fe) z11.f4845v).J(longValue12);
                            }
                            Long l22 = k3.X;
                            if (l22 != null) {
                                long longValue13 = l22.longValue();
                                z11.b();
                                ((fe) z11.f4845v).I(longValue13);
                            }
                            Long l23 = k3.Y;
                            if (l23 != null) {
                                if (l23.longValue() != 0) {
                                    i = 2;
                                } else {
                                    i = 1;
                                }
                                z11.b();
                                ((fe) z11.f4845v).T(i);
                            }
                        }
                    } catch (xf unused2) {
                    }
                    long j14 = this.A;
                    if (j14 > 0) {
                        z11.b();
                        ((fe) z11.f4845v).K(j14);
                    }
                    fe feVar = (fe) z11.c();
                    wdVar.b();
                    ((je) wdVar.f4845v).S(feVar);
                    long j15 = this.f8684w;
                    if (j15 > 0) {
                        wdVar.b();
                        ((je) wdVar.f4845v).J(j15);
                    }
                    long j16 = this.f8685x;
                    if (j16 > 0) {
                        wdVar.b();
                        ((je) wdVar.f4845v).I(j16);
                    }
                    long j17 = this.f8686y;
                    if (j17 > 0) {
                        wdVar.b();
                        ((je) wdVar.f4845v).H(j17);
                    }
                    long j18 = this.f8687z;
                    if (j18 > 0) {
                        wdVar.b();
                        ((je) wdVar.f4845v).K(j18);
                    }
                    try {
                        LinkedList linkedList = this.f8683v;
                        int size = linkedList.size() - 1;
                        if (size > 0) {
                            wdVar.b();
                            ((je) wdVar.f4845v).U();
                            for (int i12 = 0; i12 < size; i12++) {
                                eg p11 = p(Q, (MotionEvent) linkedList.get(i12), this.M);
                                ee z12 = fe.z();
                                long longValue14 = p11.O.longValue();
                                z12.b();
                                ((fe) z12.f4845v).A(longValue14);
                                long longValue15 = p11.P.longValue();
                                z12.b();
                                ((fe) z12.f4845v).B(longValue15);
                                fe feVar2 = (fe) z12.c();
                                wdVar.b();
                                ((je) wdVar.f4845v).T(feVar2);
                            }
                        }
                    } catch (xf unused3) {
                        wdVar.b();
                        ((je) wdVar.f4845v).U();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList = arrayList2;
            if (dgVar.f5419b != null) {
                int e = dgVar.e();
                nl nlVar = sl.B3;
                g9.r rVar2 = g9.r.e;
                if (((Boolean) rVar2.f17698c.a(nlVar)).booleanValue()) {
                    arrayList2.add(new ng(dgVar, wdVar, e, context, (sd) this.O.f8338w, X));
                    arrayList2.add(new mg(dgVar, wdVar, e, context));
                    arrayList2.add(new lg(dgVar, wdVar, e, context));
                    arrayList2.add(new og(dgVar, wdVar, e, 4));
                    kg kgVar = V;
                    if (kgVar != null) {
                        if (kgVar.f7736d) {
                            rVar = rVar2;
                            j12 = kgVar.f7734b - kgVar.f7733a;
                        } else {
                            rVar = rVar2;
                            j12 = -1;
                        }
                        long j19 = kgVar.f7735c;
                        kgVar.f7735c = -1L;
                        j11 = j12;
                        j10 = j19;
                    } else {
                        rVar = rVar2;
                        j10 = -1;
                        j11 = -1;
                    }
                    arrayList2.add(new sg(dgVar, wdVar, e, U, j11, j10));
                    arrayList2.add(new og(dgVar, wdVar, e, 11));
                } else {
                    rVar = rVar2;
                }
                arrayList2.add(new xe(dgVar, i11, wdVar));
                arrayList2.add(new og(dgVar, wdVar, e, 3));
                arrayList2.add(new pg(dgVar, wdVar, T, e));
                arrayList2.add(new og(dgVar, wdVar, e, 0));
                arrayList2.add(new og(dgVar, wdVar, e, 9));
                arrayList2.add(new og(dgVar, wdVar, e, 10));
                arrayList2.add(new og(dgVar, wdVar, e, 2));
                arrayList2.add(new og(dgVar, wdVar, e, 7));
                arrayList2.add(new og(dgVar, wdVar, e, 13));
                arrayList2.add(new og(dgVar, wdVar, e, 6));
                arrayList2.add(new og(dgVar, wdVar, e, 12));
                arrayList2.add(new rg(dgVar, wdVar, e, new Throwable().getStackTrace()));
                arrayList2.add(new rg(dgVar, wdVar, e, view));
                arrayList2.add(new tg(dgVar, wdVar, e));
                g9.r rVar3 = rVar;
                if (((Boolean) rVar3.f17698c.a(sl.t3)).booleanValue()) {
                    arrayList2.add(new lg(dgVar, wdVar, e, view, activity));
                }
                arrayList2.add(new og(dgVar, wdVar, e, 5));
                if (z3) {
                    arrayList = arrayList2;
                    if (((Boolean) rVar3.f17698c.a(sl.f10979v3)).booleanValue()) {
                        arrayList2.add(new ug(dgVar, wdVar, e, this.P));
                        arrayList = arrayList2;
                    }
                } else {
                    arrayList2.add(new rg(dgVar, wdVar, e, W));
                    arrayList2.add(new rg(dgVar, wdVar, e, this.N));
                    arrayList = arrayList2;
                }
            }
        }
        r(arrayList);
    }
}
