package v3;

import android.database.DataSetObserver;
import j.e0;

/* loaded from: classes.dex */
public final class a extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f27376a;

    public a(e0 e0Var) {
        this.f27376a = e0Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        e0 e0Var = this.f27376a;
        e0Var.f27377u = true;
        e0Var.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        e0 e0Var = this.f27376a;
        e0Var.f27377u = false;
        e0Var.notifyDataSetInvalidated();
    }
}
