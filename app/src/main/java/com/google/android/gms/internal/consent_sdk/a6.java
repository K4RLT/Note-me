package com.google.android.gms.internal.consent_sdk;
import c7.a;
import e7.e;
import f0.c;
import g5.q;
import q.l;

import android.app.Application;
import android.content.ContextWrapper;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a6 implements xb.b, xb.a, e7, e6 {

    /* renamed from: w, reason: collision with root package name */
    public static final j4 f13352w = new j4(27);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13353u;

    /* renamed from: v, reason: collision with root package name */
    public Object f13354v;

    public a6(int i) {
        this.f13353u = i;
        switch (i) {
            case 7:
                return;
            default:
                int i10 = e5.f13399a;
                a6 a6Var = new a6(6, new e6[]{j4.P, f13352w});
                Charset charset = u5.f13575a;
                this.f13354v = a6Var;
                return;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.e6
    public l6 a(Class cls) {
        for (int i = 0; i < 2; i++) {
            e6 e6Var = ((e6[]) this.f13354v)[i];
            if (e6Var.b(cls)) {
                return e6Var.a(cls);
            }
        }
        androidx.datastore.preferences.protobuf.s1.k("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.gms.internal.consent_sdk.e6
    public boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((e6[]) this.f13354v)[i].b(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // xb.b
    public void c(k kVar) {
        ((AtomicReference) this.f13354v).set(kVar);
    }

    @Override // xb.a
    public void d(c7.a aVar) {
        ((e7.e) this.f13354v).a(aVar);
    }

    public void e(int i, Object obj, m6 m6Var) {
        i5 i5Var = (i5) this.f13354v;
        c5 c5Var = (c5) obj;
        i5Var.x(i, 2);
        i5Var.z(c5Var.b(m6Var));
        m6Var.e(c5Var, this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.f7
    public Object zzb() {
        switch (this.f13353u) {
            case 3:
                c0 c0Var = d0.f13388b;
                f0.c(c0Var);
                return new n((b) this.f13354v, c0Var);
            case 4:
                return new ContextWrapper((Application) ((f7) this.f13354v).zzb());
            case 5:
            case 6:
            default:
                return this.f13354v;
            case 7:
                d7 d7Var = (d7) this.f13354v;
                if (d7Var != null) {
                    return d7Var.zzb();
                }
                g5.q.l();
                return null;
        }
    }

    public /* synthetic */ a6(int i, Object obj) {
        this.f13353u = i;
        this.f13354v = obj;
    }

    public a6(i5 i5Var) {
        this.f13353u = 5;
        Charset charset = u5.f13575a;
        this.f13354v = i5Var;
        i5Var.f13442b = this;
    }
}
