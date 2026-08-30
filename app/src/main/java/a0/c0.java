package a0;
import a.a;
import b0.i0;
import w.a;

import r0.f1;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f28b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f29c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f31f;

    public c0(int i, int i10, int i11) {
        this.f27a = i11;
        switch (i11) {
            case 1:
                this.f28b = new f1(i);
                this.f29c = new f1(i10);
                this.f31f = new i0(i, 30, 100);
                return;
            default:
                this.f28b = new f1(i);
                this.f29c = new f1(i10);
                this.f31f = new i0(i, 90, 200);
                return;
        }
    }

    public final void a(int i, int i10) {
        switch (this.f27a) {
            case 0:
                if (i < 0.0f) {
                    a.a("Index should be non-negative");
                }
                this.f28b.i(i);
                this.f31f.a(i);
                this.f29c.i(i10);
                return;
            default:
                if (i < 0.0f) {
                    a.a("Index should be non-negative (" + i + ')');
                }
                this.f28b.i(i);
                this.f31f.a(i);
                this.f29c.i(i10);
                return;
        }
    }
}
