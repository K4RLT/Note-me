package j;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18678u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ SearchView f18679v;

    public /* synthetic */ r(SearchView searchView, int i) {
        this.f18678u = i;
        this.f18679v = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18678u) {
            case 0:
                this.f18679v.m();
                return;
            default:
                v3.b bVar = this.f18679v.l0;
                if (bVar instanceof e0) {
                    bVar.c(null);
                    return;
                }
                return;
        }
    }
}
