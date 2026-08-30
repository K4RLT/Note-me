package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import wa.f9;

/* loaded from: classes.dex */
public final class ry {

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f10336r;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10337a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10338b;

    /* renamed from: c, reason: collision with root package name */
    public final l9.a f10339c;

    /* renamed from: d, reason: collision with root package name */
    public final ul f10340d;
    public final wl e;

    /* renamed from: f, reason: collision with root package name */
    public final a0.f0 f10341f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f10342g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f10343h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10344j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10345k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10346l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10347m;

    /* renamed from: n, reason: collision with root package name */
    public iy f10348n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10349o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10350p;

    /* renamed from: q, reason: collision with root package name */
    public long f10351q;

    static {
        boolean z3;
        if (g9.p.f17688g.e.nextInt(100) < ((Integer) g9.r.e.f17698c.a(sl.f10752ge)).intValue()) {
            z3 = true;
        } else {
            z3 = false;
        }
        f10336r = z3;
    }

    public ry(Context context, l9.a aVar, String str, wl wlVar, ul ulVar) {
        j.i0 i0Var = new j.i0(2);
        i0Var.M("min_1", Double.MIN_VALUE, 1.0d);
        i0Var.M("1_5", 1.0d, 5.0d);
        i0Var.M("5_10", 5.0d, 10.0d);
        i0Var.M("10_20", 10.0d, 20.0d);
        i0Var.M("20_30", 20.0d, 30.0d);
        i0Var.M("30_max", 30.0d, Double.MAX_VALUE);
        this.f10341f = new a0.f0(i0Var);
        this.i = false;
        this.f10344j = false;
        this.f10345k = false;
        this.f10346l = false;
        this.f10351q = -1L;
        this.f10337a = context;
        this.f10339c = aVar;
        this.f10338b = str;
        this.e = wlVar;
        this.f10340d = ulVar;
        String str2 = (String) g9.r.e.f17698c.a(sl.f10803k0);
        if (str2 == null) {
            this.f10343h = new String[0];
            this.f10342g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f10343h = new String[length];
        this.f10342g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f10342g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                int i10 = k9.a0.f19634b;
                l9.i.g("Unable to parse frame hash target time number.", e);
                this.f10342g[i] = -1;
            }
        }
    }

    public final void a(iy iyVar) {
        ul ulVar = this.f10340d;
        wl wlVar = this.e;
        an1.j(wlVar, ulVar, "vpc2");
        this.i = true;
        wlVar.c("vpn", iyVar.d());
        this.f10348n = iyVar;
    }

    public final void b() {
        Bundle b10;
        if (f10336r && !this.f10349o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f10338b);
            bundle.putString("player", this.f10348n.d());
            a0.f0 f0Var = this.f10341f;
            String[] strArr = (String[]) f0Var.f48c;
            ArrayList arrayList = new ArrayList(strArr.length);
            int i = 0;
            while (i < strArr.length) {
                String str = strArr[i];
                double[] dArr = (double[]) f0Var.e;
                double[] dArr2 = (double[]) f0Var.f49d;
                int[] iArr = (int[]) f0Var.f50f;
                double d2 = dArr[i];
                double d10 = dArr2[i];
                int i10 = iArr[i];
                arrayList.add(new k9.n(str, d2, d10, i10 / f0Var.f47b, i10));
                i++;
                f0Var = f0Var;
                strArr = strArr;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                k9.n nVar = (k9.n) obj;
                String str2 = nVar.f19713a;
                bundle.putString("fps_c_".concat(String.valueOf(str2)), Integer.toString(nVar.e));
                bundle.putString("fps_p_".concat(String.valueOf(str2)), Double.toString(nVar.f19716d));
            }
            int i12 = 0;
            while (true) {
                long[] jArr = this.f10342g;
                if (i12 >= jArr.length) {
                    break;
                }
                String str3 = this.f10343h[i12];
                if (str3 != null) {
                    Long valueOf = Long.valueOf(jArr[i12]);
                    new StringBuilder(valueOf.toString().length() + 3);
                    bundle.putString("fh_".concat(valueOf.toString()), str3);
                }
                i12++;
            }
            final k9.f0 f0Var2 = f9.k.C.f16813c;
            String str4 = this.f10339c.f20029u;
            AtomicReference atomicReference = f0Var2.f19679c;
            bundle.putString("device", k9.f0.O());
            nl nlVar = sl.f10642a;
            g9.r rVar = g9.r.e;
            bundle.putString("eids", TextUtils.join(",", rVar.f17696a.F()));
            boolean isEmpty = bundle.isEmpty();
            final Context context = this.f10337a;
            if (isEmpty) {
                int i13 = k9.a0.f19634b;
                l9.i.a("Empty or null bundle.");
            } else {
                final String str5 = (String) rVar.f17698c.a(sl.Vb);
                if (!f0Var2.f19680d.getAndSet(true)) {
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: k9.d0
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str6) {
                            f0.this.f19679c.set(f9.b(context, str5));
                        }
                    };
                    if (TextUtils.isEmpty(str5)) {
                        b10 = Bundle.EMPTY;
                    } else {
                        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                        b10 = wa.f9.b(context, str5);
                    }
                    atomicReference.set(b10);
                }
                bundle.putAll((Bundle) atomicReference.get());
            }
            l9.d dVar = g9.p.f17688g.f17689a;
            l9.d.a(context, str4, bundle, new x90(context, 16, str4));
            this.f10349o = true;
        }
    }

    public final void c(iy iyVar) {
        long j10;
        if (this.f10345k && !this.f10346l) {
            if (k9.a0.m() && !this.f10346l) {
                k9.a0.k("VideoMetricsMixin first frame");
            }
            an1.j(this.e, this.f10340d, "vff2");
            this.f10346l = true;
        }
        f9.k.C.f16819k.getClass();
        long nanoTime = System.nanoTime();
        if (this.f10347m && this.f10350p) {
            if (this.f10351q != -1) {
                double d2 = 1000000000 / (nanoTime - r8);
                a0.f0 f0Var = this.f10341f;
                f0Var.f47b++;
                int i = 0;
                while (true) {
                    double[] dArr = (double[]) f0Var.e;
                    if (i >= dArr.length) {
                        break;
                    }
                    double d10 = dArr[i];
                    if (d10 <= d2 && d2 < ((double[]) f0Var.f49d)[i]) {
                        int[] iArr = (int[]) f0Var.f50f;
                        iArr[i] = iArr[i] + 1;
                    }
                    if (d2 < d10) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.f10350p = this.f10347m;
        this.f10351q = nanoTime;
        long longValue = ((Long) g9.r.e.f17698c.a(sl.l0)).longValue();
        long k3 = iyVar.k();
        int i10 = 0;
        while (true) {
            String[] strArr = this.f10343h;
            if (i10 < strArr.length) {
                if (strArr[i10] == null && longValue > Math.abs(k3 - this.f10342g[i10])) {
                    int i11 = 8;
                    Bitmap bitmap = iyVar.getBitmap(8, 8);
                    long j11 = 63;
                    int i12 = 0;
                    long j12 = 0;
                    while (i12 < i11) {
                        int i13 = 0;
                        while (i13 < i11) {
                            int pixel = bitmap.getPixel(i13, i12);
                            if (Color.green(pixel) + Color.red(pixel) + Color.blue(pixel) > 128) {
                                j10 = 1;
                            } else {
                                j10 = 0;
                            }
                            j12 |= j10 << ((int) j11);
                            j11--;
                            i13++;
                            i11 = 8;
                        }
                        i12++;
                        i11 = 8;
                    }
                    strArr[i10] = String.format("%016X", Long.valueOf(j12));
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d() {
        this.f10347m = true;
        if (this.f10344j && !this.f10345k) {
            an1.j(this.e, this.f10340d, "vfp2");
            this.f10345k = true;
        }
    }
}
