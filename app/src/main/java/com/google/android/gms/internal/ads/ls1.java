package com.google.android.gms.internal.ads;
import q.x;

import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class ls1 implements ht1 {

    /* renamed from: p, reason: collision with root package name */
    public static final y51 f8117p;

    /* renamed from: a, reason: collision with root package name */
    public final ah f8118a;

    /* renamed from: b, reason: collision with root package name */
    public final qg f8119b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.i f8120c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8121d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8122f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8123g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8124h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f8125j;

    /* renamed from: k, reason: collision with root package name */
    public final long f8126k;

    /* renamed from: l, reason: collision with root package name */
    public final long f8127l;

    /* renamed from: m, reason: collision with root package name */
    public final d61 f8128m;

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f8129n;

    /* renamed from: o, reason: collision with root package name */
    public long f8130o;

    static {
        b51 b51Var = d51.f5314v;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        ct.h(objArr, 6);
        f8117p = d51.w(objArr, 6);
    }

    public ls1() {
        androidx.datastore.preferences.protobuf.i iVar = new androidx.datastore.preferences.protobuf.i(1);
        l("bufferForPlaybackMs", AdError.NETWORK_ERROR_CODE, 0, "0");
        l("bufferForPlaybackForLocalPlaybackMs", AdError.NETWORK_ERROR_CODE, 0, "0");
        l("bufferForPlaybackAfterRebufferMs", AdError.SERVER_ERROR_CODE, 0, "0");
        l("bufferForPlaybackAfterRebufferForLocalPlaybackMs", AdError.NETWORK_ERROR_CODE, 0, "0");
        l("minBufferMs", 50000, AdError.NETWORK_ERROR_CODE, "bufferForPlaybackMs");
        l("minBufferForLocalPlaybackMs", AdError.NETWORK_ERROR_CODE, AdError.NETWORK_ERROR_CODE, "bufferForPlaybackForLocalPlaybackMs");
        l("minBufferMs", 50000, AdError.SERVER_ERROR_CODE, "bufferForPlaybackAfterRebufferMs");
        l("minBufferForLocalPlaybackMs", AdError.NETWORK_ERROR_CODE, AdError.NETWORK_ERROR_CODE, "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        l("maxBufferMs", 50000, 50000, "minBufferMs");
        l("maxBufferForLocalPlaybackMs", 50000, AdError.NETWORK_ERROR_CODE, "minBufferForLocalPlaybackMs");
        l("backBufferDurationMs", 0, 0, "0");
        this.f8118a = new ah();
        this.f8119b = new qg();
        this.f8120c = iVar;
        long u9 = bq0.u(50000L);
        this.f8121d = u9;
        long u10 = bq0.u(1000L);
        this.e = u10;
        this.f8122f = u9;
        this.f8123g = u9;
        this.f8124h = u10;
        this.i = u10;
        this.f8125j = bq0.u(2000L);
        this.f8126k = u10;
        this.f8127l = bq0.u(0L);
        this.f8129n = new ConcurrentHashMap();
        this.f8128m = d61.a(d61.A);
        this.f8130o = -1L;
    }

    public static void l(String str, int i, int i10, String str2) {
        boolean z3;
        if (i >= i10) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return;
        }
        q.x.n(ay0.B("%s cannot be less than %s", str, str2));
    }

    @Override // com.google.android.gms.internal.ads.ht1
    public final void a(gt1 gt1Var, r[] rVarArr) {
        int i;
        tu1 tu1Var = gt1Var.f6450a;
        Integer num = (Integer) this.f8128m.get(tu1Var.f11451a);
        if (num != null && num.intValue() != -1) {
            i = num.intValue();
        } else {
            i = -1;
        }
        ks1 ks1Var = (ks1) this.f8129n.get(tu1Var);
        ks1Var.getClass();
        if (i == -1) {
            boolean k3 = k(gt1Var);
            int length = rVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 >= length) {
                    break;
                }
                r rVar = rVarArr[i10];
                if (rVar != null) {
                    int i13 = rVar.zza().f6821c;
                    if (i13 != -1) {
                        if (i13 != 0) {
                            if (i13 != 1) {
                                i12 = i13 != 2 ? i13 != 4 ? 131072 : 26214400 : k3 ? 19660800 : 131072000;
                            }
                        } else {
                            i12 = 144310272;
                        }
                    }
                    i11 += i12;
                }
                i10++;
            }
            String str = bq0.f4860a;
            i = Math.max(13107200, Math.min(i11, 210239488));
        }
        ks1Var.f7868c = i;
        j();
    }

    @Override // com.google.android.gms.internal.ads.ht1
    public final long b() {
        return this.f8127l;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, com.google.android.gms.internal.ads.ks1] */
    @Override // com.google.android.gms.internal.ads.ht1
    public final void c(tu1 tu1Var) {
        boolean z3;
        int i;
        long id2 = Thread.currentThread().getId();
        long j10 = this.f8130o;
        if (j10 == -1 || j10 == id2) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.L("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z3);
        this.f8130o = id2;
        ConcurrentHashMap concurrentHashMap = this.f8129n;
        ks1 ks1Var = (ks1) concurrentHashMap.get(tu1Var);
        if (ks1Var == null) {
            Object obj = new Object();
            obj.f7866a = 1;
            concurrentHashMap.put(tu1Var, obj);
        } else {
            ks1Var.f7866a++;
        }
        ks1 ks1Var2 = (ks1) concurrentHashMap.get(tu1Var);
        ks1Var2.getClass();
        Integer num = (Integer) this.f8128m.get(tu1Var.f11451a);
        if (num != null && num.intValue() != -1) {
            i = num.intValue();
        } else {
            i = -1;
        }
        if (i == -1) {
            i = 13107200;
        }
        ks1Var2.f7868c = i;
        ks1Var2.f7867b = false;
    }

    @Override // com.google.android.gms.internal.ads.ht1
    public final boolean d(gt1 gt1Var) {
        int i;
        long j10;
        long j11;
        boolean z3;
        boolean z9;
        int i10;
        ConcurrentHashMap concurrentHashMap = this.f8129n;
        tu1 tu1Var = gt1Var.f6450a;
        ks1 ks1Var = (ks1) concurrentHashMap.get(tu1Var);
        ks1Var.getClass();
        ks1 ks1Var2 = (ks1) this.f8129n.get(tu1Var);
        ks1Var2.getClass();
        synchronized (ks1Var2) {
            i = ks1Var2.f7869d;
        }
        int i11 = i * 65536;
        ks1 ks1Var3 = (ks1) this.f8129n.get(tu1Var);
        ks1Var3.getClass();
        int i12 = ks1Var3.f7868c;
        if (tu1Var.equals(tu1.f11450c)) {
            if (i11 >= i12) {
                return false;
            }
            return true;
        }
        boolean k3 = k(gt1Var);
        if (k3) {
            j10 = this.e;
        } else {
            j10 = this.f8121d;
        }
        if (k3) {
            j11 = this.f8123g;
        } else {
            j11 = this.f8122f;
        }
        float f10 = gt1Var.e;
        if (f10 > 1.0f) {
            j10 = Math.min(bq0.y(j10, f10), j11);
        }
        long j12 = gt1Var.f6453d;
        if (j12 < Math.max(j10, 500000L)) {
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            if (runtime.totalMemory() >= maxMemory) {
                long freeMemory = runtime.freeMemory();
                androidx.datastore.preferences.protobuf.i iVar = this.f8120c;
                synchronized (iVar) {
                    i10 = iVar.f736x * 65536;
                }
                if (freeMemory + i10 < maxMemory / 25) {
                    z3 = false;
                    if (k3 ? i11 < i12 : !(!z3 && i11 >= i12)) {
                        z9 = true;
                    }
                    ks1Var.f7867b = z9;
                    if (!z9 && k3 && !z3) {
                        x21.D("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
                    }
                    if (!ks1Var.f7867b && j12 < 500000) {
                        x21.F("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    }
                }
            }
            z3 = true;
            z9 = k3 ? false : false;
            ks1Var.f7867b = z9;
            if (!z9) {
                x21.D("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!ks1Var.f7867b) {
                x21.F("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j12 >= j11 || i11 >= i12) {
            ks1Var.f7867b = false;
        }
        return ks1Var.f7867b;
    }

    @Override // com.google.android.gms.internal.ads.ht1
    public final void e(tu1 tu1Var) {
        ConcurrentHashMap concurrentHashMap = this.f8129n;
        ks1 ks1Var = (ks1) concurrentHashMap.get(tu1Var);
        if (ks1Var != null) {
            int i = ks1Var.f7866a - 1;
            ks1Var.f7866a = i;
            if (i == 0) {
                concurrentHashMap.remove(tu1Var);
                j();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.f8130o = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.ht1
    public final boolean f() {
        Iterator it = this.f8129n.values().iterator();
        while (it.hasNext()) {
            if (((ks1) it.next()).f7867b) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ht1
    public final void g(tu1 tu1Var) {
        ConcurrentHashMap concurrentHashMap = this.f8129n;
        ks1 ks1Var = (ks1) concurrentHashMap.get(tu1Var);
        if (ks1Var != null) {
            int i = ks1Var.f7866a - 1;
            ks1Var.f7866a = i;
            if (i == 0) {
                concurrentHashMap.remove(tu1Var);
                j();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ht1
    public final boolean h(gt1 gt1Var) {
        long j10;
        boolean z3;
        int i;
        boolean z9 = gt1Var.f6454f;
        long j11 = gt1Var.f6453d;
        float f10 = gt1Var.e;
        boolean k3 = k(gt1Var);
        String str = bq0.f4860a;
        if (f10 != 1.0f) {
            j11 = Math.round(j11 / f10);
        }
        if (z9) {
            if (k3) {
                j10 = this.f8126k;
                z3 = true;
            } else {
                j10 = this.f8125j;
                z3 = false;
            }
        } else if (k3) {
            j10 = this.i;
            z3 = true;
        } else {
            j10 = this.f8124h;
            z3 = false;
        }
        long j12 = gt1Var.f6455g;
        if (j12 != -9223372036854775807L) {
            j10 = Math.min(j12 / 2, j10);
        }
        if (j10 > 0 && j11 < j10) {
            if (!z3) {
                tu1 tu1Var = gt1Var.f6450a;
                ks1 ks1Var = (ks1) this.f8129n.get(tu1Var);
                ks1Var.getClass();
                synchronized (ks1Var) {
                    i = ks1Var.f7869d;
                }
                int i10 = i * 65536;
                ks1 ks1Var2 = (ks1) this.f8129n.get(tu1Var);
                ks1Var2.getClass();
                if (i10 >= ks1Var2.f7868c) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ht1
    public final w i(tu1 tu1Var) {
        return new hq0(this, tu1Var);
    }

    public final void j() {
        ConcurrentHashMap concurrentHashMap = this.f8129n;
        boolean isEmpty = concurrentHashMap.isEmpty();
        androidx.datastore.preferences.protobuf.i iVar = this.f8120c;
        int i = 0;
        if (isEmpty) {
            synchronized (iVar) {
                iVar.b1(0);
            }
        } else {
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                i += ((ks1) it.next()).f7868c;
            }
            iVar.b1(i);
        }
    }

    public final boolean k(gt1 gt1Var) {
        uh uhVar = gt1Var.f6451b;
        j2 j2Var = uhVar.b(uhVar.o(gt1Var.f6452c.f13003a, this.f8119b).f9841c, this.f8118a, 0L).f4499b.f12771b;
        if (j2Var != null) {
            String scheme = j2Var.f7285a.getScheme();
            if (!TextUtils.isEmpty(scheme) && !f8117p.contains(scheme)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
