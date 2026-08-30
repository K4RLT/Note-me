package com.google.android.gms.internal.ads;
import eb.t;
import eb.u;
import l9.a;
import p.a;

import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class k10 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7598a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7599b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7600c;

    /* renamed from: d, reason: collision with root package name */
    public long f7601d;
    public Object e;

    public /* synthetic */ k10(k10 k10Var) {
        this.f7598a = 1;
        this.f7599b = (a) k10Var.f7599b;
        this.f7600c = (Context) k10Var.f7600c;
        this.e = (WeakReference) k10Var.e;
        this.f7601d = k10Var.f7601d;
    }

    public static k10 a(u uVar) {
        String str = uVar.f16380u;
        String str2 = uVar.f16382w;
        Bundle b10 = uVar.f16381v.b();
        long j10 = uVar.f16383x;
        k10 k10Var = new k10(2);
        k10Var.f7599b = str;
        k10Var.f7600c = str2;
        k10Var.e = b10;
        k10Var.f7601d = j10;
        return k10Var;
    }

    public u b() {
        return new u((String) this.f7599b, new t(new Bundle((Bundle) this.e)), (String) this.f7600c, this.f7601d);
    }

    public String toString() {
        switch (this.f7598a) {
            case 2:
                String str = (String) this.f7600c;
                String str2 = (String) this.f7599b;
                String valueOf = String.valueOf((Bundle) this.e);
                StringBuilder q10 = a.q("origin=", str, ",name=", str2, ",params=");
                q10.append(valueOf);
                return q10.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ k10(int i) {
        this.f7598a = i;
    }
}
