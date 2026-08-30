package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bu0 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f4876a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4877b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f4878c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f4879d;
    public final AtomicBoolean e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f4880f;

    /* renamed from: g, reason: collision with root package name */
    public final ku0 f4881g;

    public bu0(Handler handler, Context context, ku0 ku0Var) {
        super(handler);
        this.f4879d = new AtomicReference(Float.valueOf(-1.0f));
        this.e = new AtomicBoolean(false);
        this.f4880f = Executors.newSingleThreadExecutor();
        this.f4876a = handler;
        this.f4877b = context;
        this.f4878c = (AudioManager) context.getSystemService("audio");
        this.f4881g = ku0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        if (this.e.getAndSet(true)) {
            return;
        }
        this.f4880f.submit(new e40(29, this));
    }
}
