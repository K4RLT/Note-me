package d3;

import com.google.android.gms.internal.mlkit_vision_digital_ink.yl;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f15718a;

    /* renamed from: b, reason: collision with root package name */
    public j f15719b;

    /* renamed from: c, reason: collision with root package name */
    public k f15720c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15721d;

    public final void a(Object obj) {
        this.f15721d = true;
        j jVar = this.f15719b;
        if (jVar != null && jVar.f15723v.l(obj)) {
            this.f15718a = null;
            this.f15719b = null;
            this.f15720c = null;
        }
    }

    public final void b(Throwable th) {
        this.f15721d = true;
        j jVar = this.f15719b;
        if (jVar != null && jVar.f15723v.m(th)) {
            this.f15718a = null;
            this.f15719b = null;
            this.f15720c = null;
        }
    }

    public final void finalize() {
        k kVar;
        j jVar = this.f15719b;
        if (jVar != null) {
            i iVar = jVar.f15723v;
            if (!iVar.isDone()) {
                iVar.m(new yl("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f15718a, 5));
            }
        }
        if (!this.f15721d && (kVar = this.f15720c) != null) {
            kVar.l(null);
        }
    }
}
