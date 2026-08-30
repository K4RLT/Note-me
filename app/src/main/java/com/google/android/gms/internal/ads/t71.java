package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class t71 extends ay0 {
    @Override // com.google.android.gms.internal.ads.ay0
    public final boolean D(r71 r71Var, o71 o71Var, o71 o71Var2) {
        synchronized (r71Var) {
            try {
                if (r71Var.f13106v == o71Var) {
                    r71Var.f13106v = o71Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final y71 H(r71 r71Var) {
        y71 y71Var;
        y71 y71Var2 = y71.f12806c;
        synchronized (r71Var) {
            try {
                y71Var = r71Var.f13107w;
                if (y71Var != y71Var2) {
                    r71Var.f13107w = y71Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return y71Var;
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final o71 N(r71 r71Var) {
        o71 o71Var;
        o71 o71Var2 = o71.f8996d;
        synchronized (r71Var) {
            try {
                o71Var = r71Var.f13106v;
                if (o71Var != o71Var2) {
                    r71Var.f13106v = o71Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o71Var;
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final boolean T(z71 z71Var, Object obj, Object obj2) {
        synchronized (z71Var) {
            try {
                if (z71Var.f13105u == obj) {
                    z71Var.f13105u = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final void j(y71 y71Var, Thread thread) {
        y71Var.f12807a = thread;
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final void q(y71 y71Var, y71 y71Var2) {
        y71Var.f12808b = y71Var2;
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final boolean x(z71 z71Var, y71 y71Var, y71 y71Var2) {
        synchronized (z71Var) {
            try {
                if (z71Var.f13107w == y71Var) {
                    z71Var.f13107w = y71Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
