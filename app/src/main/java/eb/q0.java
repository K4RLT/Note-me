package eb;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.ar;

/* loaded from: classes.dex */
public final class q0 extends k1 {
    public static final Pair V = new Pair("", 0L);
    public ar A;
    public final s0 B;
    public final com.google.android.gms.internal.ads.d C;
    public String D;
    public boolean E;
    public long F;
    public final s0 G;
    public final r0 H;
    public final com.google.android.gms.internal.ads.d I;
    public final j6.i J;
    public final r0 K;
    public final s0 L;
    public final s0 M;
    public boolean N;
    public final r0 O;
    public final r0 P;
    public final s0 Q;
    public final com.google.android.gms.internal.ads.d R;
    public final com.google.android.gms.internal.ads.d S;
    public final s0 T;
    public final j6.i U;

    /* renamed from: x, reason: collision with root package name */
    public SharedPreferences f16319x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f16320y;

    /* renamed from: z, reason: collision with root package name */
    public SharedPreferences f16321z;

    public q0(d1 d1Var) {
        super(d1Var);
        this.f16320y = new Object();
        this.G = new s0(this, "session_timeout", 1800000L);
        this.H = new r0(this, "start_new_session", true);
        this.L = new s0(this, "last_pause_time", 0L);
        this.M = new s0(this, "session_id", 0L);
        this.I = new com.google.android.gms.internal.ads.d(this, "non_personalized_ads");
        this.J = new j6.i(this, "last_received_uri_timestamps_by_source");
        this.K = new r0(this, "allow_remote_dynamite", false);
        this.B = new s0(this, "first_open_time", 0L);
        fa.y.e("app_install_time");
        this.C = new com.google.android.gms.internal.ads.d(this, "app_instance_id");
        this.O = new r0(this, "app_backgrounded", false);
        this.P = new r0(this, "deep_link_retrieval_complete", false);
        this.Q = new s0(this, "deep_link_retrieval_attempts", 0L);
        this.R = new com.google.android.gms.internal.ads.d(this, "firebase_feature_rollouts");
        this.S = new com.google.android.gms.internal.ads.d(this, "deferred_attribution_cache");
        this.T = new s0(this, "deferred_attribution_cache_timestamp", 0L);
        this.U = new j6.i(this, "default_event_parameters");
    }

    public final boolean A(long j10) {
        if (j10 - this.G.a() > this.L.a()) {
            return true;
        }
        return false;
    }

    public final void B(boolean z3) {
        u();
        f().I.f(Boolean.valueOf(z3), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = D().edit();
        edit.putBoolean("deferred_analytics_collection", z3);
        edit.apply();
    }

    public final SharedPreferences C() {
        u();
        v();
        if (this.f16321z == null) {
            synchronized (this.f16320y) {
                try {
                    if (this.f16321z == null) {
                        String str = ((d1) this.f3443v).f16102u.getPackageName() + "_preferences";
                        f().I.f(str, "Default prefs file");
                        this.f16321z = ((d1) this.f3443v).f16102u.getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f16321z;
    }

    public final SharedPreferences D() {
        u();
        v();
        fa.y.h(this.f16319x);
        return this.f16319x;
    }

    public final SparseArray E() {
        Bundle n10 = this.J.n();
        if (n10 == null) {
            return new SparseArray();
        }
        int[] intArray = n10.getIntArray("uriSources");
        long[] longArray = n10.getLongArray("uriTimestamps");
        if (intArray != null && longArray != null) {
            if (intArray.length != longArray.length) {
                f().A.g("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray();
            }
            SparseArray sparseArray = new SparseArray();
            for (int i = 0; i < intArray.length; i++) {
                sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
            }
            return sparseArray;
        }
        return new SparseArray();
    }

    public final o1 F() {
        u();
        return o1.e(D().getInt("consent_source", 100), D().getString("consent_settings", "G1"));
    }

    @Override // eb.k1
    public final boolean x() {
        return true;
    }

    public final void y(SparseArray sparseArray) {
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            iArr[i] = sparseArray.keyAt(i);
            jArr[i] = ((Long) sparseArray.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.J.p(bundle);
    }

    public final boolean z(int i) {
        return o1.h(i, D().getInt("consent_source", 100));
    }
}
