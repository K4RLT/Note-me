package com.google.android.gms.internal.ads;
import fa.b;
import ca.b;
import fa.c;
import k9.a0;
import l9.i;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class pg0 implements fa.b, fa.c {

    /* renamed from: u, reason: collision with root package name */
    public final yx f9514u = new yx();

    /* renamed from: v, reason: collision with root package name */
    public final Object f9515v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public boolean f9516w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9517x = false;

    /* renamed from: y, reason: collision with root package name */
    public dv f9518y;

    /* renamed from: z, reason: collision with root package name */
    public cj f9519z;

    public static void b(Context context, yx yxVar, Executor executor) {
        if (!((Boolean) pm.f9552j.p()).booleanValue() && !((Boolean) pm.f9551h.p()).booleanValue()) {
            return;
        }
        yxVar.a(new t81(yxVar, 0, new rl(context, 2)), executor);
    }

    @Override // fa.b
    public void R(int i) {
        int i10 = k9.a0.f19634b;
        l9.i.a("Cannot connect to remote service, fallback to local instance.");
    }

    public final void a() {
        synchronized (this.f9515v) {
            try {
                this.f9517x = true;
                if (!this.f9519z.h()) {
                    if (this.f9519z.e()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.f9519z.o();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r0(ca.b bVar) {
        int i = k9.a0.f19634b;
        l9.i.a("Disconnected from remote ad request service.");
        this.f9514u.c(new cg0(1));
    }
}
