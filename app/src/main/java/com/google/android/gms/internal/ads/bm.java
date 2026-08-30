package com.google.android.gms.internal.ads;
import m.h;
import m.i;
import m.j;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class bm extends i {

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f4824v = new AtomicBoolean(false);

    /* renamed from: w, reason: collision with root package name */
    public Context f4825w;

    /* renamed from: x, reason: collision with root package name */
    public be0 f4826x;

    /* renamed from: y, reason: collision with root package name */
    public j f4827y;

    /* renamed from: z, reason: collision with root package name */
    public h f4828z;

    @Override // i
    public final void a(h hVar) {
        this.f4828z = hVar;
        try {
            hVar.f20412a.warmup(0L);
        } catch (RemoteException unused) {
        }
        this.f4827y = hVar.c(new am(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f4828z = null;
        this.f4827y = null;
    }
}
