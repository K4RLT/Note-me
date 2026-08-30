package sd;

import lc.c;
import ud.d;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25133u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f25134v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f25135w;

    public /* synthetic */ a(c cVar, d dVar, int i) {
        this.f25133u = i;
        this.f25134v = cVar;
        this.f25135w = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25133u) {
            case 0:
                this.f25134v.a(this.f25135w);
                return;
            default:
                this.f25134v.a(this.f25135w);
                return;
        }
    }
}
