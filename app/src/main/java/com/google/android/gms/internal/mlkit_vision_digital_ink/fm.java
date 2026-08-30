package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class fm {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f14306a;

    /* renamed from: b, reason: collision with root package name */
    public hm f14307b;

    /* renamed from: c, reason: collision with root package name */
    public im f14308c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14309d;

    public final void finalize() {
        im imVar;
        hm hmVar = this.f14307b;
        if (hmVar != null && !hmVar.f14428v.isDone()) {
            hmVar.b(new yl("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f14306a)), 1));
        }
        if (!this.f14309d && (imVar = this.f14308c) != null) {
            imVar.i();
        }
    }
}
