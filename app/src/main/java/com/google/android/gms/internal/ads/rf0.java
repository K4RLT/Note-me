package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class rf0 extends z8.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10217d;
    public final /* synthetic */ String e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wf0 f10218f;

    public rf0(wf0 wf0Var, String str, int i) {
        this.f10217d = i;
        switch (i) {
            case 1:
                this.e = str;
                Objects.requireNonNull(wf0Var);
                this.f10218f = wf0Var;
                return;
            default:
                this.e = str;
                Objects.requireNonNull(wf0Var);
                this.f10218f = wf0Var;
                return;
        }
    }

    @Override // z8.u
    public final void a(z8.l lVar) {
        switch (this.f10217d) {
            case 0:
                this.f10218f.w4(wf0.z4(lVar));
                return;
            default:
                this.f10218f.w4(wf0.z4(lVar));
                return;
        }
    }

    @Override // z8.u
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        switch (this.f10217d) {
            case 0:
                String str = this.e;
                this.f10218f.v4((qi) obj, str);
                return;
            default:
                String str2 = this.e;
                this.f10218f.v4((lw) obj, str2);
                return;
        }
    }
}
