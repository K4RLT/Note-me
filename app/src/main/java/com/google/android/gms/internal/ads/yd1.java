package com.google.android.gms.internal.ads;

import android.view.View;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class yd1 implements be1, f9.d, zo0 {

    /* renamed from: u, reason: collision with root package name */
    public Object f12855u;

    /* renamed from: v, reason: collision with root package name */
    public Object f12856v;

    /* renamed from: w, reason: collision with root package name */
    public Object f12857w;

    /* renamed from: x, reason: collision with root package name */
    public Object f12858x;

    /* renamed from: y, reason: collision with root package name */
    public Object f12859y;

    /* renamed from: z, reason: collision with root package name */
    public Object f12860z;

    public /* synthetic */ yd1() {
        this.f12860z = null;
        this.f12855u = null;
        this.f12856v = null;
        this.f12857w = null;
        this.f12858x = null;
        this.f12859y = q91.B;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.yd1, java.lang.Object] */
    public static yd1 a(String str, om1 om1Var, w91 w91Var, x91 x91Var, Integer num) {
        if (x91Var.equals(x91.f12506f)) {
            if (num != null) {
                androidx.datastore.preferences.protobuf.s1.q("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            androidx.datastore.preferences.protobuf.s1.q("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        gl1 b10 = fe1.b(str);
        ?? obj = new Object();
        obj.f12855u = str;
        obj.f12856v = b10;
        obj.f12857w = om1Var;
        obj.f12858x = w91Var;
        obj.f12859y = x91Var;
        obj.f12860z = num;
        return obj;
    }

    public void b(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f12860z = Integer.valueOf(i);
    }

    @Override // f9.d
    public void c() {
        if (((AtomicBoolean) this.f12860z).get()) {
            ((a70) this.f12856v).l();
            g90 g90Var = (g90) this.f12857w;
            synchronized (g90Var) {
                g90Var.P1(v80.B);
            }
        }
    }

    public void d(int i) {
        if (i >= 16) {
            this.f12855u = Integer.valueOf(i);
            return;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
    }

    public void e(int i) {
        if (i >= 12 && i <= 16) {
            this.f12856v = Integer.valueOf(i);
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
    }

    public void f(int i) {
        if (i >= 10) {
            this.f12857w = Integer.valueOf(i);
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
    }

    public ac.b g(rq0 rq0Var, x90 x90Var) {
        j60 j60Var = rq0Var.f10272a;
        this.f12859y = j60Var;
        if (rq0Var.f10274c != null) {
            if (j60Var.c() != null) {
                rq0Var.f10274c.e.k(rq0Var.f10272a.c());
            }
            return ed1.e(rq0Var.f10274c);
        }
        j60Var.zza().f6993g = rq0Var.f10273b;
        return ((mu) this.f12856v).j(x90Var, null, rq0Var.f10272a);
    }

    public ka1 h() {
        if (((Integer) this.f12860z) != null) {
            if (((Integer) this.f12855u) != null) {
                if (((Integer) this.f12856v) != null) {
                    Integer num = (Integer) this.f12857w;
                    if (num != null) {
                        if (((ja1) this.f12858x) != null) {
                            int intValue = num.intValue();
                            ja1 ja1Var = (ja1) this.f12858x;
                            if (ja1Var == ja1.f7385w) {
                                if (intValue > 20) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                                }
                            } else if (ja1Var == ja1.f7386x) {
                                if (intValue > 28) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                                }
                            } else if (ja1Var == ja1.f7387y) {
                                if (intValue > 32) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                                }
                            } else if (ja1Var == ja1.f7388z) {
                                if (intValue > 48) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                                }
                            } else if (ja1Var == ja1.A) {
                                if (intValue > 64) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                                }
                            } else {
                                androidx.datastore.preferences.protobuf.s1.q("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                                return null;
                            }
                            return new ka1(((Integer) this.f12860z).intValue(), ((Integer) this.f12855u).intValue(), ((Integer) this.f12856v).intValue(), ((Integer) this.f12857w).intValue(), (q91) this.f12859y, (ja1) this.f12858x);
                        }
                        androidx.datastore.preferences.protobuf.s1.q("hash type is not set");
                        return null;
                    }
                    androidx.datastore.preferences.protobuf.s1.q("tag size is not set");
                    return null;
                }
                androidx.datastore.preferences.protobuf.s1.q("iv size is not set");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.q("HMAC key size is not set");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("AES key size is not set");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zo0
    public Object k() {
        j60 j60Var;
        synchronized (this) {
            j60Var = (j60) this.f12859y;
        }
        return j60Var;
    }

    @Override // com.google.android.gms.internal.ads.zo0
    public ac.b o(x90 x90Var, yo0 yo0Var) {
        synchronized (this) {
            a20 h3 = yo0Var.h((xo0) x90Var.f12503w);
            qo0 qo0Var = new qo0((String) this.f12855u);
            switch (h3.f4319a) {
                case 0:
                    h3.f4322d = qo0Var;
                    break;
                default:
                    h3.f4322d = qo0Var;
                    break;
            }
            j60 j60Var = (j60) h3.c();
            j60Var.zzb();
            j60Var.zzb();
            g9.z2 z2Var = j60Var.zzb().f4581d;
            if (z2Var.M == null && z2Var.R == null) {
                aq0 zzb = j60Var.zzb();
                g9.z2 z2Var2 = zzb.f4581d;
                String str = zzb.f4583g;
                g9.f3 f3Var = zzb.f4586k;
                Executor executor = (Executor) this.f12860z;
                return ed1.c0(q81.t(((hq0) this.f12857w).j(j60Var)), new xi0(this, x90Var, new po0(yo0Var, x90Var, z2Var2, str, executor, f3Var, null), yo0Var, j60Var, 1), executor);
            }
            this.f12859y = j60Var;
            return ((mu) this.f12856v).j(x90Var, yo0Var, j60Var);
        }
    }

    @Override // f9.d
    public synchronized void x(View view) {
        if (!((AtomicBoolean) this.f12860z).compareAndSet(false, true)) {
            return;
        }
        ((u30) this.f12859y).y();
        ((d90) this.f12858x).U1(view);
    }

    @Override // f9.d
    public void zzb() {
        if (((AtomicBoolean) this.f12860z).get()) {
            ((q60) this.f12855u).L();
        }
    }

    public yd1(mu muVar, hq0 hq0Var, u uVar, String str, wx wxVar) {
        this.f12856v = muVar;
        this.f12857w = hq0Var;
        this.f12858x = uVar;
        this.f12855u = str;
        this.f12860z = wxVar;
    }
}
