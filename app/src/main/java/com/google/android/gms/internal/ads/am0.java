package com.google.android.gms.internal.ads;
import a0.k;
import ac.b;
import f9.k;
import g9.r;
import k9.a0;
import l9.a;
import r.e;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class am0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4538a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4539b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4540c;

    public am0(l9.a aVar, wx wxVar) {
        this.f4538a = 1;
        this.f4540c = aVar;
        this.f4539b = wxVar;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final ac.b zza() {
        switch (this.f4538a) {
            case 0:
                if (((Boolean) g9.r.e.f17698c.a(sl.M3)).booleanValue()) {
                    return ed1.e(new ul0(1, null));
                }
                px pxVar = (px) this.f4540c;
                return ed1.d0(pxVar.h(), i6.f7007l, (Executor) this.f4539b);
            case 1:
                return ((wx) this.f4539b).j(new qf(12, this));
            case 2:
                k9.a0.k("HsdpMigrationSignal.produce");
                if (((Boolean) g9.r.e.f17698c.a(sl.f10845me)).booleanValue()) {
                    boolean z3 = false;
                    try {
                        if (((Intent) this.f4540c).resolveActivity(((Context) this.f4539b).getPackageManager()) != null) {
                            k9.a0.k("HSDP intent is supported");
                            z3 = true;
                        }
                    } catch (Exception e) {
                        f9.k.C.f16817h.d("HsdpMigrationSignal.isHsdpMigrationSupported", e);
                    }
                    return ed1.e(new xm0(Boolean.valueOf(z3), 1));
                }
                return ed1.e(new xm0(null, 1));
            case 3:
                return ((wx) this.f4539b).j(new qf(20, this));
            case 4:
                return ((wx) this.f4539b).j(new qf(22, this));
            case 5:
                v81 e8 = ed1.e((String) this.f4540c);
                i6 i6Var = i6.f7009n;
                Executor executor = (Executor) this.f4539b;
                return ed1.U(ed1.d0(e8, i6Var, executor), Throwable.class, new dq(10, this), executor);
            default:
                return ((wx) this.f4539b).j(new bo0(1, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int zzb() {
        switch (this.f4538a) {
            case 0:
                return 10;
            case 1:
                return 54;
            case 2:
                return 60;
            case 3:
                return 23;
            case 4:
                return 62;
            case 5:
                return 41;
            default:
                return 48;
        }
    }

    public /* synthetic */ am0(Object obj, int i, Object obj2) {
        this.f4538a = i;
        this.f4539b = obj;
        this.f4540c = obj2;
    }
}
