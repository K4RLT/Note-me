package f4;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class b implements DialogInterface.OnCancelListener {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16706u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f16707v;

    public /* synthetic */ b(int i, Object obj) {
        this.f16706u = i;
        this.f16707v = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f16706u) {
            case 0:
                return;
            default:
                ((k9.g) this.f16707v).b();
                return;
        }
    }
}
