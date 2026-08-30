package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kt implements View.OnClickListener {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7870u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f7871v;

    public kt(mt mtVar) {
        Objects.requireNonNull(mtVar);
        this.f7871v = mtVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7870u) {
            case 0:
                ((mt) this.f7871v).u(true);
                return;
            default:
                ((fd0) this.f7871v).f6030j.f16785b = true;
                return;
        }
    }

    public /* synthetic */ kt(fd0 fd0Var) {
        this.f7871v = fd0Var;
    }
}
