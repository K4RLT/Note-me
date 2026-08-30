package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.net.Uri;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f14688a;

    /* renamed from: b, reason: collision with root package name */
    public final km f14689b;

    /* renamed from: c, reason: collision with root package name */
    public final h4 f14690c;

    /* renamed from: d, reason: collision with root package name */
    public final jm f14691d;
    public final boolean e;

    public n0(Uri uri, km kmVar, h4 h4Var, jm jmVar, boolean z3) {
        this.f14688a = uri;
        this.f14689b = kmVar;
        this.f14690c = h4Var;
        this.f14691d = jmVar;
        this.e = z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_digital_ink.m0] */
    public static m0 a() {
        com.google.android.gms.internal.mlkit_vision_digital_ink.m0 obj = new Object();
        obj.e = jm.f14513w;
        obj.f14654g = (byte) (obj.f14654g | 2);
        obj.c(true);
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                if (this.f14688a.equals(n0Var.f14688a) && this.f14689b.equals(n0Var.f14689b) && this.f14690c.equals(n0Var.f14690c) && this.f14691d.equals(n0Var.f14691d) && this.e == n0Var.e) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((this.f14688a.hashCode() ^ 1000003) * 1000003) ^ this.f14689b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.f14690c.hashCode()) * 1000003) ^ this.f14691d.hashCode();
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ 1237;
    }

    public final String toString() {
        String obj = this.f14688a.toString();
        String obj2 = this.f14689b.toString();
        String valueOf = String.valueOf(this.f14690c);
        String obj3 = this.f14691d.toString();
        StringBuilder q10 = p.a.q("ProtoDataStoreConfig{uri=", obj, ", schema=", obj2, ", handler=Optional.absent(), migrations=");
        g3.a.t(q10, valueOf, ", variantConfig=", obj3, ", useGeneratedExtensionRegistry=");
        q10.append(this.e);
        q10.append(", enableTracing=false}");
        return q10.toString();
    }
}
