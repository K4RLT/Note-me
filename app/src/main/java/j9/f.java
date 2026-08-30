package j9;

import android.view.View;
import j.i0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19075u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f19076v;

    public f(i0 i0Var) {
        Objects.requireNonNull(i0Var);
        this.f19076v = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f19075u) {
            case 0:
                d dVar = (d) this.f19076v;
                dVar.R = 2;
                dVar.f19064v.finish();
                return;
            default:
                ((i0) this.f19076v).N();
                return;
        }
    }

    public f(d dVar) {
        this.f19076v = dVar;
    }
}
